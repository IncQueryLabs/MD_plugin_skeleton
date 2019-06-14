/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.Block;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
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
 *         // or {...} // extend as needed
 *         
 *         pattern blockToGen(block : Class, pack: Package) {
 *         	find block(block);
 *         	Package.packagedElement+(pack, block);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class BlockToGen extends BaseGeneratedEMFQuerySpecification<BlockToGen.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.blockToGen pattern,
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
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fBlock;
    
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package fPack;
    
    private static List<String> parameterNames = makeImmutableList("block", "pack");
    
    private Match(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
      this.fBlock = pBlock;
      this.fPack = pPack;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("block".equals(parameterName)) return this.fBlock;
      if ("pack".equals(parameterName)) return this.fPack;
      return null;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getBlock() {
      return this.fBlock;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getPack() {
      return this.fPack;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("block".equals(parameterName) ) {
          this.fBlock = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      if ("pack".equals(parameterName) ) {
          this.fPack = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) newValue;
          return true;
      }
      return false;
    }
    
    public void setBlock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fBlock = pBlock;
    }
    
    public void setPack(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPack = pPack;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.blockToGen";
    }
    
    @Override
    public List<String> parameterNames() {
      return BlockToGen.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fBlock, fPack};
    }
    
    @Override
    public BlockToGen.Match toImmutable() {
      return isMutable() ? newMatch(fBlock, fPack) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"block\"=" + prettyPrintValue(fBlock) + ", ");
      result.append("\"pack\"=" + prettyPrintValue(fPack));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fBlock, fPack);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof BlockToGen.Match)) {
          BlockToGen.Match other = (BlockToGen.Match) obj;
          return Objects.equals(fBlock, other.fBlock) && Objects.equals(fPack, other.fPack);
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
    public BlockToGen specification() {
      return BlockToGen.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static BlockToGen.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static BlockToGen.Match newMutableMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
      return new Mutable(pBlock, pPack);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static BlockToGen.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
      return new Immutable(pBlock, pPack);
    }
    
    private static final class Mutable extends BlockToGen.Match {
      Mutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
        super(pBlock, pPack);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends BlockToGen.Match {
      Immutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
        super(pBlock, pPack);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.blockToGen pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // or {...} // extend as needed
   * 
   * pattern blockToGen(block : Class, pack: Package) {
   * 	find block(block);
   * 	Package.packagedElement+(pack, block);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see BlockToGen
   * 
   */
  public static class Matcher extends BaseMatcher<BlockToGen.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static BlockToGen.Matcher on(final ViatraQueryEngine engine) {
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
    public static BlockToGen.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_BLOCK = 0;
    
    private static final int POSITION_PACK = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BlockToGen.Matcher.class);
    
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
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<BlockToGen.Match> getAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
      return rawStreamAllMatches(new Object[]{pBlock, pPack}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<BlockToGen.Match> streamAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
      return rawStreamAllMatches(new Object[]{pBlock, pPack});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<BlockToGen.Match> getOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
      return rawGetOneArbitraryMatch(new Object[]{pBlock, pPack});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
      return rawHasMatch(new Object[]{pBlock, pPack});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
      return rawCountMatches(new Object[]{pBlock, pPack});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack, final Consumer<? super BlockToGen.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pBlock, pPack}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pPack the fixed value of pattern parameter pack, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public BlockToGen.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
      return BlockToGen.Match.newMatch(pBlock, pPack);
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final BlockToGen.Match partialMatch) {
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
      return rawStreamAllValuesOfblock(new Object[]{null, pPack});
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final BlockToGen.Match partialMatch) {
      return rawStreamAllValuesOfblock(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pPack) {
      return rawStreamAllValuesOfblock(new Object[]{null, pPack}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> rawStreamAllValuesOfpack(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PACK, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfpack() {
      return rawStreamAllValuesOfpack(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfpack() {
      return rawStreamAllValuesOfpack(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfpack(final BlockToGen.Match partialMatch) {
      return rawStreamAllValuesOfpack(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfpack(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfpack(new Object[]{pBlock, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfpack(final BlockToGen.Match partialMatch) {
      return rawStreamAllValuesOfpack(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for pack.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfpack(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfpack(new Object[]{pBlock, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected BlockToGen.Match tupleToMatch(final Tuple t) {
      try {
          return BlockToGen.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_BLOCK), (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) t.get(POSITION_PACK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected BlockToGen.Match arrayToMatch(final Object[] match) {
      try {
          return BlockToGen.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) match[POSITION_PACK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected BlockToGen.Match arrayToMatchMutable(final Object[] match) {
      try {
          return BlockToGen.Match.newMutableMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) match[POSITION_PACK]);
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
    public static IQuerySpecification<BlockToGen.Matcher> querySpecification() {
      return BlockToGen.instance();
    }
  }
  
  private BlockToGen() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static BlockToGen instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected BlockToGen.Matcher instantiate(final ViatraQueryEngine engine) {
    return BlockToGen.Matcher.on(engine);
  }
  
  @Override
  public BlockToGen.Matcher instantiate() {
    return BlockToGen.Matcher.create();
  }
  
  @Override
  public BlockToGen.Match newEmptyMatch() {
    return BlockToGen.Match.newEmptyMatch();
  }
  
  @Override
  public BlockToGen.Match newMatch(final Object... parameters) {
    return BlockToGen.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.BlockToGen (visibility: PUBLIC, simpleName: BlockToGen, identifier: com.incquerylabs.magicdraw.plugin.example.queries.BlockToGen, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.BlockToGen (visibility: PUBLIC, simpleName: BlockToGen, identifier: com.incquerylabs.magicdraw.plugin.example.queries.BlockToGen, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final BlockToGen INSTANCE = new BlockToGen();
    
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
    private static final BlockToGen.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_block = new PParameter("block", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pack = new PParameter("pack", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_block, parameter_pack);
    
    private class Embedded_1_Package_packagedElement extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "PackageableElement")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_Package_packagedElement() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_Package_packagedElement";
      }
      
      @Override
      public List<PParameter> getParameters() {
        return embeddedParameters;
      }
      
      @Override
      public Set<PBody> doGetContainedBodies() {
        PBody body = new PBody(this);
        PVariable var_p0 = body.getOrCreateVariableByName("p0");
        PVariable var_p1 = body.getOrCreateVariableByName("p1");
        body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
           new ExportedParameter(body, var_p0, parameter_p0),
           new ExportedParameter(body, var_p1, parameter_p1)
        ));
        // 	Package.packagedElement+(pack, block)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package", "packagedElement")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "PackageableElement")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.blockToGen";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("block","pack");
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
          PVariable var_block = body.getOrCreateVariableByName("block");
          PVariable var_pack = body.getOrCreateVariableByName("pack");
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_pack), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_block, parameter_block),
             new ExportedParameter(body, var_pack, parameter_pack)
          ));
          // 	find block(block)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_block), Block.instance().getInternalQueryRepresentation());
          // 	Package.packagedElement+(pack, block)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_pack, var_block), new BlockToGen.GeneratedPQuery.Embedded_1_Package_packagedElement());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
