/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example.queries/src/com/incquerylabs/magicdraw/plugin/example/queries/TEST.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.TESTPattern;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in TEST.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file TEST.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package com.incquerylabs.magicdraw.plugin.example.queries, the group contains the definition of the following patterns: <ul>
 * <li>TESTPattern</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class TEST extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TEST instance() {
    if (INSTANCE == null) {
        INSTANCE = new TEST();
    }
    return INSTANCE;
  }
  
  private static TEST INSTANCE;
  
  private TEST() {
    querySpecifications.add(TESTPattern.instance());
  }
  
  public TESTPattern getTESTPattern() {
    return TESTPattern.instance();
  }
  
  public TESTPattern.Matcher getTESTPattern(final ViatraQueryEngine engine) {
    return TESTPattern.Matcher.on(engine);
  }
}
