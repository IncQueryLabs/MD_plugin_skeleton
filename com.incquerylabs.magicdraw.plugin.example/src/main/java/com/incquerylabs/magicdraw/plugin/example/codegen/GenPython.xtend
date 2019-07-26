/*******************************************************************************
 * Copyright (c) 2010-2019, Gabor Bergmann, IncQuery Labs Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabor Bergmann - initial API and implementation
 *******************************************************************************/
package com.incquerylabs.magicdraw.plugin.example.codegen

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ElementValue
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TypedElement
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectableElement
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port
import java.io.File
import java.io.FileWriter
import java.util.ArrayList
import java.util.Collection
import java.util.List
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine

import static com.incquerylabs.magicdraw.plugin.example.codegen.CodegenUtil.mangleName

/**
 * @author Gabor Bergmann
 *
 */
class GenPython {
	val ViatraQueryEngine queryEngine
	val String codeOutletRootPath
	val List<String> pythonRootPackage
	val Collection<Package> modelPackagesToGen
	
	new(ViatraQueryEngine queryEngine, String codeOutletRootPath, List<String> pythonRootPackage, Collection<Package> modelPackagesToGen) {
		this.queryEngine = queryEngine
		this.codeOutletRootPath = codeOutletRootPath
		this.pythonRootPackage = pythonRootPackage
		this.modelPackagesToGen = modelPackagesToGen
	}
		
	val extension CodegenPatternLoader codegenControl = new CodegenPatternLoader()
	val extension GenPythonHelper genPythonHelper = new GenPythonHelper()

	def doGen() {
		init();
		modelPackagesToGen.forEach[ pack |
			queryEngine.blockToGen.getAllValuesOfblock(pack).forEach[ block |
				if (block.checkName)
					block.doGenBlockFile
					System.out.println(block.genBlockCode)
			]
		]
	}

	def doGenBlockFile(Class block) {
		if (checkName(block)) {
			val blockFilePath = block.genBlockFilePath.toString
			println("generating " + blockFilePath)
			
			
			val blockFile = new File(blockFilePath)
			if (blockFile.exists) 
				blockFile.delete
			
			blockFile.parentFile.mkdirs
			blockFile.createNewFile
			val blockFileWriter = new FileWriter(blockFile, false)
			blockFileWriter.write(block.genBlockCode.toString)
			blockFileWriter.close
			
			// ensure package is created
			for (packagePath : block.genPackageFilePaths) {
				val packageFile = new File(packagePath.toString)
				//packageFile.parentFile.mkdirs
				packageFile.createNewFile
			}
		}
	}
	
	def boolean checkName(NamedElement element) {
		val violation = queryEngine.mangledNameCollision.getOneArbitraryMatch(null, element, null)
		if (violation.present) {
			System.err.println(String.format(
				"Mangled name ambiguity: name of %s is mangled to non-unique form %s, skipping code generation", 
				element.humanName, violation.get.mangledName
			))
			return false
		}
		return true
	}
	def boolean checkTypeIsBlock(TypedElement element) {
		val type = element.type
		if (type === null) {
			System.err.println(String.format(
				"Missing type for typed element %s", 
				element.humanName
			))
			return false
		}
		if (type instanceof Class) {
			if (queryEngine.blockToGen.hasMatch(type, null)) {
				return true
			} else {
				System.err.println(String.format(
					"Block %s as type of %s not possible to generate", 
					type.humanName, element.humanName
				))
				return false
			}
		} else {
			System.err.println(String.format(
				"Block type expected for typed element %s instead of %s", 
				element.humanName, type.humanName
			))
			return false
		}
	}
	def boolean checkPropertyIsPart(Property property) {
		if (queryEngine.mandatoryPartToGen.hasMatch(property, null)) {
			return true;
		} else {
			System.err.println(String.format(
				"Part property expected in property path instead of %s", 
				property.humanName
			))
			return false
		}
	}
	def boolean checkConnectableIsPort(ConnectableElement element) {
		if (element instanceof Port) {
			if (queryEngine.portToGen.hasMatch(element, null))
				return true;
		}
		System.err.println(String.format(
			"Port expected at the end of the property path instead of %s", 
			element.humanName
		))
		return false
	}
		
