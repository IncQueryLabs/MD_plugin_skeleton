/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/util/CommonLibrary.vql
 */
package util;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
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
 *         //tag::queries[]
 *         
 *           Matches if the parameter `general` is connected by a single
 *           generalization relation to parameter `classifier`
 *          
 *         pattern generalizedClassifier(classifier : Classifier, general: Classifier) {
 *         	Generalization.general(gen, general);
 *         	Generalization.specific(gen, classifier);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class GeneralizedClassifier extends BaseGeneratedEMFQuerySpecification<GeneralizedClassifier.Matcher> {
  /**
   * Pattern-specific match representation of the util.generalizedClassifier pattern,
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
    private Classifier fClassifier;
    
    private Classifier fGeneral;
    
    private static List<String> parameterNames = makeImmutableList("classifier", "general");
    
    private Match(final Classifier pClassifier, final Classifier pGeneral) {
      this.fClassifier = pClassifier;
      this.fGeneral = pGeneral;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "classifier": return this.fClassifier;
          case "general": return this.fGeneral;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fClassifier;
          case 1: return this.fGeneral;
          default: return null;
      }
    }
    
    public Classifier getClassifier() {
      return this.fClassifier;
    }
    
    public Classifier getGeneral() {
      return this.fGeneral;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("classifier".equals(parameterName) ) {
          this.fClassifier = (Classifier) newValue;
          return true;
      }
      if ("general".equals(parameterName) ) {
          this.fGeneral = (Classifier) newValue;
          return true;
      }
      return false;
    }
    
    public void setClassifier(final Classifier pClassifier) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClassifier = pClassifier;
    }
    
    public void setGeneral(final Classifier pGeneral) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fGeneral = pGeneral;
    }
    
    @Override
    public String patternName() {
      return "util.generalizedClassifier";
    }
    
    @Override
    public List<String> parameterNames() {
      return GeneralizedClassifier.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClassifier, fGeneral};
    }
    
    @Override
    public GeneralizedClassifier.Match toImmutable() {
      return isMutable() ? newMatch(fClassifier, fGeneral) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"classifier\"=" + prettyPrintValue(fClassifier) + ", ");
      result.append("\"general\"=" + prettyPrintValue(fGeneral));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fClassifier, fGeneral);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof GeneralizedClassifier.Match)) {
          GeneralizedClassifier.Match other = (GeneralizedClassifier.Match) obj;
          return Objects.equals(fClassifier, other.fClassifier) && Objects.equals(fGeneral, other.fGeneral);
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
    public GeneralizedClassifier specification() {
      return GeneralizedClassifier.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static GeneralizedClassifier.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter general, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static GeneralizedClassifier.Match newMutableMatch(final Classifier pClassifier, final Classifier pGeneral) {
      return new Mutable(pClassifier, pGeneral);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter general, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static GeneralizedClassifier.Match newMatch(final Classifier pClassifier, final Classifier pGeneral) {
      return new Immutable(pClassifier, pGeneral);
    }
    
    private static final class Mutable extends GeneralizedClassifier.Match {
      Mutable(final Classifier pClassifier, final Classifier pGeneral) {
        super(pClassifier, pGeneral);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends GeneralizedClassifier.Match {
      Immutable(final Classifier pClassifier, final Classifier pGeneral) {
        super(pClassifier, pGeneral);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the util.generalizedClassifier pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //tag::queries[]
   * 
   *   Matches if the parameter `general` is connected by a single
   *   generalization relation to parameter `classifier`
   *  
   * pattern generalizedClassifier(classifier : Classifier, general: Classifier) {
   * 	Generalization.general(gen, general);
   * 	Generalization.specific(gen, classifier);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see GeneralizedClassifier
   * 
   */
  public static class Matcher extends BaseMatcher<GeneralizedClassifier.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static GeneralizedClassifier.Matcher on(final ViatraQueryEngine engine) {
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
    public static GeneralizedClassifier.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CLASSIFIER = 0;
    
    private static final int POSITION_GENERAL = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(GeneralizedClassifier.Matcher.class);
    
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
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter general, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<GeneralizedClassifier.Match> getAllMatches(final Classifier pClassifier, final Classifier pGeneral) {
      return rawStreamAllMatches(new Object[]{pClassifier, pGeneral}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter general, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<GeneralizedClassifier.Match> streamAllMatches(final Classifier pClassifier, final Classifier pGeneral) {
      return rawStreamAllMatches(new Object[]{pClassifier, pGeneral});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter general, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<GeneralizedClassifier.Match> getOneArbitraryMatch(final Classifier pClassifier, final Classifier pGeneral) {
      return rawGetOneArbitraryMatch(new Object[]{pClassifier, pGeneral});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter general, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Classifier pClassifier, final Classifier pGeneral) {
      return rawHasMatch(new Object[]{pClassifier, pGeneral});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter general, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Classifier pClassifier, final Classifier pGeneral) {
      return rawCountMatches(new Object[]{pClassifier, pGeneral});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter general, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Classifier pClassifier, final Classifier pGeneral, final Consumer<? super GeneralizedClassifier.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClassifier, pGeneral}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter general, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public GeneralizedClassifier.Match newMatch(final Classifier pClassifier, final Classifier pGeneral) {
      return GeneralizedClassifier.Match.newMatch(pClassifier, pGeneral);
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Classifier> rawStreamAllValuesOfclassifier(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CLASSIFIER, parameters).map(Classifier.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfclassifier() {
      return rawStreamAllValuesOfclassifier(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfclassifier() {
      return rawStreamAllValuesOfclassifier(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfclassifier(final GeneralizedClassifier.Match partialMatch) {
      return rawStreamAllValuesOfclassifier(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfclassifier(final Classifier pGeneral) {
      return rawStreamAllValuesOfclassifier(new Object[]{null, pGeneral});
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfclassifier(final GeneralizedClassifier.Match partialMatch) {
      return rawStreamAllValuesOfclassifier(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfclassifier(final Classifier pGeneral) {
      return rawStreamAllValuesOfclassifier(new Object[]{null, pGeneral}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for general.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Classifier> rawStreamAllValuesOfgeneral(final Object[] parameters) {
      return rawStreamAllValues(POSITION_GENERAL, parameters).map(Classifier.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for general.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfgeneral() {
      return rawStreamAllValuesOfgeneral(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for general.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfgeneral() {
      return rawStreamAllValuesOfgeneral(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for general.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfgeneral(final GeneralizedClassifier.Match partialMatch) {
      return rawStreamAllValuesOfgeneral(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for general.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfgeneral(final Classifier pClassifier) {
      return rawStreamAllValuesOfgeneral(new Object[]{pClassifier, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for general.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfgeneral(final GeneralizedClassifier.Match partialMatch) {
      return rawStreamAllValuesOfgeneral(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for general.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfgeneral(final Classifier pClassifier) {
      return rawStreamAllValuesOfgeneral(new Object[]{pClassifier, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected GeneralizedClassifier.Match tupleToMatch(final Tuple t) {
      try {
          return GeneralizedClassifier.Match.newMatch((Classifier) t.get(POSITION_CLASSIFIER), (Classifier) t.get(POSITION_GENERAL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected GeneralizedClassifier.Match arrayToMatch(final Object[] match) {
      try {
          return GeneralizedClassifier.Match.newMatch((Classifier) match[POSITION_CLASSIFIER], (Classifier) match[POSITION_GENERAL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected GeneralizedClassifier.Match arrayToMatchMutable(final Object[] match) {
      try {
          return GeneralizedClassifier.Match.newMutableMatch((Classifier) match[POSITION_CLASSIFIER], (Classifier) match[POSITION_GENERAL]);
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
    public static IQuerySpecification<GeneralizedClassifier.Matcher> querySpecification() {
      return GeneralizedClassifier.instance();
    }
  }
  
  private GeneralizedClassifier() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static GeneralizedClassifier instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected GeneralizedClassifier.Matcher instantiate(final ViatraQueryEngine engine) {
    return GeneralizedClassifier.Matcher.on(engine);
  }
  
  @Override
  public GeneralizedClassifier.Matcher instantiate() {
    return GeneralizedClassifier.Matcher.create();
  }
  
  @Override
  public GeneralizedClassifier.Match newEmptyMatch() {
    return GeneralizedClassifier.Match.newEmptyMatch();
  }
  
  @Override
  public GeneralizedClassifier.Match newMatch(final Object... parameters) {
    return GeneralizedClassifier.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link GeneralizedClassifier} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link GeneralizedClassifier#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final GeneralizedClassifier INSTANCE = new GeneralizedClassifier();
    
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
    private static final GeneralizedClassifier.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_classifier = new PParameter("classifier", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")), PParameterDirection.INOUT);
    
    private final PParameter parameter_general = new PParameter("general", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_classifier, parameter_general);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "util.generalizedClassifier";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("classifier","general");
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
          PVariable var_classifier = body.getOrCreateVariableByName("classifier");
          PVariable var_general = body.getOrCreateVariableByName("general");
          PVariable var_gen = body.getOrCreateVariableByName("gen");
          new TypeConstraint(body, Tuples.flatTupleOf(var_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_general), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_classifier, parameter_classifier),
             new ExportedParameter(body, var_general, parameter_general)
          ));
          // 	Generalization.general(gen, general)
          new TypeConstraint(body, Tuples.flatTupleOf(var_gen), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Generalization")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_gen, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Generalization", "general")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")));
          new Equality(body, var__virtual_0_, var_general);
          // 	Generalization.specific(gen, classifier)
          new TypeConstraint(body, Tuples.flatTupleOf(var_gen), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Generalization")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_gen, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Generalization", "specific")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")));
          new Equality(body, var__virtual_1_, var_classifier);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
