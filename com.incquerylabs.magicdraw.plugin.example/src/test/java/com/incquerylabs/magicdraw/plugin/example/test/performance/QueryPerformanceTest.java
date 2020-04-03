package com.incquerylabs.magicdraw.plugin.example.test.performance;

import java.io.File;

import org.eclipse.viatra.query.runtime.api.GenericQueryGroup;
import org.eclipse.viatra.query.runtime.api.IQueryGroup;
import org.junit.Test;

import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.tests.MagicDrawTestCase;
import com.nomagic.magicdraw.tests.common.TestEnvironment;

import util.CommonLibrary;

public class QueryPerformanceTest extends MagicDrawTestCase {

	private static final IQueryGroup SYSML = GenericQueryGroup.of(CommonLibrary.instance());

	// path: src/test/data
	protected static String projectToUse = "Python_Codegen_Example.mdzip";

	private Project project;

	@Test
	public void runMeasurements() {
		project = loadProject(new File(TestEnvironment.getResourceDir(), projectToUse).getAbsolutePath());
		QueryPerformanceTestAdapter adapter = new QueryPerformanceTestAdapter(project, SYSML);
		adapter.queryPerformance();
	}

}