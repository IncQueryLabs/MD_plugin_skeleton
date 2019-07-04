/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/sysml/SysMLLibrary.vql
 */
package sysml;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.mdusecases.Actor;
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
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
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
import util.StereotypedElement;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // Non-Normative Extensions - Actors
 *         
 *         
 *           Pattern that queries elements with the stereotype 'Actuator' or other stereotypes generalizing it.
 *          
 *           Parameters:
 *           element : 'Actor' object with the stereotype Actuator.
 *           domainStereotypeInstance : Stereotype Application instance
 *          
 *         pattern Actuator(element : Actor, domainStereotypeInstance : InstanceSpecification){
 *         	find util.stereotypedElement(element, domainStereotypeInstance, "SysML", "Actuator");
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Actuator extends BaseGeneratedEMFQuerySpecification<Actuator.Matcher> {
  /**
   * Pattern-specific match representation of the sysml.Actuator pattern,
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
    private Actor fElement;
    
    private InstanceSpecification fDomainStereotypeInstance;
    
    private static List<String> parameterNames = makeImmutableList("element", "domainStereotypeInstance");
    
    private Match(final Actor pElement, final InstanceSpecification pDomainStereotypeInstance) {
      this.fElement = pElement;
      this.fDomainStereotypeInstance = pDomainStereotypeInstance;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("element".equals(parameterName)) return this.fElement;
      if ("domainStereotypeInstance".equals(parameterName)) return this.fDomainStereotypeInstance;
      return null;
    }
    
    public Actor getElement() {
      return this.fElement;
    }
    
    public InstanceSpecification getDomainStereotypeInstance() {
      return this.fDomainStereotypeInstance;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("element".equals(parameterName) ) {
          this.fElement = (Actor) newValue;
          return true;
      }
      if ("domainStereotypeInstance".equals(parameterName) ) {
          this.fDomainStereotypeInstance = (InstanceSpecification) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final Actor pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setDomainStereotypeInstance(final InstanceSpecification pDomainStereotypeInstance) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDomainStereotypeInstance = pDomainStereotypeInstance;
    }
    
    @Override
    public String patternName() {
      return "sysml.Actuator";
    }
    
    @Override
    public List<String> parameterNames() {
      return Actuator.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fDomainStereotypeInstance};
    }
    
    @Override
    public Actuator.Match toImmutable() {
      return isMutable() ? newMatch(fElement, fDomainStereotypeInstance) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"element\"=" + prettyPrintValue(fElement) + ", ");
      result.append("\"domainStereotypeInstance\"=" + prettyPrintValue(fDomainStereotypeInstance));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElement, fDomainStereotypeInstance);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Actuator.Match)) {
          Actuator.Match other = (Actuator.Match) obj;
          return Objects.equals(fElement, other.fElement) && Objects.equals(fDomainStereotypeInstance, other.fDomainStereotypeInstance);
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
    public Actuator specification() {
      return Actuator.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Actuator.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Actuator.Match newMutableMatch(final Actor pElement, final InstanceSpecification pDomainStereotypeInstance) {
      return new Mutable(pElement, pDomainStereotypeInstance);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Actuator.Match newMatch(final Actor pElement, final InstanceSpecification pDomainStereotypeInstance) {
      return new Immutable(pElement, pDomainStereotypeInstance);
    }
    
    private static final class Mutable extends Actuator.Match {
      Mutable(final Actor pElement, final InstanceSpecification pDomainStereotypeInstance) {
        super(pElement, pDomainStereotypeInstance);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Actuator.Match {
      Immutable(final Actor pElement, final InstanceSpecification pDomainStereotypeInstance) {
        super(pElement, pDomainStereotypeInstance);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the sysml.Actuator pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // Non-Normative Extensions - Actors
   * 
   * 
   *   Pattern that queries elements with the stereotype 'Actuator' or other stereotypes generalizing it.
   *  
   *   Parameters:
   *   element : 'Actor' object with the stereotype Actuator.
   *   domainStereotypeInstance : Stereotype Application instance
   *  
   * pattern Actuator(element : Actor, domainStereotypeInstance : InstanceSpecification){
   * 	find util.stereotypedElement(element, domainStereotypeInstance, "SysML", "Actuator");
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Actuator
   * 
   */
  public static class Matcher extends BaseMatcher<Actuator.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Actuator.Matcher on(final ViatraQueryEngine engine) {
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
    public static Actuator.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_DOMAINSTEREOTYPEINSTANCE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Actuator.Matcher.class);
    
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
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Actuator.Match> getAllMatches(final Actor pElement, final InstanceSpecification pDomainStereotypeInstance) {
      return rawStreamAllMatches(new Object[]{pElement, pDomainStereotypeInstance}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Actuator.Match> streamAllMatches(final Actor pElement, final InstanceSpecification pDomainStereotypeInstance) {
      return rawStreamAllMatches(new Object[]{pElement, pDomainStereotypeInstance});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Actuator.Match> getOneArbitraryMatch(final Actor pElement, final InstanceSpecification pDomainStereotypeInstance) {
      return rawGetOneArbitraryMatch(new Object[]{pElement, pDomainStereotypeInstance});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Actor pElement, final InstanceSpecification pDomainStereotypeInstance) {
      return rawHasMatch(new Object[]{pElement, pDomainStereotypeInstance});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Actor pElement, final InstanceSpecification pDomainStereotypeInstance) {
      return rawCountMatches(new Object[]{pElement, pDomainStereotypeInstance});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Actor pElement, final InstanceSpecification pDomainStereotypeInstance, final Consumer<? super Actuator.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement, pDomainStereotypeInstance}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Actuator.Match newMatch(final Actor pElement, final InstanceSpecification pDomainStereotypeInstance) {
      return Actuator.Match.newMatch(pElement, pDomainStereotypeInstance);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Actor> rawStreamAllValuesOfelement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(Actor.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Actor> getAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Actor> streamAllValuesOfelement() {
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
    public Stream<Actor> streamAllValuesOfelement(final Actuator.Match partialMatch) {
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
    public Stream<Actor> streamAllValuesOfelement(final InstanceSpecification pDomainStereotypeInstance) {
      return rawStreamAllValuesOfelement(new Object[]{null, pDomainStereotypeInstance});
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Actor> getAllValuesOfelement(final Actuator.Match partialMatch) {
      return rawStreamAllValuesOfelement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Actor> getAllValuesOfelement(final InstanceSpecification pDomainStereotypeInstance) {
      return rawStreamAllValuesOfelement(new Object[]{null, pDomainStereotypeInstance}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for domainStereotypeInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<InstanceSpecification> rawStreamAllValuesOfdomainStereotypeInstance(final Object[] parameters) {
      return rawStreamAllValues(POSITION_DOMAINSTEREOTYPEINSTANCE, parameters).map(InstanceSpecification.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for domainStereotypeInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InstanceSpecification> getAllValuesOfdomainStereotypeInstance() {
      return rawStreamAllValuesOfdomainStereotypeInstance(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for domainStereotypeInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<InstanceSpecification> streamAllValuesOfdomainStereotypeInstance() {
      return rawStreamAllValuesOfdomainStereotypeInstance(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for domainStereotypeInstance.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<InstanceSpecification> streamAllValuesOfdomainStereotypeInstance(final Actuator.Match partialMatch) {
      return rawStreamAllValuesOfdomainStereotypeInstance(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for domainStereotypeInstance.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<InstanceSpecification> streamAllValuesOfdomainStereotypeInstance(final Actor pElement) {
      return rawStreamAllValuesOfdomainStereotypeInstance(new Object[]{pElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for domainStereotypeInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InstanceSpecification> getAllValuesOfdomainStereotypeInstance(final Actuator.Match partialMatch) {
      return rawStreamAllValuesOfdomainStereotypeInstance(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for domainStereotypeInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InstanceSpecification> getAllValuesOfdomainStereotypeInstance(final Actor pElement) {
      return rawStreamAllValuesOfdomainStereotypeInstance(new Object[]{pElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Actuator.Match tupleToMatch(final Tuple t) {
      try {
          return Actuator.Match.newMatch((Actor) t.get(POSITION_ELEMENT), (InstanceSpecification) t.get(POSITION_DOMAINSTEREOTYPEINSTANCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Actuator.Match arrayToMatch(final Object[] match) {
      try {
          return Actuator.Match.newMatch((Actor) match[POSITION_ELEMENT], (InstanceSpecification) match[POSITION_DOMAINSTEREOTYPEINSTANCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Actuator.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Actuator.Match.newMutableMatch((Actor) match[POSITION_ELEMENT], (InstanceSpecification) match[POSITION_DOMAINSTEREOTYPEINSTANCE]);
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
    public static IQuerySpecification<Actuator.Matcher> querySpecification() {
      return Actuator.instance();
    }
  }
  
  private Actuator() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Actuator instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Actuator.Matcher instantiate(final ViatraQueryEngine engine) {
    return Actuator.Matcher.on(engine);
  }
  
  @Override
  public Actuator.Matcher instantiate() {
    return Actuator.Matcher.create();
  }
  
  @Override
  public Actuator.Match newEmptyMatch() {
    return Actuator.Match.newEmptyMatch();
  }
  
  @Override
  public Actuator.Match newMatch(final Object... parameters) {
    return Actuator.Match.newMatch((com.nomagic.uml2.ext.magicdraw.mdusecases.Actor) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: sysml.Actuator (visibility: PUBLIC, simpleName: Actuator, identifier: sysml.Actuator, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: sysml) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: sysml.Actuator (visibility: PUBLIC, simpleName: Actuator, identifier: sysml.Actuator, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: sysml) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Actuator INSTANCE = new Actuator();
    
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
    private static final Actuator.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_element = new PParameter("element", "com.nomagic.uml2.ext.magicdraw.mdusecases.Actor", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Actor")), PParameterDirection.INOUT);
    
    private final PParameter parameter_domainStereotypeInstance = new PParameter("domainStereotypeInstance", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_element, parameter_domainStereotypeInstance);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "sysml.Actuator";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("element","domainStereotypeInstance");
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
          PVariable var_domainStereotypeInstance = body.getOrCreateVariableByName("domainStereotypeInstance");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Actor")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_domainStereotypeInstance), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_element, parameter_element),
             new ExportedParameter(body, var_domainStereotypeInstance, parameter_domainStereotypeInstance)
          ));
          // 	find util.stereotypedElement(element, domainStereotypeInstance, "SysML", "Actuator")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "SysML");
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, "Actuator");
          new PositivePatternCall(body, Tuples.flatTupleOf(var_element, var_domainStereotypeInstance, var__virtual_0_, var__virtual_1_), StereotypedElement.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
