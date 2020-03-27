/*******************************************************************************
 * Copyright (c) 2010-2016, Gabor Bergmann, IncQuery Labs Ltd.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package com.incquerylabs.magicdraw.plugin.example.test.performance.viatra

import com.google.common.base.Stopwatch
import com.google.common.collect.Maps
import java.util.Map
import java.util.concurrent.TimeUnit
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher

/**
 * This abstract test class can be used to measure the steady-state memory requirements 
 * of the Rete networks of individual queries on a given QueryScope,
 * relative to the network built to evaluate its dependencies.
 * In other words, the "local cost" of a query is measured; this is the memory footprint of the query 
 * imposed on top of the memory footprint of all other queries invoked by it.
 * 
 * <p>
 * This test case prepares an ViatraEngine on the given scope and with the provided query group.
 * After the initial preparation is done, the engine is wiped (deletes the Rete network but keeps the base index).
 * Next, the following is performed for each query in the group:
 * <p/>
 * <ol>
 *   <li> Wipe the engine </li>
 *   <li> Prepare all queries referenced by the query under consideration, then measure memory </li>
 *   <li> Create the matcher for the query and count matches, then measure memory again to see the difference </li>
 *   <li> Wipe the engine </li>
 * </ol>  
 * 
 * After each step, the used, total and free heap space is logged in MBytes after 5 GC calls and 1 second of waiting.
 * Note that even this does not always provide an absolute steady state or a precise result, but can be useful for 
 * finding problematic queries.
 * 
 * @since 1.3
 */
abstract class RelativeQueryPerformanceTest extends QueryPerformanceTest {

    Map<String, Long> absoluteHeapResults = Maps.newTreeMap()
    Map<String, Long> relativeHeapResults = Maps.newTreeMap()

    override <MATCH extends IPatternMatch, MATCHER extends ViatraQueryMatcher<MATCH>> performMeasurements(IQuerySpecification<MATCHER> specification, int current, long usedHeapBefore) {

        val prerequisites = specification.directPrerequisites
        var prerequisitesHeap = 0L
        {
            debug("Building Prerequisites")
            val watch = Stopwatch.createStarted
            queryEngine.prepareGroup(prerequisites, null)
            watch.stop()
            val usedHeapAfter = logMemoryProperties("Prerequisites built")

            prerequisitesHeap = usedHeapAfter - usedHeapBefore
            info(
                "Prerequisites of query " + specification.fullyQualifiedName + "(used " + prerequisitesHeap +
                    " kByte heap, took " + watch.elapsed(TimeUnit.MILLISECONDS) + " ms)")
        // / incQueryEngine.wipe
        // logMemoryProperties("Wiped engine after building prerequisites")
        }

        val result = super.performMeasurements(specification, current, usedHeapBefore)

        absoluteHeapResults.put(specification.getFullyQualifiedName, result.usedHeap)
        relativeHeapResults.put(specification.getFullyQualifiedName, result.usedHeap - prerequisitesHeap)

        return result
    }

    protected override printResults() {
        super.printResults
        val resultSB = new StringBuilder("\nAbsoluteHeap[kB]\trelativeHeap[kB]\tquery\n")
        absoluteHeapResults.entrySet.forEach [ entry |
            val query = entry.key
            resultSB.append(String.format("%12d\t%12d\t%s\n", entry.value, relativeHeapResults.get(query), query))
        ]
        info(resultSB)

    }

    protected static def getDirectPrerequisites(IQuerySpecification<?> query) {
        val referredQueries = query.internalQueryRepresentation.disjunctBodies.directReferredQueries
        val referredSpecifications = referredQueries.map[publishedAs.filter(IQuerySpecification)].flatten
        GenericQueryGroup.of(referredSpecifications)
    }

}
