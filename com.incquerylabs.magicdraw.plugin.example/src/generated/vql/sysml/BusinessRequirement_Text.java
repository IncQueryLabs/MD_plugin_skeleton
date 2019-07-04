/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/sysml/SysMLLibrary.vql
 */
package sysml;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralString;
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
import sysml.BusinessRequirement;
import util.SlotValue;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         Pattern that queries the 'Text' attribute of elements with the stereotype 'businessRequirement'.
 *           
 *           Parameters: 
 *           	element: 'Class' object with the stereotype 'businessRequirement'.
 *           	valuespec : LiteralString : A value of the attribute 'Text'.
 *          
 *         pattern businessRequirement_Text(element : Class, valuespec : LiteralString){
 *         	find businessRequirement(element, domainStereotypeInstance);
 *         	find util.slotValue(domainStereotypeInstance, "Text", valuespec);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class BusinessRequirement_Text extends BaseGeneratedEMFQuerySpecification<BusinessRequirement_Text.Matcher> {
  /**
   * Pattern-specific match representation of the sysml.businessRequirement_Text pattern,
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
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fElement;
    
    private LiteralString fValuespec;
    
    private static List<String> parameterNames = makeImmutableList("element", "valuespec");
    
    private Match(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement, final LiteralString pValuespec) {
      this.fElement = pElement;
      this.fValuespec = pValuespec;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("element".equals(parameterName)) return this.fElement;
      if ("valuespec".equals(parameterName)) return this.fValuespec;
      return null;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getElement() {
      return this.fElement;
    }
    
    public LiteralString getValuespec() {
      return this.fValuespec;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("element".equals(parameterName) ) {
          this.fElement = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      if ("valuespec".equals(parameterName) ) {
          this.fValuespec = (LiteralString) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setValuespec(final LiteralString pValuespec) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fValuespec = pValuespec;
    }
    
    @Override
    public String patternName() {
      return "sysml.businessRequirement_Text";
    }
    
    @Override
    public List<String> parameterNames() {
      return BusinessRequirement_Text.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fValuespec};
    }
    
    @Override
    public BusinessRequirement_Text.Match toImmutable() {
      return isMutable() ? newMatch(fElement, fValuespec) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"element\"=" + prettyPrintValue(fElement) + ", ");
      result.append("\"valuespec\"=" + prettyPrintValue(fValuespec));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElement, fValuespec);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof BusinessRequirement_Text.Match)) {
          BusinessRequirement_Text.Match other = (BusinessRequirement_Text.Match) obj;
          return Objects.equals(fElement, other.fElement) && Objects.equals(fValuespec, other.fValuespec);
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
    public BusinessRequirement_Text specification() {
      return BusinessRequirement_Text.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static BusinessRequirement_Text.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static BusinessRequirement_Text.Match newMutableMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement, final LiteralString pValuespec) {
      return new Mutable(pElement, pValuespec);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static BusinessRequirement_Text.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement, final LiteralString pValuespec) {
      return new Immutable(pElement, pValuespec);
    }
    
    private static final class Mutable extends BusinessRequirement_Text.Match {
      Mutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement, final LiteralString pValuespec) {
        super(pElement, pValuespec);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends BusinessRequirement_Text.Match {
      Immutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement, final LiteralString pValuespec) {
        super(pElement, pValuespec);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the sysml.businessRequirement_Text pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Pattern that queries the 'Text' attribute of elements with the stereotype 'businessRequirement'.
   *   
   *   Parameters: 
   *   	element: 'Class' object with the stereotype 'businessRequirement'.
   *   	valuespec : LiteralString : A value of the attribute 'Text'.
   *  
   * pattern businessRequirement_Text(element : Class, valuespec : LiteralString){
   * 	find businessRequirement(element, domainStereotypeInstance);
   * 	find util.slotValue(domainStereotypeInstance, "Text", valuespec);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see BusinessRequirement_Text
   * 
   */
  public static class Matcher extends BaseMatcher<BusinessRequirement_Text.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static BusinessRequirement_Text.Matcher on(final ViatraQueryEngine engine) {
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
    public static BusinessRequirement_Text.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_VALUESPEC = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BusinessRequirement_Text.Matcher.class);
    
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
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<BusinessRequirement_Text.Match> getAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement, final LiteralString pValuespec) {
      return rawStreamAllMatches(new Object[]{pElement, pValuespec}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<BusinessRequirement_Text.Match> streamAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement, final LiteralString pValuespec) {
      return rawStreamAllMatches(new Object[]{pElement, pValuespec});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<BusinessRequirement_Text.Match> getOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement, final LiteralString pValuespec) {
      return rawGetOneArbitraryMatch(new Object[]{pElement, pValuespec});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement, final LiteralString pValuespec) {
      return rawHasMatch(new Object[]{pElement, pValuespec});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement, final LiteralString pValuespec) {
      return rawCountMatches(new Object[]{pElement, pValuespec});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement, final LiteralString pValuespec, final Consumer<? super BusinessRequirement_Text.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement, pValuespec}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public BusinessRequirement_Text.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement, final LiteralString pValuespec) {
      return BusinessRequirement_Text.Match.newMatch(pElement, pValuespec);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> rawStreamAllValuesOfelement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfelement() {
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfelement(final BusinessRequirement_Text.Match partialMatch) {
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfelement(final LiteralString pValuespec) {
      return rawStreamAllValuesOfelement(new Object[]{null, pValuespec});
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfelement(final BusinessRequirement_Text.Match partialMatch) {
      return rawStreamAllValuesOfelement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfelement(final LiteralString pValuespec) {
      return rawStreamAllValuesOfelement(new Object[]{null, pValuespec}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<LiteralString> rawStreamAllValuesOfvaluespec(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VALUESPEC, parameters).map(LiteralString.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<LiteralString> getAllValuesOfvaluespec() {
      return rawStreamAllValuesOfvaluespec(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<LiteralString> streamAllValuesOfvaluespec() {
      return rawStreamAllValuesOfvaluespec(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<LiteralString> streamAllValuesOfvaluespec(final BusinessRequirement_Text.Match partialMatch) {
      return rawStreamAllValuesOfvaluespec(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<LiteralString> streamAllValuesOfvaluespec(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement) {
      return rawStreamAllValuesOfvaluespec(new Object[]{pElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<LiteralString> getAllValuesOfvaluespec(final BusinessRequirement_Text.Match partialMatch) {
      return rawStreamAllValuesOfvaluespec(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<LiteralString> getAllValuesOfvaluespec(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pElement) {
      return rawStreamAllValuesOfvaluespec(new Object[]{pElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected BusinessRequirement_Text.Match tupleToMatch(final Tuple t) {
      try {
          return BusinessRequirement_Text.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_ELEMENT), (LiteralString) t.get(POSITION_VALUESPEC));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected BusinessRequirement_Text.Match arrayToMatch(final Object[] match) {
      try {
          return BusinessRequirement_Text.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_ELEMENT], (LiteralString) match[POSITION_VALUESPEC]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected BusinessRequirement_Text.Match arrayToMatchMutable(final Object[] match) {
      try {
          return BusinessRequirement_Text.Match.newMutableMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_ELEMENT], (LiteralString) match[POSITION_VALUESPEC]);
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
    public static IQuerySpecification<BusinessRequirement_Text.Matcher> querySpecification() {
      return BusinessRequirement_Text.instance();
    }
  }
  
  private BusinessRequirement_Text() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static BusinessRequirement_Text instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected BusinessRequirement_Text.Matcher instantiate(final ViatraQueryEngine engine) {
    return BusinessRequirement_Text.Matcher.on(engine);
  }
  
  @Override
  public BusinessRequirement_Text.Matcher instantiate() {
    return BusinessRequirement_Text.Matcher.create();
  }
  
  @Override
  public BusinessRequirement_Text.Match newEmptyMatch() {
    return BusinessRequirement_Text.Match.newEmptyMatch();
  }
  
  @Override
  public BusinessRequirement_Text.Match newMatch(final Object... parameters) {
    return BusinessRequirement_Text.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralString) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: sysml.BusinessRequirement_Text (visibility: PUBLIC, simpleName: BusinessRequirement_Text, identifier: sysml.BusinessRequirement_Text, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: sysml) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: sysml.BusinessRequirement_Text (visibility: PUBLIC, simpleName: BusinessRequirement_Text, identifier: sysml.BusinessRequirement_Text, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: sysml) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final BusinessRequirement_Text INSTANCE = new BusinessRequirement_Text();
    
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
    private static final BusinessRequirement_Text.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_element = new PParameter("element", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_valuespec = new PParameter("valuespec", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralString", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralString")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_element, parameter_valuespec);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "sysml.businessRequirement_Text";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("element","valuespec");
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
          PVariable var_valuespec = body.getOrCreateVariableByName("valuespec");
          PVariable var_domainStereotypeInstance = body.getOrCreateVariableByName("domainStereotypeInstance");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_valuespec), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralString")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_element, parameter_element),
             new ExportedParameter(body, var_valuespec, parameter_valuespec)
          ));
          // 	find businessRequirement(element, domainStereotypeInstance)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_element, var_domainStereotypeInstance), BusinessRequirement.instance().getInternalQueryRepresentation());
          // 	find util.slotValue(domainStereotypeInstance, "Text", valuespec)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "Text");
          new PositivePatternCall(body, Tuples.flatTupleOf(var_domainStereotypeInstance, var__virtual_0_, var_valuespec), SlotValue.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
