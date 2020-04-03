/*******************************************************************************
 * Copyright (c) 2010-2016, Abel Hegedus, IncQuery Labs Ltd.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package com.incquerylabs.magicdraw.plugin.example.test.performance.viatra;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;

import org.apache.commons.lang.time.StopWatch;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQueryGroup;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.api.scope.QueryScope;
import org.eclipse.viatra.query.runtime.matchers.ViatraQueryRuntimeException;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.junit.Test;

/**
 * This abstract test class can be used to measure the steady-state memory
 * requirements of the base index and Rete networks of individual queries on a
 * given {@link QueryScope} and with a given query group.
 * 
 * <p/>
 * This test case prepares a ViatraQueryEngine on the given scope and with the
 * provided query group. After the initial preparation is done, the engine is
 * wiped (deletes the Rete network but keeps the base index). Next, the
 * following is performed for each query in the group:
 * <p/>
 * <ol>
 * <li>Wipe the engine</li>
 * <li>Create the matcher and count matches</li>
 * <li>Wipe the engine</li>
 * </ol>
 * 
 * After each step, the used, total and free heap space is logged in MBytes
 * after 5 GC calls and 1 second of waiting. Note that even this does not always
 * provide an absolute steady state or a precise result, but can be useful for
 * finding problematic queries.
 */
public abstract class QueryPerformanceTest {
	protected static Logger logger = ViatraQueryLoggingUtil.getLogger(QueryPerformanceTest.class);

	/**
	 * @since 1.3
	 */
	protected static class QueryPerformanceData implements Comparable<QueryPerformanceData> {
		private int sequence;
		private int countMatches;
		private long usedHeapBefore;
		private long usedHeapAfter;
		public long usedHeap;
		private long elapsed;

		public QueryPerformanceData(int sequence, int countMatches, long usedHeapBefore, long usedHeapAfter,
				long usedHeap, long elapsed) {
			this.sequence = sequence;
			this.countMatches = countMatches;
			this.usedHeapBefore = usedHeapBefore;
			this.usedHeapAfter = usedHeapAfter;
			this.usedHeap = usedHeap;
			this.elapsed = elapsed;
		}

		@Override
		public int compareTo(QueryPerformanceData o) {
			if (o == null) {
				return -1;
			} else {
				return Integer.compare(this.sequence, o.sequence);
			}
		}
	}

	/**
	 * @since 1.3
	 */
	protected AdvancedViatraQueryEngine queryEngine;
	protected Map<String, QueryPerformanceData> results = new TreeMap<>();

	/**
	 * This method shall return the query engine to be used to evaluate the queries.
	 * 
	 * @throws ViatraQueryRuntimeException
	 */
	public abstract AdvancedViatraQueryEngine getEngine();

	/**
	 * This method shall return the query group that contains the set of queries to
	 * evaluate.
	 * 
	 * @throws ViatraQueryRuntimeException
	 */
	public abstract IQueryGroup getQueryGroup();

	protected void prepare() {
		logger.info("Preparing query performance test");

		logMemoryProperties("Scope prepared");

		queryEngine = getEngine();
		getQueryGroup().prepare(queryEngine);
		logMemoryProperties("Base index created");
		queryEngine.wipe();
		logMemoryProperties("VIATRA Query engine wiped");
		logger.info("Prepared query performance test");
	}

	/**
	 * This test case executes the performance evaluation on the given scope and
	 * with the provided query group.
	 */
	@Test
	public void queryPerformance() {
		logger.setLevel(Level.DEBUG);
		prepare();

		logger.info("Starting query performance test");

		measureEntireGroup();

		logger.info("Finished query performance test");

		printResults();
	}

	/**
	 * @since 1.5
	 */
	@SuppressWarnings("unchecked")
	protected void measureEntireGroup() {
		Set<IQuerySpecification<?>> specifications = getQueryGroup().getSpecifications();
		int numOfSpecifications = specifications.size();
		int current = 0;
		for (IQuerySpecification<?> _specification : specifications) {
			current++;
			logger.debug("Measuring query " + _specification.getFullyQualifiedName() + "(" + current + "/"
					+ numOfSpecifications + ")");
			long usedHeapBefore = wipe(_specification);
			IQuerySpecification<ViatraQueryMatcher<IPatternMatch>> specification = (IQuerySpecification<ViatraQueryMatcher<IPatternMatch>>) _specification;
			performMeasurements(specification, current, usedHeapBefore);
		}
	}

	/**
	 * @since 1.3
	 */
	public long wipe(IQuerySpecification<?> _specification) {
		return wipeAndMeasure();
	}

