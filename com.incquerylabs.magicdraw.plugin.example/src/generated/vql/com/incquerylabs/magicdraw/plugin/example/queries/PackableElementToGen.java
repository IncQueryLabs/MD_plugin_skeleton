/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.Block;
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
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
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
 *         pattern packableElementToGen(packElem: PackageableElement) {
 *         	find block(packElem);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class PackableElementToGen extends BaseGeneratedEMFQuerySpecification<PackableElementToGen.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.packableElementToGen pattern,
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
    private PackageableElement fPackElem;
    
    private static List<String> parameterNames = makeImmutableList("packElem");
    
    private Match(final PackageableElement pPackElem) {
      this.fPackElem = pPackElem;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("packElem".equals(parameterName)) return this.fPackElem;
      return null;
    }
    
    public PackageableElement getPackElem() {
      return this.fPackElem;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("packElem".equals(parameterName) ) {
          this.fPackElem = (PackageableElement) newValue;
          return true;
      }
      return false;
    }
    
    public void setPackElem(final PackageableElement pPackElem) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPackElem = pPackElem;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.packableElementToGen";
    }
    
    @Override
    public List<String> parameterNames() {
      return PackableElementToGen.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPackElem};
    }
    
    @Override
    public PackableElementToGen.Match toImmutable() {
      return isMutable() ? newMatch(fPackElem) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"packElem\"=" + prettyPrintValue(fPackElem));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fPackElem);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PackableElementToGen.Match)) {
          PackableElementToGen.Match other = (PackableElementToGen.Match) obj;
          return Objects.equals(fPackElem, other.fPackElem);
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
    public PackableElementToGen specification() {
      return PackableElementToGen.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PackableElementToGen.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PackableElementToGen.Match newMutableMatch(final PackageableElement pPackElem) {
      return new Mutable(pPackElem);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PackableElementToGen.Match newMatch(final PackageableElement pPackElem) {
      return new Immutable(pPackElem);
    }
    
    private static final class Mutable extends PackableElementToGen.Match {
      Mutable(final PackageableElement pPackElem) {
        super(pPackElem);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends PackableElementToGen.Match {
      Immutable(final PackageableElement pPackElem) {
        super(pPackElem);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.packableElementToGen pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern packableElementToGen(packElem: PackageableElement) {
   * 	find block(packElem);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see PackableElementToGen
   * 
   */
  public static class Matcher extends BaseMatcher<PackableElementToGen.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PackableElementToGen.Matcher on(final ViatraQueryEngine engine) {
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
    public static PackableElementToGen.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PACKELEM = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PackableElementToGen.Matcher.class);
    
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
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PackableElementToGen.Match> getAllMatches(final PackageableElement pPackElem) {
      return rawStreamAllMatches(new Object[]{pPackElem}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<PackableElementToGen.Match> streamAllMatches(final PackageableElement pPackElem) {
      return rawStreamAllMatches(new Object[]{pPackElem});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<PackableElementToGen.Match> getOneArbitraryMatch(final PackageableElement pPackElem) {
      return rawGetOneArbitraryMatch(new Object[]{pPackElem});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final PackageableElement pPackElem) {
      return rawHasMatch(new Object[]{pPackElem});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final PackageableElement pPackElem) {
      return rawCountMatches(new Object[]{pPackElem});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final PackageableElement pPackElem, final Consumer<? super PackableElementToGen.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPackElem}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackElem the fixed value of pattern parameter packElem, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PackableElementToGen.Match newMatch(final PackageableElement pPackElem) {
      return PackableElementToGen.Match.newMatch(pPackElem);
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
    
    @Override
    protected PackableElementToGen.Match tupleToMatch(final Tuple t) {
      try {
          return PackableElementToGen.Match.newMatch((PackageableElement) t.get(POSITION_PACKELEM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PackableElementToGen.Match arrayToMatch(final Object[] match) {
      try {
          return PackableElementToGen.Match.newMatch((PackageableElement) match[POSITION_PACKELEM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PackableElementToGen.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PackableElementToGen.Match.newMutableMatch((PackageableElement) match[POSITION_PACKELEM]);
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
    public static IQuerySpecification<PackableElementToGen.Matcher> querySpecification() {
      return PackableElementToGen.instance();
    }
  }
  
  private PackableElementToGen() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PackableElementToGen instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected PackableElementToGen.Matcher instantiate(final ViatraQueryEngine engine) {
    return PackableElementToGen.Matcher.on(engine);
  }
  
  @Override
  public PackableElementToGen.Matcher instantiate() {
    return PackableElementToGen.Matcher.create();
  }
  
  @Override
  public PackableElementToGen.Match newEmptyMatch() {
    return PackableElementToGen.Match.newEmptyMatch();
  }
  
  @Override
  public PackableElementToGen.Match newMatch(final Object... parameters) {
    return PackableElementToGen.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.PackableElementToGen (visibility: PUBLIC, simpleName: PackableElementToGen, identifier: com.incquerylabs.magicdraw.plugin.example.queries.PackableElementToGen, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.PackableElementToGen (visibility: PUBLIC, simpleName: PackableElementToGen, identifier: com.incquerylabs.magicdraw.plugin.example.queries.PackableElementToGen, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final PackableElementToGen INSTANCE = new PackableElementToGen();
    
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
    private static final PackableElementToGen.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_packElem = new PParameter("packElem", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "PackageableElement")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_packElem);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.packableElementToGen";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("packElem");
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
          PVariable var_packElem = body.getOrCreateVariableByName("packElem");
          new TypeConstraint(body, Tuples.flatTupleOf(var_packElem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "PackageableElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_packElem, parameter_packElem)
          ));
          // 	find block(packElem)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_packElem), Block.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
