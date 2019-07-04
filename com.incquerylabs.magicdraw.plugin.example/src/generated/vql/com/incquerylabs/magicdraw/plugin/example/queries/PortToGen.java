/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.BlockToGen;
import com.incquerylabs.magicdraw.plugin.example.queries.internal.ElementInNamespace;
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
 *         pattern portToGen(port : Port, block: Class) {
 *         	// find toOneUpper(port);
 *         	find blockToGen(block, _);
 *         	find elementInNamespace(port, block);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class PortToGen extends BaseGeneratedEMFQuerySpecification<PortToGen.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.portToGen pattern,
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
    
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fBlock;
    
    private static List<String> parameterNames = makeImmutableList("port", "block");
    
    private Match(final Port pPort, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      this.fPort = pPort;
      this.fBlock = pBlock;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("port".equals(parameterName)) return this.fPort;
      if ("block".equals(parameterName)) return this.fBlock;
      return null;
    }
    
    public Port getPort() {
      return this.fPort;
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
    
    public void setBlock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fBlock = pBlock;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.portToGen";
    }
    
    @Override
    public List<String> parameterNames() {
      return PortToGen.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPort, fBlock};
    }
    
    @Override
    public PortToGen.Match toImmutable() {
      return isMutable() ? newMatch(fPort, fBlock) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"port\"=" + prettyPrintValue(fPort) + ", ");
      result.append("\"block\"=" + prettyPrintValue(fBlock));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fPort, fBlock);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PortToGen.Match)) {
          PortToGen.Match other = (PortToGen.Match) obj;
          return Objects.equals(fPort, other.fPort) && Objects.equals(fBlock, other.fBlock);
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
    public PortToGen specification() {
      return PortToGen.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PortToGen.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PortToGen.Match newMutableMatch(final Port pPort, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return new Mutable(pPort, pBlock);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PortToGen.Match newMatch(final Port pPort, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return new Immutable(pPort, pBlock);
    }
    
    private static final class Mutable extends PortToGen.Match {
      Mutable(final Port pPort, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
        super(pPort, pBlock);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends PortToGen.Match {
      Immutable(final Port pPort, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
        super(pPort, pBlock);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.portToGen pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern portToGen(port : Port, block: Class) {
   * 	// find toOneUpper(port);
   * 	find blockToGen(block, _);
   * 	find elementInNamespace(port, block);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see PortToGen
   * 
   */
  public static class Matcher extends BaseMatcher<PortToGen.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PortToGen.Matcher on(final ViatraQueryEngine engine) {
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
    public static PortToGen.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PORT = 0;
    
    private static final int POSITION_BLOCK = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PortToGen.Matcher.class);
    
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
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PortToGen.Match> getAllMatches(final Port pPort, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllMatches(new Object[]{pPort, pBlock}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<PortToGen.Match> streamAllMatches(final Port pPort, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllMatches(new Object[]{pPort, pBlock});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<PortToGen.Match> getOneArbitraryMatch(final Port pPort, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawGetOneArbitraryMatch(new Object[]{pPort, pBlock});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Port pPort, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawHasMatch(new Object[]{pPort, pBlock});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Port pPort, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawCountMatches(new Object[]{pPort, pBlock});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Port pPort, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final Consumer<? super PortToGen.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPort, pBlock}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PortToGen.Match newMatch(final Port pPort, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return PortToGen.Match.newMatch(pPort, pBlock);
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
    public Stream<Port> streamAllValuesOfport(final PortToGen.Match partialMatch) {
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
    public Stream<Port> streamAllValuesOfport(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfport(new Object[]{null, pBlock});
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfport(final PortToGen.Match partialMatch) {
      return rawStreamAllValuesOfport(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfport(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfport(new Object[]{null, pBlock}).collect(Collectors.toSet());
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final PortToGen.Match partialMatch) {
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final Port pPort) {
      return rawStreamAllValuesOfblock(new Object[]{pPort, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final PortToGen.Match partialMatch) {
      return rawStreamAllValuesOfblock(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final Port pPort) {
      return rawStreamAllValuesOfblock(new Object[]{pPort, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected PortToGen.Match tupleToMatch(final Tuple t) {
      try {
          return PortToGen.Match.newMatch((Port) t.get(POSITION_PORT), (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_BLOCK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PortToGen.Match arrayToMatch(final Object[] match) {
      try {
          return PortToGen.Match.newMatch((Port) match[POSITION_PORT], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PortToGen.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PortToGen.Match.newMutableMatch((Port) match[POSITION_PORT], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK]);
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
    public static IQuerySpecification<PortToGen.Matcher> querySpecification() {
      return PortToGen.instance();
    }
  }
  
  private PortToGen() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PortToGen instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected PortToGen.Matcher instantiate(final ViatraQueryEngine engine) {
    return PortToGen.Matcher.on(engine);
  }
  
  @Override
  public PortToGen.Matcher instantiate() {
    return PortToGen.Matcher.create();
  }
  
  @Override
  public PortToGen.Match newEmptyMatch() {
    return PortToGen.Match.newEmptyMatch();
  }
  
  @Override
  public PortToGen.Match newMatch(final Object... parameters) {
    return PortToGen.Match.newMatch((com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.PortToGen (visibility: PUBLIC, simpleName: PortToGen, identifier: com.incquerylabs.magicdraw.plugin.example.queries.PortToGen, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.PortToGen (visibility: PUBLIC, simpleName: PortToGen, identifier: com.incquerylabs.magicdraw.plugin.example.queries.PortToGen, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final PortToGen INSTANCE = new PortToGen();
    
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
    private static final PortToGen.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_port = new PParameter("port", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Port")), PParameterDirection.INOUT);
    
    private final PParameter parameter_block = new PParameter("block", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_port, parameter_block);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.portToGen";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("port","block");
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
          PVariable var_block = body.getOrCreateVariableByName("block");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_port), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Port")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_port, parameter_port),
             new ExportedParameter(body, var_block, parameter_block)
          ));
          // 	// find toOneUpper(port);	find blockToGen(block, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_block, var___0_), BlockToGen.instance().getInternalQueryRepresentation());
          // 	find elementInNamespace(port, block)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_port, var_block), ElementInNamespace.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
