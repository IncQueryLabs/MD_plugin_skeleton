/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/EdgeCheck.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.EdgeTest;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in EdgeCheck.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file EdgeCheck.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package com.incquerylabs.magicdraw.plugin.example.queries, the group contains the definition of the following patterns: <ul>
 * <li>edgeTest</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class EdgeCheck extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static EdgeCheck instance() {
    if (INSTANCE == null) {
        INSTANCE = new EdgeCheck();
    }
    return INSTANCE;
  }
  
  private static EdgeCheck INSTANCE;
  
  private EdgeCheck() {
    querySpecifications.add(EdgeTest.instance());
  }
  
  public EdgeTest getEdgeTest() {
    return EdgeTest.instance();
  }
  
  public EdgeTest.Matcher getEdgeTest(final ViatraQueryEngine engine) {
    return EdgeTest.Matcher.on(engine);
  }
}
