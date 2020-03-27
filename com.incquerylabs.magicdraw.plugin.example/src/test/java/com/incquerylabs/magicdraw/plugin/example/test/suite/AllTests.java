package com.incquerylabs.magicdraw.plugin.example.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.incquerylabs.magicdraw.plugin.example.test.DummyTest;
import com.incquerylabs.magicdraw.plugin.example.test.performance.QueryPerformanceTest;

@RunWith(Suite.class)
@SuiteClasses({
		DummyTest.class,
		QueryPerformanceTest.class
})

public class AllTests {}
