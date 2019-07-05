/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/com/incquerylabs/magicdraw/plugin/example/queries/SearchQueries.vql
 */
package com.incquerylabs.magicdraw.plugin.example.queries.internal;

import com.incquerylabs.magicdraw.plugin.example.queries.DeduciblePortType;
import com.incquerylabs.magicdraw.plugin.example.queries.internal.ConnectedPort;
import com.incquerylabs.magicdraw.plugin.example.queries.internal.PortWithSpecifiedType;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all patterns defined in SearchQueries.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package com.incquerylabs.magicdraw.plugin.example.queries, the group contains the definition of the following patterns: <ul>
 * <li>DeduciblePortType</li>
 * <li>PortWithSpecifiedType</li>
 * <li>ConnectedPort</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class SearchQueriesAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SearchQueriesAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new SearchQueriesAll();
    }
    return INSTANCE;
  }
  
  private static SearchQueriesAll INSTANCE;
  
  private SearchQueriesAll() {
    querySpecifications.add(DeduciblePortType.instance());
    querySpecifications.add(PortWithSpecifiedType.instance());
    querySpecifications.add(ConnectedPort.instance());
  }
}
