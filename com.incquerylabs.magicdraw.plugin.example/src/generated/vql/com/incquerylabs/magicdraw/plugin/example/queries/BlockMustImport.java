/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.MandatoryPartToGen;
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
 *         pattern blockMustImport(block: Class, importedBlock: Class) {
 *         	find mandatoryPartToGen(part, block);
 *         	TypedElement.type(part, importedBlock);
 *         	importedBlock != block;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class BlockMustImport extends BaseGeneratedEMFQuerySpecification<BlockMustImport.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.blockMustImport pattern,
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
    
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fImportedBlock;
    
    private static List<String> parameterNames = makeImmutableList("block", "importedBlock");
    
    private Match(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
      this.fBlock = pBlock;
      this.fImportedBlock = pImportedBlock;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("block".equals(parameterName)) return this.fBlock;
      if ("importedBlock".equals(parameterName)) return this.fImportedBlock;
      return null;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getBlock() {
      return this.fBlock;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getImportedBlock() {
      return this.fImportedBlock;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("block".equals(parameterName) ) {
          this.fBlock = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      if ("importedBlock".equals(parameterName) ) {
          this.fImportedBlock = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setBlock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fBlock = pBlock;
    }
    
    public void setImportedBlock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fImportedBlock = pImportedBlock;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.blockMustImport";
    }
    
    @Override
    public List<String> parameterNames() {
      return BlockMustImport.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fBlock, fImportedBlock};
    }
    
    @Override
    public BlockMustImport.Match toImmutable() {
      return isMutable() ? newMatch(fBlock, fImportedBlock) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"block\"=" + prettyPrintValue(fBlock) + ", ");
      result.append("\"importedBlock\"=" + prettyPrintValue(fImportedBlock));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fBlock, fImportedBlock);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof BlockMustImport.Match)) {
          BlockMustImport.Match other = (BlockMustImport.Match) obj;
          return Objects.equals(fBlock, other.fBlock) && Objects.equals(fImportedBlock, other.fImportedBlock);
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
    public BlockMustImport specification() {
      return BlockMustImport.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static BlockMustImport.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pImportedBlock the fixed value of pattern parameter importedBlock, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static BlockMustImport.Match newMutableMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
      return new Mutable(pBlock, pImportedBlock);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pImportedBlock the fixed value of pattern parameter importedBlock, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static BlockMustImport.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
      return new Immutable(pBlock, pImportedBlock);
    }
    
    private static final class Mutable extends BlockMustImport.Match {
      Mutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
        super(pBlock, pImportedBlock);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends BlockMustImport.Match {
      Immutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
        super(pBlock, pImportedBlock);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.blockMustImport pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern blockMustImport(block: Class, importedBlock: Class) {
   * 	find mandatoryPartToGen(part, block);
   * 	TypedElement.type(part, importedBlock);
   * 	importedBlock != block;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see BlockMustImport
   * 
   */
  public static class Matcher extends BaseMatcher<BlockMustImport.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static BlockMustImport.Matcher on(final ViatraQueryEngine engine) {
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
    public static BlockMustImport.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_BLOCK = 0;
    
    private static final int POSITION_IMPORTEDBLOCK = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BlockMustImport.Matcher.class);
    
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
     * @param pImportedBlock the fixed value of pattern parameter importedBlock, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<BlockMustImport.Match> getAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
      return rawStreamAllMatches(new Object[]{pBlock, pImportedBlock}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pImportedBlock the fixed value of pattern parameter importedBlock, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<BlockMustImport.Match> streamAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
      return rawStreamAllMatches(new Object[]{pBlock, pImportedBlock});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pImportedBlock the fixed value of pattern parameter importedBlock, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<BlockMustImport.Match> getOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
      return rawGetOneArbitraryMatch(new Object[]{pBlock, pImportedBlock});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pImportedBlock the fixed value of pattern parameter importedBlock, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
      return rawHasMatch(new Object[]{pBlock, pImportedBlock});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pImportedBlock the fixed value of pattern parameter importedBlock, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
      return rawCountMatches(new Object[]{pBlock, pImportedBlock});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pImportedBlock the fixed value of pattern parameter importedBlock, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock, final Consumer<? super BlockMustImport.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pBlock, pImportedBlock}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param pImportedBlock the fixed value of pattern parameter importedBlock, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public BlockMustImport.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
      return BlockMustImport.Match.newMatch(pBlock, pImportedBlock);
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final BlockMustImport.Match partialMatch) {
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
      return rawStreamAllValuesOfblock(new Object[]{null, pImportedBlock});
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final BlockMustImport.Match partialMatch) {
      return rawStreamAllValuesOfblock(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pImportedBlock) {
      return rawStreamAllValuesOfblock(new Object[]{null, pImportedBlock}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for importedBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> rawStreamAllValuesOfimportedBlock(final Object[] parameters) {
      return rawStreamAllValues(POSITION_IMPORTEDBLOCK, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for importedBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfimportedBlock() {
      return rawStreamAllValuesOfimportedBlock(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for importedBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfimportedBlock() {
      return rawStreamAllValuesOfimportedBlock(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for importedBlock.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfimportedBlock(final BlockMustImport.Match partialMatch) {
      return rawStreamAllValuesOfimportedBlock(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for importedBlock.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfimportedBlock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfimportedBlock(new Object[]{pBlock, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for importedBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfimportedBlock(final BlockMustImport.Match partialMatch) {
      return rawStreamAllValuesOfimportedBlock(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for importedBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfimportedBlock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfimportedBlock(new Object[]{pBlock, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected BlockMustImport.Match tupleToMatch(final Tuple t) {
      try {
          return BlockMustImport.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_BLOCK), (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_IMPORTEDBLOCK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected BlockMustImport.Match arrayToMatch(final Object[] match) {
      try {
          return BlockMustImport.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_IMPORTEDBLOCK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected BlockMustImport.Match arrayToMatchMutable(final Object[] match) {
      try {
          return BlockMustImport.Match.newMutableMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_IMPORTEDBLOCK]);
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
    public static IQuerySpecification<BlockMustImport.Matcher> querySpecification() {
      return BlockMustImport.instance();
    }
  }
  
  private BlockMustImport() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static BlockMustImport instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected BlockMustImport.Matcher instantiate(final ViatraQueryEngine engine) {
    return BlockMustImport.Matcher.on(engine);
  }
  
  @Override
  public BlockMustImport.Matcher instantiate() {
    return BlockMustImport.Matcher.create();
  }
  
  @Override
  public BlockMustImport.Match newEmptyMatch() {
    return BlockMustImport.Match.newEmptyMatch();
  }
  
  @Override
  public BlockMustImport.Match newMatch(final Object... parameters) {
    return BlockMustImport.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.BlockMustImport (visibility: PUBLIC, simpleName: BlockMustImport, identifier: com.incquerylabs.magicdraw.plugin.example.queries.BlockMustImport, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.BlockMustImport (visibility: PUBLIC, simpleName: BlockMustImport, identifier: com.incquerylabs.magicdraw.plugin.example.queries.BlockMustImport, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final BlockMustImport INSTANCE = new BlockMustImport();
    
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
    private static final BlockMustImport.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_block = new PParameter("block", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_importedBlock = new PParameter("importedBlock", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_block, parameter_importedBlock);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.blockMustImport";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("block","importedBlock");
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
          PVariable var_importedBlock = body.getOrCreateVariableByName("importedBlock");
          PVariable var_part = body.getOrCreateVariableByName("part");
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_importedBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_block, parameter_block),
             new ExportedParameter(body, var_importedBlock, parameter_importedBlock)
          ));
          // 	find mandatoryPartToGen(part, block)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_part, var_block), MandatoryPartToGen.instance().getInternalQueryRepresentation());
          // 	TypedElement.type(part, importedBlock)
          new TypeConstraint(body, Tuples.flatTupleOf(var_part), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "TypedElement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_part, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "TypedElement", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Type")));
          new Equality(body, var__virtual_0_, var_importedBlock);
          // 	importedBlock != block
          new Inequality(body, var_importedBlock, var_block);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