	/**
	 * @since 1.5
	 */
	public long wipeAndMeasure() {
		queryEngine.wipe();
		long usedHeapBefore = logMemoryProperties("Wiped engine before building");
		return usedHeapBefore;
	}

	/**
	 * @since 1.3
	 */
	public <MATCH extends IPatternMatch, MATCHER extends ViatraQueryMatcher<MATCH>> QueryPerformanceData performMeasurements(
			IQuerySpecification<MATCHER> specification, int current, long usedHeapBefore) {
		Function<AdvancedViatraQueryEngine, ViatraQueryMatcher<?>> measuredAction = new Function<AdvancedViatraQueryEngine, ViatraQueryMatcher<?>>() {
			@Override
			public ViatraQueryMatcher<?> apply(AdvancedViatraQueryEngine it) {
				return it.<MATCHER>getMatcher(specification);
			}
		};

		return performMeasurements(specification.getFullyQualifiedName(), current, usedHeapBefore, measuredAction);
	}

	/**
	 * The measured action may OPTIONALLY return a matcher, in which case the
	 * matches will be counted.
	 * 
	 * @since 1.5
	 */
	public QueryPerformanceData performMeasurements(String queryName, int sequence, long usedHeapBefore,
			Function<AdvancedViatraQueryEngine, ViatraQueryMatcher<?>> measuredAction) {
		logger.debug("Building Rete");
		StopWatch watch = new StopWatch();
		watch.start();
		ViatraQueryMatcher<?> matcher = measuredAction.apply(queryEngine);
		watch.stop();
		int countMatches = -1;
		if (matcher != null) {
			countMatches = matcher.countMatches();
		}
		long elapsed = watch.getTime();

		return concludeMeasurement(queryName, sequence, countMatches, elapsed, usedHeapBefore);
	}

	/**
	 * Includes logging and wipe.
	 * 
	 * @since 1.5
	 */
	public QueryPerformanceData concludeMeasurement(String queryName, int sequence, int countMatches, long elapsed,
			long usedHeapBefore) {
		long usedHeapAfter = logMemoryProperties("Matcher created");
		long usedHeap = usedHeapAfter - usedHeapBefore;
		QueryPerformanceData result = new QueryPerformanceData(sequence, countMatches, usedHeapBefore, usedHeapAfter,
				usedHeap, elapsed);
		results.put(queryName, result);
		logger.info("Query " + queryName + "( " + countMatches + " matches, used " + usedHeap + " kByte heap, took "
				+ elapsed + " ms)");

		queryEngine.wipe();
		logMemoryProperties("Wiped engine after building");
		logger.debug("\n-------------------------------------------\n");

		return result;
	}

	protected void printResults() {
		StringBuilder resultSB = new StringBuilder("\n\nPerformance test results:\n");
		resultSB.append(
				"pattern, sequence, matches count, heap before (kb), heap after (kb), used heap (kb), elapsed (ms)\n");
		results.entrySet().forEach(entry -> {
			resultSB.append(entry.getKey());
			resultSB.append(", ");
			resultSB.append(entry.getValue().sequence);
			resultSB.append(", ");
			resultSB.append(entry.getValue().countMatches);
			resultSB.append(", ");
			resultSB.append(entry.getValue().usedHeapBefore);
			resultSB.append(", ");
			resultSB.append(entry.getValue().usedHeapAfter);
			resultSB.append(", ");
			resultSB.append(entry.getValue().usedHeap);
			resultSB.append(", ");
			resultSB.append(entry.getValue().elapsed);
			resultSB.append("\n");
		});
		logger.info(resultSB);
	}

	/**
	 * Calls garbage collector 5 times, sleeps 1 second and logs the used, total and
	 * free heap sizes in MByte.
	 * 
	 * @param logger
	 * @return The amount of used heap memory in kBytes
	 */
	protected static long logMemoryProperties(String status) {
		for (int i = 0; i <= 4; i++) {
			Runtime.getRuntime().gc();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			logger.trace("Sleep after GC interrupted");
		}

		long totalHeapKB = Runtime.getRuntime().totalMemory() / 1024;
		long freeHeapKB = Runtime.getRuntime().freeMemory() / 1024;
		long usedHeapKB = totalHeapKB - freeHeapKB;
		logger.debug(status + ": Used Heap size: " + usedHeapKB / 1024 + " MByte (Total: " + totalHeapKB / 1024
				+ " MByte, Free: " + freeHeapKB / 1024 + " MByte)");

		return usedHeapKB;
	}
}
