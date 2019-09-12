/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.ConnectorEndNestedPath;
import com.incquerylabs.magicdraw.plugin.example.queries.ConnectorToGen;
import com.incquerylabs.magicdraw.plugin.example.queries.EndToGen;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
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
 *         pattern delegationEnd(port: Port, connector: Connector, end: ConnectorEnd, block : Class) {
 *         	find connectorToGen(connector, block);
 *         	find endToGen(connector, end, port);
 *         	neg find connectorEndNestedPath(end, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class DelegationEnd extends BaseGeneratedEMFQuerySpecification<DelegationEnd.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.delegationEnd pattern,
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
    private Port fPort;
    
    private Connector fConnector;
    
    private ConnectorEnd fEnd;
    
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fBlock;
    
    private static List<String> parameterNames = makeImmutableList("port", "connector", "end", "block");
    
    private Match(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      this.fPort = pPort;
      this.fConnector = pConnector;
      this.fEnd = pEnd;
      this.fBlock = pBlock;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "port": return this.fPort;
          case "connector": return this.fConnector;
          case "end": return this.fEnd;
          case "block": return this.fBlock;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fPort;
          case 1: return this.fConnector;
          case 2: return this.fEnd;
          case 3: return this.fBlock;
          default: return null;
      }
    }
    
    public Port getPort() {
      return this.fPort;
    }
    
    public Connector getConnector() {
      return this.fConnector;
    }
    
    public ConnectorEnd getEnd() {
      return this.fEnd;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getBlock() {
      return this.fBlock;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("port".equals(parameterName) ) {
          this.fPort = (Port) newValue;
          return true;
      }
      if ("connector".equals(parameterName) ) {
          this.fConnector = (Connector) newValue;
          return true;
      }
      if ("end".equals(parameterName) ) {
          this.fEnd = (ConnectorEnd) newValue;
          return true;
      }
      if ("block".equals(parameterName) ) {
          this.fBlock = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setPort(final Port pPort) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPort = pPort;
    }
    
    public void setConnector(final Connector pConnector) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fConnector = pConnector;
    }
    
    public void setEnd(final ConnectorEnd pEnd) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnd = pEnd;
    }
    
    public void setBlock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fBlock = pBlock;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.delegationEnd";
    }
    
    @Override
    public List<String> parameterNames() {
      return DelegationEnd.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPort, fConnector, fEnd, fBlock};
    }
    
    @Override
    public DelegationEnd.Match toImmutable() {
      return isMutable() ? newMatch(fPort, fConnector, fEnd, fBlock) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"port\"=" + prettyPrintValue(fPort) + ", ");
      result.append("\"connector\"=" + prettyPrintValue(fConnector) + ", ");
      result.append("\"end\"=" + prettyPrintValue(fEnd) + ", ");
      result.append("\"block\"=" + prettyPrintValue(fBlock));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fPort, fConnector, fEnd, fBlock);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof DelegationEnd.Match)) {
          DelegationEnd.Match other = (DelegationEnd.Match) obj;
          return Objects.equals(fPort, other.fPort) && Objects.equals(fConnector, other.fConnector) && Objects.equals(fEnd, other.fEnd) && Objects.equals(fBlock, other.fBlock);
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
    public DelegationEnd specification() {
      return DelegationEnd.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static DelegationEnd.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static DelegationEnd.Match newMutableMatch(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return new Mutable(pPort, pConnector, pEnd, pBlock);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static DelegationEnd.Match newMatch(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return new Immutable(pPort, pConnector, pEnd, pBlock);
    }
    
    private static final class Mutable extends DelegationEnd.Match {
      Mutable(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
        super(pPort, pConnector, pEnd, pBlock);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends DelegationEnd.Match {
      Immutable(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
        super(pPort, pConnector, pEnd, pBlock);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.delegationEnd pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern delegationEnd(port: Port, connector: Connector, end: ConnectorEnd, block : Class) {
   * 	find connectorToGen(connector, block);
   * 	find endToGen(connector, end, port);
   * 	neg find connectorEndNestedPath(end, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see DelegationEnd
   * 
   */
  public static class Matcher extends BaseMatcher<DelegationEnd.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static DelegationEnd.Matcher on(final ViatraQueryEngine engine) {
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
    public static DelegationEnd.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PORT = 0;
    
    private static final int POSITION_CONNECTOR = 1;
    
    private static final int POSITION_END = 2;
    
    private static final int POSITION_BLOCK = 3;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DelegationEnd.Matcher.class);
    
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
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<DelegationEnd.Match> getAllMatches(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllMatches(new Object[]{pPort, pConnector, pEnd, pBlock}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<DelegationEnd.Match> streamAllMatches(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllMatches(new Object[]{pPort, pConnector, pEnd, pBlock});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<DelegationEnd.Match> getOneArbitraryMatch(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawGetOneArbitraryMatch(new Object[]{pPort, pConnector, pEnd, pBlock});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawHasMatch(new Object[]{pPort, pConnector, pEnd, pBlock});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawCountMatches(new Object[]{pPort, pConnector, pEnd, pBlock});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final Consumer<? super DelegationEnd.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPort, pConnector, pEnd, pBlock}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public DelegationEnd.Match newMatch(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return DelegationEnd.Match.newMatch(pPort, pConnector, pEnd, pBlock);
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Port> rawStreamAllValuesOfport(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PORT, parameters).map(Port.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfport() {
      return rawStreamAllValuesOfport(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfport() {
      return rawStreamAllValuesOfport(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfport(final DelegationEnd.Match partialMatch) {
      return rawStreamAllValuesOfport(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfport(final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfport(new Object[]{null, pConnector, pEnd, pBlock});
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfport(final DelegationEnd.Match partialMatch) {
      return rawStreamAllValuesOfport(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfport(final Connector pConnector, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfport(new Object[]{null, pConnector, pEnd, pBlock}).collect(Collectors.toSet());
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
    public Stream<Connector> streamAllValuesOfconnector(final DelegationEnd.Match partialMatch) {
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
    public Stream<Connector> streamAllValuesOfconnector(final Port pPort, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfconnector(new Object[]{pPort, null, pEnd, pBlock});
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Connector> getAllValuesOfconnector(final DelegationEnd.Match partialMatch) {
      return rawStreamAllValuesOfconnector(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Connector> getAllValuesOfconnector(final Port pPort, final ConnectorEnd pEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfconnector(new Object[]{pPort, null, pEnd, pBlock}).collect(Collectors.toSet());
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
    public Stream<ConnectorEnd> streamAllValuesOfend(final DelegationEnd.Match partialMatch) {
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
    public Stream<ConnectorEnd> streamAllValuesOfend(final Port pPort, final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfend(new Object[]{pPort, pConnector, null, pBlock});
    }
    
    /**
     * Retrieve the set of values that occur in matches for end.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ConnectorEnd> getAllValuesOfend(final DelegationEnd.Match partialMatch) {
      return rawStreamAllValuesOfend(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for end.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ConnectorEnd> getAllValuesOfend(final Port pPort, final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfend(new Object[]{pPort, pConnector, null, pBlock}).collect(Collectors.toSet());
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final DelegationEnd.Match partialMatch) {
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd) {
      return rawStreamAllValuesOfblock(new Object[]{pPort, pConnector, pEnd, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final DelegationEnd.Match partialMatch) {
      return rawStreamAllValuesOfblock(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final Port pPort, final Connector pConnector, final ConnectorEnd pEnd) {
      return rawStreamAllValuesOfblock(new Object[]{pPort, pConnector, pEnd, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected DelegationEnd.Match tupleToMatch(final Tuple t) {
      try {
          return DelegationEnd.Match.newMatch((Port) t.get(POSITION_PORT), (Connector) t.get(POSITION_CONNECTOR), (ConnectorEnd) t.get(POSITION_END), (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_BLOCK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DelegationEnd.Match arrayToMatch(final Object[] match) {
      try {
          return DelegationEnd.Match.newMatch((Port) match[POSITION_PORT], (Connector) match[POSITION_CONNECTOR], (ConnectorEnd) match[POSITION_END], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DelegationEnd.Match arrayToMatchMutable(final Object[] match) {
      try {
          return DelegationEnd.Match.newMutableMatch((Port) match[POSITION_PORT], (Connector) match[POSITION_CONNECTOR], (ConnectorEnd) match[POSITION_END], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK]);
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
    public static IQuerySpecification<DelegationEnd.Matcher> querySpecification() {
      return DelegationEnd.instance();
    }
  }
  
  private DelegationEnd() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static DelegationEnd instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DelegationEnd.Matcher instantiate(final ViatraQueryEngine engine) {
    return DelegationEnd.Matcher.on(engine);
  }
  
  @Override
  public DelegationEnd.Matcher instantiate() {
    return DelegationEnd.Matcher.create();
  }
  
  @Override
  public DelegationEnd.Match newEmptyMatch() {
    return DelegationEnd.Match.newEmptyMatch();
  }
  
  @Override
  public DelegationEnd.Match newMatch(final Object... parameters) {
    return DelegationEnd.Match.newMatch((com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port) parameters[0], (com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector) parameters[1], (com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd) parameters[2], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link DelegationEnd} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link DelegationEnd#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final DelegationEnd INSTANCE = new DelegationEnd();
    
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
    private static final DelegationEnd.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_port = new PParameter("port", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Port")), PParameterDirection.INOUT);
    
    private final PParameter parameter_connector = new PParameter("connector", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")), PParameterDirection.INOUT);
    
    private final PParameter parameter_end = new PParameter("end", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")), PParameterDirection.INOUT);
    
    private final PParameter parameter_block = new PParameter("block", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_port, parameter_connector, parameter_end, parameter_block);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.delegationEnd";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("port","connector","end","block");
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
          PVariable var_port = body.getOrCreateVariableByName("port");
          PVariable var_connector = body.getOrCreateVariableByName("connector");
          PVariable var_end = body.getOrCreateVariableByName("end");
          PVariable var_block = body.getOrCreateVariableByName("block");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_port), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Port")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_end), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_port, parameter_port),
             new ExportedParameter(body, var_connector, parameter_connector),
             new ExportedParameter(body, var_end, parameter_end),
             new ExportedParameter(body, var_block, parameter_block)
          ));
          // 	find connectorToGen(connector, block)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_connector, var_block), ConnectorToGen.instance().getInternalQueryRepresentation());
          // 	find endToGen(connector, end, port)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_connector, var_end, var_port), EndToGen.instance().getInternalQueryRepresentation());
          // 	neg find connectorEndNestedPath(end, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_end, var___0_), ConnectorEndNestedPath.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
