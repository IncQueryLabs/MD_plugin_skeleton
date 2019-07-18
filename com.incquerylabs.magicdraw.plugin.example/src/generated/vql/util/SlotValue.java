/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/util/CommonLibrary.vql
 */
package util;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
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
 *         Matches the value of the slot with the given name
 *          
 *         pattern slotValue(domainStereotypeInstance : InstanceSpecification, featureName : String, valuespec: ValueSpecification) {
 *         	InstanceSpecification.slot(domainStereotypeInstance, slot);
 *         	Slot.definingFeature.name(slot, featureName);
 *         	Slot.value(slot, valuespec);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SlotValue extends BaseGeneratedEMFQuerySpecification<SlotValue.Matcher> {
  /**
   * Pattern-specific match representation of the util.slotValue pattern,
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
    private InstanceSpecification fDomainStereotypeInstance;
    
    private String fFeatureName;
    
    private ValueSpecification fValuespec;
    
    private static List<String> parameterNames = makeImmutableList("domainStereotypeInstance", "featureName", "valuespec");
    
    private Match(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName, final ValueSpecification pValuespec) {
      this.fDomainStereotypeInstance = pDomainStereotypeInstance;
      this.fFeatureName = pFeatureName;
      this.fValuespec = pValuespec;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("domainStereotypeInstance".equals(parameterName)) return this.fDomainStereotypeInstance;
      if ("featureName".equals(parameterName)) return this.fFeatureName;
      if ("valuespec".equals(parameterName)) return this.fValuespec;
      return null;
    }
    
    public InstanceSpecification getDomainStereotypeInstance() {
      return this.fDomainStereotypeInstance;
    }
    
    public String getFeatureName() {
      return this.fFeatureName;
    }
    
    public ValueSpecification getValuespec() {
      return this.fValuespec;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("domainStereotypeInstance".equals(parameterName) ) {
          this.fDomainStereotypeInstance = (InstanceSpecification) newValue;
          return true;
      }
      if ("featureName".equals(parameterName) ) {
          this.fFeatureName = (String) newValue;
          return true;
      }
      if ("valuespec".equals(parameterName) ) {
          this.fValuespec = (ValueSpecification) newValue;
          return true;
      }
      return false;
    }
    
    public void setDomainStereotypeInstance(final InstanceSpecification pDomainStereotypeInstance) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDomainStereotypeInstance = pDomainStereotypeInstance;
    }
    
    public void setFeatureName(final String pFeatureName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFeatureName = pFeatureName;
    }
    
    public void setValuespec(final ValueSpecification pValuespec) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fValuespec = pValuespec;
    }
    
    @Override
    public String patternName() {
      return "util.slotValue";
    }
    
    @Override
    public List<String> parameterNames() {
      return SlotValue.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fDomainStereotypeInstance, fFeatureName, fValuespec};
    }
    
    @Override
    public SlotValue.Match toImmutable() {
      return isMutable() ? newMatch(fDomainStereotypeInstance, fFeatureName, fValuespec) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"domainStereotypeInstance\"=" + prettyPrintValue(fDomainStereotypeInstance) + ", ");
      result.append("\"featureName\"=" + prettyPrintValue(fFeatureName) + ", ");
      result.append("\"valuespec\"=" + prettyPrintValue(fValuespec));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fDomainStereotypeInstance, fFeatureName, fValuespec);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SlotValue.Match)) {
          SlotValue.Match other = (SlotValue.Match) obj;
          return Objects.equals(fDomainStereotypeInstance, other.fDomainStereotypeInstance) && Objects.equals(fFeatureName, other.fFeatureName) && Objects.equals(fValuespec, other.fValuespec);
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
    public SlotValue specification() {
      return SlotValue.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SlotValue.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter featureName, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SlotValue.Match newMutableMatch(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName, final ValueSpecification pValuespec) {
      return new Mutable(pDomainStereotypeInstance, pFeatureName, pValuespec);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter featureName, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SlotValue.Match newMatch(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName, final ValueSpecification pValuespec) {
      return new Immutable(pDomainStereotypeInstance, pFeatureName, pValuespec);
    }
    
    private static final class Mutable extends SlotValue.Match {
      Mutable(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName, final ValueSpecification pValuespec) {
        super(pDomainStereotypeInstance, pFeatureName, pValuespec);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends SlotValue.Match {
      Immutable(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName, final ValueSpecification pValuespec) {
        super(pDomainStereotypeInstance, pFeatureName, pValuespec);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the util.slotValue pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Matches the value of the slot with the given name
   *  
   * pattern slotValue(domainStereotypeInstance : InstanceSpecification, featureName : String, valuespec: ValueSpecification) {
   * 	InstanceSpecification.slot(domainStereotypeInstance, slot);
   * 	Slot.definingFeature.name(slot, featureName);
   * 	Slot.value(slot, valuespec);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SlotValue
   * 
   */
  public static class Matcher extends BaseMatcher<SlotValue.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SlotValue.Matcher on(final ViatraQueryEngine engine) {
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
    public static SlotValue.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_DOMAINSTEREOTYPEINSTANCE = 0;
    
    private static final int POSITION_FEATURENAME = 1;
    
    private static final int POSITION_VALUESPEC = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SlotValue.Matcher.class);
    
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
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter featureName, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SlotValue.Match> getAllMatches(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName, final ValueSpecification pValuespec) {
      return rawStreamAllMatches(new Object[]{pDomainStereotypeInstance, pFeatureName, pValuespec}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter featureName, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SlotValue.Match> streamAllMatches(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName, final ValueSpecification pValuespec) {
      return rawStreamAllMatches(new Object[]{pDomainStereotypeInstance, pFeatureName, pValuespec});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter featureName, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SlotValue.Match> getOneArbitraryMatch(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName, final ValueSpecification pValuespec) {
      return rawGetOneArbitraryMatch(new Object[]{pDomainStereotypeInstance, pFeatureName, pValuespec});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter featureName, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName, final ValueSpecification pValuespec) {
      return rawHasMatch(new Object[]{pDomainStereotypeInstance, pFeatureName, pValuespec});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter featureName, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName, final ValueSpecification pValuespec) {
      return rawCountMatches(new Object[]{pDomainStereotypeInstance, pFeatureName, pValuespec});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter featureName, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName, final ValueSpecification pValuespec, final Consumer<? super SlotValue.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pDomainStereotypeInstance, pFeatureName, pValuespec}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter featureName, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SlotValue.Match newMatch(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName, final ValueSpecification pValuespec) {
      return SlotValue.Match.newMatch(pDomainStereotypeInstance, pFeatureName, pValuespec);
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
    public Stream<InstanceSpecification> streamAllValuesOfdomainStereotypeInstance(final SlotValue.Match partialMatch) {
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
    public Stream<InstanceSpecification> streamAllValuesOfdomainStereotypeInstance(final String pFeatureName, final ValueSpecification pValuespec) {
      return rawStreamAllValuesOfdomainStereotypeInstance(new Object[]{null, pFeatureName, pValuespec});
    }
    
    /**
     * Retrieve the set of values that occur in matches for domainStereotypeInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InstanceSpecification> getAllValuesOfdomainStereotypeInstance(final SlotValue.Match partialMatch) {
      return rawStreamAllValuesOfdomainStereotypeInstance(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for domainStereotypeInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InstanceSpecification> getAllValuesOfdomainStereotypeInstance(final String pFeatureName, final ValueSpecification pValuespec) {
      return rawStreamAllValuesOfdomainStereotypeInstance(new Object[]{null, pFeatureName, pValuespec}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for featureName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOffeatureName(final Object[] parameters) {
      return rawStreamAllValues(POSITION_FEATURENAME, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for featureName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOffeatureName() {
      return rawStreamAllValuesOffeatureName(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for featureName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOffeatureName() {
      return rawStreamAllValuesOffeatureName(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for featureName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOffeatureName(final SlotValue.Match partialMatch) {
      return rawStreamAllValuesOffeatureName(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for featureName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOffeatureName(final InstanceSpecification pDomainStereotypeInstance, final ValueSpecification pValuespec) {
      return rawStreamAllValuesOffeatureName(new Object[]{pDomainStereotypeInstance, null, pValuespec});
    }
    
    /**
     * Retrieve the set of values that occur in matches for featureName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOffeatureName(final SlotValue.Match partialMatch) {
      return rawStreamAllValuesOffeatureName(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for featureName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOffeatureName(final InstanceSpecification pDomainStereotypeInstance, final ValueSpecification pValuespec) {
      return rawStreamAllValuesOffeatureName(new Object[]{pDomainStereotypeInstance, null, pValuespec}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<ValueSpecification> rawStreamAllValuesOfvaluespec(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VALUESPEC, parameters).map(ValueSpecification.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ValueSpecification> getAllValuesOfvaluespec() {
      return rawStreamAllValuesOfvaluespec(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<ValueSpecification> streamAllValuesOfvaluespec() {
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
    public Stream<ValueSpecification> streamAllValuesOfvaluespec(final SlotValue.Match partialMatch) {
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
    public Stream<ValueSpecification> streamAllValuesOfvaluespec(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName) {
      return rawStreamAllValuesOfvaluespec(new Object[]{pDomainStereotypeInstance, pFeatureName, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ValueSpecification> getAllValuesOfvaluespec(final SlotValue.Match partialMatch) {
      return rawStreamAllValuesOfvaluespec(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ValueSpecification> getAllValuesOfvaluespec(final InstanceSpecification pDomainStereotypeInstance, final String pFeatureName) {
      return rawStreamAllValuesOfvaluespec(new Object[]{pDomainStereotypeInstance, pFeatureName, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected SlotValue.Match tupleToMatch(final Tuple t) {
      try {
          return SlotValue.Match.newMatch((InstanceSpecification) t.get(POSITION_DOMAINSTEREOTYPEINSTANCE), (String) t.get(POSITION_FEATURENAME), (ValueSpecification) t.get(POSITION_VALUESPEC));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SlotValue.Match arrayToMatch(final Object[] match) {
      try {
          return SlotValue.Match.newMatch((InstanceSpecification) match[POSITION_DOMAINSTEREOTYPEINSTANCE], (String) match[POSITION_FEATURENAME], (ValueSpecification) match[POSITION_VALUESPEC]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SlotValue.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SlotValue.Match.newMutableMatch((InstanceSpecification) match[POSITION_DOMAINSTEREOTYPEINSTANCE], (String) match[POSITION_FEATURENAME], (ValueSpecification) match[POSITION_VALUESPEC]);
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
    public static IQuerySpecification<SlotValue.Matcher> querySpecification() {
      return SlotValue.instance();
    }
  }
  
  private SlotValue() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SlotValue instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected SlotValue.Matcher instantiate(final ViatraQueryEngine engine) {
    return SlotValue.Matcher.on(engine);
  }
  
  @Override
  public SlotValue.Matcher instantiate() {
    return SlotValue.Matcher.create();
  }
  
  @Override
  public SlotValue.Match newEmptyMatch() {
    return SlotValue.Match.newEmptyMatch();
  }
  
  @Override
  public SlotValue.Match newMatch(final Object... parameters) {
    return SlotValue.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification) parameters[0], (java.lang.String) parameters[1], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: util.SlotValue (visibility: PUBLIC, simpleName: SlotValue, identifier: util.SlotValue, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: util.SlotValue (visibility: PUBLIC, simpleName: SlotValue, identifier: util.SlotValue, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SlotValue INSTANCE = new SlotValue();
    
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
    private static final SlotValue.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_domainStereotypeInstance = new PParameter("domainStereotypeInstance", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")), PParameterDirection.INOUT);
    
    private final PParameter parameter_featureName = new PParameter("featureName", "java.lang.String", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")), PParameterDirection.INOUT);
    
    private final PParameter parameter_valuespec = new PParameter("valuespec", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_domainStereotypeInstance, parameter_featureName, parameter_valuespec);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "util.slotValue";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("domainStereotypeInstance","featureName","valuespec");
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
          PVariable var_domainStereotypeInstance = body.getOrCreateVariableByName("domainStereotypeInstance");
          PVariable var_featureName = body.getOrCreateVariableByName("featureName");
          PVariable var_valuespec = body.getOrCreateVariableByName("valuespec");
          PVariable var_slot = body.getOrCreateVariableByName("slot");
          new TypeConstraint(body, Tuples.flatTupleOf(var_domainStereotypeInstance), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_featureName), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_valuespec), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_domainStereotypeInstance, parameter_domainStereotypeInstance),
             new ExportedParameter(body, var_featureName, parameter_featureName),
             new ExportedParameter(body, var_valuespec, parameter_valuespec)
          ));
          // 	InstanceSpecification.slot(domainStereotypeInstance, slot)
          new TypeConstraint(body, Tuples.flatTupleOf(var_domainStereotypeInstance), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_domainStereotypeInstance, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification", "slot")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot")));
          new Equality(body, var__virtual_0_, var_slot);
          // 	Slot.definingFeature.name(slot, featureName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_slot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_slot, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot", "definingFeature")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StructuralFeature")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
          new Equality(body, var__virtual_2_, var_featureName);
          // 	Slot.value(slot, valuespec)
          new TypeConstraint(body, Tuples.flatTupleOf(var_slot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_slot, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")));
          new Equality(body, var__virtual_3_, var_valuespec);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
