/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.BlockToGen;
import com.incquerylabs.magicdraw.plugin.example.queries.EndToGen;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
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
 *         pattern connectorToGen(connector: Connector, block: Class) {
 *         	find blockToGen(block, _);
 *         	Class.ownedConnector(block, connector);
 *         	2 == count find endToGen(connector, _, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ConnectorToGen extends BaseGeneratedEMFQuerySpecification<ConnectorToGen.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.connectorToGen pattern,
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
    private Connector fConnector;
    
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fBlock;
    
    private static List<String> parameterNames = makeImmutableList("connector", "block");
    
    private Match(final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      this.fConnector = pConnector;
      this.fBlock = pBlock;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("connector".equals(parameterName)) return this.fConnector;
      if ("block".equals(parameterName)) return this.fBlock;
      return null;
    }
    
    public Connector getConnector() {
      return this.fConnector;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getBlock() {
      return this.fBlock;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("connector".equals(parameterName) ) {
          this.fConnector = (Connector) newValue;
          return true;
      }
      if ("block".equals(parameterName) ) {
          this.fBlock = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setConnector(final Connector pConnector) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fConnector = pConnector;
    }
    
    public void setBlock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fBlock = pBlock;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.connectorToGen";
    }
    
    @Override
    public List<String> parameterNames() {
      return ConnectorToGen.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fConnector, fBlock};
    }
    
    @Override
    public ConnectorToGen.Match toImmutable() {
      return isMutable() ? newMatch(fConnector, fBlock) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"connector\"=" + prettyPrintValue(fConnector) + ", ");
      result.append("\"block\"=" + prettyPrintValue(fBlock));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fConnector, fBlock);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ConnectorToGen.Match)) {
          ConnectorToGen.Match other = (ConnectorToGen.Match) obj;
          return Objects.equals(fConnector, other.fConnector) && Objects.equals(fBlock, other.fBlock);
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
    public ConnectorToGen specification() {
      return ConnectorToGen.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ConnectorToGen.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ConnectorToGen.Match newMutableMatch(final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return new Mutable(pConnector, pBlock);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ConnectorToGen.Match newMatch(final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return new Immutable(pConnector, pBlock);
    }
    
    private static final class Mutable extends ConnectorToGen.Match {
      Mutable(final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
        super(pConnector, pBlock);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ConnectorToGen.Match {
      Immutable(final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
        super(pConnector, pBlock);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.connectorToGen pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern connectorToGen(connector: Connector, block: Class) {
   * 	find blockToGen(block, _);
   * 	Class.ownedConnector(block, connector);
   * 	2 == count find endToGen(connector, _, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ConnectorToGen
   * 
   */
  public static class Matcher extends BaseMatcher<ConnectorToGen.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ConnectorToGen.Matcher on(final ViatraQueryEngine engine) {
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
    public static ConnectorToGen.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CONNECTOR = 0;
    
    private static final int POSITION_BLOCK = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ConnectorToGen.Matcher.class);
    
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
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ConnectorToGen.Match> getAllMatches(final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllMatches(new Object[]{pConnector, pBlock}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ConnectorToGen.Match> streamAllMatches(final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllMatches(new Object[]{pConnector, pBlock});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ConnectorToGen.Match> getOneArbitraryMatch(final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawGetOneArbitraryMatch(new Object[]{pConnector, pBlock});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawHasMatch(new Object[]{pConnector, pBlock});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawCountMatches(new Object[]{pConnector, pBlock});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final Consumer<? super ConnectorToGen.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pConnector, pBlock}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ConnectorToGen.Match newMatch(final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return ConnectorToGen.Match.newMatch(pConnector, pBlock);
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Connector> rawStreamAllValuesOfconnector(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CONNECTOR, parameters).map(Connector.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Connector> getAllValuesOfconnector() {
      return rawStreamAllValuesOfconnector(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Connector> streamAllValuesOfconnector() {
      return rawStreamAllValuesOfconnector(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Connector> streamAllValuesOfconnector(final ConnectorToGen.Match partialMatch) {
      return rawStreamAllValuesOfconnector(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Connector> streamAllValuesOfconnector(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfconnector(new Object[]{null, pBlock});
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Connector> getAllValuesOfconnector(final ConnectorToGen.Match partialMatch) {
      return rawStreamAllValuesOfconnector(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Connector> getAllValuesOfconnector(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfconnector(new Object[]{null, pBlock}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> rawStreamAllValuesOfblock(final Object[] parameters) {
      return rawStreamAllValues(POSITION_BLOCK, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock() {
      return rawStreamAllValuesOfblock(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock() {
      return rawStreamAllValuesOfblock(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final ConnectorToGen.Match partialMatch) {
      return rawStreamAllValuesOfblock(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final Connector pConnector) {
      return rawStreamAllValuesOfblock(new Object[]{pConnector, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final ConnectorToGen.Match partialMatch) {
      return rawStreamAllValuesOfblock(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final Connector pConnector) {
      return rawStreamAllValuesOfblock(new Object[]{pConnector, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ConnectorToGen.Match tupleToMatch(final Tuple t) {
      try {
          return ConnectorToGen.Match.newMatch((Connector) t.get(POSITION_CONNECTOR), (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_BLOCK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConnectorToGen.Match arrayToMatch(final Object[] match) {
      try {
          return ConnectorToGen.Match.newMatch((Connector) match[POSITION_CONNECTOR], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConnectorToGen.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ConnectorToGen.Match.newMutableMatch((Connector) match[POSITION_CONNECTOR], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK]);
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
    public static IQuerySpecification<ConnectorToGen.Matcher> querySpecification() {
      return ConnectorToGen.instance();
    }
  }
  
  private ConnectorToGen() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ConnectorToGen instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ConnectorToGen.Matcher instantiate(final ViatraQueryEngine engine) {
    return ConnectorToGen.Matcher.on(engine);
  }
  
  @Override
  public ConnectorToGen.Matcher instantiate() {
    return ConnectorToGen.Matcher.create();
  }
  
  @Override
  public ConnectorToGen.Match newEmptyMatch() {
    return ConnectorToGen.Match.newEmptyMatch();
  }
  
  @Override
  public ConnectorToGen.Match newMatch(final Object... parameters) {
    return ConnectorToGen.Match.newMatch((com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.ConnectorToGen (visibility: PUBLIC, simpleName: ConnectorToGen, identifier: com.incquerylabs.magicdraw.plugin.example.queries.ConnectorToGen, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.ConnectorToGen (visibility: PUBLIC, simpleName: ConnectorToGen, identifier: com.incquerylabs.magicdraw.plugin.example.queries.ConnectorToGen, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ConnectorToGen INSTANCE = new ConnectorToGen();
    
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
    private static final ConnectorToGen.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_connector = new PParameter("connector", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")), PParameterDirection.INOUT);
    
    private final PParameter parameter_block = new PParameter("block", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_connector, parameter_block);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.connectorToGen";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("connector","block");
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
          PVariable var_connector = body.getOrCreateVariableByName("connector");
          PVariable var_block = body.getOrCreateVariableByName("block");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_connector, parameter_connector),
             new ExportedParameter(body, var_block, parameter_block)
          ));
          // 	find blockToGen(block, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_block, var___0_), BlockToGen.instance().getInternalQueryRepresentation());
          // 	Class.ownedConnector(block, connector)
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_block, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StructuredClassifier", "ownedConnector")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")));
          new Equality(body, var__virtual_0_, var_connector);
          // 	2 == count find endToGen(connector, _, _)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, 2);
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_connector, var___1_, var___2_), EndToGen.instance().getInternalQueryRepresentation(), var__virtual_2_);
          new Equality(body, var__virtual_1_, var__virtual_2_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static int evaluateExpression_1_1() {
    return 2;
  }
}
