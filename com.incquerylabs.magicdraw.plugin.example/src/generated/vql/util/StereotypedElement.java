/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/util/CommonLibrary.vql
 */
package util;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import util.CompatibleClassifier;
import util.OwningPackageOrSelf;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         Collects the InstanceSpecification of the given Element having the stereotype with the given name
 *          
 *         pattern stereotypedElement(element : Element, domainStereotypeInstance : InstanceSpecification, profileName : String, stereotypeName : String) {
 *         	Element.appliedStereotypeInstance(element, domainStereotypeInstance);
 *         	InstanceSpecification.classifier(domainStereotypeInstance, domainStereotype);
 *         	find compatibleClassifier(domainStereotype, superStereotype);
 *         	Stereotype.owningPackage(superStereotype, owner);
 *         	find owningPackageOrSelf(owner, profile);
 *         	Profile.name(profile, profileName);
 *         	Stereotype.name(superStereotype, stereotypeName);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class StereotypedElement extends BaseGeneratedEMFQuerySpecification<StereotypedElement.Matcher> {
  /**
   * Pattern-specific match representation of the util.stereotypedElement pattern,
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
    private Element fElement;
    
    private InstanceSpecification fDomainStereotypeInstance;
    
    private String fProfileName;
    
    private String fStereotypeName;
    
    private static List<String> parameterNames = makeImmutableList("element", "domainStereotypeInstance", "profileName", "stereotypeName");
    
    private Match(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName) {
      this.fElement = pElement;
      this.fDomainStereotypeInstance = pDomainStereotypeInstance;
      this.fProfileName = pProfileName;
      this.fStereotypeName = pStereotypeName;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "element": return this.fElement;
          case "domainStereotypeInstance": return this.fDomainStereotypeInstance;
          case "profileName": return this.fProfileName;
          case "stereotypeName": return this.fStereotypeName;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fElement;
          case 1: return this.fDomainStereotypeInstance;
          case 2: return this.fProfileName;
          case 3: return this.fStereotypeName;
          default: return null;
      }
    }
    
    public Element getElement() {
      return this.fElement;
    }
    
    public InstanceSpecification getDomainStereotypeInstance() {
      return this.fDomainStereotypeInstance;
    }
    
    public String getProfileName() {
      return this.fProfileName;
    }
    
    public String getStereotypeName() {
      return this.fStereotypeName;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("element".equals(parameterName) ) {
          this.fElement = (Element) newValue;
          return true;
      }
      if ("domainStereotypeInstance".equals(parameterName) ) {
          this.fDomainStereotypeInstance = (InstanceSpecification) newValue;
          return true;
      }
      if ("profileName".equals(parameterName) ) {
          this.fProfileName = (String) newValue;
          return true;
      }
      if ("stereotypeName".equals(parameterName) ) {
          this.fStereotypeName = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final Element pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setDomainStereotypeInstance(final InstanceSpecification pDomainStereotypeInstance) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDomainStereotypeInstance = pDomainStereotypeInstance;
    }
    
    public void setProfileName(final String pProfileName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fProfileName = pProfileName;
    }
    
    public void setStereotypeName(final String pStereotypeName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fStereotypeName = pStereotypeName;
    }
    
    @Override
    public String patternName() {
      return "util.stereotypedElement";
    }
    
    @Override
    public List<String> parameterNames() {
      return StereotypedElement.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fDomainStereotypeInstance, fProfileName, fStereotypeName};
    }
    
    @Override
    public StereotypedElement.Match toImmutable() {
      return isMutable() ? newMatch(fElement, fDomainStereotypeInstance, fProfileName, fStereotypeName) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"element\"=" + prettyPrintValue(fElement) + ", ");
      result.append("\"domainStereotypeInstance\"=" + prettyPrintValue(fDomainStereotypeInstance) + ", ");
      result.append("\"profileName\"=" + prettyPrintValue(fProfileName) + ", ");
      result.append("\"stereotypeName\"=" + prettyPrintValue(fStereotypeName));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElement, fDomainStereotypeInstance, fProfileName, fStereotypeName);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof StereotypedElement.Match)) {
          StereotypedElement.Match other = (StereotypedElement.Match) obj;
          return Objects.equals(fElement, other.fElement) && Objects.equals(fDomainStereotypeInstance, other.fDomainStereotypeInstance) && Objects.equals(fProfileName, other.fProfileName) && Objects.equals(fStereotypeName, other.fStereotypeName);
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
    public StereotypedElement specification() {
      return StereotypedElement.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static StereotypedElement.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter profileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter stereotypeName, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static StereotypedElement.Match newMutableMatch(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName) {
      return new Mutable(pElement, pDomainStereotypeInstance, pProfileName, pStereotypeName);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter profileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter stereotypeName, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static StereotypedElement.Match newMatch(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName) {
      return new Immutable(pElement, pDomainStereotypeInstance, pProfileName, pStereotypeName);
    }
    
    private static final class Mutable extends StereotypedElement.Match {
      Mutable(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName) {
        super(pElement, pDomainStereotypeInstance, pProfileName, pStereotypeName);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends StereotypedElement.Match {
      Immutable(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName) {
        super(pElement, pDomainStereotypeInstance, pProfileName, pStereotypeName);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the util.stereotypedElement pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Collects the InstanceSpecification of the given Element having the stereotype with the given name
   *  
   * pattern stereotypedElement(element : Element, domainStereotypeInstance : InstanceSpecification, profileName : String, stereotypeName : String) {
   * 	Element.appliedStereotypeInstance(element, domainStereotypeInstance);
   * 	InstanceSpecification.classifier(domainStereotypeInstance, domainStereotype);
   * 	find compatibleClassifier(domainStereotype, superStereotype);
   * 	Stereotype.owningPackage(superStereotype, owner);
   * 	find owningPackageOrSelf(owner, profile);
   * 	Profile.name(profile, profileName);
   * 	Stereotype.name(superStereotype, stereotypeName);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see StereotypedElement
   * 
   */
  public static class Matcher extends BaseMatcher<StereotypedElement.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static StereotypedElement.Matcher on(final ViatraQueryEngine engine) {
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
    public static StereotypedElement.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_DOMAINSTEREOTYPEINSTANCE = 1;
    
    private static final int POSITION_PROFILENAME = 2;
    
    private static final int POSITION_STEREOTYPENAME = 3;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(StereotypedElement.Matcher.class);
    
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
     * @param pProfileName the fixed value of pattern parameter profileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter stereotypeName, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<StereotypedElement.Match> getAllMatches(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName) {
      return rawStreamAllMatches(new Object[]{pElement, pDomainStereotypeInstance, pProfileName, pStereotypeName}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter profileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter stereotypeName, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<StereotypedElement.Match> streamAllMatches(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName) {
      return rawStreamAllMatches(new Object[]{pElement, pDomainStereotypeInstance, pProfileName, pStereotypeName});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter profileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter stereotypeName, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<StereotypedElement.Match> getOneArbitraryMatch(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName) {
      return rawGetOneArbitraryMatch(new Object[]{pElement, pDomainStereotypeInstance, pProfileName, pStereotypeName});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter profileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter stereotypeName, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName) {
      return rawHasMatch(new Object[]{pElement, pDomainStereotypeInstance, pProfileName, pStereotypeName});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter profileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter stereotypeName, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName) {
      return rawCountMatches(new Object[]{pElement, pDomainStereotypeInstance, pProfileName, pStereotypeName});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter profileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter stereotypeName, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName, final Consumer<? super StereotypedElement.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement, pDomainStereotypeInstance, pProfileName, pStereotypeName}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pDomainStereotypeInstance the fixed value of pattern parameter domainStereotypeInstance, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter profileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter stereotypeName, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public StereotypedElement.Match newMatch(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName) {
      return StereotypedElement.Match.newMatch(pElement, pDomainStereotypeInstance, pProfileName, pStereotypeName);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Element> rawStreamAllValuesOfelement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(Element.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOfelement() {
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
    public Stream<Element> streamAllValuesOfelement(final StereotypedElement.Match partialMatch) {
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
    public Stream<Element> streamAllValuesOfelement(final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName) {
      return rawStreamAllValuesOfelement(new Object[]{null, pDomainStereotypeInstance, pProfileName, pStereotypeName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfelement(final StereotypedElement.Match partialMatch) {
      return rawStreamAllValuesOfelement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfelement(final InstanceSpecification pDomainStereotypeInstance, final String pProfileName, final String pStereotypeName) {
      return rawStreamAllValuesOfelement(new Object[]{null, pDomainStereotypeInstance, pProfileName, pStereotypeName}).collect(Collectors.toSet());
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
    public Stream<InstanceSpecification> streamAllValuesOfdomainStereotypeInstance(final StereotypedElement.Match partialMatch) {
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
    public Stream<InstanceSpecification> streamAllValuesOfdomainStereotypeInstance(final Element pElement, final String pProfileName, final String pStereotypeName) {
      return rawStreamAllValuesOfdomainStereotypeInstance(new Object[]{pElement, null, pProfileName, pStereotypeName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for domainStereotypeInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InstanceSpecification> getAllValuesOfdomainStereotypeInstance(final StereotypedElement.Match partialMatch) {
      return rawStreamAllValuesOfdomainStereotypeInstance(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for domainStereotypeInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InstanceSpecification> getAllValuesOfdomainStereotypeInstance(final Element pElement, final String pProfileName, final String pStereotypeName) {
      return rawStreamAllValuesOfdomainStereotypeInstance(new Object[]{pElement, null, pProfileName, pStereotypeName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for profileName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfprofileName(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PROFILENAME, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for profileName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfprofileName() {
      return rawStreamAllValuesOfprofileName(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for profileName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfprofileName() {
      return rawStreamAllValuesOfprofileName(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for profileName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfprofileName(final StereotypedElement.Match partialMatch) {
      return rawStreamAllValuesOfprofileName(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for profileName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfprofileName(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pStereotypeName) {
      return rawStreamAllValuesOfprofileName(new Object[]{pElement, pDomainStereotypeInstance, null, pStereotypeName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for profileName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfprofileName(final StereotypedElement.Match partialMatch) {
      return rawStreamAllValuesOfprofileName(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for profileName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfprofileName(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pStereotypeName) {
      return rawStreamAllValuesOfprofileName(new Object[]{pElement, pDomainStereotypeInstance, null, pStereotypeName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for stereotypeName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfstereotypeName(final Object[] parameters) {
      return rawStreamAllValues(POSITION_STEREOTYPENAME, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for stereotypeName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfstereotypeName() {
      return rawStreamAllValuesOfstereotypeName(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for stereotypeName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfstereotypeName() {
      return rawStreamAllValuesOfstereotypeName(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for stereotypeName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfstereotypeName(final StereotypedElement.Match partialMatch) {
      return rawStreamAllValuesOfstereotypeName(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for stereotypeName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfstereotypeName(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName) {
      return rawStreamAllValuesOfstereotypeName(new Object[]{pElement, pDomainStereotypeInstance, pProfileName, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for stereotypeName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfstereotypeName(final StereotypedElement.Match partialMatch) {
      return rawStreamAllValuesOfstereotypeName(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for stereotypeName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfstereotypeName(final Element pElement, final InstanceSpecification pDomainStereotypeInstance, final String pProfileName) {
      return rawStreamAllValuesOfstereotypeName(new Object[]{pElement, pDomainStereotypeInstance, pProfileName, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected StereotypedElement.Match tupleToMatch(final Tuple t) {
      try {
          return StereotypedElement.Match.newMatch((Element) t.get(POSITION_ELEMENT), (InstanceSpecification) t.get(POSITION_DOMAINSTEREOTYPEINSTANCE), (String) t.get(POSITION_PROFILENAME), (String) t.get(POSITION_STEREOTYPENAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected StereotypedElement.Match arrayToMatch(final Object[] match) {
      try {
          return StereotypedElement.Match.newMatch((Element) match[POSITION_ELEMENT], (InstanceSpecification) match[POSITION_DOMAINSTEREOTYPEINSTANCE], (String) match[POSITION_PROFILENAME], (String) match[POSITION_STEREOTYPENAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected StereotypedElement.Match arrayToMatchMutable(final Object[] match) {
      try {
          return StereotypedElement.Match.newMutableMatch((Element) match[POSITION_ELEMENT], (InstanceSpecification) match[POSITION_DOMAINSTEREOTYPEINSTANCE], (String) match[POSITION_PROFILENAME], (String) match[POSITION_STEREOTYPENAME]);
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
    public static IQuerySpecification<StereotypedElement.Matcher> querySpecification() {
      return StereotypedElement.instance();
    }
  }
  
  private StereotypedElement() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static StereotypedElement instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected StereotypedElement.Matcher instantiate(final ViatraQueryEngine engine) {
    return StereotypedElement.Matcher.on(engine);
  }
  
  @Override
  public StereotypedElement.Matcher instantiate() {
    return StereotypedElement.Matcher.create();
  }
  
  @Override
  public StereotypedElement.Match newEmptyMatch() {
    return StereotypedElement.Match.newEmptyMatch();
  }
  
  @Override
  public StereotypedElement.Match newMatch(final Object... parameters) {
    return StereotypedElement.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification) parameters[1], (java.lang.String) parameters[2], (java.lang.String) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link StereotypedElement} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link StereotypedElement#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final StereotypedElement INSTANCE = new StereotypedElement();
    
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
    private static final StereotypedElement.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_element = new PParameter("element", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Element")), PParameterDirection.INOUT);
    
    private final PParameter parameter_domainStereotypeInstance = new PParameter("domainStereotypeInstance", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")), PParameterDirection.INOUT);
    
    private final PParameter parameter_profileName = new PParameter("profileName", "java.lang.String", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")), PParameterDirection.INOUT);
    
    private final PParameter parameter_stereotypeName = new PParameter("stereotypeName", "java.lang.String", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_element, parameter_domainStereotypeInstance, parameter_profileName, parameter_stereotypeName);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "util.stereotypedElement";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("element","domainStereotypeInstance","profileName","stereotypeName");
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
          PVariable var_profileName = body.getOrCreateVariableByName("profileName");
          PVariable var_stereotypeName = body.getOrCreateVariableByName("stereotypeName");
          PVariable var_domainStereotype = body.getOrCreateVariableByName("domainStereotype");
          PVariable var_superStereotype = body.getOrCreateVariableByName("superStereotype");
          PVariable var_owner = body.getOrCreateVariableByName("owner");
          PVariable var_profile = body.getOrCreateVariableByName("profile");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Element")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_domainStereotypeInstance), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_profileName), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_stereotypeName), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_element, parameter_element),
             new ExportedParameter(body, var_domainStereotypeInstance, parameter_domainStereotypeInstance),
             new ExportedParameter(body, var_profileName, parameter_profileName),
             new ExportedParameter(body, var_stereotypeName, parameter_stereotypeName)
          ));
          // 	Element.appliedStereotypeInstance(element, domainStereotypeInstance)
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Element")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Element", "appliedStereotypeInstance")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")));
          new Equality(body, var__virtual_0_, var_domainStereotypeInstance);
          // 	InstanceSpecification.classifier(domainStereotypeInstance, domainStereotype)
          new TypeConstraint(body, Tuples.flatTupleOf(var_domainStereotypeInstance), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_domainStereotypeInstance, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification", "classifier")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")));
          new Equality(body, var__virtual_1_, var_domainStereotype);
          // 	find compatibleClassifier(domainStereotype, superStereotype)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_domainStereotype, var_superStereotype), CompatibleClassifier.instance().getInternalQueryRepresentation());
          // 	Stereotype.owningPackage(superStereotype, owner)
          new TypeConstraint(body, Tuples.flatTupleOf(var_superStereotype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Stereotype")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_superStereotype, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "PackageableElement", "owningPackage")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")));
          new Equality(body, var__virtual_2_, var_owner);
          // 	find owningPackageOrSelf(owner, profile)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_owner, var_profile), OwningPackageOrSelf.instance().getInternalQueryRepresentation());
          // 	Profile.name(profile, profileName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_profile), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Profile")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_profile, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
          new Equality(body, var__virtual_3_, var_profileName);
          // 	Stereotype.name(superStereotype, stereotypeName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_superStereotype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Stereotype")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_superStereotype, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
          new Equality(body, var__virtual_4_, var_stereotypeName);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
