/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/EdgeCheck.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern edgeTest(edge: Abstraction){
 *         	Abstraction.client.name(edge, "UniqueAbstractionClient");
 *         	Abstraction.supplier.name(edge, "UniqueAbstractionSupplier");
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EdgeTest extends BaseGeneratedEMFQuerySpecification<EdgeTest.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.edgeTest pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private Abstraction fEdge;
    
    private static List<String> parameterNames = makeImmutableList("edge");
    
    private Match(final Abstraction pEdge) {
      this.fEdge = pEdge;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "edge": return this.fEdge;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEdge;
          default: return null;
      }
    }
    
    public Abstraction getEdge() {
      return this.fEdge;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("edge".equals(parameterName) ) {
          this.fEdge = (Abstraction) newValue;
          return true;
      }
      return false;
    }
    
    public void setEdge(final Abstraction pEdge) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEdge = pEdge;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.edgeTest";
    }
    
    @Override
    public List<String> parameterNames() {
      return EdgeTest.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEdge};
    }
    
    @Override
    public EdgeTest.Match toImmutable() {
      return isMutable() ? newMatch(fEdge) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"edge\"=" + prettyPrintValue(fEdge));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEdge);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EdgeTest.Match)) {
          EdgeTest.Match other = (EdgeTest.Match) obj;
          return Objects.equals(fEdge, other.fEdge);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public EdgeTest specification() {
      return EdgeTest.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EdgeTest.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEdge the fixed value of pattern parameter edge, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EdgeTest.Match newMutableMatch(final Abstraction pEdge) {
      return new Mutable(pEdge);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEdge the fixed value of pattern parameter edge, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EdgeTest.Match newMatch(final Abstraction pEdge) {
      return new Immutable(pEdge);
    }
    
    private static final class Mutable extends EdgeTest.Match {
      Mutable(final Abstraction pEdge) {
        super(pEdge);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EdgeTest.Match {
      Immutable(final Abstraction pEdge) {
        super(pEdge);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.edgeTest pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern edgeTest(edge: Abstraction){
   * 	Abstraction.client.name(edge, "UniqueAbstractionClient");
   * 	Abstraction.supplier.name(edge, "UniqueAbstractionSupplier");
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EdgeTest
   * 
   */
  public static class Matcher extends BaseMatcher<EdgeTest.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EdgeTest.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static EdgeTest.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_EDGE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EdgeTest.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEdge the fixed value of pattern parameter edge, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EdgeTest.Match> getAllMatches(final Abstraction pEdge) {
      return rawStreamAllMatches(new Object[]{pEdge}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEdge the fixed value of pattern parameter edge, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EdgeTest.Match> streamAllMatches(final Abstraction pEdge) {
      return rawStreamAllMatches(new Object[]{pEdge});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEdge the fixed value of pattern parameter edge, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EdgeTest.Match> getOneArbitraryMatch(final Abstraction pEdge) {
      return rawGetOneArbitraryMatch(new Object[]{pEdge});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEdge the fixed value of pattern parameter edge, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Abstraction pEdge) {
      return rawHasMatch(new Object[]{pEdge});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEdge the fixed value of pattern parameter edge, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Abstraction pEdge) {
      return rawCountMatches(new Object[]{pEdge});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEdge the fixed value of pattern parameter edge, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Abstraction pEdge, final Consumer<? super EdgeTest.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEdge}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEdge the fixed value of pattern parameter edge, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EdgeTest.Match newMatch(final Abstraction pEdge) {
      return EdgeTest.Match.newMatch(pEdge);
    }
    
    /**
     * Retrieve the set of values that occur in matches for edge.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Abstraction> rawStreamAllValuesOfedge(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EDGE, parameters).map(Abstraction.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for edge.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Abstraction> getAllValuesOfedge() {
      return rawStreamAllValuesOfedge(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for edge.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Abstraction> streamAllValuesOfedge() {
      return rawStreamAllValuesOfedge(emptyArray());
    }
    
    @Override
    protected EdgeTest.Match tupleToMatch(final Tuple t) {
      try {
          return EdgeTest.Match.newMatch((Abstraction) t.get(POSITION_EDGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EdgeTest.Match arrayToMatch(final Object[] match) {
      try {
          return EdgeTest.Match.newMatch((Abstraction) match[POSITION_EDGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EdgeTest.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EdgeTest.Match.newMutableMatch((Abstraction) match[POSITION_EDGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<EdgeTest.Matcher> querySpecification() {
      return EdgeTest.instance();
    }
  }
  
  private EdgeTest() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EdgeTest instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EdgeTest.Matcher instantiate(final ViatraQueryEngine engine) {
    return EdgeTest.Matcher.on(engine);
  }
  
  @Override
  public EdgeTest.Matcher instantiate() {
    return EdgeTest.Matcher.create();
  }
  
  @Override
  public EdgeTest.Match newEmptyMatch() {
    return EdgeTest.Match.newEmptyMatch();
  }
  
  @Override
  public EdgeTest.Match newMatch(final Object... parameters) {
    return EdgeTest.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EdgeTest} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EdgeTest#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EdgeTest INSTANCE = new EdgeTest();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final EdgeTest.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_edge = new PParameter("edge", "com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_edge);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.edgeTest";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("edge");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_edge = body.getOrCreateVariableByName("edge");
          new TypeConstraint(body, Tuples.flatTupleOf(var_edge), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_edge, parameter_edge)
          ));
          // 	Abstraction.client.name(edge, "UniqueAbstractionClient")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "UniqueAbstractionClient");
          new TypeConstraint(body, Tuples.flatTupleOf(var_edge), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_edge, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Dependency", "client")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
          new Equality(body, var__virtual_2_, var__virtual_0_);
          // 	Abstraction.supplier.name(edge, "UniqueAbstractionSupplier")
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new ConstantValue(body, var__virtual_3_, "UniqueAbstractionSupplier");
          new TypeConstraint(body, Tuples.flatTupleOf(var_edge), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_edge, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Dependency", "supplier")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
          new Equality(body, var__virtual_5_, var__virtual_3_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
