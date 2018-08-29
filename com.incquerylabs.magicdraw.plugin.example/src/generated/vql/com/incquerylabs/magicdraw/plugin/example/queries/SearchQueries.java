/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/SearchQueries.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries;

import com.incquerylabs.magicdraw.plugin.example.queries.DeduciblePortType;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in SearchQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file SearchQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package com.incquerylabs.magicdraw.plugin.example.queries, the group contains the definition of the following patterns: <ul>
 * <li>DeduciblePortType</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class SearchQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SearchQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new SearchQueries();
    }
    return INSTANCE;
  }
  
  private static SearchQueries INSTANCE;
  
  private SearchQueries() {
    querySpecifications.add(DeduciblePortType.instance());
  }
  
  public DeduciblePortType getDeduciblePortType() {
    return DeduciblePortType.instance();
  }
  
  public DeduciblePortType.Matcher getDeduciblePortType(final ViatraQueryEngine engine) {
    return DeduciblePortType.Matcher.on(engine);
  }
}
