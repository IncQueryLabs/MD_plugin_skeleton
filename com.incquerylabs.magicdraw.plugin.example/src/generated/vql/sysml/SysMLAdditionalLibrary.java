/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/sysml/SysMLAdditionalLibrary.vql
 */
package sysml;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import sysml.AbstractReferenceProperty;
import sysml.Analysis;
import sysml.BlackBoxICDTable;
import sysml.BlackBoxICDTable_query;
import sysml.BlockProperty;
import sysml.Conceptual;
import sysml.ConstraintParameter;
import sysml.ConstraintProperty;
import sysml.ContextSpecificDefaultValue;
import sysml.ContextSpecificDefaultValue_path;
import sysml.ContextSpecificValuesHolder;
import sysml.ContextSpecificValuesHolder_instances;
import sysml.Electrical;
import sysml.Fmu;
import sysml.Fmu_FMIVersion;
import sysml.Fmu_GUID;
import sysml.Fmu_fileName;
import sysml.Fmu_modelIdentifier;
import sysml.Fmu_modelName;
import sysml.Logical;
import sysml.Mechanical;
import sysml.Optical;
import sysml.PartProperty;
import sysml.Pattern;
import sysml.QuantityKind;
import sysml.QuantityKind_definitionURI;
import sysml.QuantityKind_description;
import sysml.QuantityKind_symbol;
import sysml.ReferenceProperty;
import sysml.SharedProperty;
import sysml.Software;
import sysml.Unit;
import sysml.Unit_definitionURI;
import sysml.Unit_description;
import sysml.Unit_quantityKind;
import sysml.Unit_symbol;
import sysml.ValueProperty;
import sysml.WhiteBoxICDTable;
import sysml.WhiteBoxICDTable_query;

