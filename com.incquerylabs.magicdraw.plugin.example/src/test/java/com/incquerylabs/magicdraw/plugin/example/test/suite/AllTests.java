package com.incquerylabs.magicdraw.plugin.example.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.incquerylabs.magicdraw.plugin.example.test.DummyGuiTest;
import com.incquerylabs.magicdraw.plugin.example.test.DummyTest;

@RunWith(Suite.class)
@SuiteClasses({
		DummyTest.class,
		DummyGuiTest.class
		
})

public class AllTests {}
