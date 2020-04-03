/*******************************************************************************
 * Copyright (c) 2010-2016, Gabor Bergmann, IncQuery Labs Ltd.
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
import java.util.stream.Stream;

import org.apache.commons.lang.time.StopWatch;
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQueryGroup;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery;

/**
 * This abstract test class can be used to measure the steady-state memory
 * requirements of the Rete networks of individual queries on a given
 * QueryScope, relative to the network built to evaluate its dependencies. In
 * other words, the "local cost" of a query is measured; this is the memory
 * footprint of the query imposed on top of the memory footprint of all other
 * queries invoked by it.
 * 
 * <p>
 * This test case prepares an ViatraEngine on the given scope and with the
 * provided query group. After the initial preparation is done, the engine is
 * wiped (deletes the Rete network but keeps the base index). Next, the
 * following is performed for each query in the group:
 * <p/>
 * <ol>
 * <li>Wipe the engine</li>
 * <li>Prepare all queries referenced by the query under consideration, then
 * measure memory</li>
 * <li>Create the matcher for the query and count matches, then measure memory
 * again to see the difference</li>
 * <li>Wipe the engine</li>
 * </ol>
 * 
 * After each step, the used, total and free heap space is logged in MBytes
 * after 5 GC calls and 1 second of waiting. Note that even this does not always
 * provide an absolute steady state or a precise result, but can be useful for
 * finding problematic queries.
 * 
 * @since 1.3
 */
public abstract class RelativeQueryPerformanceTest extends QueryPerformanceTest {

	private Map<String, Long> absoluteHeapResults = new TreeMap<>();
	private Map<String, Long> relativeHeapResults = new TreeMap<>();

	@Override
	public <MATCH extends IPatternMatch, MATCHER extends ViatraQueryMatcher<MATCH>> QueryPerformanceData performMeasurements(
			IQuerySpecification<MATCHER> specification, int current, long usedHeapBefore) {

		IQueryGroup prerequisites = getDirectPrerequisites(specification);
		long prerequisitesHeap = 0L;

		logger.debug("Building Prerequisites");
		StopWatch watch = new StopWatch();
		watch.start();
		queryEngine.prepareGroup(prerequisites, null);
		watch.stop();
		long usedHeapAfter = logMemoryProperties("Prerequisites built");

		prerequisitesHeap = usedHeapAfter - usedHeapBefore;
		logger.info("Prerequisites of query " + specification.getFullyQualifiedName() + "(used " + prerequisitesHeap
				+ " kByte heap, took " + watch.getTime() + " ms)");

		QueryPerformanceData result = super.performMeasurements(specification, current, usedHeapBefore);

		absoluteHeapResults.put(specification.getFullyQualifiedName(), result.usedHeap);
		relativeHeapResults.put(specification.getFullyQualifiedName(), result.usedHeap - prerequisitesHeap);

		return result;
	}

	@Override
	protected void printResults() {
		super.printResults();
		StringBuilder resultSB = new StringBuilder("\nAbsoluteHeap[kB]\trelativeHeap[kB]\tquery\n");
		absoluteHeapResults.entrySet().forEach(entry -> {
			String query = entry.getKey();
			resultSB.append(String.format("%12d\t%12d\t%s\n", entry.getValue(), relativeHeapResults.get(query), query));
		});
		logger.info(resultSB);
	}

	protected static IQueryGroup getDirectPrerequisites(IQuerySpecification<?> query) {
		Set<PQuery> referredQueries = query.getInternalQueryRepresentation().getDisjunctBodies()
				.getDirectReferredQueries();
		Stream<IQuerySpecification<?>> referredSpecifications = referredQueries.stream()
				.flatMap(it -> it.publishedAs().stream().filter(IQuerySpecification.class::isInstance))
				.map(IQuerySpecification.class::cast);
		return GenericQueryGroup.of(referredSpecifications);
	}

}