/**
 * A pattern group formed of all public patterns defined in SysMLAdditionalLibrary.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file SysMLAdditionalLibrary.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package sysml, the group contains the definition of the following patterns: <ul>
 * <li>Conceptual</li>
 * <li>Electrical</li>
 * <li>Logical</li>
 * <li>Mechanical</li>
 * <li>Optical</li>
 * <li>Software</li>
 * <li>AbstractReferenceProperty</li>
 * <li>Analysis</li>
 * <li>BlackBoxICDTable</li>
 * <li>BlackBoxICDTable_query</li>
 * <li>BlockProperty</li>
 * <li>ConstraintParameter</li>
 * <li>PartProperty</li>
 * <li>Pattern</li>
 * <li>ReferenceProperty</li>
 * <li>SharedProperty</li>
 * <li>ValueProperty</li>
 * <li>WhiteBoxICDTable</li>
 * <li>WhiteBoxICDTable_query</li>
 * <li>contextSpecificDefaultValue</li>
 * <li>contextSpecificDefaultValue_path</li>
 * <li>contextSpecificValuesHolder</li>
 * <li>contextSpecificValuesHolder_instances</li>
 * <li>fmu</li>
 * <li>fmu_FMIVersion</li>
 * <li>fmu_GUID</li>
 * <li>fmu_fileName</li>
 * <li>fmu_modelIdentifier</li>
 * <li>fmu_modelName</li>
 * <li>ConstraintProperty</li>
 * <li>QuantityKind</li>
 * <li>QuantityKind_definitionURI</li>
 * <li>QuantityKind_description</li>
 * <li>QuantityKind_symbol</li>
 * <li>Unit</li>
 * <li>Unit_definitionURI</li>
 * <li>Unit_description</li>
 * <li>Unit_quantityKind</li>
 * <li>Unit_symbol</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class SysMLAdditionalLibrary extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SysMLAdditionalLibrary instance() {
    if (INSTANCE == null) {
        INSTANCE = new SysMLAdditionalLibrary();
    }
    return INSTANCE;
  }
  
  private static SysMLAdditionalLibrary INSTANCE;
  
  private SysMLAdditionalLibrary() {
    querySpecifications.add(Conceptual.instance());
    querySpecifications.add(Electrical.instance());
    querySpecifications.add(Logical.instance());
    querySpecifications.add(Mechanical.instance());
    querySpecifications.add(Optical.instance());
    querySpecifications.add(Software.instance());
    querySpecifications.add(AbstractReferenceProperty.instance());
    querySpecifications.add(Analysis.instance());
    querySpecifications.add(BlackBoxICDTable.instance());
    querySpecifications.add(BlackBoxICDTable_query.instance());
    querySpecifications.add(BlockProperty.instance());
    querySpecifications.add(ConstraintParameter.instance());
    querySpecifications.add(PartProperty.instance());
    querySpecifications.add(Pattern.instance());
    querySpecifications.add(ReferenceProperty.instance());
    querySpecifications.add(SharedProperty.instance());
    querySpecifications.add(ValueProperty.instance());
    querySpecifications.add(WhiteBoxICDTable.instance());
    querySpecifications.add(WhiteBoxICDTable_query.instance());
    querySpecifications.add(ContextSpecificDefaultValue.instance());
    querySpecifications.add(ContextSpecificDefaultValue_path.instance());
    querySpecifications.add(ContextSpecificValuesHolder.instance());
    querySpecifications.add(ContextSpecificValuesHolder_instances.instance());
    querySpecifications.add(Fmu.instance());
    querySpecifications.add(Fmu_FMIVersion.instance());
    querySpecifications.add(Fmu_GUID.instance());
    querySpecifications.add(Fmu_fileName.instance());
    querySpecifications.add(Fmu_modelIdentifier.instance());
    querySpecifications.add(Fmu_modelName.instance());
    querySpecifications.add(ConstraintProperty.instance());
    querySpecifications.add(QuantityKind.instance());
    querySpecifications.add(QuantityKind_definitionURI.instance());
    querySpecifications.add(QuantityKind_description.instance());
    querySpecifications.add(QuantityKind_symbol.instance());
    querySpecifications.add(Unit.instance());
    querySpecifications.add(Unit_definitionURI.instance());
    querySpecifications.add(Unit_description.instance());
    querySpecifications.add(Unit_quantityKind.instance());
    querySpecifications.add(Unit_symbol.instance());
  }
  
  public Conceptual getConceptual() {
    return Conceptual.instance();
  }
  
  public Conceptual.Matcher getConceptual(final ViatraQueryEngine engine) {
    return Conceptual.Matcher.on(engine);
  }
  
  public Electrical getElectrical() {
    return Electrical.instance();
  }
  
  public Electrical.Matcher getElectrical(final ViatraQueryEngine engine) {
    return Electrical.Matcher.on(engine);
  }
  
  public Logical getLogical() {
    return Logical.instance();
  }
  
  public Logical.Matcher getLogical(final ViatraQueryEngine engine) {
    return Logical.Matcher.on(engine);
  }
  
  public Mechanical getMechanical() {
    return Mechanical.instance();
  }
  
  public Mechanical.Matcher getMechanical(final ViatraQueryEngine engine) {
    return Mechanical.Matcher.on(engine);
  }
  
  public Optical getOptical() {
    return Optical.instance();
  }
  
  public Optical.Matcher getOptical(final ViatraQueryEngine engine) {
    return Optical.Matcher.on(engine);
  }
  
  public Software getSoftware() {
    return Software.instance();
  }
  
  public Software.Matcher getSoftware(final ViatraQueryEngine engine) {
    return Software.Matcher.on(engine);
  }
  
  public AbstractReferenceProperty getAbstractReferenceProperty() {
    return AbstractReferenceProperty.instance();
  }
  
  public AbstractReferenceProperty.Matcher getAbstractReferenceProperty(final ViatraQueryEngine engine) {
    return AbstractReferenceProperty.Matcher.on(engine);
  }
  
  public Analysis getAnalysis() {
    return Analysis.instance();
  }
  
  public Analysis.Matcher getAnalysis(final ViatraQueryEngine engine) {
    return Analysis.Matcher.on(engine);
  }
  
  public BlackBoxICDTable getBlackBoxICDTable() {
    return BlackBoxICDTable.instance();
  }
  
  public BlackBoxICDTable.Matcher getBlackBoxICDTable(final ViatraQueryEngine engine) {
    return BlackBoxICDTable.Matcher.on(engine);
  }
  
  public BlackBoxICDTable_query getBlackBoxICDTable_query() {
    return BlackBoxICDTable_query.instance();
  }
  
  public BlackBoxICDTable_query.Matcher getBlackBoxICDTable_query(final ViatraQueryEngine engine) {
    return BlackBoxICDTable_query.Matcher.on(engine);
  }
  
  public BlockProperty getBlockProperty() {
    return BlockProperty.instance();
  }
  
  public BlockProperty.Matcher getBlockProperty(final ViatraQueryEngine engine) {
    return BlockProperty.Matcher.on(engine);
  }
  
  public ConstraintParameter getConstraintParameter() {
    return ConstraintParameter.instance();
  }
  
  public ConstraintParameter.Matcher getConstraintParameter(final ViatraQueryEngine engine) {
    return ConstraintParameter.Matcher.on(engine);
  }
  
  public PartProperty getPartProperty() {
    return PartProperty.instance();
  }
  
  public PartProperty.Matcher getPartProperty(final ViatraQueryEngine engine) {
    return PartProperty.Matcher.on(engine);
  }
  
  public Pattern getPattern() {
    return Pattern.instance();
  }
  
  public Pattern.Matcher getPattern(final ViatraQueryEngine engine) {
    return Pattern.Matcher.on(engine);
  }
  
  public ReferenceProperty getReferenceProperty() {
    return ReferenceProperty.instance();
  }
  
  public ReferenceProperty.Matcher getReferenceProperty(final ViatraQueryEngine engine) {
    return ReferenceProperty.Matcher.on(engine);
  }
  
  public SharedProperty getSharedProperty() {
    return SharedProperty.instance();
  }
  
  public SharedProperty.Matcher getSharedProperty(final ViatraQueryEngine engine) {
    return SharedProperty.Matcher.on(engine);
  }
  
  public ValueProperty getValueProperty() {
    return ValueProperty.instance();
  }
  
  public ValueProperty.Matcher getValueProperty(final ViatraQueryEngine engine) {
    return ValueProperty.Matcher.on(engine);
  }
  
  public WhiteBoxICDTable getWhiteBoxICDTable() {
    return WhiteBoxICDTable.instance();
  }
  
  public WhiteBoxICDTable.Matcher getWhiteBoxICDTable(final ViatraQueryEngine engine) {
    return WhiteBoxICDTable.Matcher.on(engine);
  }
  
  public WhiteBoxICDTable_query getWhiteBoxICDTable_query() {
    return WhiteBoxICDTable_query.instance();
  }
  
  public WhiteBoxICDTable_query.Matcher getWhiteBoxICDTable_query(final ViatraQueryEngine engine) {
    return WhiteBoxICDTable_query.Matcher.on(engine);
  }
  
  public ContextSpecificDefaultValue getContextSpecificDefaultValue() {
    return ContextSpecificDefaultValue.instance();
  }
  
  public ContextSpecificDefaultValue.Matcher getContextSpecificDefaultValue(final ViatraQueryEngine engine) {
    return ContextSpecificDefaultValue.Matcher.on(engine);
  }
  
  public ContextSpecificDefaultValue_path getContextSpecificDefaultValue_path() {
    return ContextSpecificDefaultValue_path.instance();
  }
  
  public ContextSpecificDefaultValue_path.Matcher getContextSpecificDefaultValue_path(final ViatraQueryEngine engine) {
    return ContextSpecificDefaultValue_path.Matcher.on(engine);
  }
  
  public ContextSpecificValuesHolder getContextSpecificValuesHolder() {
    return ContextSpecificValuesHolder.instance();
  }
  
  public ContextSpecificValuesHolder.Matcher getContextSpecificValuesHolder(final ViatraQueryEngine engine) {
    return ContextSpecificValuesHolder.Matcher.on(engine);
  }
  
  public ContextSpecificValuesHolder_instances getContextSpecificValuesHolder_instances() {
    return ContextSpecificValuesHolder_instances.instance();
  }
  
  public ContextSpecificValuesHolder_instances.Matcher getContextSpecificValuesHolder_instances(final ViatraQueryEngine engine) {
    return ContextSpecificValuesHolder_instances.Matcher.on(engine);
  }
  
  public Fmu getFmu() {
    return Fmu.instance();
  }
  
  public Fmu.Matcher getFmu(final ViatraQueryEngine engine) {
    return Fmu.Matcher.on(engine);
  }
  
  public Fmu_FMIVersion getFmu_FMIVersion() {
    return Fmu_FMIVersion.instance();
  }
  
  public Fmu_FMIVersion.Matcher getFmu_FMIVersion(final ViatraQueryEngine engine) {
    return Fmu_FMIVersion.Matcher.on(engine);
  }
  
  public Fmu_GUID getFmu_GUID() {
    return Fmu_GUID.instance();
  }
  
  public Fmu_GUID.Matcher getFmu_GUID(final ViatraQueryEngine engine) {
    return Fmu_GUID.Matcher.on(engine);
  }
  
  public Fmu_fileName getFmu_fileName() {
    return Fmu_fileName.instance();
  }
  
  public Fmu_fileName.Matcher getFmu_fileName(final ViatraQueryEngine engine) {
    return Fmu_fileName.Matcher.on(engine);
  }
  
  public Fmu_modelIdentifier getFmu_modelIdentifier() {
    return Fmu_modelIdentifier.instance();
  }
  
  public Fmu_modelIdentifier.Matcher getFmu_modelIdentifier(final ViatraQueryEngine engine) {
    return Fmu_modelIdentifier.Matcher.on(engine);
  }
  
  public Fmu_modelName getFmu_modelName() {
    return Fmu_modelName.instance();
  }
  
  public Fmu_modelName.Matcher getFmu_modelName(final ViatraQueryEngine engine) {
    return Fmu_modelName.Matcher.on(engine);
  }
  
  public ConstraintProperty getConstraintProperty() {
    return ConstraintProperty.instance();
  }
  
  public ConstraintProperty.Matcher getConstraintProperty(final ViatraQueryEngine engine) {
    return ConstraintProperty.Matcher.on(engine);
  }
  
  public QuantityKind getQuantityKind() {
    return QuantityKind.instance();
  }
  
  public QuantityKind.Matcher getQuantityKind(final ViatraQueryEngine engine) {
    return QuantityKind.Matcher.on(engine);
  }
  
  public QuantityKind_definitionURI getQuantityKind_definitionURI() {
    return QuantityKind_definitionURI.instance();
  }
  
  public QuantityKind_definitionURI.Matcher getQuantityKind_definitionURI(final ViatraQueryEngine engine) {
    return QuantityKind_definitionURI.Matcher.on(engine);
  }
  
  public QuantityKind_description getQuantityKind_description() {
    return QuantityKind_description.instance();
  }
  
  public QuantityKind_description.Matcher getQuantityKind_description(final ViatraQueryEngine engine) {
    return QuantityKind_description.Matcher.on(engine);
  }
  
  public QuantityKind_symbol getQuantityKind_symbol() {
    return QuantityKind_symbol.instance();
  }
  
  public QuantityKind_symbol.Matcher getQuantityKind_symbol(final ViatraQueryEngine engine) {
    return QuantityKind_symbol.Matcher.on(engine);
  }
  
  public Unit getUnit() {
    return Unit.instance();
  }
  
  public Unit.Matcher getUnit(final ViatraQueryEngine engine) {
    return Unit.Matcher.on(engine);
  }
  
  public Unit_definitionURI getUnit_definitionURI() {
    return Unit_definitionURI.instance();
  }
  
  public Unit_definitionURI.Matcher getUnit_definitionURI(final ViatraQueryEngine engine) {
    return Unit_definitionURI.Matcher.on(engine);
  }
  
  public Unit_description getUnit_description() {
    return Unit_description.instance();
  }
  
  public Unit_description.Matcher getUnit_description(final ViatraQueryEngine engine) {
    return Unit_description.Matcher.on(engine);
  }
  
  public Unit_quantityKind getUnit_quantityKind() {
    return Unit_quantityKind.instance();
  }
  
  public Unit_quantityKind.Matcher getUnit_quantityKind(final ViatraQueryEngine engine) {
    return Unit_quantityKind.Matcher.on(engine);
  }
  
  public Unit_symbol getUnit_symbol() {
    return Unit_symbol.instance();
  }
  
  public Unit_symbol.Matcher getUnit_symbol(final ViatraQueryEngine engine) {
    return Unit_symbol.Matcher.on(engine);
  }
}
