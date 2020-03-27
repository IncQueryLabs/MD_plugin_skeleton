/*******************************************************************************
 * Copyright (c) 2010-2016, Abel Hegedus, IncQuery Labs Ltd.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package com.incquerylabs.magicdraw.plugin.example.test.performance.viatra

import com.google.common.base.Function
import com.google.common.base.Stopwatch
import com.google.common.collect.Maps
import java.util.Map
import java.util.concurrent.TimeUnit
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQueryGroup
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.api.scope.QueryScope
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil
import org.eclipse.xtend.lib.annotations.Data
import org.junit.Test

/**
 * This abstract test class can be used to measure the steady-state memory requirements of the base index and
 * Rete networks of individual queries on a given {@link QueryScope} and with a given query group.
 * 
 * <p/>
 * This test case prepares a ViatraQueryEngine on the given scope and with the provided query group.
 * After the initial preparation is done, the engine is wiped (deletes the Rete network but keeps the base index).
 * Next, the following is performed for each query in the group:
 * <p/>
 * <ol>
 *   <li> Wipe the engine </li>
 *   <li> Create the matcher and count matches </li>
 *   <li> Wipe the engine </li>
 * </ol>  
 * 
 * After each step, the used, total and free heap space is logged in MBytes after 5 GC calls and 1 second of waiting.
 * Note that even this does not always provide an absolute steady state or a precise result, but can be useful for 
 * finding problematic queries.
 */
abstract class QueryPerformanceTest {

    protected static extension Logger logger = ViatraQueryLoggingUtil.getLogger(QueryPerformanceTest)

    /**
     * @since 1.3
     */
    @Data
    protected static class QueryPerformanceData implements Comparable<QueryPerformanceData> {
        int sequence
        int countMatches
        long usedHeapBefore
        long usedHeapAfter
       public long usedHeap
        long elapsed
					
		new(int sequence, int countMatches, long usedHeapBefore, long usedHeapAfter, long usedHeap, long elapsed) {
			this.sequence = sequence
			this.countMatches = countMatches
			this.usedHeapBefore = usedHeapBefore
			this.usedHeapAfter = usedHeapAfter
			this.usedHeap = usedHeap
			this.elapsed = elapsed
		}
        
        override compareTo(QueryPerformanceData o) {
            if (o === null) {
                return -1
            } else {
                return Integer.compare(this.sequence, o.sequence)
            }
        }
        
    }

    /**
     * @since 1.3
     */
    protected AdvancedViatraQueryEngine queryEngine
    protected Map<String, QueryPerformanceData> results = Maps.newTreeMap

    /**
     * This method shall return the query engine to be used to evaluate the queries.
     * @throws ViatraQueryRuntimeException
     */
    def AdvancedViatraQueryEngine getEngine()

    /**
     * This method shall return the query group that contains the set of queries to evaluate.
     * @throws ViatraQueryRuntimeException
     */
    def IQueryGroup getQueryGroup()

    protected def prepare() {
        info("Preparing query performance test")

        logMemoryProperties("Scope prepared")

        queryEngine = engine
        queryGroup.prepare(queryEngine)
        logMemoryProperties("Base index created")
        queryEngine.wipe()
        logMemoryProperties("VIATRA Query engine wiped")
        info("Prepared query performance test")
    }
    
    /**
     * This test case executes the performance evaluation on the given scope and with the provided query group.
     */
    @Test
    def queryPerformance() {
        logger.level = Level.DEBUG
        prepare()

        info("Starting query performance test")
        
        measureEntireGroup()

        info("Finished query performance test")

        printResults()
    }

    /**
     * @since 1.5
     */
    protected def measureEntireGroup() {
        val specifications = queryGroup.getSpecifications
        val numOfSpecifications = specifications.length
        var current = 0
        for (IQuerySpecification<?> _specification : specifications) {
            current++
            debug("Measuring query " + _specification.getFullyQualifiedName + "(" + current + "/" + numOfSpecifications + ")")
            val usedHeapBefore = _specification.wipe
            performMeasurements(_specification as IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>, current, usedHeapBefore)
        }
    }

