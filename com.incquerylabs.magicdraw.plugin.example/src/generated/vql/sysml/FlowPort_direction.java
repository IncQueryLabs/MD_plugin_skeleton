/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/sysml/SysMLLibrary.vql
 */
package sysml;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port;
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
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import sysml.FlowPort;
import util.SlotValue;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         Pattern that queries the 'direction' attribute of elements with the stereotype 'FlowPort'.
 *           
 *           Parameters: 
 *           	element: 'Port' object with the stereotype 'FlowPort'.
 *           	value : EnumerationLiteral : A value of the attribute 'direction'.
 *          
 *         pattern FlowPort_direction(element : Port, value : EnumerationLiteral){
 *         	find FlowPort(element, domainStereotypeInstance);
 *         	find util.slotValue(domainStereotypeInstance, "direction", valuespec);
 *         	InstanceValue.instance(valuespec, value);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FlowPort_direction extends BaseGeneratedEMFQuerySpecification<FlowPort_direction.Matcher> {
  /**
   * Pattern-specific match representation of the sysml.FlowPort_direction pattern,
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
    private Port fElement;
    
    private EnumerationLiteral fValue;
    
    private static List<String> parameterNames = makeImmutableList("element", "value");
    
    private Match(final Port pElement, final EnumerationLiteral pValue) {
      this.fElement = pElement;
      this.fValue = pValue;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("element".equals(parameterName)) return this.fElement;
      if ("value".equals(parameterName)) return this.fValue;
      return null;
    }
    
    public Port getElement() {
      return this.fElement;
    }
    
    public EnumerationLiteral getValue() {
      return this.fValue;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("element".equals(parameterName) ) {
          this.fElement = (Port) newValue;
          return true;
      }
      if ("value".equals(parameterName) ) {
          this.fValue = (EnumerationLiteral) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final Port pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setValue(final EnumerationLiteral pValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fValue = pValue;
    }
    
    @Override
    public String patternName() {
      return "sysml.FlowPort_direction";
    }
    
    @Override
    public List<String> parameterNames() {
      return FlowPort_direction.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fValue};
    }
    
    @Override
    public FlowPort_direction.Match toImmutable() {
      return isMutable() ? newMatch(fElement, fValue) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"element\"=" + prettyPrintValue(fElement) + ", ");
      result.append("\"value\"=" + prettyPrintValue(fValue));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElement, fValue);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FlowPort_direction.Match)) {
          FlowPort_direction.Match other = (FlowPort_direction.Match) obj;
          return Objects.equals(fElement, other.fElement) && Objects.equals(fValue, other.fValue);
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
    public FlowPort_direction specification() {
      return FlowPort_direction.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FlowPort_direction.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FlowPort_direction.Match newMutableMatch(final Port pElement, final EnumerationLiteral pValue) {
      return new Mutable(pElement, pValue);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FlowPort_direction.Match newMatch(final Port pElement, final EnumerationLiteral pValue) {
      return new Immutable(pElement, pValue);
    }
    
    private static final class Mutable extends FlowPort_direction.Match {
      Mutable(final Port pElement, final EnumerationLiteral pValue) {
        super(pElement, pValue);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends FlowPort_direction.Match {
      Immutable(final Port pElement, final EnumerationLiteral pValue) {
        super(pElement, pValue);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the sysml.FlowPort_direction pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Pattern that queries the 'direction' attribute of elements with the stereotype 'FlowPort'.
   *   
   *   Parameters: 
   *   	element: 'Port' object with the stereotype 'FlowPort'.
   *   	value : EnumerationLiteral : A value of the attribute 'direction'.
   *  
   * pattern FlowPort_direction(element : Port, value : EnumerationLiteral){
   * 	find FlowPort(element, domainStereotypeInstance);
   * 	find util.slotValue(domainStereotypeInstance, "direction", valuespec);
   * 	InstanceValue.instance(valuespec, value);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FlowPort_direction
   * 
   */
  public static class Matcher extends BaseMatcher<FlowPort_direction.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FlowPort_direction.Matcher on(final ViatraQueryEngine engine) {
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
    public static FlowPort_direction.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_VALUE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FlowPort_direction.Matcher.class);
    
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
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FlowPort_direction.Match> getAllMatches(final Port pElement, final EnumerationLiteral pValue) {
      return rawStreamAllMatches(new Object[]{pElement, pValue}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FlowPort_direction.Match> streamAllMatches(final Port pElement, final EnumerationLiteral pValue) {
      return rawStreamAllMatches(new Object[]{pElement, pValue});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FlowPort_direction.Match> getOneArbitraryMatch(final Port pElement, final EnumerationLiteral pValue) {
      return rawGetOneArbitraryMatch(new Object[]{pElement, pValue});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Port pElement, final EnumerationLiteral pValue) {
      return rawHasMatch(new Object[]{pElement, pValue});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Port pElement, final EnumerationLiteral pValue) {
      return rawCountMatches(new Object[]{pElement, pValue});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Port pElement, final EnumerationLiteral pValue, final Consumer<? super FlowPort_direction.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement, pValue}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FlowPort_direction.Match newMatch(final Port pElement, final EnumerationLiteral pValue) {
      return FlowPort_direction.Match.newMatch(pElement, pValue);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Port> rawStreamAllValuesOfelement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(Port.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfelement(final FlowPort_direction.Match partialMatch) {
      return rawStreamAllValuesOfelement(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfelement(final EnumerationLiteral pValue) {
      return rawStreamAllValuesOfelement(new Object[]{null, pValue});
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfelement(final FlowPort_direction.Match partialMatch) {
      return rawStreamAllValuesOfelement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfelement(final EnumerationLiteral pValue) {
      return rawStreamAllValuesOfelement(new Object[]{null, pValue}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EnumerationLiteral> rawStreamAllValuesOfvalue(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VALUE, parameters).map(EnumerationLiteral.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfvalue() {
      return rawStreamAllValuesOfvalue(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EnumerationLiteral> streamAllValuesOfvalue() {
      return rawStreamAllValuesOfvalue(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EnumerationLiteral> streamAllValuesOfvalue(final FlowPort_direction.Match partialMatch) {
      return rawStreamAllValuesOfvalue(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EnumerationLiteral> streamAllValuesOfvalue(final Port pElement) {
      return rawStreamAllValuesOfvalue(new Object[]{pElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfvalue(final FlowPort_direction.Match partialMatch) {
      return rawStreamAllValuesOfvalue(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfvalue(final Port pElement) {
      return rawStreamAllValuesOfvalue(new Object[]{pElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected FlowPort_direction.Match tupleToMatch(final Tuple t) {
      try {
          return FlowPort_direction.Match.newMatch((Port) t.get(POSITION_ELEMENT), (EnumerationLiteral) t.get(POSITION_VALUE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected FlowPort_direction.Match arrayToMatch(final Object[] match) {
      try {
          return FlowPort_direction.Match.newMatch((Port) match[POSITION_ELEMENT], (EnumerationLiteral) match[POSITION_VALUE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected FlowPort_direction.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FlowPort_direction.Match.newMutableMatch((Port) match[POSITION_ELEMENT], (EnumerationLiteral) match[POSITION_VALUE]);
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
    public static IQuerySpecification<FlowPort_direction.Matcher> querySpecification() {
      return FlowPort_direction.instance();
    }
  }
  
  private FlowPort_direction() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FlowPort_direction instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected FlowPort_direction.Matcher instantiate(final ViatraQueryEngine engine) {
    return FlowPort_direction.Matcher.on(engine);
  }
  
  @Override
  public FlowPort_direction.Matcher instantiate() {
    return FlowPort_direction.Matcher.create();
  }
  
  @Override
  public FlowPort_direction.Match newEmptyMatch() {
    return FlowPort_direction.Match.newEmptyMatch();
  }
  
  @Override
  public FlowPort_direction.Match newMatch(final Object... parameters) {
    return FlowPort_direction.Match.newMatch((com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: sysml.FlowPort_direction (visibility: PUBLIC, simpleName: FlowPort_direction, identifier: sysml.FlowPort_direction, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: sysml) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: sysml.FlowPort_direction (visibility: PUBLIC, simpleName: FlowPort_direction, identifier: sysml.FlowPort_direction, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: sysml) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FlowPort_direction INSTANCE = new FlowPort_direction();
    
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
    private static final FlowPort_direction.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_element = new PParameter("element", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Port")), PParameterDirection.INOUT);
    
    private final PParameter parameter_value = new PParameter("value", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "EnumerationLiteral")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_element, parameter_value);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "sysml.FlowPort_direction";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("element","value");
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
          PVariable var_element = body.getOrCreateVariableByName("element");
          PVariable var_value = body.getOrCreateVariableByName("value");
          PVariable var_domainStereotypeInstance = body.getOrCreateVariableByName("domainStereotypeInstance");
          PVariable var_valuespec = body.getOrCreateVariableByName("valuespec");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Port")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_value), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "EnumerationLiteral")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_element, parameter_element),
             new ExportedParameter(body, var_value, parameter_value)
          ));
          // 	find FlowPort(element, domainStereotypeInstance)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_element, var_domainStereotypeInstance), FlowPort.instance().getInternalQueryRepresentation());
          // 	find util.slotValue(domainStereotypeInstance, "direction", valuespec)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "direction");
          new PositivePatternCall(body, Tuples.flatTupleOf(var_domainStereotypeInstance, var__virtual_0_, var_valuespec), SlotValue.instance().getInternalQueryRepresentation());
          // 	InstanceValue.instance(valuespec, value)
          new TypeConstraint(body, Tuples.flatTupleOf(var_valuespec), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceValue")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_valuespec, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceValue", "instance")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")));
          new Equality(body, var__virtual_1_, var_value);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
