package com.incquerylabs.magicdraw.plugin.headless.example;

import com.nomagic.magicdraw.commandline.CommandLineAction;

public class ExampleHeadlessAction implements CommandLineAction {

	@Override
	public byte execute(String[] arg0) {
		System.out.println("IncQuery Labs Example Headless Plugin Action: Hello World!");
		return 0;
	}
}