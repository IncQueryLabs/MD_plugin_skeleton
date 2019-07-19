package com.incquerylabs.magicdraw.plugin.example.codegen

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.OpaqueBehavior
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher

class GenPythonHelper {
	
	
	def getAllValuesOfblock(ViatraQueryMatcher<IPatternMatch> matcher, Package pack) {
		val filterMatch = matcher.newEmptyMatch()
		filterMatch.set("pack", pack)
		return matcher.getAllValues("block", filterMatch).map[block | block as Class];
	}
	
	def getAllValuesOfport(ViatraQueryMatcher<IPatternMatch> matcher, Class block) {
		val filterMatch = matcher.newEmptyMatch()
		filterMatch.set("block", block)
		return matcher.getAllValues("port", filterMatch).map[port | port as Port];
	}
	
	def getAllValuesOfconnector(ViatraQueryMatcher<IPatternMatch> matcher, Class block) {
		val filterMatch = matcher.newEmptyMatch()
		filterMatch.set("block", block)
		return matcher.getAllValues("connector", filterMatch).map[connector | connector as Connector];
	}
	
	def getAllValuesOfpart(ViatraQueryMatcher<IPatternMatch> matcher, Class block) {
		val filterMatch = matcher.newEmptyMatch()
		filterMatch.set("block", block)
		return matcher.getAllValues("part", filterMatch).map[part | part as Property];
	}
	
	def getAllValuesOfpropertyPath(ViatraQueryMatcher<IPatternMatch> matcher, ConnectorEnd end) {
		val filterMatch = matcher.newEmptyMatch()
		filterMatch.set("end", end)
		return matcher.getAllValues("propertyPath", filterMatch).map[propertyPath | propertyPath as Slot];
	}
	
	def getAllValuesOfimportedBlock(ViatraQueryMatcher<IPatternMatch> matcher, Class block) {
		val filterMatch = matcher.newEmptyMatch()
		filterMatch.set("block", block)
		return matcher.getAllValues("importedBlock", filterMatch).map[importedBlock | importedBlock as Class];
	}
	
	def mangledName(IPatternMatch match) {
		return match.get("mangledName")
	}
	
	def hasMatch(ViatraQueryMatcher<IPatternMatch> matcher, Object value, Object value2) {
		val filterMatch = matcher.newEmptyMatch()
		filterMatch.set(0, value);
		filterMatch.set(1, value2);
		return matcher.hasMatch(filterMatch);
	}
	
	def getOneArbitraryMatch(ViatraQueryMatcher<IPatternMatch> matcher, Object value, Object value2, Object value3) {
		val filterMatch = matcher.newEmptyMatch()
		filterMatch.set(0, value);
		filterMatch.set(1, value2);
		filterMatch.set(2, value3);
		return matcher.getOneArbitraryMatch(filterMatch);
	}
	
	def getAllMatches(ViatraQueryMatcher<IPatternMatch> matcher, Object value, Object value2, Object value3, Object value4) {
		val filterMatch = matcher.newEmptyMatch()
		filterMatch.set(0, value);
		filterMatch.set(1, value2);
		filterMatch.set(2, value3);
		filterMatch.set(3, value4);
		return matcher.getAllMatches(filterMatch);
	}
	
	def static prepare(OpaqueBehavior queryDefinition) '''
	import "http://www.nomagic.com/magicdraw/UML/2.5.1"
	import java com.incquerylabs.magicdraw.plugin.example.codegen.CodegenUtil;
	
	pattern mangledNameCollision(namespace: Namespace, element : NamedElement, mangledName: java String) {
		find mangledNameInNamespace(namespace, element, mangledName);
		sameMangledNameElements == count find mangledNameInNamespace(namespace, _, mangledName);
		check(sameMangledNameElements > 1);
	}
	
	pattern mangledNameInNamespace(namespace: Namespace, element : NamedElement, mangledName: java String) {
		find elementInNamespace(element, namespace);
		find namedElementToGen(element);
		find mangledName(element, mangledName);
	}
	
	pattern mangledName(element : NamedElement, mangledName: java String) {
		NamedElement.name(element, name);
		mangledName == eval(CodegenUtil.mangleName(name));
	}
	
	«queryDefinition.body.get(0)»
	'''
	
}