/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries.internal;

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
import com.incquerylabs.magicdraw.plugin.example.queries.internal.ElementInNamespace;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all patterns defined in codegenControl.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package com.incquerylabs.magicdraw.plugin.example.queries, the group contains the definition of the following patterns: <ul>
 * <li>mangledNameCollision</li>
 * <li>mangledNameInNamespace</li>
 * <li>elementInNamespace</li>
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
public final class CodegenControlAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static CodegenControlAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new CodegenControlAll();
    }
    return INSTANCE;
  }
  
  private static CodegenControlAll INSTANCE;
  
  private CodegenControlAll() {
    querySpecifications.add(MangledNameCollision.instance());
    querySpecifications.add(MangledNameInNamespace.instance());
    querySpecifications.add(ElementInNamespace.instance());
    querySpecifications.add(MangledName.instance());
    querySpecifications.add(NamedElementToGen.instance());
    querySpecifications.add(BlockToGen.instance());
    querySpecifications.add(PortToGen.instance());
    querySpecifications.add(MandatoryPartToGen.instance());
    querySpecifications.add(Block.instance());
    querySpecifications.add(ToOneUpper.instance());
    querySpecifications.add(ToOneLower.instance());
  }
}