    /**
     * @since 1.3
     */
    def wipe(IQuerySpecification<?> _specification) {
        wipeAndMeasure
    }
    
    /**
     * @since 1.5
     */
    def wipeAndMeasure() {
        queryEngine.wipe
        val usedHeapBefore = logMemoryProperties("Wiped engine before building")
        return usedHeapBefore
    }
    
    /**
     * @since 1.3
     */
    def <MATCH extends IPatternMatch, MATCHER extends ViatraQueryMatcher<MATCH>> performMeasurements(IQuerySpecification<MATCHER> specification, int current, long usedHeapBefore) {
        return performMeasurements(specification.getFullyQualifiedName, current, usedHeapBefore) [getMatcher(specification)]
    }
    
    /**
     * The measured action may OPTIONALLY return a matcher, in which case the matches will be counted.
     * @since 1.5
     */
    def performMeasurements(String queryName, int sequence, long usedHeapBefore, 
        Function<AdvancedViatraQueryEngine, ViatraQueryMatcher<?>> measuredAction
    ) {
        debug("Building Rete")
        val watch = Stopwatch.createStarted
        val matcher = measuredAction.apply(queryEngine)
        watch.stop()
        val countMatches = if (matcher === null) -1 else matcher.countMatches
        val elapsed = watch.elapsed(TimeUnit.MILLISECONDS)
        
        return concludeMeasurement(queryName, sequence, countMatches, elapsed, usedHeapBefore)
    }
    
    /**
     * Includes logging and wipe. 
     * @since 1.5
     */
    def concludeMeasurement(String queryName, int sequence, int countMatches, long elapsed, long usedHeapBefore) {
        val usedHeapAfter = logMemoryProperties("Matcher created")
        val usedHeap = usedHeapAfter - usedHeapBefore
        val result = new QueryPerformanceData(sequence, countMatches, usedHeapBefore, usedHeapAfter, usedHeap, elapsed)
        results.put(queryName, result)
        info(
            "Query " + queryName + "( " + countMatches + " matches, used " + usedHeap +
                " kByte heap, took " + elapsed + " ms)")

        queryEngine.wipe
        logMemoryProperties("Wiped engine after building")
        debug("\n-------------------------------------------\n")
        
        return result
    }

    protected def printResults() {

        val resultSB = new StringBuilder("\n\nPerformance test results:\n")
        resultSB.append(
            "pattern, sequence, matches count, heap before (kb), heap after (kb), used heap (kb), elapsed (ms)\n");
        results.entrySet.forEach [ entry |
            resultSB.append(entry.key)
            resultSB.append(", ");
            resultSB.append(entry.value.sequence)
            resultSB.append(", ");
            resultSB.append(entry.value.countMatches)
            resultSB.append(", ");
            resultSB.append(entry.value.usedHeapBefore)
            resultSB.append(", ");
            resultSB.append(entry.value.usedHeapAfter)
            resultSB.append(", ");
            resultSB.append(entry.value.usedHeap)
            resultSB.append(", ");
            resultSB.append(entry.value.elapsed)
            resultSB.append("\n")
        ]
        info(resultSB)

    }

    /**
     * Calls garbage collector 5 times, sleeps 1 second and logs the used, total and free heap sizes in MByte.
     * 
     * @param logger
     * @return The amount of used heap memory in kBytes
     */
    protected def static logMemoryProperties(String status) {
        (0 .. 4).forEach[Runtime.getRuntime().gc()]

        try {
            Thread.sleep(1000)
        } catch (InterruptedException e) {
            trace("Sleep after GC interrupted")
        }

        val totalHeapKB = Runtime.getRuntime().totalMemory() / 1024;
        val freeHeapKB = Runtime.getRuntime().freeMemory() / 1024;
        val usedHeapKB = totalHeapKB - freeHeapKB;
        debug(
            status + ": Used Heap size: " + usedHeapKB / 1024 + " MByte (Total: " + totalHeapKB / 1024 +
                " MByte, Free: " + freeHeapKB / 1024 + " MByte)")

        usedHeapKB
    }
}
        