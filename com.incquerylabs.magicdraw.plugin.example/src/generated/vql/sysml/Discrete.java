/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/sysml/SysMLLibrary.vql
 */
package sysml;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
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
 *         Pattern that queries elements with the stereotype 'Discrete' or other stereotypes generalizing it.
 *          
 *           Parameters:
 *           element : 'NamedElement' object with the stereotype Discrete.
 *           domainStereotypeInstance : Stereotype Application instance
 *          
 *         pattern Discrete(element : NamedElement, domainStereotypeInstance : InstanceSpecification){
 *         	find util.stereotypedElement(element, domainStereotypeInstance, "SysML", "Discrete");
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Discrete extends BaseGeneratedEMFQuerySpecification<Discrete.Matcher> {
  /**
   * Pattern-specific match representation of the sysml.Discrete pattern,
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
    private NamedElement fElement;
    
    private InstanceSpecification fDomainStereotypeInstance;
    
    private static List<String> parameterNames = makeImmutableList("element", "domainStereotypeInstance");
    
    private Match(final NamedElement pElement, final InstanceSpecification pDomainStereotypeInstance) {
      this.fElement = pElement;
      this.fDomainStereotypeInstance = pDomainStereotypeInstance;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("element".equals(parameterName)) return this.fElement;
      if ("domainStereotypeInstance".equals(parameterName)) return this.fDomainStereotypeInstance;
      return null;
    }
    
    public NamedElement getElement() {
      return this.fElement;
    }
    
    public InstanceSpecification getDomainStereotypeInstance() {
      return this.fDomainStereotypeInstance;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("element".equals(parameterName) ) {
          this.fElement = (NamedElement) newValue;
          return true;
      }
      if ("domainStereotypeInstance".equals(parameterName) ) {
          this.fDomainStereotypeInstance = (InstanceSpecification) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final NamedElement pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setDomainStereotypeInstance(final InstanceSpecification pDomainStereotypeInstance) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDomainStereotypeInstance = pDomainStereotypeInstance;
    }
    
    @Override
    public String patternName() {
      return "sysml.Discrete";
    }
    
    @Override
    public List<String> parameterNames() {
      return Discrete.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fDomainStereotypeInstance};
    }
    
    @Override
    public Discrete.Match toImmutable() {
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
      if ((obj instanceof Discrete.Match)) {
          Discrete.Match other = (Discrete.Match) obj;
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
    public Discrete specification() {
      return Discrete.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Discrete.Match newEmptyMatch() {
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
    public static Discrete.Match newMutableMatch(final NamedElement pElement, final InstanceSpecification pDomainStereotypeInstance) {
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
    public static Discrete.Match newMatch(final NamedElement pElement, final InstanceSpecification pDomainStereotypeInstance) {
      return new Immutable(pElement, pDomainStereotypeInstance);
    }
    
    private static final class Mutable extends Discrete.Match {
      Mutable(final NamedElement pElement, final InstanceSpecification pDomainStereotypeInstance) {
        super(pElement, pDomainStereotypeInstance);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Discrete.Match {
      Immutable(final NamedElement pElement, final InstanceSpecification pDomainStereotypeInstance) {
        super(pElement, pDomainStereotypeInstance);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the sysml.Discrete pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Pattern that queries elements with the stereotype 'Discrete' or other stereotypes generalizing it.
   *  
   *   Parameters:
   *   element : 'NamedElement' object with the stereotype Discrete.
   *   domainStereotypeInstance : Stereotype Application instance
   *  
   * pattern Discrete(element : NamedElement, domainStereotypeInstance : InstanceSpecification){
   * 	find util.stereotypedElement(element, domainStereotypeInstance, "SysML", "Discrete");
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Discrete
   * 
   */
  public static class Matcher extends BaseMatcher<Discrete.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Discrete.Matcher on(final ViatraQueryEngine engine) {
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
    public static Discrete.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_DOMAINSTEREOTYPEINSTANCE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Discrete.Matcher.class);
    
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
    public Collection<Discrete.Match> getAllMatches(final NamedElement pElement, final InstanceSpecification pDomainStereotypeInstance) {
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
    public Stream<Discrete.Match> streamAllMatches(final NamedElement pElement, final InstanceSpecification pDomainStereotypeInstance) {
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
    public Optional<Discrete.Match> getOneArbitraryMatch(final NamedElement pElement, final InstanceSpecification pDomainStereotypeInstance) {
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
    public boolean hasMatch(final NamedElement pElement, final InstanceSpecification pDomainStereotypeInstance) {
      return rawHasMatch(new Object[]{pElement, pDomainStereotypeInstance});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final NamedElement pElement, final InstanceSpecification pDomainStereotypeInstance) {
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
    public boolean forOneArbitraryMatch(final NamedElement pElement, final InstanceSpecification pDomainStereotypeInstance, final Consumer<? super Discrete.Match> processor) {
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
    public Discrete.Match newMatch(final NamedElement pElement, final InstanceSpecification pDomainStereotypeInstance) {
      return Discrete.Match.newMatch(pElement, pDomainStereotypeInstance);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<NamedElement> rawStreamAllValuesOfelement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(NamedElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOfelement() {
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
    public Stream<NamedElement> streamAllValuesOfelement(final Discrete.Match partialMatch) {
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
    public Stream<NamedElement> streamAllValuesOfelement(final InstanceSpecification pDomainStereotypeInstance) {
      return rawStreamAllValuesOfelement(new Object[]{null, pDomainStereotypeInstance});
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfelement(final Discrete.Match partialMatch) {
      return rawStreamAllValuesOfelement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfelement(final InstanceSpecification pDomainStereotypeInstance) {
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
    public Stream<InstanceSpecification> streamAllValuesOfdomainStereotypeInstance(final Discrete.Match partialMatch) {
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
    public Stream<InstanceSpecification> streamAllValuesOfdomainStereotypeInstance(final NamedElement pElement) {
      return rawStreamAllValuesOfdomainStereotypeInstance(new Object[]{pElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for domainStereotypeInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InstanceSpecification> getAllValuesOfdomainStereotypeInstance(final Discrete.Match partialMatch) {
      return rawStreamAllValuesOfdomainStereotypeInstance(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for domainStereotypeInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InstanceSpecification> getAllValuesOfdomainStereotypeInstance(final NamedElement pElement) {
      return rawStreamAllValuesOfdomainStereotypeInstance(new Object[]{pElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Discrete.Match tupleToMatch(final Tuple t) {
      try {
          return Discrete.Match.newMatch((NamedElement) t.get(POSITION_ELEMENT), (InstanceSpecification) t.get(POSITION_DOMAINSTEREOTYPEINSTANCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Discrete.Match arrayToMatch(final Object[] match) {
      try {
          return Discrete.Match.newMatch((NamedElement) match[POSITION_ELEMENT], (InstanceSpecification) match[POSITION_DOMAINSTEREOTYPEINSTANCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Discrete.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Discrete.Match.newMutableMatch((NamedElement) match[POSITION_ELEMENT], (InstanceSpecification) match[POSITION_DOMAINSTEREOTYPEINSTANCE]);
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
    public static IQuerySpecification<Discrete.Matcher> querySpecification() {
      return Discrete.instance();
    }
  }
  
  private Discrete() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Discrete instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Discrete.Matcher instantiate(final ViatraQueryEngine engine) {
    return Discrete.Matcher.on(engine);
  }
  
  @Override
  public Discrete.Matcher instantiate() {
    return Discrete.Matcher.create();
  }
  
  @Override
  public Discrete.Match newEmptyMatch() {
    return Discrete.Match.newEmptyMatch();
  }
  
  @Override
  public Discrete.Match newMatch(final Object... parameters) {
    return Discrete.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: sysml.Discrete (visibility: PUBLIC, simpleName: Discrete, identifier: sysml.Discrete, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: sysml) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: sysml.Discrete (visibility: PUBLIC, simpleName: Discrete, identifier: sysml.Discrete, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: sysml) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Discrete INSTANCE = new Discrete();
    
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
    private static final Discrete.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_element = new PParameter("element", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")), PParameterDirection.INOUT);
    
    private final PParameter parameter_domainStereotypeInstance = new PParameter("domainStereotypeInstance", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_element, parameter_domainStereotypeInstance);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "sysml.Discrete";
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
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_domainStereotypeInstance), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_element, parameter_element),
             new ExportedParameter(body, var_domainStereotypeInstance, parameter_domainStereotypeInstance)
          ));
          // 	find util.stereotypedElement(element, domainStereotypeInstance, "SysML", "Discrete")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "SysML");
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, "Discrete");
          new PositivePatternCall(body, Tuples.flatTupleOf(var_element, var_domainStereotypeInstance, var__virtual_0_, var__virtual_1_), StereotypedElement.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