	def genBlockCode(Class block) '''
	    «FOR imported: queryEngine.blockMustImport.getAllValuesOfimportedBlock(block)»
	        import «imported.genPackageableElementPackageRef»
	    «ENDFOR»
	    class «block.genName»:
	        """ 
	            Class automatically generated by V4MD example code generator.
	            Derived from «block.humanName».
	            Refer to this Python class as «block.genPackageableElementRef»
	        """
	        
	        def __init__(self):
	            «FOR part : queryEngine.mandatoryPartToGen.getAllValuesOfpart(block)»
	                «IF part.checkName && part.checkTypeIsBlock»
	                    self.«part.genName» = «part.type.genPackageableElementRef»()
	                «ENDIF»
	            «ENDFOR»
	            «FOR conn : queryEngine.assemblyToGen.getAllValuesOfconnector(block)»
	                self«conn.end.get(0).genPathToPort» = self«conn.end.get(1).genPathToPortOwner»
	                self«conn.end.get(1).genPathToPort» = self«conn.end.get(0).genPathToPortOwner»
	            «ENDFOR»
	            pass
	        
	        «FOR port : queryEngine.portToGen.getAllValuesOfport(block)»
	            «IF port.checkName && port.checkTypeIsBlock»
	                @property
	                def «port.genName»(self):
	                    return self.«CodegenUtil.V4MD_FIELD_PREFIX»«port.genName»
	                
	                @«port.genName».setter
	                def «port.genName»(self, value):
	                    self.«CodegenUtil.V4MD_FIELD_PREFIX»«port.genName» = value
	                    if (value):
	                        «FOR delegation : queryEngine.delegationToGen.getAllMatches(port, null, null, block)»
	                        	self«(delegation.get("otherEnd") as ConnectorEnd).genPathToPort» = value
	                        «ENDFOR»
	                        pass
	                        
	            «ENDIF»
	        «ENDFOR»
	'''
	
	def genBlockFilePath(Class block) 
		'''«codeOutletRootPath»/«block.genPackageableElementPathSteps.join('/')».py'''

	def genPackageFilePaths(PackageableElement element) {
		val steps = element.owningPackage.genPackageableElementPathSteps
		return (1..steps.size).map[ prefixLength |
			'''«codeOutletRootPath»/«steps.take(prefixLength).join('/')»/__init__.py'''
		]
	}


	def CharSequence genPackageableElementRef(PackageableElement block) {
		'''«block.genPackageableElementPackageRef».«block.genName»'''
	} 
	def CharSequence genPackageableElementPackageRef(PackageableElement block) {
		return block.genPackageableElementPathSteps.join('.')
	} 
	
	def List<String> genPackageableElementPathSteps(PackageableElement element) {
		val accumulator = new ArrayList(pythonRootPackage)
		element.genPackageableElementPathSteps(accumulator)
		return accumulator
	}
	private def void genPackageableElementPathSteps(PackageableElement element, List<String> accumulator) {
		element.owningPackage?.genPackageableElementPathSteps(accumulator)
		accumulator.add(element.genName)
	}
	
	def genName(NamedElement element) { mangleName(element.name) }
	
	def genPathToPortOwner(ConnectorEnd end) {
		val propertyPaths = queryEngine.connectorEndNestedPath.getAllValuesOfpropertyPath(end)
		if (propertyPaths.empty)
			return ""
		val propertyPathSlot = propertyPaths.head
		propertyPathSlot.value
			.filter(ElementValue)
			.map[element]
			.filter(Property)
			.filter[checkPropertyIsPart]
			.map['.'+genName]
			.join

	}
	def genPathToPort(ConnectorEnd end) {
		val portRole = end.role
		checkConnectableIsPort(portRole)
		return '''«end.genPathToPortOwner».«portRole.genName»'''
	}
}