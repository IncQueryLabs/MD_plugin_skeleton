/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import sysml.NestedConnectorEnd;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern connectorEndNestedPath(end: ConnectorEnd, propertyPath: Slot) {
 *         	find sysml.NestedConnectorEnd(end, nestedConnectorEnd);
 *         	InstanceSpecification.slot(nestedConnectorEnd, propertyPath);
 *         	Slot.definingFeature.name(propertyPath, "propertyPath");
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ConnectorEndNestedPath extends BaseGeneratedEMFQuerySpecification<ConnectorEndNestedPath.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.connectorEndNestedPath pattern,
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
    private ConnectorEnd fEnd;
    
    private Slot fPropertyPath;
    
    private static List<String> parameterNames = makeImmutableList("end", "propertyPath");
    
    private Match(final ConnectorEnd pEnd, final Slot pPropertyPath) {
      this.fEnd = pEnd;
      this.fPropertyPath = pPropertyPath;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("end".equals(parameterName)) return this.fEnd;
      if ("propertyPath".equals(parameterName)) return this.fPropertyPath;
      return null;
    }
    
    public ConnectorEnd getEnd() {
      return this.fEnd;
    }
    
    public Slot getPropertyPath() {
      return this.fPropertyPath;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("end".equals(parameterName) ) {
          this.fEnd = (ConnectorEnd) newValue;
          return true;
      }
      if ("propertyPath".equals(parameterName) ) {
          this.fPropertyPath = (Slot) newValue;
          return true;
      }
      return false;
    }
    
    public void setEnd(final ConnectorEnd pEnd) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnd = pEnd;
    }
    
    public void setPropertyPath(final Slot pPropertyPath) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPropertyPath = pPropertyPath;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.connectorEndNestedPath";
    }
    
    @Override
    public List<String> parameterNames() {
      return ConnectorEndNestedPath.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEnd, fPropertyPath};
    }
    
    @Override
    public ConnectorEndNestedPath.Match toImmutable() {
      return isMutable() ? newMatch(fEnd, fPropertyPath) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"end\"=" + prettyPrintValue(fEnd) + ", ");
      result.append("\"propertyPath\"=" + prettyPrintValue(fPropertyPath));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEnd, fPropertyPath);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ConnectorEndNestedPath.Match)) {
          ConnectorEndNestedPath.Match other = (ConnectorEndNestedPath.Match) obj;
          return Objects.equals(fEnd, other.fEnd) && Objects.equals(fPropertyPath, other.fPropertyPath);
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
    public ConnectorEndNestedPath specification() {
      return ConnectorEndNestedPath.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ConnectorEndNestedPath.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPropertyPath the fixed value of pattern parameter propertyPath, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ConnectorEndNestedPath.Match newMutableMatch(final ConnectorEnd pEnd, final Slot pPropertyPath) {
      return new Mutable(pEnd, pPropertyPath);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPropertyPath the fixed value of pattern parameter propertyPath, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ConnectorEndNestedPath.Match newMatch(final ConnectorEnd pEnd, final Slot pPropertyPath) {
      return new Immutable(pEnd, pPropertyPath);
    }
    
    private static final class Mutable extends ConnectorEndNestedPath.Match {
      Mutable(final ConnectorEnd pEnd, final Slot pPropertyPath) {
        super(pEnd, pPropertyPath);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ConnectorEndNestedPath.Match {
      Immutable(final ConnectorEnd pEnd, final Slot pPropertyPath) {
        super(pEnd, pPropertyPath);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.connectorEndNestedPath pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern connectorEndNestedPath(end: ConnectorEnd, propertyPath: Slot) {
   * 	find sysml.NestedConnectorEnd(end, nestedConnectorEnd);
   * 	InstanceSpecification.slot(nestedConnectorEnd, propertyPath);
   * 	Slot.definingFeature.name(propertyPath, "propertyPath");
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ConnectorEndNestedPath
   * 
   */
  public static class Matcher extends BaseMatcher<ConnectorEndNestedPath.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ConnectorEndNestedPath.Matcher on(final ViatraQueryEngine engine) {
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
    public static ConnectorEndNestedPath.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_END = 0;
    
    private static final int POSITION_PROPERTYPATH = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ConnectorEndNestedPath.Matcher.class);
    
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
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPropertyPath the fixed value of pattern parameter propertyPath, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ConnectorEndNestedPath.Match> getAllMatches(final ConnectorEnd pEnd, final Slot pPropertyPath) {
      return rawStreamAllMatches(new Object[]{pEnd, pPropertyPath}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPropertyPath the fixed value of pattern parameter propertyPath, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ConnectorEndNestedPath.Match> streamAllMatches(final ConnectorEnd pEnd, final Slot pPropertyPath) {
      return rawStreamAllMatches(new Object[]{pEnd, pPropertyPath});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPropertyPath the fixed value of pattern parameter propertyPath, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ConnectorEndNestedPath.Match> getOneArbitraryMatch(final ConnectorEnd pEnd, final Slot pPropertyPath) {
      return rawGetOneArbitraryMatch(new Object[]{pEnd, pPropertyPath});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPropertyPath the fixed value of pattern parameter propertyPath, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final ConnectorEnd pEnd, final Slot pPropertyPath) {
      return rawHasMatch(new Object[]{pEnd, pPropertyPath});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPropertyPath the fixed value of pattern parameter propertyPath, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final ConnectorEnd pEnd, final Slot pPropertyPath) {
      return rawCountMatches(new Object[]{pEnd, pPropertyPath});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPropertyPath the fixed value of pattern parameter propertyPath, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final ConnectorEnd pEnd, final Slot pPropertyPath, final Consumer<? super ConnectorEndNestedPath.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEnd, pPropertyPath}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPropertyPath the fixed value of pattern parameter propertyPath, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ConnectorEndNestedPath.Match newMatch(final ConnectorEnd pEnd, final Slot pPropertyPath) {
      return ConnectorEndNestedPath.Match.newMatch(pEnd, pPropertyPath);
    }
    
    /**
     * Retrieve the set of values that occur in matches for end.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<ConnectorEnd> rawStreamAllValuesOfend(final Object[] parameters) {
      return rawStreamAllValues(POSITION_END, parameters).map(ConnectorEnd.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for end.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ConnectorEnd> getAllValuesOfend() {
      return rawStreamAllValuesOfend(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for end.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<ConnectorEnd> streamAllValuesOfend() {
      return rawStreamAllValuesOfend(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for end.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<ConnectorEnd> streamAllValuesOfend(final ConnectorEndNestedPath.Match partialMatch) {
      return rawStreamAllValuesOfend(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for end.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<ConnectorEnd> streamAllValuesOfend(final Slot pPropertyPath) {
      return rawStreamAllValuesOfend(new Object[]{null, pPropertyPath});
    }
    
    /**
     * Retrieve the set of values that occur in matches for end.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ConnectorEnd> getAllValuesOfend(final ConnectorEndNestedPath.Match partialMatch) {
      return rawStreamAllValuesOfend(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for end.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ConnectorEnd> getAllValuesOfend(final Slot pPropertyPath) {
      return rawStreamAllValuesOfend(new Object[]{null, pPropertyPath}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for propertyPath.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Slot> rawStreamAllValuesOfpropertyPath(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PROPERTYPATH, parameters).map(Slot.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for propertyPath.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Slot> getAllValuesOfpropertyPath() {
      return rawStreamAllValuesOfpropertyPath(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for propertyPath.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Slot> streamAllValuesOfpropertyPath() {
      return rawStreamAllValuesOfpropertyPath(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for propertyPath.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Slot> streamAllValuesOfpropertyPath(final ConnectorEndNestedPath.Match partialMatch) {
      return rawStreamAllValuesOfpropertyPath(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for propertyPath.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Slot> streamAllValuesOfpropertyPath(final ConnectorEnd pEnd) {
      return rawStreamAllValuesOfpropertyPath(new Object[]{pEnd, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for propertyPath.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Slot> getAllValuesOfpropertyPath(final ConnectorEndNestedPath.Match partialMatch) {
      return rawStreamAllValuesOfpropertyPath(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for propertyPath.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Slot> getAllValuesOfpropertyPath(final ConnectorEnd pEnd) {
      return rawStreamAllValuesOfpropertyPath(new Object[]{pEnd, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ConnectorEndNestedPath.Match tupleToMatch(final Tuple t) {
      try {
          return ConnectorEndNestedPath.Match.newMatch((ConnectorEnd) t.get(POSITION_END), (Slot) t.get(POSITION_PROPERTYPATH));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConnectorEndNestedPath.Match arrayToMatch(final Object[] match) {
      try {
          return ConnectorEndNestedPath.Match.newMatch((ConnectorEnd) match[POSITION_END], (Slot) match[POSITION_PROPERTYPATH]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConnectorEndNestedPath.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ConnectorEndNestedPath.Match.newMutableMatch((ConnectorEnd) match[POSITION_END], (Slot) match[POSITION_PROPERTYPATH]);
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
    public static IQuerySpecification<ConnectorEndNestedPath.Matcher> querySpecification() {
      return ConnectorEndNestedPath.instance();
    }
  }
  
  private ConnectorEndNestedPath() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ConnectorEndNestedPath instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ConnectorEndNestedPath.Matcher instantiate(final ViatraQueryEngine engine) {
    return ConnectorEndNestedPath.Matcher.on(engine);
  }
  
  @Override
  public ConnectorEndNestedPath.Matcher instantiate() {
    return ConnectorEndNestedPath.Matcher.create();
  }
  
  @Override
  public ConnectorEndNestedPath.Match newEmptyMatch() {
    return ConnectorEndNestedPath.Match.newEmptyMatch();
  }
  
  @Override
  public ConnectorEndNestedPath.Match newMatch(final Object... parameters) {
    return ConnectorEndNestedPath.Match.newMatch((com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.ConnectorEndNestedPath (visibility: PUBLIC, simpleName: ConnectorEndNestedPath, identifier: com.incquerylabs.magicdraw.plugin.example.queries.ConnectorEndNestedPath, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.ConnectorEndNestedPath (visibility: PUBLIC, simpleName: ConnectorEndNestedPath, identifier: com.incquerylabs.magicdraw.plugin.example.queries.ConnectorEndNestedPath, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ConnectorEndNestedPath INSTANCE = new ConnectorEndNestedPath();
    
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
    private static final ConnectorEndNestedPath.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_end = new PParameter("end", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")), PParameterDirection.INOUT);
    
    private final PParameter parameter_propertyPath = new PParameter("propertyPath", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_end, parameter_propertyPath);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.connectorEndNestedPath";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("end","propertyPath");
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
          PVariable var_end = body.getOrCreateVariableByName("end");
          PVariable var_propertyPath = body.getOrCreateVariableByName("propertyPath");
          PVariable var_nestedConnectorEnd = body.getOrCreateVariableByName("nestedConnectorEnd");
          new TypeConstraint(body, Tuples.flatTupleOf(var_end), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_propertyPath), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_end, parameter_end),
             new ExportedParameter(body, var_propertyPath, parameter_propertyPath)
          ));
          // 	find sysml.NestedConnectorEnd(end, nestedConnectorEnd)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_end, var_nestedConnectorEnd), NestedConnectorEnd.instance().getInternalQueryRepresentation());
          // 	InstanceSpecification.slot(nestedConnectorEnd, propertyPath)
          new TypeConstraint(body, Tuples.flatTupleOf(var_nestedConnectorEnd), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_nestedConnectorEnd, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification", "slot")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot")));
          new Equality(body, var__virtual_0_, var_propertyPath);
          // 	Slot.definingFeature.name(propertyPath, "propertyPath")
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, "propertyPath");
          new TypeConstraint(body, Tuples.flatTupleOf(var_propertyPath), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_propertyPath, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot", "definingFeature")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StructuralFeature")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
          new Equality(body, var__virtual_3_, var__virtual_1_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
