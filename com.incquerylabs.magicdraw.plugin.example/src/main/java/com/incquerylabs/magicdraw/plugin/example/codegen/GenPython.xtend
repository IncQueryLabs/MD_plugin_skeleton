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

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement

import static com.incquerylabs.magicdraw.plugin.example.codegen.CodegenUtil.mangleName
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement
import java.util.List
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import java.io.File
import java.io.FileWriter
import com.incquerylabs.magicdraw.plugin.example.queries.CodegenControl

/**
 * @author Gabor Bergmann
 *
 */
class GenPython {
	val ViatraQueryEngine queryEngine
	val String rootPath
	
	new(ViatraQueryEngine queryEngine, String rootPath) {
		this.queryEngine = queryEngine
		this.rootPath = rootPath
	}
	
	
	val extension CodegenControl codegenControl = CodegenControl.instance
	

	def doGen() {
		queryEngine.block.forEachMatch [ System.out.println(block.genBlockCode) ]
	}

	def doGenBlockFile(Classifier block) {
		if (checkBlock(block)) {
			val fileW = new FileWriter(block.genBlockFilePath.toString)
			fileW.write(block.genBlockCode.toString)
			fileW.close
		}
	}
	
	def boolean checkBlock(Classifier classifier) {
		// TODO more elaborate validity check
		return ! queryEngine.mangledNameCollision.hasMatch(null, classifier, null)
	}
		
	def genBlockCode(Classifier block) '''
		class «block.genName»:
		    """ 
		        Class automatically generated from «block.humanName».
		        Placed into «block.genBlockFilePath».
		        Refer to this Python class as «block.genPackageableElementRef»
		    """
		    
		    def __init__(self):
		        pass
		        
	'''
	
	def genBlockFilePath(Classifier block) 
		'''«rootPath»/«block.genPackageableElementPathSteps.join('/')».py'''

	def CharSequence genPackageableElementRef(PackageableElement block) {
		block.genPackageableElementPathSteps.join('.')
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