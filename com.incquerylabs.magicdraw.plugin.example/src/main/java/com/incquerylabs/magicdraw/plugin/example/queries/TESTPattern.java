/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example.queries/src/com/incquerylabs/magicdraw/plugin/example/queries/TEST.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
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
 *         pattern TESTPattern(class : Class){
 *         	Class.name(class, name);
 *         	check(!name.equals(""));	
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class TESTPattern extends BaseGeneratedEMFQuerySpecification<TESTPattern.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.plugin.example.queries.TESTPattern pattern,
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
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fClass;
    
    private static List<String> parameterNames = makeImmutableList("class");
    
    private Match(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass) {
      this.fClass = pClass;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("class".equals(parameterName)) return this.fClass;
      return null;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getValueOfClass() {
      return this.fClass;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("class".equals(parameterName) ) {
          this.fClass = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setClass(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClass = pClass;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.TESTPattern";
    }
    
    @Override
    public List<String> parameterNames() {
      return TESTPattern.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClass};
    }
    
    @Override
    public TESTPattern.Match toImmutable() {
      return isMutable() ? newMatch(fClass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"class\"=" + prettyPrintValue(fClass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fClass);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof TESTPattern.Match)) {
          TESTPattern.Match other = (TESTPattern.Match) obj;
          return Objects.equals(fClass, other.fClass);
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
    public TESTPattern specification() {
      return TESTPattern.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static TESTPattern.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static TESTPattern.Match newMutableMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass) {
      return new Mutable(pClass);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static TESTPattern.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass) {
      return new Immutable(pClass);
    }
    
    private static final class Mutable extends TESTPattern.Match {
      Mutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass) {
        super(pClass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends TESTPattern.Match {
      Immutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass) {
        super(pClass);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.plugin.example.queries.TESTPattern pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern TESTPattern(class : Class){
   * 	Class.name(class, name);
   * 	check(!name.equals(""));	
   * }
   * </pre></code>
   * 
   * @see Match
   * @see TESTPattern
   * 
   */
  public static class Matcher extends BaseMatcher<TESTPattern.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static TESTPattern.Matcher on(final ViatraQueryEngine engine) {
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
    public static TESTPattern.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_CLASS = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TESTPattern.Matcher.class);
    
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
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<TESTPattern.Match> getAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass) {
      return rawStreamAllMatches(new Object[]{pClass}).collect(Collectors.toSet());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Stream<TESTPattern.Match> streamAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass) {
      return rawStreamAllMatches(new Object[]{pClass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<TESTPattern.Match> getOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass) {
      return rawGetOneArbitraryMatch(new Object[]{pClass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass) {
      return rawHasMatch(new Object[]{pClass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass) {
      return rawCountMatches(new Object[]{pClass});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass, final Consumer<? super TESTPattern.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClass}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public TESTPattern.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pClass) {
      return TESTPattern.Match.newMatch(pClass);
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> rawStreamAllValuesOfclass(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CLASS, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfclass() {
      return rawStreamAllValuesOfclass(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfclass() {
      return rawStreamAllValuesOfclass(emptyArray());
    }
    
    @Override
    protected TESTPattern.Match tupleToMatch(final Tuple t) {
      try {
          return TESTPattern.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_CLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TESTPattern.Match arrayToMatch(final Object[] match) {
      try {
          return TESTPattern.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_CLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TESTPattern.Match arrayToMatchMutable(final Object[] match) {
      try {
          return TESTPattern.Match.newMutableMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_CLASS]);
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
    public static IQuerySpecification<TESTPattern.Matcher> querySpecification() {
      return TESTPattern.instance();
    }
  }
  
  private TESTPattern() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TESTPattern instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TESTPattern.Matcher instantiate(final ViatraQueryEngine engine) {
    return TESTPattern.Matcher.on(engine);
  }
  
  @Override
  public TESTPattern.Matcher instantiate() {
    return TESTPattern.Matcher.create();
  }
  
  @Override
  public TESTPattern.Match newEmptyMatch() {
    return TESTPattern.Match.newEmptyMatch();
  }
  
  @Override
  public TESTPattern.Match newMatch(final Object... parameters) {
    return TESTPattern.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.TESTPattern (visibility: PUBLIC, simpleName: TESTPattern, identifier: com.incquerylabs.magicdraw.plugin.example.queries.TESTPattern, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.plugin.example.queries.TESTPattern (visibility: PUBLIC, simpleName: TESTPattern, identifier: com.incquerylabs.magicdraw.plugin.example.queries.TESTPattern, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.plugin.example.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TESTPattern INSTANCE = new TESTPattern();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TESTPattern.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pClass = new PParameter("class", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pClass);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.plugin.example.queries.TESTPattern";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("class");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_class = body.getOrCreateVariableByName("class");
          PVariable var_name = body.getOrCreateVariableByName("name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_class, parameter_pClass)
          ));
          // 	Class.name(class, name)
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "Class")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_class, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5", "String")));
          new Equality(body, var__virtual_0_, var_name);
          // 	check(!name.equals(""))
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern TESTPattern";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("name");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String name = (String) provider.getValue("name");
                  return evaluateExpression_1_1(name);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final String name) {
    boolean _equals = name.equals("");
    boolean _not = (!_equals);
    return _not;
  }
}
