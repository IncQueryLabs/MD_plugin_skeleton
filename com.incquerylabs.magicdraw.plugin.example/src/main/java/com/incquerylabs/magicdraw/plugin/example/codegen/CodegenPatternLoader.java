package com.incquerylabs.magicdraw.plugin.example.codegen;

import java.io.IOException;
import java.util.Optional;

import org.eclipse.viatra.query.patternlanguage.emf.util.PatternParser;
import org.eclipse.viatra.query.patternlanguage.emf.util.PatternParserBuilder;
import org.eclipse.viatra.query.patternlanguage.emf.util.PatternParsingResults;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.xtext.validation.Issue;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.uml.Finder;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.OpaqueBehavior;

public class CodegenPatternLoader {

	private static final String CONNECTOR_END_NESTED_PATH = "connectorEndNestedPath";
	private static final String DELEGATION_TO_GEN = "delegationToGen";
	private static final String ASSEMBLY_TO_GEN = "assemblyToGen";
	private static final String BLOCK_MUST_IMPORT = "blockMustImport";
	private static final String MANDATORY_PART_TO_GEN = "mandatoryPartToGen";
	private static final String MANGLED_NAME_COLLISION = "mangledNameCollision";
	private static final String BLOCK_TO_GEN = "blockToGen";
	private static final String PORT_TO_GEN = "portToGen";
	
	public static final String QUERY_DEFINITION_NAME_FOR_CODE_GEN = "QueryDefinitionForCodeGen";
	private PatternParsingResults parsingResults;
	

	public void init() throws IOException {
		Project project = Application.getInstance().getProject();
		if (project == null)
			throw new IllegalArgumentException("No project is open.");

		OpaqueBehavior queryDefinition = Finder.byNameRecursively().find(project.getPrimaryModel(),
				OpaqueBehavior.class, QUERY_DEFINITION_NAME_FOR_CODE_GEN);

		if (queryDefinition == null)
			throw new IllegalArgumentException("Behavior " + QUERY_DEFINITION_NAME_FOR_CODE_GEN + " is missing.");

		if (!queryDefinition.getLanguage().contains("VQL"))
			throw new IllegalArgumentException("Only VQL behavior is supported.");

		if (queryDefinition.getBody().isEmpty())
			throw new IllegalArgumentException("No pattern is provided.");

		parseQueryDefinitions(queryDefinition);
		
	}

	private void parseQueryDefinitions(OpaqueBehavior queryDefinition) {
		String queryDefinitionSerialized = GenPythonHelper.prepare(queryDefinition).toString();

		PatternParserBuilder parserBuilder = new PatternParserBuilder();
		PatternParser parser = parserBuilder.build();
		parsingResults = parser.parse(queryDefinitionSerialized);
		for (Issue issue : parsingResults.getErrors()) {
			System.out.println(issue.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	ViatraQueryMatcher<IPatternMatch> getBlockToGen(final ViatraQueryEngine engine) throws IllegalAccessException {
		Optional<IQuerySpecification<?>> querySpecification = parsingResults.getQuerySpecification(BLOCK_TO_GEN);
		if(querySpecification.isPresent())
			return (ViatraQueryMatcher<IPatternMatch>) engine.getMatcher(querySpecification.get());
		
		throw new IllegalAccessException(BLOCK_TO_GEN + " is missing from the QueryDefinition.");
	}
	
	@SuppressWarnings("unchecked")
	ViatraQueryMatcher<IPatternMatch> getPortToGen(final ViatraQueryEngine engine) throws IllegalAccessException {
		Optional<IQuerySpecification<?>> querySpecification = parsingResults.getQuerySpecification(PORT_TO_GEN);
		if(querySpecification.isPresent())
			return (ViatraQueryMatcher<IPatternMatch>) engine.getMatcher(querySpecification.get());
		
		throw new IllegalAccessException(PORT_TO_GEN + " is missing from the QueryDefinition.");
	}
	
	@SuppressWarnings("unchecked")
	ViatraQueryMatcher<IPatternMatch> getMangledNameCollision(final ViatraQueryEngine engine) throws IllegalAccessException {
		Optional<IQuerySpecification<?>> querySpecification = parsingResults.getQuerySpecification(MANGLED_NAME_COLLISION);
		if(querySpecification.isPresent())
			return (ViatraQueryMatcher<IPatternMatch>) engine.getMatcher(querySpecification.get());
		
		throw new IllegalAccessException(MANGLED_NAME_COLLISION + " is missing from the QueryDefinition.");
	}
	
	@SuppressWarnings("unchecked")
	ViatraQueryMatcher<IPatternMatch> getMandatoryPartToGen(final ViatraQueryEngine engine) throws IllegalAccessException {
		Optional<IQuerySpecification<?>> querySpecification = parsingResults.getQuerySpecification(MANDATORY_PART_TO_GEN);
		if(querySpecification.isPresent())
			return (ViatraQueryMatcher<IPatternMatch>) engine.getMatcher(querySpecification.get());
		
		throw new IllegalAccessException(MANDATORY_PART_TO_GEN + " is missing from the QueryDefinition.");
	}
	
	@SuppressWarnings("unchecked")
	ViatraQueryMatcher<IPatternMatch> getBlockMustImport(final ViatraQueryEngine engine) throws IllegalAccessException {
		Optional<IQuerySpecification<?>> querySpecification = parsingResults.getQuerySpecification(BLOCK_MUST_IMPORT);
		if(querySpecification.isPresent())
			return (ViatraQueryMatcher<IPatternMatch>) engine.getMatcher(querySpecification.get());
		
		throw new IllegalAccessException(BLOCK_MUST_IMPORT + " is missing from the QueryDefinition.");
	}
	
	@SuppressWarnings("unchecked")
	ViatraQueryMatcher<IPatternMatch> getAssemblyToGen(final ViatraQueryEngine engine) throws IllegalAccessException {
		Optional<IQuerySpecification<?>> querySpecification = parsingResults.getQuerySpecification(ASSEMBLY_TO_GEN);
		if(querySpecification.isPresent())
			return (ViatraQueryMatcher<IPatternMatch>) engine.getMatcher(querySpecification.get());
		
		throw new IllegalAccessException(ASSEMBLY_TO_GEN + " is missing from the QueryDefinition.");
	}
	
	@SuppressWarnings("unchecked")
	ViatraQueryMatcher<IPatternMatch> getDelegationToGen(final ViatraQueryEngine engine) throws IllegalAccessException {
		Optional<IQuerySpecification<?>> querySpecification = parsingResults.getQuerySpecification(DELEGATION_TO_GEN);
		if(querySpecification.isPresent())
			return (ViatraQueryMatcher<IPatternMatch>) engine.getMatcher(querySpecification.get());
		
		throw new IllegalAccessException(DELEGATION_TO_GEN + " is missing from the QueryDefinition.");
	}
	
	@SuppressWarnings("unchecked")
	ViatraQueryMatcher<IPatternMatch> getConnectorEndNestedPath(final ViatraQueryEngine engine) throws IllegalAccessException {
		Optional<IQuerySpecification<?>> querySpecification = parsingResults.getQuerySpecification(CONNECTOR_END_NESTED_PATH);
		if(querySpecification.isPresent())
			return (ViatraQueryMatcher<IPatternMatch>) engine.getMatcher(querySpecification.get());
		
		throw new IllegalAccessException(CONNECTOR_END_NESTED_PATH + " is missing from the QueryDefinition.");
	}
}
