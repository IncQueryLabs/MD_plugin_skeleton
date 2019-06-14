/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.MultiplicityElement;
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
 *         pattern toOneUpper(multiplicityElement: MultiplicityElement) {
 *         	MultiplicityElement.upperValue(multiplicityElement, upperValue);
 *         	LiteralUnlimitedNatural.value(upperValue, 1);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ToOneUpper extends BaseGeneratedEMFQuerySpecification<ToOneUpper.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.toOneUpper pattern,
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
    private MultiplicityElement fMultiplicityElement;
    
    private static List<String> parameterNames = makeImmutableList("multiplicityElement");
    
    private Match(final MultiplicityElement pMultiplicityElement) {
      this.fMultiplicityElement = pMultiplicityElement;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("multiplicityElement".equals(parameterName)) return this.fMultiplicityElement;
      return null;
    }
    
    public MultiplicityElement getMultiplicityElement() {
      return this.fMultiplicityElement;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("multiplicityElement".equals(parameterName) ) {
          this.fMultiplicityElement = (MultiplicityElement) newValue;
          return true;
      }
      return false;
    }
    
    public void setMultiplicityElement(final MultiplicityElement pMultiplicityElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fMultiplicityElement = pMultiplicityElement;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.toOneUpper";
    }
    
    @Override
    public List<String> parameterNames() {
      return ToOneUpper.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fMultiplicityElement};
    }
    
    @Override
    public ToOneUpper.Match toImmutable() {
      return isMutable() ? newMatch(fMultiplicityElement) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"multiplicityElement\"=" + prettyPrintValue(fMultiplicityElement));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fMultiplicityElement);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ToOneUpper.Match)) {
          ToOneUpper.Match other = (ToOneUpper.Match) obj;
          return Objects.equals(fMultiplicityElement, other.fMultiplicityElement);
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
    public ToOneUpper specification() {
      return ToOneUpper.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ToOneUpper.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pMultiplicityElement the fixed value of pattern parameter multiplicityElement, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ToOneUpper.Match newMutableMatch(final MultiplicityElement pMultiplicityElement) {
      return new Mutable(pMultiplicityElement);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pMultiplicityElement the fixed value of pattern parameter multiplicityElement, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ToOneUpper.Match newMatch(final MultiplicityElement pMultiplicityElement) {
      return new Immutable(pMultiplicityElement);
    }
    
    private static final class Mutable extends ToOneUpper.Match {
      Mutable(final MultiplicityElement pMultiplicityElement) {
        super(pMultiplicityElement);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ToOneUpper.Match {
      Immutable(final MultiplicityElement pMultiplicityElement) {
        super(pMultiplicityElement);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.toOneUpper pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern toOneUpper(multiplicityElement: MultiplicityElement) {
   * 	MultiplicityElement.upperValue(multiplicityElement, upperValue);
   * 	LiteralUnlimitedNatural.value(upperValue, 1);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ToOneUpper
   * 
   */
  public static class Matcher extends BaseMatcher<ToOneUpper.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ToOneUpper.Matcher on(final ViatraQueryEngine engine) {
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
    public static ToOneUpper.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_MULTIPLICITYELEMENT = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ToOneUpper.Matcher.class);
    
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
     * @param pMultiplicityElement the fixed value of pattern parameter multiplicityElement, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ToOneUpper.Match> getAllMatches(final MultiplicityElement pMultiplicityElement) {
      return rawStreamAllMatches(new Object[]{pMultiplicityElement}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pMultiplicityElement the fixed value of pattern parameter multiplicityElement, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ToOneUpper.Match> streamAllMatches(final MultiplicityElement pMultiplicityElement) {
      return rawStreamAllMatches(new Object[]{pMultiplicityElement});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pMultiplicityElement the fixed value of pattern parameter multiplicityElement, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ToOneUpper.Match> getOneArbitraryMatch(final MultiplicityElement pMultiplicityElement) {
      return rawGetOneArbitraryMatch(new Object[]{pMultiplicityElement});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pMultiplicityElement the fixed value of pattern parameter multiplicityElement, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final MultiplicityElement pMultiplicityElement) {
      return rawHasMatch(new Object[]{pMultiplicityElement});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pMultiplicityElement the fixed value of pattern parameter multiplicityElement, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final MultiplicityElement pMultiplicityElement) {
      return rawCountMatches(new Object[]{pMultiplicityElement});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pMultiplicityElement the fixed value of pattern parameter multiplicityElement, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final MultiplicityElement pMultiplicityElement, final Consumer<? super ToOneUpper.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pMultiplicityElement}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pMultiplicityElement the fixed value of pattern parameter multiplicityElement, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ToOneUpper.Match newMatch(final MultiplicityElement pMultiplicityElement) {
      return ToOneUpper.Match.newMatch(pMultiplicityElement);
    }
    
    /**
     * Retrieve the set of values that occur in matches for multiplicityElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<MultiplicityElement> rawStreamAllValuesOfmultiplicityElement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_MULTIPLICITYELEMENT, parameters).map(MultiplicityElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for multiplicityElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<MultiplicityElement> getAllValuesOfmultiplicityElement() {
      return rawStreamAllValuesOfmultiplicityElement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for multiplicityElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<MultiplicityElement> streamAllValuesOfmultiplicityElement() {
      return rawStreamAllValuesOfmultiplicityElement(emptyArray());
    }
    
    @Override
    protected ToOneUpper.Match tupleToMatch(final Tuple t) {
      try {
          return ToOneUpper.Match.newMatch((MultiplicityElement) t.get(POSITION_MULTIPLICITYELEMENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ToOneUpper.Match arrayToMatch(final Object[] match) {
      try {
          return ToOneUpper.Match.newMatch((MultiplicityElement) match[POSITION_MULTIPLICITYELEMENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ToOneUpper.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ToOneUpper.Match.newMutableMatch((MultiplicityElement) match[POSITION_MULTIPLICITYELEMENT]);
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
    public static IQuerySpecification<ToOneUpper.Matcher> querySpecification() {
      return ToOneUpper.instance();
    }
  }
  
  private ToOneUpper() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ToOneUpper instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ToOneUpper.Matcher instantiate(final ViatraQueryEngine engine) {
    return ToOneUpper.Matcher.on(engine);
  }
  
  @Override
  public ToOneUpper.Matcher instantiate() {
    return ToOneUpper.Matcher.create();
  }
  
  @Override
  public ToOneUpper.Match newEmptyMatch() {
    return ToOneUpper.Match.newEmptyMatch();
  }
  
  @Override
  public ToOneUpper.Match newMatch(final Object... parameters) {
    return ToOneUpper.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.MultiplicityElement) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.ToOneUpper (visibility: PUBLIC, simpleName: ToOneUpper, identifier: com.incquerylabs.magicdraw.plugin.example.queries.ToOneUpper, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.ToOneUpper (visibility: PUBLIC, simpleName: ToOneUpper, identifier: com.incquerylabs.magicdraw.plugin.example.queries.ToOneUpper, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ToOneUpper INSTANCE = new ToOneUpper();
    
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
    private static final ToOneUpper.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_multiplicityElement = new PParameter("multiplicityElement", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.MultiplicityElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_multiplicityElement);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.toOneUpper";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("multiplicityElement");
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
          PVariable var_multiplicityElement = body.getOrCreateVariableByName("multiplicityElement");
          PVariable var_upperValue = body.getOrCreateVariableByName("upperValue");
          new TypeConstraint(body, Tuples.flatTupleOf(var_multiplicityElement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_multiplicityElement, parameter_multiplicityElement)
          ));
          // 	MultiplicityElement.upperValue(multiplicityElement, upperValue)
          new TypeConstraint(body, Tuples.flatTupleOf(var_multiplicityElement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_multiplicityElement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement", "upperValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")));
          new Equality(body, var__virtual_0_, var_upperValue);
          // 	LiteralUnlimitedNatural.value(upperValue, 1)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, 1);
          new TypeConstraint(body, Tuples.flatTupleOf(var_upperValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_upperValue, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "UnlimitedNatural")));
          new Equality(body, var__virtual_2_, var__virtual_1_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static int evaluateExpression_1_1() {
    return 1;
  }
}
