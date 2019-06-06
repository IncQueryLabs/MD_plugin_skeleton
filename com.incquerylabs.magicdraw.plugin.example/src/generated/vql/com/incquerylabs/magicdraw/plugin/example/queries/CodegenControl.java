/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.Block;
import com.incquerylabs.magicdraw.plugin.example.queries.MangledName;
import com.incquerylabs.magicdraw.plugin.example.queries.MangledNameCollision;
import com.incquerylabs.magicdraw.plugin.example.queries.MangledNameInPackage;
import com.incquerylabs.magicdraw.plugin.example.queries.PackableElementToGen;
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
 * <li>mangledNameInPackage</li>
 * <li>mangledName</li>
 * <li>packableElementToGen</li>
 * <li>block</li>
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
    querySpecifications.add(MangledNameInPackage.instance());
    querySpecifications.add(MangledName.instance());
    querySpecifications.add(PackableElementToGen.instance());
    querySpecifications.add(Block.instance());
  }
  
  public MangledNameCollision getMangledNameCollision() {
    return MangledNameCollision.instance();
  }
  
  public MangledNameCollision.Matcher getMangledNameCollision(final ViatraQueryEngine engine) {
    return MangledNameCollision.Matcher.on(engine);
  }
  
  public MangledNameInPackage getMangledNameInPackage() {
    return MangledNameInPackage.instance();
  }
  
  public MangledNameInPackage.Matcher getMangledNameInPackage(final ViatraQueryEngine engine) {
    return MangledNameInPackage.Matcher.on(engine);
  }
  
  public MangledName getMangledName() {
    return MangledName.instance();
  }
  
  public MangledName.Matcher getMangledName(final ViatraQueryEngine engine) {
    return MangledName.Matcher.on(engine);
  }
  
  public PackableElementToGen getPackableElementToGen() {
    return PackableElementToGen.instance();
  }
  
  public PackableElementToGen.Matcher getPackableElementToGen(final ViatraQueryEngine engine) {
    return PackableElementToGen.Matcher.on(engine);
  }
  
  public Block getBlock() {
    return Block.instance();
  }
  
  public Block.Matcher getBlock(final ViatraQueryEngine engine) {
    return Block.Matcher.on(engine);
  }
}
