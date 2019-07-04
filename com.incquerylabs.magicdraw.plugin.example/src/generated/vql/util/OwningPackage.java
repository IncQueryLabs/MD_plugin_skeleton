/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/util/CommonLibrary.vql
 */
package util;

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
 *         Matches the parameter `element` and its direct owning Package
 *          
 *         pattern owningPackage(element : Package, owner : Package){
 *         	Package.owningPackage(element, owner);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class OwningPackage extends BaseGeneratedEMFQuerySpecification<OwningPackage.Matcher> {
  /**
   * Pattern-specific match representation of the util.owningPackage pattern,
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
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package fElement;
    
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package fOwner;
    
    private static List<String> parameterNames = makeImmutableList("element", "owner");
    
    private Match(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
      this.fElement = pElement;
      this.fOwner = pOwner;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("element".equals(parameterName)) return this.fElement;
      if ("owner".equals(parameterName)) return this.fOwner;
      return null;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getElement() {
      return this.fElement;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getOwner() {
      return this.fOwner;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("element".equals(parameterName) ) {
          this.fElement = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) newValue;
          return true;
      }
      if ("owner".equals(parameterName) ) {
          this.fOwner = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setOwner(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOwner = pOwner;
    }
    
    @Override
    public String patternName() {
      return "util.owningPackage";
    }
    
    @Override
    public List<String> parameterNames() {
      return OwningPackage.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fOwner};
    }
    
    @Override
    public OwningPackage.Match toImmutable() {
      return isMutable() ? newMatch(fElement, fOwner) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"element\"=" + prettyPrintValue(fElement) + ", ");
      result.append("\"owner\"=" + prettyPrintValue(fOwner));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElement, fOwner);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof OwningPackage.Match)) {
          OwningPackage.Match other = (OwningPackage.Match) obj;
          return Objects.equals(fElement, other.fElement) && Objects.equals(fOwner, other.fOwner);
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
    public OwningPackage specification() {
      return OwningPackage.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static OwningPackage.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static OwningPackage.Match newMutableMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
      return new Mutable(pElement, pOwner);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static OwningPackage.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
      return new Immutable(pElement, pOwner);
    }
    
    private static final class Mutable extends OwningPackage.Match {
      Mutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
        super(pElement, pOwner);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends OwningPackage.Match {
      Immutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
        super(pElement, pOwner);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the util.owningPackage pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Matches the parameter `element` and its direct owning Package
   *  
   * pattern owningPackage(element : Package, owner : Package){
   * 	Package.owningPackage(element, owner);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see OwningPackage
   * 
   */
  public static class Matcher extends BaseMatcher<OwningPackage.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static OwningPackage.Matcher on(final ViatraQueryEngine engine) {
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
    public static OwningPackage.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_OWNER = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(OwningPackage.Matcher.class);
    
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
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<OwningPackage.Match> getAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
      return rawStreamAllMatches(new Object[]{pElement, pOwner}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<OwningPackage.Match> streamAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
      return rawStreamAllMatches(new Object[]{pElement, pOwner});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<OwningPackage.Match> getOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
      return rawGetOneArbitraryMatch(new Object[]{pElement, pOwner});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
      return rawHasMatch(new Object[]{pElement, pOwner});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
      return rawCountMatches(new Object[]{pElement, pOwner});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner, final Consumer<? super OwningPackage.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement, pOwner}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public OwningPackage.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
      return OwningPackage.Match.newMatch(pElement, pOwner);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> rawStreamAllValuesOfelement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfelement() {
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfelement(final OwningPackage.Match partialMatch) {
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfelement(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
      return rawStreamAllValuesOfelement(new Object[]{null, pOwner});
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfelement(final OwningPackage.Match partialMatch) {
      return rawStreamAllValuesOfelement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfelement(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pOwner) {
      return rawStreamAllValuesOfelement(new Object[]{null, pOwner}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> rawStreamAllValuesOfowner(final Object[] parameters) {
      return rawStreamAllValues(POSITION_OWNER, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfowner() {
      return rawStreamAllValuesOfowner(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfowner() {
      return rawStreamAllValuesOfowner(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfowner(final OwningPackage.Match partialMatch) {
      return rawStreamAllValuesOfowner(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfowner(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement) {
      return rawStreamAllValuesOfowner(new Object[]{pElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfowner(final OwningPackage.Match partialMatch) {
      return rawStreamAllValuesOfowner(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfowner(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement) {
      return rawStreamAllValuesOfowner(new Object[]{pElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected OwningPackage.Match tupleToMatch(final Tuple t) {
      try {
          return OwningPackage.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) t.get(POSITION_ELEMENT), (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) t.get(POSITION_OWNER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected OwningPackage.Match arrayToMatch(final Object[] match) {
      try {
          return OwningPackage.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) match[POSITION_ELEMENT], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) match[POSITION_OWNER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected OwningPackage.Match arrayToMatchMutable(final Object[] match) {
      try {
          return OwningPackage.Match.newMutableMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) match[POSITION_ELEMENT], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) match[POSITION_OWNER]);
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
    public static IQuerySpecification<OwningPackage.Matcher> querySpecification() {
      return OwningPackage.instance();
    }
  }
  
  private OwningPackage() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static OwningPackage instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected OwningPackage.Matcher instantiate(final ViatraQueryEngine engine) {
    return OwningPackage.Matcher.on(engine);
  }
  
  @Override
  public OwningPackage.Matcher instantiate() {
    return OwningPackage.Matcher.create();
  }
  
  @Override
  public OwningPackage.Match newEmptyMatch() {
    return OwningPackage.Match.newEmptyMatch();
  }
  
  @Override
  public OwningPackage.Match newMatch(final Object... parameters) {
    return OwningPackage.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: util.OwningPackage (visibility: PUBLIC, simpleName: OwningPackage, identifier: util.OwningPackage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: util.OwningPackage (visibility: PUBLIC, simpleName: OwningPackage, identifier: util.OwningPackage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final OwningPackage INSTANCE = new OwningPackage();
    
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
    private static final OwningPackage.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_element = new PParameter("element", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_owner = new PParameter("owner", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_element, parameter_owner);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "util.owningPackage";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("element","owner");
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
          PVariable var_owner = body.getOrCreateVariableByName("owner");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_owner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_element, parameter_element),
             new ExportedParameter(body, var_owner, parameter_owner)
          ));
          // 	Package.owningPackage(element, owner)
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "PackageableElement", "owningPackage")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")));
          new Equality(body, var__virtual_0_, var_owner);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
