/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/util/CommonLibrary.vql
 */
package util;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import util.CompatibleClassifier;
import util.GeneralizedClassifier;
import util.IndirectGeneralization;
import util.OwningPackage;
import util.OwningPackageOrSelf;
import util.SlotValue;
import util.StereotypedElement;

/**
 * A pattern group formed of all public patterns defined in CommonLibrary.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file CommonLibrary.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package util, the group contains the definition of the following patterns: <ul>
 * <li>generalizedClassifier</li>
 * <li>indirectGeneralization</li>
 * <li>compatibleClassifier</li>
 * <li>owningPackage</li>
 * <li>owningPackageOrSelf</li>
 * <li>stereotypedElement</li>
 * <li>slotValue</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class CommonLibrary extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static CommonLibrary instance() {
    if (INSTANCE == null) {
        INSTANCE = new CommonLibrary();
    }
    return INSTANCE;
  }
  
  private static CommonLibrary INSTANCE;
  
  private CommonLibrary() {
    querySpecifications.add(GeneralizedClassifier.instance());
    querySpecifications.add(IndirectGeneralization.instance());
    querySpecifications.add(CompatibleClassifier.instance());
    querySpecifications.add(OwningPackage.instance());
    querySpecifications.add(OwningPackageOrSelf.instance());
    querySpecifications.add(StereotypedElement.instance());
    querySpecifications.add(SlotValue.instance());
  }
  
  public GeneralizedClassifier getGeneralizedClassifier() {
    return GeneralizedClassifier.instance();
  }
  
  public GeneralizedClassifier.Matcher getGeneralizedClassifier(final ViatraQueryEngine engine) {
    return GeneralizedClassifier.Matcher.on(engine);
  }
  
  public IndirectGeneralization getIndirectGeneralization() {
    return IndirectGeneralization.instance();
  }
  
  public IndirectGeneralization.Matcher getIndirectGeneralization(final ViatraQueryEngine engine) {
    return IndirectGeneralization.Matcher.on(engine);
  }
  
  public CompatibleClassifier getCompatibleClassifier() {
    return CompatibleClassifier.instance();
  }
  
  public CompatibleClassifier.Matcher getCompatibleClassifier(final ViatraQueryEngine engine) {
    return CompatibleClassifier.Matcher.on(engine);
  }
  
  public OwningPackage getOwningPackage() {
    return OwningPackage.instance();
  }
  
  public OwningPackage.Matcher getOwningPackage(final ViatraQueryEngine engine) {
    return OwningPackage.Matcher.on(engine);
  }
  
  public OwningPackageOrSelf getOwningPackageOrSelf() {
    return OwningPackageOrSelf.instance();
  }
  
  public OwningPackageOrSelf.Matcher getOwningPackageOrSelf(final ViatraQueryEngine engine) {
    return OwningPackageOrSelf.Matcher.on(engine);
  }
  
  public StereotypedElement getStereotypedElement() {
    return StereotypedElement.instance();
  }
  
  public StereotypedElement.Matcher getStereotypedElement(final ViatraQueryEngine engine) {
    return StereotypedElement.Matcher.on(engine);
  }
  
  public SlotValue getSlotValue() {
    return SlotValue.instance();
  }
  
  public SlotValue.Matcher getSlotValue(final ViatraQueryEngine engine) {
    return SlotValue.Matcher.on(engine);
  }
}
