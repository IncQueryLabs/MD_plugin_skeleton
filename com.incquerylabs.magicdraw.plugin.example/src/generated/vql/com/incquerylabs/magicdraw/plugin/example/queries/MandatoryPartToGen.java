/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.BlockToGen;
import com.incquerylabs.magicdraw.plugin.example.queries.ToOneLower;
import com.incquerylabs.magicdraw.plugin.example.queries.ToOneUpper;
import com.incquerylabs.magicdraw.plugin.example.queries.internal.ElementInNamespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
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

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern mandatoryPartToGen(part : Property, block: Class) {
 *         	Property.aggregation(part, ::composite);
 *         	find toOneUpper(part);
 *         	find toOneLower(part);
 *         	find blockToGen(block, _);
 *         	find elementInNamespace(part, block);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class MandatoryPartToGen extends BaseGeneratedEMFQuerySpecification<MandatoryPartToGen.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.mandatoryPartToGen pattern,
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
    private Property fPart;
    
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fBlock;
    
    private static List<String> parameterNames = makeImmutableList("part", "block");
    
    private Match(final Property pPart, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      this.fPart = pPart;
      this.fBlock = pBlock;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "part": return this.fPart;
          case "block": return this.fBlock;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fPart;
          case 1: return this.fBlock;
          default: return null;
      }
    }
    
    public Property getPart() {
      return this.fPart;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getBlock() {
      return this.fBlock;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("part".equals(parameterName) ) {
          this.fPart = (Property) newValue;
          return true;
      }
      if ("block".equals(parameterName) ) {
          this.fBlock = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setPart(final Property pPart) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPart = pPart;
    }
    
    public void setBlock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fBlock = pBlock;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.mandatoryPartToGen";
    }
    
    @Override
    public List<String> parameterNames() {
      return MandatoryPartToGen.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPart, fBlock};
    }
    
    @Override
    public MandatoryPartToGen.Match toImmutable() {
      return isMutable() ? newMatch(fPart, fBlock) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"part\"=" + prettyPrintValue(fPart) + ", ");
      result.append("\"block\"=" + prettyPrintValue(fBlock));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fPart, fBlock);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MandatoryPartToGen.Match)) {
          MandatoryPartToGen.Match other = (MandatoryPartToGen.Match) obj;
          return Objects.equals(fPart, other.fPart) && Objects.equals(fBlock, other.fBlock);
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
    public MandatoryPartToGen specification() {
      return MandatoryPartToGen.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MandatoryPartToGen.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPart the fixed value of pattern parameter part, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MandatoryPartToGen.Match newMutableMatch(final Property pPart, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return new Mutable(pPart, pBlock);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPart the fixed value of pattern parameter part, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MandatoryPartToGen.Match newMatch(final Property pPart, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return new Immutable(pPart, pBlock);
    }
    
    private static final class Mutable extends MandatoryPartToGen.Match {
      Mutable(final Property pPart, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
        super(pPart, pBlock);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MandatoryPartToGen.Match {
      Immutable(final Property pPart, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
        super(pPart, pBlock);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.mandatoryPartToGen pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern mandatoryPartToGen(part : Property, block: Class) {
   * 	Property.aggregation(part, ::composite);
   * 	find toOneUpper(part);
   * 	find toOneLower(part);
   * 	find blockToGen(block, _);
   * 	find elementInNamespace(part, block);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see MandatoryPartToGen
   * 
   */
  public static class Matcher extends BaseMatcher<MandatoryPartToGen.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MandatoryPartToGen.Matcher on(final ViatraQueryEngine engine) {
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
    public static MandatoryPartToGen.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PART = 0;
    
    private static final int POSITION_BLOCK = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MandatoryPartToGen.Matcher.class);
    
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
     * @param pPart the fixed value of pattern parameter part, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MandatoryPartToGen.Match> getAllMatches(final Property pPart, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllMatches(new Object[]{pPart, pBlock}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pPart the fixed value of pattern parameter part, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<MandatoryPartToGen.Match> streamAllMatches(final Property pPart, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllMatches(new Object[]{pPart, pBlock});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPart the fixed value of pattern parameter part, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<MandatoryPartToGen.Match> getOneArbitraryMatch(final Property pPart, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawGetOneArbitraryMatch(new Object[]{pPart, pBlock});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPart the fixed value of pattern parameter part, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Property pPart, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawHasMatch(new Object[]{pPart, pBlock});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPart the fixed value of pattern parameter part, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Property pPart, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawCountMatches(new Object[]{pPart, pBlock});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPart the fixed value of pattern parameter part, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Property pPart, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock, final Consumer<? super MandatoryPartToGen.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPart, pBlock}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPart the fixed value of pattern parameter part, or null if not bound.
     * @param pBlock the fixed value of pattern parameter block, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MandatoryPartToGen.Match newMatch(final Property pPart, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return MandatoryPartToGen.Match.newMatch(pPart, pBlock);
    }
    
    /**
     * Retrieve the set of values that occur in matches for part.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Property> rawStreamAllValuesOfpart(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PART, parameters).map(Property.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for part.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfpart() {
      return rawStreamAllValuesOfpart(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for part.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfpart() {
      return rawStreamAllValuesOfpart(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for part.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfpart(final MandatoryPartToGen.Match partialMatch) {
      return rawStreamAllValuesOfpart(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for part.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfpart(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfpart(new Object[]{null, pBlock});
    }
    
    /**
     * Retrieve the set of values that occur in matches for part.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfpart(final MandatoryPartToGen.Match partialMatch) {
      return rawStreamAllValuesOfpart(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for part.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfpart(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pBlock) {
      return rawStreamAllValuesOfpart(new Object[]{null, pBlock}).collect(Collectors.toSet());
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final MandatoryPartToGen.Match partialMatch) {
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfblock(final Property pPart) {
      return rawStreamAllValuesOfblock(new Object[]{pPart, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final MandatoryPartToGen.Match partialMatch) {
      return rawStreamAllValuesOfblock(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for block.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfblock(final Property pPart) {
      return rawStreamAllValuesOfblock(new Object[]{pPart, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected MandatoryPartToGen.Match tupleToMatch(final Tuple t) {
      try {
          return MandatoryPartToGen.Match.newMatch((Property) t.get(POSITION_PART), (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_BLOCK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MandatoryPartToGen.Match arrayToMatch(final Object[] match) {
      try {
          return MandatoryPartToGen.Match.newMatch((Property) match[POSITION_PART], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MandatoryPartToGen.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MandatoryPartToGen.Match.newMutableMatch((Property) match[POSITION_PART], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_BLOCK]);
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
    public static IQuerySpecification<MandatoryPartToGen.Matcher> querySpecification() {
      return MandatoryPartToGen.instance();
    }
  }
  
  private MandatoryPartToGen() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MandatoryPartToGen instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MandatoryPartToGen.Matcher instantiate(final ViatraQueryEngine engine) {
    return MandatoryPartToGen.Matcher.on(engine);
  }
  
  @Override
  public MandatoryPartToGen.Matcher instantiate() {
    return MandatoryPartToGen.Matcher.create();
  }
  
  @Override
  public MandatoryPartToGen.Match newEmptyMatch() {
    return MandatoryPartToGen.Match.newEmptyMatch();
  }
  
  @Override
  public MandatoryPartToGen.Match newMatch(final Object... parameters) {
    return MandatoryPartToGen.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link MandatoryPartToGen} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link MandatoryPartToGen#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final MandatoryPartToGen INSTANCE = new MandatoryPartToGen();
    
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
    private static final MandatoryPartToGen.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_part = new PParameter("part", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")), PParameterDirection.INOUT);
    
    private final PParameter parameter_block = new PParameter("block", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_part, parameter_block);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.mandatoryPartToGen";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("part","block");
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
          PVariable var_part = body.getOrCreateVariableByName("part");
          PVariable var_block = body.getOrCreateVariableByName("block");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_part), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_part, parameter_part),
             new ExportedParameter(body, var_block, parameter_block)
          ));
          // 	Property.aggregation(part, ::composite)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum.get("composite"));
          new TypeConstraint(body, Tuples.flatTupleOf(var_part), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_part, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property", "aggregation")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AggregationKind")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          // 	find toOneUpper(part)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_part), ToOneUpper.instance().getInternalQueryRepresentation());
          // 	find toOneLower(part)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_part), ToOneLower.instance().getInternalQueryRepresentation());
          // 	find blockToGen(block, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_block, var___0_), BlockToGen.instance().getInternalQueryRepresentation());
          // 	find elementInNamespace(part, block)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_part, var_block), ElementInNamespace.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
