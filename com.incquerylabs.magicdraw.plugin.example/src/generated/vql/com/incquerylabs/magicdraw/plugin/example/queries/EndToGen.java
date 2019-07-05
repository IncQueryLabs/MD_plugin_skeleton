/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.PortToGen;
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

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern endToGen(connector: Connector, end: ConnectorEnd, port: Port) {
 *         	Connector.end(connector, end);
 *         	ConnectorEnd.role(end, port);
 *         	find portToGen(port, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EndToGen extends BaseGeneratedEMFQuerySpecification<EndToGen.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.endToGen pattern,
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
    
    private ConnectorEnd fEnd;
    
    private Port fPort;
    
    private static List<String> parameterNames = makeImmutableList("connector", "end", "port");
    
    private Match(final Connector pConnector, final ConnectorEnd pEnd, final Port pPort) {
      this.fConnector = pConnector;
      this.fEnd = pEnd;
      this.fPort = pPort;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("connector".equals(parameterName)) return this.fConnector;
      if ("end".equals(parameterName)) return this.fEnd;
      if ("port".equals(parameterName)) return this.fPort;
      return null;
    }
    
    public Connector getConnector() {
      return this.fConnector;
    }
    
    public ConnectorEnd getEnd() {
      return this.fEnd;
    }
    
    public Port getPort() {
      return this.fPort;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("connector".equals(parameterName) ) {
          this.fConnector = (Connector) newValue;
          return true;
      }
      if ("end".equals(parameterName) ) {
          this.fEnd = (ConnectorEnd) newValue;
          return true;
      }
      if ("port".equals(parameterName) ) {
          this.fPort = (Port) newValue;
          return true;
      }
      return false;
    }
    
    public void setConnector(final Connector pConnector) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fConnector = pConnector;
    }
    
    public void setEnd(final ConnectorEnd pEnd) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnd = pEnd;
    }
    
    public void setPort(final Port pPort) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPort = pPort;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.endToGen";
    }
    
    @Override
    public List<String> parameterNames() {
      return EndToGen.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fConnector, fEnd, fPort};
    }
    
    @Override
    public EndToGen.Match toImmutable() {
      return isMutable() ? newMatch(fConnector, fEnd, fPort) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"connector\"=" + prettyPrintValue(fConnector) + ", ");
      result.append("\"end\"=" + prettyPrintValue(fEnd) + ", ");
      result.append("\"port\"=" + prettyPrintValue(fPort));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fConnector, fEnd, fPort);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EndToGen.Match)) {
          EndToGen.Match other = (EndToGen.Match) obj;
          return Objects.equals(fConnector, other.fConnector) && Objects.equals(fEnd, other.fEnd) && Objects.equals(fPort, other.fPort);
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
    public EndToGen specification() {
      return EndToGen.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EndToGen.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EndToGen.Match newMutableMatch(final Connector pConnector, final ConnectorEnd pEnd, final Port pPort) {
      return new Mutable(pConnector, pEnd, pPort);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EndToGen.Match newMatch(final Connector pConnector, final ConnectorEnd pEnd, final Port pPort) {
      return new Immutable(pConnector, pEnd, pPort);
    }
    
    private static final class Mutable extends EndToGen.Match {
      Mutable(final Connector pConnector, final ConnectorEnd pEnd, final Port pPort) {
        super(pConnector, pEnd, pPort);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EndToGen.Match {
      Immutable(final Connector pConnector, final ConnectorEnd pEnd, final Port pPort) {
        super(pConnector, pEnd, pPort);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.endToGen pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern endToGen(connector: Connector, end: ConnectorEnd, port: Port) {
   * 	Connector.end(connector, end);
   * 	ConnectorEnd.role(end, port);
   * 	find portToGen(port, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EndToGen
   * 
   */
  public static class Matcher extends BaseMatcher<EndToGen.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EndToGen.Matcher on(final ViatraQueryEngine engine) {
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
    public static EndToGen.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CONNECTOR = 0;
    
    private static final int POSITION_END = 1;
    
    private static final int POSITION_PORT = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EndToGen.Matcher.class);
    
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
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EndToGen.Match> getAllMatches(final Connector pConnector, final ConnectorEnd pEnd, final Port pPort) {
      return rawStreamAllMatches(new Object[]{pConnector, pEnd, pPort}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EndToGen.Match> streamAllMatches(final Connector pConnector, final ConnectorEnd pEnd, final Port pPort) {
      return rawStreamAllMatches(new Object[]{pConnector, pEnd, pPort});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EndToGen.Match> getOneArbitraryMatch(final Connector pConnector, final ConnectorEnd pEnd, final Port pPort) {
      return rawGetOneArbitraryMatch(new Object[]{pConnector, pEnd, pPort});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Connector pConnector, final ConnectorEnd pEnd, final Port pPort) {
      return rawHasMatch(new Object[]{pConnector, pEnd, pPort});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Connector pConnector, final ConnectorEnd pEnd, final Port pPort) {
      return rawCountMatches(new Object[]{pConnector, pEnd, pPort});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Connector pConnector, final ConnectorEnd pEnd, final Port pPort, final Consumer<? super EndToGen.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pConnector, pEnd, pPort}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pEnd the fixed value of pattern parameter end, or null if not bound.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EndToGen.Match newMatch(final Connector pConnector, final ConnectorEnd pEnd, final Port pPort) {
      return EndToGen.Match.newMatch(pConnector, pEnd, pPort);
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
    public Stream<Connector> streamAllValuesOfconnector(final EndToGen.Match partialMatch) {
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
    public Stream<Connector> streamAllValuesOfconnector(final ConnectorEnd pEnd, final Port pPort) {
      return rawStreamAllValuesOfconnector(new Object[]{null, pEnd, pPort});
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Connector> getAllValuesOfconnector(final EndToGen.Match partialMatch) {
      return rawStreamAllValuesOfconnector(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Connector> getAllValuesOfconnector(final ConnectorEnd pEnd, final Port pPort) {
      return rawStreamAllValuesOfconnector(new Object[]{null, pEnd, pPort}).collect(Collectors.toSet());
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
    public Stream<ConnectorEnd> streamAllValuesOfend(final EndToGen.Match partialMatch) {
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
    public Stream<ConnectorEnd> streamAllValuesOfend(final Connector pConnector, final Port pPort) {
      return rawStreamAllValuesOfend(new Object[]{pConnector, null, pPort});
    }
    
    /**
     * Retrieve the set of values that occur in matches for end.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ConnectorEnd> getAllValuesOfend(final EndToGen.Match partialMatch) {
      return rawStreamAllValuesOfend(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for end.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ConnectorEnd> getAllValuesOfend(final Connector pConnector, final Port pPort) {
      return rawStreamAllValuesOfend(new Object[]{pConnector, null, pPort}).collect(Collectors.toSet());
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
    public Stream<Port> streamAllValuesOfport(final EndToGen.Match partialMatch) {
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
    public Stream<Port> streamAllValuesOfport(final Connector pConnector, final ConnectorEnd pEnd) {
      return rawStreamAllValuesOfport(new Object[]{pConnector, pEnd, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfport(final EndToGen.Match partialMatch) {
      return rawStreamAllValuesOfport(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfport(final Connector pConnector, final ConnectorEnd pEnd) {
      return rawStreamAllValuesOfport(new Object[]{pConnector, pEnd, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected EndToGen.Match tupleToMatch(final Tuple t) {
      try {
          return EndToGen.Match.newMatch((Connector) t.get(POSITION_CONNECTOR), (ConnectorEnd) t.get(POSITION_END), (Port) t.get(POSITION_PORT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndToGen.Match arrayToMatch(final Object[] match) {
      try {
          return EndToGen.Match.newMatch((Connector) match[POSITION_CONNECTOR], (ConnectorEnd) match[POSITION_END], (Port) match[POSITION_PORT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndToGen.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EndToGen.Match.newMutableMatch((Connector) match[POSITION_CONNECTOR], (ConnectorEnd) match[POSITION_END], (Port) match[POSITION_PORT]);
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
    public static IQuerySpecification<EndToGen.Matcher> querySpecification() {
      return EndToGen.instance();
    }
  }
  
  private EndToGen() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EndToGen instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EndToGen.Matcher instantiate(final ViatraQueryEngine engine) {
    return EndToGen.Matcher.on(engine);
  }
  
  @Override
  public EndToGen.Matcher instantiate() {
    return EndToGen.Matcher.create();
  }
  
  @Override
  public EndToGen.Match newEmptyMatch() {
    return EndToGen.Match.newEmptyMatch();
  }
  
  @Override
  public EndToGen.Match newMatch(final Object... parameters) {
    return EndToGen.Match.newMatch((com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector) parameters[0], (com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd) parameters[1], (com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.EndToGen (visibility: PUBLIC, simpleName: EndToGen, identifier: com.incquerylabs.magicdraw.plugin.example.queries.EndToGen, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.EndToGen (visibility: PUBLIC, simpleName: EndToGen, identifier: com.incquerylabs.magicdraw.plugin.example.queries.EndToGen, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EndToGen INSTANCE = new EndToGen();
    
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
    private static final EndToGen.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_connector = new PParameter("connector", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")), PParameterDirection.INOUT);
    
    private final PParameter parameter_end = new PParameter("end", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")), PParameterDirection.INOUT);
    
    private final PParameter parameter_port = new PParameter("port", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Port")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_connector, parameter_end, parameter_port);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.endToGen";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("connector","end","port");
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
          PVariable var_end = body.getOrCreateVariableByName("end");
          PVariable var_port = body.getOrCreateVariableByName("port");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_end), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_port), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Port")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_connector, parameter_connector),
             new ExportedParameter(body, var_end, parameter_end),
             new ExportedParameter(body, var_port, parameter_port)
          ));
          // 	Connector.end(connector, end)
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector", "end")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")));
          new Equality(body, var__virtual_0_, var_end);
          // 	ConnectorEnd.role(end, port)
          new TypeConstraint(body, Tuples.flatTupleOf(var_end), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_end, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd", "role")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectableElement")));
          new Equality(body, var__virtual_1_, var_port);
          // 	find portToGen(port, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_port, var___0_), PortToGen.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
