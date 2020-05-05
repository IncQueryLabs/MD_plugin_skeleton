/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.MangledNameInNamespace;
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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
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
 *         pattern mangledNameCollision(namespace: Namespace, element : NamedElement, mangledName: java String) {
 *         	find mangledNameInNamespace(namespace, element, mangledName);
 *         	sameMangledNameElements == count find mangledNameInNamespace(namespace, _, mangledName);
 *         	check(sameMangledNameElements {@literal >} 1);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class MangledNameCollision extends BaseGeneratedEMFQuerySpecification<MangledNameCollision.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.mangledNameCollision pattern,
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
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace fNamespace;
    
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement fElement;
    
    private String fMangledName;
    
    private static List<String> parameterNames = makeImmutableList("namespace", "element", "mangledName");
    
    private Match(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName) {
      this.fNamespace = pNamespace;
      this.fElement = pElement;
      this.fMangledName = pMangledName;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "namespace": return this.fNamespace;
          case "element": return this.fElement;
          case "mangledName": return this.fMangledName;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fNamespace;
          case 1: return this.fElement;
          case 2: return this.fMangledName;
          default: return null;
      }
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace getNamespace() {
      return this.fNamespace;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement getElement() {
      return this.fElement;
    }
    
    public String getMangledName() {
      return this.fMangledName;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("namespace".equals(parameterName) ) {
          this.fNamespace = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace) newValue;
          return true;
      }
      if ("element".equals(parameterName) ) {
          this.fElement = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement) newValue;
          return true;
      }
      if ("mangledName".equals(parameterName) ) {
          this.fMangledName = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setNamespace(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fNamespace = pNamespace;
    }
    
    public void setElement(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setMangledName(final String pMangledName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fMangledName = pMangledName;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.mangledNameCollision";
    }
    
    @Override
    public List<String> parameterNames() {
      return MangledNameCollision.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fNamespace, fElement, fMangledName};
    }
    
    @Override
    public MangledNameCollision.Match toImmutable() {
      return isMutable() ? newMatch(fNamespace, fElement, fMangledName) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"namespace\"=" + prettyPrintValue(fNamespace) + ", ");
      result.append("\"element\"=" + prettyPrintValue(fElement) + ", ");
      result.append("\"mangledName\"=" + prettyPrintValue(fMangledName));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fNamespace, fElement, fMangledName);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MangledNameCollision.Match)) {
          MangledNameCollision.Match other = (MangledNameCollision.Match) obj;
          return Objects.equals(fNamespace, other.fNamespace) && Objects.equals(fElement, other.fElement) && Objects.equals(fMangledName, other.fMangledName);
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
    public MangledNameCollision specification() {
      return MangledNameCollision.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MangledNameCollision.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pNamespace the fixed value of pattern parameter namespace, or null if not bound.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MangledNameCollision.Match newMutableMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName) {
      return new Mutable(pNamespace, pElement, pMangledName);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pNamespace the fixed value of pattern parameter namespace, or null if not bound.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MangledNameCollision.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName) {
      return new Immutable(pNamespace, pElement, pMangledName);
    }
    
    private static final class Mutable extends MangledNameCollision.Match {
      Mutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName) {
        super(pNamespace, pElement, pMangledName);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MangledNameCollision.Match {
      Immutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName) {
        super(pNamespace, pElement, pMangledName);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.mangledNameCollision pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern mangledNameCollision(namespace: Namespace, element : NamedElement, mangledName: java String) {
   * 	find mangledNameInNamespace(namespace, element, mangledName);
   * 	sameMangledNameElements == count find mangledNameInNamespace(namespace, _, mangledName);
   * 	check(sameMangledNameElements {@literal >} 1);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see MangledNameCollision
   * 
   */
  public static class Matcher extends BaseMatcher<MangledNameCollision.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MangledNameCollision.Matcher on(final ViatraQueryEngine engine) {
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
    public static MangledNameCollision.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_NAMESPACE = 0;
    
    private static final int POSITION_ELEMENT = 1;
    
    private static final int POSITION_MANGLEDNAME = 2;
    
    private static final org.apache.log4j.Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MangledNameCollision.Matcher.class);
    
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
     * @param pNamespace the fixed value of pattern parameter namespace, or null if not bound.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MangledNameCollision.Match> getAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName) {
      return rawStreamAllMatches(new Object[]{pNamespace, pElement, pMangledName}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pNamespace the fixed value of pattern parameter namespace, or null if not bound.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<MangledNameCollision.Match> streamAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName) {
      return rawStreamAllMatches(new Object[]{pNamespace, pElement, pMangledName});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pNamespace the fixed value of pattern parameter namespace, or null if not bound.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<MangledNameCollision.Match> getOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName) {
      return rawGetOneArbitraryMatch(new Object[]{pNamespace, pElement, pMangledName});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pNamespace the fixed value of pattern parameter namespace, or null if not bound.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName) {
      return rawHasMatch(new Object[]{pNamespace, pElement, pMangledName});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pNamespace the fixed value of pattern parameter namespace, or null if not bound.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName) {
      return rawCountMatches(new Object[]{pNamespace, pElement, pMangledName});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pNamespace the fixed value of pattern parameter namespace, or null if not bound.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName, final Consumer<? super MangledNameCollision.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pNamespace, pElement, pMangledName}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pNamespace the fixed value of pattern parameter namespace, or null if not bound.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MangledNameCollision.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName) {
      return MangledNameCollision.Match.newMatch(pNamespace, pElement, pMangledName);
    }
    
    /**
     * Retrieve the set of values that occur in matches for namespace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected /* Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace> */Object rawStreamAllValuesOfnamespace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_NAMESPACE, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for namespace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public /* Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace> */Object getAllValuesOfnamespace() {
      return rawStreamAllValuesOfnamespace(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for namespace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public /* Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace> */Object streamAllValuesOfnamespace() {
      return rawStreamAllValuesOfnamespace(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for namespace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public /* Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace> */Object streamAllValuesOfnamespace(final MangledNameCollision.Match partialMatch) {
      return rawStreamAllValuesOfnamespace(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for namespace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public /* Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace> */Object streamAllValuesOfnamespace(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName) {
      return rawStreamAllValuesOfnamespace(new Object[]{null, pElement, pMangledName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for namespace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public /* Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace> */Object getAllValuesOfnamespace(final MangledNameCollision.Match partialMatch) {
      return rawStreamAllValuesOfnamespace(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for namespace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public /* Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace> */Object getAllValuesOfnamespace(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement, final String pMangledName) {
      return rawStreamAllValuesOfnamespace(new Object[]{null, pElement, pMangledName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected /* Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement> */Object rawStreamAllValuesOfelement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public /* Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement> */Object getAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public /* Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement> */Object streamAllValuesOfelement() {
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
    public /* Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement> */Object streamAllValuesOfelement(final MangledNameCollision.Match partialMatch) {
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
    public /* Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement> */Object streamAllValuesOfelement(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final String pMangledName) {
      return rawStreamAllValuesOfelement(new Object[]{pNamespace, null, pMangledName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public /* Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement> */Object getAllValuesOfelement(final MangledNameCollision.Match partialMatch) {
      return rawStreamAllValuesOfelement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public /* Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement> */Object getAllValuesOfelement(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final String pMangledName) {
      return rawStreamAllValuesOfelement(new Object[]{pNamespace, null, pMangledName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for mangledName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfmangledName(final Object[] parameters) {
      return rawStreamAllValues(POSITION_MANGLEDNAME, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for mangledName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfmangledName() {
      return rawStreamAllValuesOfmangledName(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for mangledName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfmangledName() {
      return rawStreamAllValuesOfmangledName(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for mangledName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfmangledName(final MangledNameCollision.Match partialMatch) {
      return rawStreamAllValuesOfmangledName(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for mangledName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfmangledName(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement) {
      return rawStreamAllValuesOfmangledName(new Object[]{pNamespace, pElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for mangledName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfmangledName(final MangledNameCollision.Match partialMatch) {
      return rawStreamAllValuesOfmangledName(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for mangledName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfmangledName(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace pNamespace, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement pElement) {
      return rawStreamAllValuesOfmangledName(new Object[]{pNamespace, pElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected MangledNameCollision.Match tupleToMatch(final Tuple t) {
      try {
          return MangledNameCollision.Match.newMatch(() t.get(POSITION_NAMESPACE), () t.get(POSITION_ELEMENT), (String) t.get(POSITION_MANGLEDNAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MangledNameCollision.Match arrayToMatch(final Object[] match) {
      try {
          return MangledNameCollision.Match.newMatch(() match[POSITION_NAMESPACE], () match[POSITION_ELEMENT], (String) match[POSITION_MANGLEDNAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MangledNameCollision.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MangledNameCollision.Match.newMutableMatch(() match[POSITION_NAMESPACE], () match[POSITION_ELEMENT], (String) match[POSITION_MANGLEDNAME]);
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
    public static IQuerySpecification<MangledNameCollision.Matcher> querySpecification() {
      return MangledNameCollision.instance();
    }
  }
  
  private MangledNameCollision() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MangledNameCollision instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MangledNameCollision.Matcher instantiate(final ViatraQueryEngine engine) {
    return MangledNameCollision.Matcher.on(engine);
  }
  
  @Override
  public MangledNameCollision.Matcher instantiate() {
    return MangledNameCollision.Matcher.create();
  }
  
  @Override
  public MangledNameCollision.Match newEmptyMatch() {
    return MangledNameCollision.Match.newEmptyMatch();
  }
  
  @Override
  public MangledNameCollision.Match newMatch(final Object... parameters) {
    return MangledNameCollision.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement) parameters[1], (java.lang.String) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link MangledNameCollision} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link MangledNameCollision#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final MangledNameCollision INSTANCE = new MangledNameCollision();
    
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
    private static final MangledNameCollision.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_namespace = new PParameter("namespace", "", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Namespace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_element = new PParameter("element", "", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")), PParameterDirection.INOUT);
    
    private final PParameter parameter_mangledName = new PParameter("mangledName", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_namespace, parameter_element, parameter_mangledName);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.mangledNameCollision";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("namespace","element","mangledName");
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
          PVariable var_namespace = body.getOrCreateVariableByName("namespace");
          PVariable var_element = body.getOrCreateVariableByName("element");
          PVariable var_mangledName = body.getOrCreateVariableByName("mangledName");
          PVariable var_sameMangledNameElements = body.getOrCreateVariableByName("sameMangledNameElements");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_namespace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Namespace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_mangledName), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_namespace, parameter_namespace),
             new ExportedParameter(body, var_element, parameter_element),
             new ExportedParameter(body, var_mangledName, parameter_mangledName)
          ));
          // 	find mangledNameInNamespace(namespace, element, mangledName)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_namespace, var_element, var_mangledName), MangledNameInNamespace.instance().getInternalQueryRepresentation());
          // 	sameMangledNameElements == count find mangledNameInNamespace(namespace, _, mangledName)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_namespace, var___0_, var_mangledName), MangledNameInNamespace.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_sameMangledNameElements, var__virtual_0_);
          // 	check(sameMangledNameElements > 1)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern mangledNameCollision";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("sameMangledNameElements");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer sameMangledNameElements = (Integer) provider.getValue("sameMangledNameElements");
                  return evaluateExpression_1_1(sameMangledNameElements);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer sameMangledNameElements) {
    return ((sameMangledNameElements).intValue() > 1);
  }
}
