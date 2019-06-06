/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.MangledName;
import com.incquerylabs.magicdraw.plugin.example.queries.PackableElementToGen;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
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
 *         pattern mangledNameInPackage(pack: Package, packElem: PackageableElement, mangledName: java String) {
 *         	Package.packagedElement(pack, packElem);
 *         	find packableElementToGen(packElem);
 *         	find mangledName(packElem, mangledName);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class MangledNameInPackage extends BaseGeneratedEMFQuerySpecification<MangledNameInPackage.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.mangledNameInPackage pattern,
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
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package fPack;
    
    private PackageableElement fPackElem;
    
    private String fMangledName;
    
    private static List<String> parameterNames = makeImmutableList("pack", "packElem", "mangledName");
    
    private Match(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem, final String pMangledName) {
      this.fPack = pPack;
      this.fPackElem = pPackElem;
      this.fMangledName = pMangledName;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("pack".equals(parameterName)) return this.fPack;
      if ("packElem".equals(parameterName)) return this.fPackElem;
      if ("mangledName".equals(parameterName)) return this.fMangledName;
      return null;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getPack() {
      return this.fPack;
    }
    
    public PackageableElement getPackElem() {
      return this.fPackElem;
    }
    
    public String getMangledName() {
      return this.fMangledName;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("pack".equals(parameterName) ) {
          this.fPack = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) newValue;
          return true;
      }
      if ("packElem".equals(parameterName) ) {
          this.fPackElem = (PackageableElement) newValue;
          return true;
      }
      if ("mangledName".equals(parameterName) ) {
          this.fMangledName = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setPack(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPack = pPack;
    }
    
    public void setPackElem(final PackageableElement pPackElem) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPackElem = pPackElem;
    }
    
    public void setMangledName(final String pMangledName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fMangledName = pMangledName;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.mangledNameInPackage";
    }
    
    @Override
    public List<String> parameterNames() {
      return MangledNameInPackage.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPack, fPackElem, fMangledName};
    }
    
    @Override
    public MangledNameInPackage.Match toImmutable() {
      return isMutable() ? newMatch(fPack, fPackElem, fMangledName) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"pack\"=" + prettyPrintValue(fPack) + ", ");
      result.append("\"packElem\"=" + prettyPrintValue(fPackElem) + ", ");
      result.append("\"mangledName\"=" + prettyPrintValue(fMangledName));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fPack, fPackElem, fMangledName);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MangledNameInPackage.Match)) {
          MangledNameInPackage.Match other = (MangledNameInPackage.Match) obj;
          return Objects.equals(fPack, other.fPack) && Objects.equals(fPackElem, other.fPackElem) && Objects.equals(fMangledName, other.fMangledName);
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
    public MangledNameInPackage specification() {
      return MangledNameInPackage.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MangledNameInPackage.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MangledNameInPackage.Match newMutableMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem, final String pMangledName) {
      return new Mutable(pPack, pPackElem, pMangledName);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MangledNameInPackage.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem, final String pMangledName) {
      return new Immutable(pPack, pPackElem, pMangledName);
    }
    
    private static final class Mutable extends MangledNameInPackage.Match {
      Mutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem, final String pMangledName) {
        super(pPack, pPackElem, pMangledName);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MangledNameInPackage.Match {
      Immutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem, final String pMangledName) {
        super(pPack, pPackElem, pMangledName);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.mangledNameInPackage pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern mangledNameInPackage(pack: Package, packElem: PackageableElement, mangledName: java String) {
   * 	Package.packagedElement(pack, packElem);
   * 	find packableElementToGen(packElem);
   * 	find mangledName(packElem, mangledName);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see MangledNameInPackage
   * 
   */
  public static class Matcher extends BaseMatcher<MangledNameInPackage.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MangledNameInPackage.Matcher on(final ViatraQueryEngine engine) {
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
    public static MangledNameInPackage.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PACK = 0;
    
    private static final int POSITION_PACKELEM = 1;
    
    private static final int POSITION_MANGLEDNAME = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MangledNameInPackage.Matcher.class);
    
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
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MangledNameInPackage.Match> getAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem, final String pMangledName) {
      return rawStreamAllMatches(new Object[]{pPack, pPackElem, pMangledName}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<MangledNameInPackage.Match> streamAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem, final String pMangledName) {
      return rawStreamAllMatches(new Object[]{pPack, pPackElem, pMangledName});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<MangledNameInPackage.Match> getOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem, final String pMangledName) {
      return rawGetOneArbitraryMatch(new Object[]{pPack, pPackElem, pMangledName});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem, final String pMangledName) {
      return rawHasMatch(new Object[]{pPack, pPackElem, pMangledName});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem, final String pMangledName) {
      return rawCountMatches(new Object[]{pPack, pPackElem, pMangledName});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem, final String pMangledName, final Consumer<? super MangledNameInPackage.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPack, pPackElem, pMangledName}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @param pMangledName the fixed value of pattern parameter mangledName, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MangledNameInPackage.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem, final String pMangledName) {
      return MangledNameInPackage.Match.newMatch(pPack, pPackElem, pMangledName);
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> rawStreamAllValuesOfpack(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PACK, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfpack() {
      return rawStreamAllValuesOfpack(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfpack() {
      return rawStreamAllValuesOfpack(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfpack(final MangledNameInPackage.Match partialMatch) {
      return rawStreamAllValuesOfpack(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfpack(final PackageableElement pPackElem, final String pMangledName) {
      return rawStreamAllValuesOfpack(new Object[]{null, pPackElem, pMangledName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfpack(final MangledNameInPackage.Match partialMatch) {
      return rawStreamAllValuesOfpack(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfpack(final PackageableElement pPackElem, final String pMangledName) {
      return rawStreamAllValuesOfpack(new Object[]{null, pPackElem, pMangledName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for packElem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<PackageableElement> rawStreamAllValuesOfpackElem(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PACKELEM, parameters).map(PackageableElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for packElem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PackageableElement> getAllValuesOfpackElem() {
      return rawStreamAllValuesOfpackElem(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for packElem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<PackageableElement> streamAllValuesOfpackElem() {
      return rawStreamAllValuesOfpackElem(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for packElem.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<PackageableElement> streamAllValuesOfpackElem(final MangledNameInPackage.Match partialMatch) {
      return rawStreamAllValuesOfpackElem(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for packElem.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<PackageableElement> streamAllValuesOfpackElem(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final String pMangledName) {
      return rawStreamAllValuesOfpackElem(new Object[]{pPack, null, pMangledName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for packElem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PackageableElement> getAllValuesOfpackElem(final MangledNameInPackage.Match partialMatch) {
      return rawStreamAllValuesOfpackElem(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for packElem.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PackageableElement> getAllValuesOfpackElem(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final String pMangledName) {
      return rawStreamAllValuesOfpackElem(new Object[]{pPack, null, pMangledName}).collect(Collectors.toSet());
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
    public Stream<String> streamAllValuesOfmangledName(final MangledNameInPackage.Match partialMatch) {
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
    public Stream<String> streamAllValuesOfmangledName(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem) {
      return rawStreamAllValuesOfmangledName(new Object[]{pPack, pPackElem, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for mangledName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfmangledName(final MangledNameInPackage.Match partialMatch) {
      return rawStreamAllValuesOfmangledName(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for mangledName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfmangledName(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final PackageableElement pPackElem) {
      return rawStreamAllValuesOfmangledName(new Object[]{pPack, pPackElem, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected MangledNameInPackage.Match tupleToMatch(final Tuple t) {
      try {
          return MangledNameInPackage.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) t.get(POSITION_PACK), (PackageableElement) t.get(POSITION_PACKELEM), (String) t.get(POSITION_MANGLEDNAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MangledNameInPackage.Match arrayToMatch(final Object[] match) {
      try {
          return MangledNameInPackage.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) match[POSITION_PACK], (PackageableElement) match[POSITION_PACKELEM], (String) match[POSITION_MANGLEDNAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MangledNameInPackage.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MangledNameInPackage.Match.newMutableMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) match[POSITION_PACK], (PackageableElement) match[POSITION_PACKELEM], (String) match[POSITION_MANGLEDNAME]);
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
    public static IQuerySpecification<MangledNameInPackage.Matcher> querySpecification() {
      return MangledNameInPackage.instance();
    }
  }
  
  private MangledNameInPackage() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MangledNameInPackage instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MangledNameInPackage.Matcher instantiate(final ViatraQueryEngine engine) {
    return MangledNameInPackage.Matcher.on(engine);
  }
  
  @Override
  public MangledNameInPackage.Matcher instantiate() {
    return MangledNameInPackage.Matcher.create();
  }
  
  @Override
  public MangledNameInPackage.Match newEmptyMatch() {
    return MangledNameInPackage.Match.newEmptyMatch();
  }
  
  @Override
  public MangledNameInPackage.Match newMatch(final Object... parameters) {
    return MangledNameInPackage.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement) parameters[1], (java.lang.String) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.MangledNameInPackage (visibility: PUBLIC, simpleName: MangledNameInPackage, identifier: com.incquerylabs.magicdraw.plugin.example.queries.MangledNameInPackage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.MangledNameInPackage (visibility: PUBLIC, simpleName: MangledNameInPackage, identifier: com.incquerylabs.magicdraw.plugin.example.queries.MangledNameInPackage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final MangledNameInPackage INSTANCE = new MangledNameInPackage();
    
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
    private static final MangledNameInPackage.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pack = new PParameter("pack", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_packElem = new PParameter("packElem", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "PackageableElement")), PParameterDirection.INOUT);
    
    private final PParameter parameter_mangledName = new PParameter("mangledName", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pack, parameter_packElem, parameter_mangledName);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.mangledNameInPackage";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("pack","packElem","mangledName");
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
          PVariable var_pack = body.getOrCreateVariableByName("pack");
          PVariable var_packElem = body.getOrCreateVariableByName("packElem");
          PVariable var_mangledName = body.getOrCreateVariableByName("mangledName");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pack), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_packElem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "PackageableElement")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_mangledName), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_pack, parameter_pack),
             new ExportedParameter(body, var_packElem, parameter_packElem),
             new ExportedParameter(body, var_mangledName, parameter_mangledName)
          ));
          // 	Package.packagedElement(pack, packElem)
          new TypeConstraint(body, Tuples.flatTupleOf(var_pack), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_pack, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package", "packagedElement")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "PackageableElement")));
          new Equality(body, var__virtual_0_, var_packElem);
          // 	find packableElementToGen(packElem)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_packElem), PackableElementToGen.instance().getInternalQueryRepresentation());
          // 	find mangledName(packElem, mangledName)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_packElem, var_mangledName), MangledName.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
