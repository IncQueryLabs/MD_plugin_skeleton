/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.DelegationEnd;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
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
 *         pattern delegationToGen(externalPort: Port, connector: Connector, otherEnd: ConnectorEnd, block : Class) {
 *         	find delegationEnd(externalPort, connector, externalEnd, block);
 *         	find endToGen(connector, otherEnd, _otherPort);
 *         	externalEnd != otherEnd;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class DelegationToGen extends BaseGeneratedEMFQuerySpecification<DelegationToGen.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.delegationToGen pattern,
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
    private Port fExternalPort;
    
    private Connector fConnector;
    
    private ConnectorEnd fOtherEnd;
    
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fBlock;
    
    private static List<String> parameterNames = makeImmutableList("externalPort", "connector", "otherEnd", "block");
    
    private Match(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      this.fExternalPort = pExternalPort;
      this.fConnector = pConnector;
      this.fOtherEnd = pOtherEnd;
      this.fBlock = pBlock;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "externalPort": return this.fExternalPort;
          case "connector": return this.fConnector;
          case "otherEnd": return this.fOtherEnd;
          case "block": return this.fBlock;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fExternalPort;
          case 1: return this.fConnector;
          case 2: return this.fOtherEnd;
          case 3: return this.fBlock;
          default: return null;
      }
    }
    
    public Port getExternalPort() {
      return this.fExternalPort;
    }
    
    public Connector getConnector() {
      return this.fConnector;
    }
    
    public ConnectorEnd getOtherEnd() {
      return this.fOtherEnd;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getBlock() {
      return this.fBlock;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("externalPort".equals(parameterName) ) {
          this.fExternalPort = (Port) newValue;
          return true;
      }
      if ("connector".equals(parameterName) ) {
          this.fConnector = (Connector) newValue;
          return true;
      }
      if ("otherEnd".equals(parameterName) ) {
          this.fOtherEnd = (ConnectorEnd) newValue;
          return true;
      }
      if ("block".equals(parameterName) ) {
          this.fBlock = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setExternalPort(final Port pExternalPort) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fExternalPort = pExternalPort;
    }
    
    public void setConnector(final Connector pConnector) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fConnector = pConnector;
    }
    
    public void setOtherEnd(final ConnectorEnd pOtherEnd) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOtherEnd = pOtherEnd;
    }
    
    public void setBlock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fBlock = pBlock;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.delegationToGen";
    }
    
    @Override
    public List<String> parameterNames() {
      return DelegationToGen.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fExternalPort, fConnector, fOtherEnd, fBlock};
    }
    
    @Override
    public DelegationToGen.Match toImmutable() {
      return isMutable() ? newMatch(fExternalPort, fConnector, fOtherEnd, fBlock) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"externalPort\"=" + prettyPrintValue(fExternalPort) + ", ");
      result.append("\"connector\"=" + prettyPrintValue(fConnector) + ", ");
      result.append("\"otherEnd\"=" + prettyPrintValue(fOtherEnd) + ", ");
      result.append("\"block\"=" + prettyPrintValue(fBlock));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fExternalPort, fConnector, fOtherEnd, fBlock);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof DelegationToGen.Match)) {
          DelegationToGen.Match other = (DelegationToGen.Match) obj;
          return Objects.equals(fExternalPort, other.fExternalPort) && Objects.equals(fConnector, other.fConnector) && Objects.equals(fOtherEnd, other.fOtherEnd) && Objects.equals(fBlock, other.fBlock);
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
    public DelegationToGen specification() {
      return DelegationToGen.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static DelegationToGen.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pExternalPort the fixed value of pattern parameter externalPort, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pOtherEnd the fixed value of pattern parameter otherEnd, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static DelegationToGen.Match newMutableMatch(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return new Mutable(pExternalPort, pConnector, pOtherEnd, pBlock);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pExternalPort the fixed value of pattern parameter externalPort, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pOtherEnd the fixed value of pattern parameter otherEnd, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static DelegationToGen.Match newMatch(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return new Immutable(pExternalPort, pConnector, pOtherEnd, pBlock);
    }
    
    private static final class Mutable extends DelegationToGen.Match {
      Mutable(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
        super(pExternalPort, pConnector, pOtherEnd, pBlock);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends DelegationToGen.Match {
      Immutable(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
        super(pExternalPort, pConnector, pOtherEnd, pBlock);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.delegationToGen pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern delegationToGen(externalPort: Port, connector: Connector, otherEnd: ConnectorEnd, block : Class) {
   * 	find delegationEnd(externalPort, connector, externalEnd, block);
   * 	find endToGen(connector, otherEnd, _otherPort);
   * 	externalEnd != otherEnd;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see DelegationToGen
   * 
   */
  public static class Matcher extends BaseMatcher<DelegationToGen.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static DelegationToGen.Matcher on(final ViatraQueryEngine engine) {
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
    public static DelegationToGen.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_EXTERNALPORT = 0;
    
    private static final int POSITION_CONNECTOR = 1;
    
    private static final int POSITION_OTHEREND = 2;
    
    private static final int POSITION_BLOCK = 3;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DelegationToGen.Matcher.class);
    
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
     * @param pExternalPort the fixed value of pattern parameter externalPort, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pOtherEnd the fixed value of pattern parameter otherEnd, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<DelegationToGen.Match> getAllMatches(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllMatches(new Object[]{pExternalPort, pConnector, pOtherEnd, pBlock}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pExternalPort the fixed value of pattern parameter externalPort, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pOtherEnd the fixed value of pattern parameter otherEnd, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<DelegationToGen.Match> streamAllMatches(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllMatches(new Object[]{pExternalPort, pConnector, pOtherEnd, pBlock});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pExternalPort the fixed value of pattern parameter externalPort, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pOtherEnd the fixed value of pattern parameter otherEnd, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<DelegationToGen.Match> getOneArbitraryMatch(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawGetOneArbitraryMatch(new Object[]{pExternalPort, pConnector, pOtherEnd, pBlock});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pExternalPort the fixed value of pattern parameter externalPort, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pOtherEnd the fixed value of pattern parameter otherEnd, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawHasMatch(new Object[]{pExternalPort, pConnector, pOtherEnd, pBlock});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pExternalPort the fixed value of pattern parameter externalPort, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pOtherEnd the fixed value of pattern parameter otherEnd, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawCountMatches(new Object[]{pExternalPort, pConnector, pOtherEnd, pBlock});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pExternalPort the fixed value of pattern parameter externalPort, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pOtherEnd the fixed value of pattern parameter otherEnd, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final Consumer<? super DelegationToGen.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pExternalPort, pConnector, pOtherEnd, pBlock}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pExternalPort the fixed value of pattern parameter externalPort, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param pOtherEnd the fixed value of pattern parameter otherEnd, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public DelegationToGen.Match newMatch(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return DelegationToGen.Match.newMatch(pExternalPort, pConnector, pOtherEnd, pBlock);
    }
    
    /**
     * Retrieve the set of values that occur in matches for externalPort.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Port> rawStreamAllValuesOfexternalPort(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EXTERNALPORT, parameters).map(Port.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for externalPort.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfexternalPort() {
      return rawStreamAllValuesOfexternalPort(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for externalPort.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfexternalPort() {
      return rawStreamAllValuesOfexternalPort(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for externalPort.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfexternalPort(final DelegationToGen.Match partialMatch) {
      return rawStreamAllValuesOfexternalPort(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for externalPort.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfexternalPort(final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfexternalPort(new Object[]{null, pConnector, pOtherEnd, pBlock});
    }
    
    /**
     * Retrieve the set of values that occur in matches for externalPort.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfexternalPort(final DelegationToGen.Match partialMatch) {
      return rawStreamAllValuesOfexternalPort(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for externalPort.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfexternalPort(final Connector pConnector, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfexternalPort(new Object[]{null, pConnector, pOtherEnd, pBlock}).collect(Collectors.toSet());
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
    public Stream<Connector> streamAllValuesOfconnector(final DelegationToGen.Match partialMatch) {
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
    public Stream<Connector> streamAllValuesOfconnector(final Port pExternalPort, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfconnector(new Object[]{pExternalPort, null, pOtherEnd, pBlock});
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Connector> getAllValuesOfconnector(final DelegationToGen.Match partialMatch) {
      return rawStreamAllValuesOfconnector(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Connector> getAllValuesOfconnector(final Port pExternalPort, final ConnectorEnd pOtherEnd, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfconnector(new Object[]{pExternalPort, null, pOtherEnd, pBlock}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for otherEnd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<ConnectorEnd> rawStreamAllValuesOfotherEnd(final Object[] parameters) {
      return rawStreamAllValues(POSITION_OTHEREND, parameters).map(ConnectorEnd.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for otherEnd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ConnectorEnd> getAllValuesOfotherEnd() {
      return rawStreamAllValuesOfotherEnd(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for otherEnd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<ConnectorEnd> streamAllValuesOfotherEnd() {
      return rawStreamAllValuesOfotherEnd(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for otherEnd.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<ConnectorEnd> streamAllValuesOfotherEnd(final DelegationToGen.Match partialMatch) {
      return rawStreamAllValuesOfotherEnd(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for otherEnd.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<ConnectorEnd> streamAllValuesOfotherEnd(final Port pExternalPort, final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfotherEnd(new Object[]{pExternalPort, pConnector, null, pBlock});
    }
    
    /**
     * Retrieve the set of values that occur in matches for otherEnd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ConnectorEnd> getAllValuesOfotherEnd(final DelegationToGen.Match partialMatch) {
      return rawStreamAllValuesOfotherEnd(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for otherEnd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ConnectorEnd> getAllValuesOfotherEnd(final Port pExternalPort, final Connector pConnector, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfotherEnd(new Object[]{pExternalPort, pConnector, null, pBlock}).collect(Collectors.toSet());
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final DelegationToGen.Match partialMatch) {
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd) {
      return rawStreamAllValuesOfblock(new Object[]{pExternalPort, pConnector, pOtherEnd, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final DelegationToGen.Match partialMatch) {
      return rawStreamAllValuesOfblock(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final Port pExternalPort, final Connector pConnector, final ConnectorEnd pOtherEnd) {
      return rawStreamAllValuesOfblock(new Object[]{pExternalPort, pConnector, pOtherEnd, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected DelegationToGen.Match tupleToMatch(final Tuple t) {
      try {
          return DelegationToGen.Match.newMatch((Port) t.get(POSITION_EXTERNALPORT), (Connector) t.get(POSITION_CONNECTOR), (ConnectorEnd) t.get(POSITION_OTHEREND), (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_BLOCK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DelegationToGen.Match arrayToMatch(final Object[] match) {
      try {
          return DelegationToGen.Match.newMatch((Port) match[POSITION_EXTERNALPORT], (Connector) match[POSITION_CONNECTOR], (ConnectorEnd) match[POSITION_OTHEREND], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DelegationToGen.Match arrayToMatchMutable(final Object[] match) {
      try {
          return DelegationToGen.Match.newMutableMatch((Port) match[POSITION_EXTERNALPORT], (Connector) match[POSITION_CONNECTOR], (ConnectorEnd) match[POSITION_OTHEREND], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK]);
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
    public static IQuerySpecification<DelegationToGen.Matcher> querySpecification() {
      return DelegationToGen.instance();
    }
  }
  
  private DelegationToGen() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static DelegationToGen instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DelegationToGen.Matcher instantiate(final ViatraQueryEngine engine) {
    return DelegationToGen.Matcher.on(engine);
  }
  
  @Override
  public DelegationToGen.Matcher instantiate() {
    return DelegationToGen.Matcher.create();
  }
  
  @Override
  public DelegationToGen.Match newEmptyMatch() {
    return DelegationToGen.Match.newEmptyMatch();
  }
  
  @Override
  public DelegationToGen.Match newMatch(final Object... parameters) {
    return DelegationToGen.Match.newMatch((com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port) parameters[0], (com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector) parameters[1], (com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd) parameters[2], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link DelegationToGen} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link DelegationToGen#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final DelegationToGen INSTANCE = new DelegationToGen();
    
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
    private static final DelegationToGen.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_externalPort = new PParameter("externalPort", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Port")), PParameterDirection.INOUT);
    
    private final PParameter parameter_connector = new PParameter("connector", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")), PParameterDirection.INOUT);
    
    private final PParameter parameter_otherEnd = new PParameter("otherEnd", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")), PParameterDirection.INOUT);
    
    private final PParameter parameter_block = new PParameter("block", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_externalPort, parameter_connector, parameter_otherEnd, parameter_block);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.delegationToGen";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("externalPort","connector","otherEnd","block");
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
          PVariable var_externalPort = body.getOrCreateVariableByName("externalPort");
          PVariable var_connector = body.getOrCreateVariableByName("connector");
          PVariable var_otherEnd = body.getOrCreateVariableByName("otherEnd");
          PVariable var_block = body.getOrCreateVariableByName("block");
          PVariable var_externalEnd = body.getOrCreateVariableByName("externalEnd");
          PVariable var__otherPort = body.getOrCreateVariableByName("_otherPort");
          new TypeConstraint(body, Tuples.flatTupleOf(var_externalPort), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Port")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_otherEnd), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_externalPort, parameter_externalPort),
             new ExportedParameter(body, var_connector, parameter_connector),
             new ExportedParameter(body, var_otherEnd, parameter_otherEnd),
             new ExportedParameter(body, var_block, parameter_block)
          ));
          // 	find delegationEnd(externalPort, connector, externalEnd, block)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_externalPort, var_connector, var_externalEnd, var_block), DelegationEnd.instance().getInternalQueryRepresentation());
          // 	find endToGen(connector, otherEnd, _otherPort)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_connector, var_otherEnd, var__otherPort), EndToGen.instance().getInternalQueryRepresentation());
          // 	externalEnd != otherEnd
          new Inequality(body, var_externalEnd, var_otherEnd);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
