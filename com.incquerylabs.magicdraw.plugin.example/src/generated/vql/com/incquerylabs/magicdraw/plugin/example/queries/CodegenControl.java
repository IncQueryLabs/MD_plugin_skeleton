/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.Block;
import com.incquerylabs.magicdraw.plugin.example.queries.BlockToGen;
import com.incquerylabs.magicdraw.plugin.example.queries.MandatoryPartToGen;
import com.incquerylabs.magicdraw.plugin.example.queries.MangledName;
import com.incquerylabs.magicdraw.plugin.example.queries.MangledNameCollision;
import com.incquerylabs.magicdraw.plugin.example.queries.MangledNameInNamespace;
import com.incquerylabs.magicdraw.plugin.example.queries.NamedElementToGen;
import com.incquerylabs.magicdraw.plugin.example.queries.PortToGen;
import com.incquerylabs.magicdraw.plugin.example.queries.ToOneLower;
import com.incquerylabs.magicdraw.plugin.example.queries.ToOneUpper;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in codegenControl.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file codegenControl.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package com.incquerylabs.magicdraw.plugin.example.queries, the group contains the definition of the following patterns: <ul>
 * <li>mangledNameCollision</li>
 * <li>mangledNameInNamespace</li>
 * <li>mangledName</li>
 * <li>namedElementToGen</li>
 * <li>blockToGen</li>
 * <li>portToGen</li>
 * <li>mandatoryPartToGen</li>
 * <li>block</li>
 * <li>toOneUpper</li>
 * <li>toOneLower</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class CodegenControl extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static CodegenControl instance() {
    if (INSTANCE == null) {
        INSTANCE = new CodegenControl();
    }
    return INSTANCE;
  }
  
  private static CodegenControl INSTANCE;
  
  private CodegenControl() {
    querySpecifications.add(MangledNameCollision.instance());
    querySpecifications.add(MangledNameInNamespace.instance());
    querySpecifications.add(MangledName.instance());
    querySpecifications.add(NamedElementToGen.instance());
    querySpecifications.add(BlockToGen.instance());
    querySpecifications.add(PortToGen.instance());
    querySpecifications.add(MandatoryPartToGen.instance());
    querySpecifications.add(Block.instance());
    querySpecifications.add(ToOneUpper.instance());
    querySpecifications.add(ToOneLower.instance());
  }
  
  public MangledNameCollision getMangledNameCollision() {
    return MangledNameCollision.instance();
  }
  
  public MangledNameCollision.Matcher getMangledNameCollision(final ViatraQueryEngine engine) {
    return MangledNameCollision.Matcher.on(engine);
  }
  
  public MangledNameInNamespace getMangledNameInNamespace() {
    return MangledNameInNamespace.instance();
  }
  
  public MangledNameInNamespace.Matcher getMangledNameInNamespace(final ViatraQueryEngine engine) {
    return MangledNameInNamespace.Matcher.on(engine);
  }
  
  public MangledName getMangledName() {
    return MangledName.instance();
  }
  
  public MangledName.Matcher getMangledName(final ViatraQueryEngine engine) {
    return MangledName.Matcher.on(engine);
  }
  
  public NamedElementToGen getNamedElementToGen() {
    return NamedElementToGen.instance();
  }
  
  public NamedElementToGen.Matcher getNamedElementToGen(final ViatraQueryEngine engine) {
    return NamedElementToGen.Matcher.on(engine);
  }
  
  public BlockToGen getBlockToGen() {
    return BlockToGen.instance();
  }
  
  public BlockToGen.Matcher getBlockToGen(final ViatraQueryEngine engine) {
    return BlockToGen.Matcher.on(engine);
  }
  
  public PortToGen getPortToGen() {
    return PortToGen.instance();
  }
  
  public PortToGen.Matcher getPortToGen(final ViatraQueryEngine engine) {
    return PortToGen.Matcher.on(engine);
  }
  
  public MandatoryPartToGen getMandatoryPartToGen() {
    return MandatoryPartToGen.instance();
  }
  
  public MandatoryPartToGen.Matcher getMandatoryPartToGen(final ViatraQueryEngine engine) {
    return MandatoryPartToGen.Matcher.on(engine);
  }
  
  public Block getBlock() {
    return Block.instance();
  }
  
  public Block.Matcher getBlock(final ViatraQueryEngine engine) {
    return Block.Matcher.on(engine);
  }
  
  public ToOneUpper getToOneUpper() {
    return ToOneUpper.instance();
  }
  
  public ToOneUpper.Matcher getToOneUpper(final ViatraQueryEngine engine) {
    return ToOneUpper.Matcher.on(engine);
  }
  
  public ToOneLower getToOneLower() {
    return ToOneLower.instance();
  }
  
  public ToOneLower.Matcher getToOneLower(final ViatraQueryEngine engine) {
    return ToOneLower.Matcher.on(engine);
  }
}
