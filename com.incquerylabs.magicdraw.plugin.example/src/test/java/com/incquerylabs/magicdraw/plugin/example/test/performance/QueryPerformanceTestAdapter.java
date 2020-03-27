package com.incquerylabs.magicdraw.plugin.example.test.performance;

import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IQueryGroup;

import com.incquerylabs.magicdraw.plugin.example.test.performance.viatra.RelativeQueryPerformanceTest;
import com.incquerylabs.v4md.ViatraQueryAdapter;
import com.nomagic.magicdraw.core.Project;

public class QueryPerformanceTestAdapter extends RelativeQueryPerformanceTest {

	private Project project;
	private IQueryGroup queryGroup;

	public QueryPerformanceTestAdapter(Project project, IQueryGroup queryGroup) {
		this.project = project;
		this.queryGroup = queryGroup;
	}

	@Override
	public IQueryGroup getQueryGroup() {
		return queryGroup;
	}

	@Override
	public AdvancedViatraQueryEngine getEngine() {
		return ViatraQueryAdapter.getOrCreateAdapter(project).getEngine();
	}

}
