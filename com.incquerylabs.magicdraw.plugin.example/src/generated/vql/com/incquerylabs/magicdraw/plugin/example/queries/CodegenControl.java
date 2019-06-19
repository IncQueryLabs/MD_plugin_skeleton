/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/codegenControl.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.AssemblyToGen;
import com.incquerylabs.magicdraw.plugin.example.queries.Block;
import com.incquerylabs.magicdraw.plugin.example.queries.BlockMustImport;
import com.incquerylabs.magicdraw.plugin.example.queries.BlockToGen;
import com.incquerylabs.magicdraw.plugin.example.queries.ConnectorEndNestedPath;
import com.incquerylabs.magicdraw.plugin.example.queries.ConnectorToGen;
import com.incquerylabs.magicdraw.plugin.example.queries.DelegationEnd;
import com.incquerylabs.magicdraw.plugin.example.queries.DelegationToGen;
import com.incquerylabs.magicdraw.plugin.example.queries.EndToGen;
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
 * <li>connectorToGen</li>
 * <li>endToGen</li>
 * <li>connectorEndNestedPath</li>
 * <li>delegationEnd</li>
 * <li>delegationToGen</li>
 * <li>assemblyToGen</li>
 * <li>blockMustImport</li>
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
    querySpecifications.add(ConnectorToGen.instance());
    querySpecifications.add(EndToGen.instance());
    querySpecifications.add(ConnectorEndNestedPath.instance());
    querySpecifications.add(DelegationEnd.instance());
    querySpecifications.add(DelegationToGen.instance());
    querySpecifications.add(AssemblyToGen.instance());
    querySpecifications.add(BlockMustImport.instance());
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
  
  public ConnectorToGen getConnectorToGen() {
    return ConnectorToGen.instance();
  }
  
  public ConnectorToGen.Matcher getConnectorToGen(final ViatraQueryEngine engine) {
    return ConnectorToGen.Matcher.on(engine);
  }
  
  public EndToGen getEndToGen() {
    return EndToGen.instance();
  }
  
  public EndToGen.Matcher getEndToGen(final ViatraQueryEngine engine) {
    return EndToGen.Matcher.on(engine);
  }
  
  public ConnectorEndNestedPath getConnectorEndNestedPath() {
    return ConnectorEndNestedPath.instance();
  }
  
  public ConnectorEndNestedPath.Matcher getConnectorEndNestedPath(final ViatraQueryEngine engine) {
    return ConnectorEndNestedPath.Matcher.on(engine);
  }
  
  public DelegationEnd getDelegationEnd() {
    return DelegationEnd.instance();
  }
  
  public DelegationEnd.Matcher getDelegationEnd(final ViatraQueryEngine engine) {
    return DelegationEnd.Matcher.on(engine);
  }
  
  public DelegationToGen getDelegationToGen() {
    return DelegationToGen.instance();
  }
  
  public DelegationToGen.Matcher getDelegationToGen(final ViatraQueryEngine engine) {
    return DelegationToGen.Matcher.on(engine);
  }
  
  public AssemblyToGen getAssemblyToGen() {
    return AssemblyToGen.instance();
  }
  
  public AssemblyToGen.Matcher getAssemblyToGen(final ViatraQueryEngine engine) {
    return AssemblyToGen.Matcher.on(engine);
  }
  
  public BlockMustImport getBlockMustImport() {
    return BlockMustImport.instance();
  }
  
  public BlockMustImport.Matcher getBlockMustImport(final ViatraQueryEngine engine) {
    return BlockMustImport.Matcher.on(engine);
  }
}
