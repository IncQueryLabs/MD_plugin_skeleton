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

import com.incquerylabs.magicdraw.plugin.example.queries.CodegenControl
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TypedElement
import java.io.FileWriter
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
	val String pythonRootPackage
	val Collection<Package> modelPackagesToGen
	
	new(ViatraQueryEngine queryEngine, String codeOutletRootPath, String pythonRootPackage, Collection<Package> modelPackagesToGen) {
		this.queryEngine = queryEngine
		this.codeOutletRootPath = codeOutletRootPath
		this.pythonRootPackage = pythonRootPackage
		this.modelPackagesToGen = modelPackagesToGen
	}
	
	
	val extension CodegenControl codegenControl = CodegenControl.instance
	
	
	

	def doGen() {
		modelPackagesToGen.forEach[ pack |
			queryEngine.blockToGen.streamAllValuesOfblock(pack).forEach[ block |
				if (block.checkName)
					// block.doGenBlockFile
					System.out.println(block.genBlockCode)
			]
		]
	}

	def doGenBlockFile(Class block) {
		if (checkName(block)) {
			val fileW = new FileWriter(block.genBlockFilePath.toString)
			fileW.write(block.genBlockCode.toString)
			fileW.close
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
		
	def genBlockCode(Class block) '''
		# TODO gen imports
	
		class «block.genName»:
		    """ 
		        Class automatically generated from «block.humanName».
		        Placed into «block.genBlockFilePath».
		        Refer to this Python class as «block.genPackageableElementRef»
		    """
		    
		    def __init__(self):
		    	«FOR part : queryEngine.mandatoryPartToGen.getAllValuesOfpart(block)»
		    		«IF part.checkName && part.checkTypeIsBlock»
		    			self.«part.genName» = «part.type.genPackageableElementRef»()
		    		«ENDIF»
		    	«ENDFOR»
		    	«FOR port : queryEngine.portToGen.getAllValuesOfport(block)»
		    		«IF port.checkName && port.checkTypeIsBlock»
		    			self.set_«port.genName»(None)
		    		«ENDIF»
		    	«ENDFOR»
		    	# TODO set up internal connections based on IBD
		        pass
		    
		    	«FOR port : queryEngine.portToGen.getAllValuesOfport(block)»
		    		«IF port.checkName && port.checkTypeIsBlock»
		    			@property
		    			def «port.genName»(self):
		    				return self.«CodegenUtil.V4MD_FIELD_PREFIX»«port.genName»
	
		    			@«port.genName».setter
		    			def set_«port.genName»(self, value):
		    				self.«CodegenUtil.V4MD_FIELD_PREFIX»«port.genName» = value
		    				if (value):
		    					# TODO set up external connections based on IBD
		    					pass
		    		«ENDIF»
		    	«ENDFOR»
	'''
	
	def genBlockFilePath(Class block) 
		'''«codeOutletRootPath»/«block.genPackageableElementPathSteps.join('/')».py'''

	def CharSequence genPackageableElementRef(PackageableElement block) {
		'''«pythonRootPackage».«block.genPackageableElementPathSteps.join('.')»'''
	} 
	
	def List<String> genPackageableElementPathSteps(PackageableElement element) {
		val accumulator = newArrayList
		element.genPackageableElementPathSteps(accumulator)
		return accumulator
	}
	private def void genPackageableElementPathSteps(PackageableElement element, List<String> accumulator) {
		element.owningPackage?.genPackageableElementPathSteps(accumulator)
		accumulator.add(element.genName)
	}
	
	def genName(NamedElement element) { mangleName(element.name) }

	
}