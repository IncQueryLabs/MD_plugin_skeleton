package com.incquerylabs.magicdraw.plugin.headless.example;

import com.nomagic.magicdraw.commandline.CommandLineActionManager;
import com.nomagic.magicdraw.plugins.Plugin;

public class ExampleHeadlessPlugin extends Plugin {

	@Override
	public void init() {
		System.out.println("IncQuery Labs Example Headless Plugin: init");
		CommandLineActionManager.getInstance().addAction(new ExampleHeadlessAction());
	}

	@Override
	public boolean close() {
		System.out.println("IncQuery Labs Example Headless Plugin: close");
		return true;
	}

	@Override
	public boolean isSupported() {
		System.out.println("IncQuery Labs Example Headless Plugin: isSupported");
		return true;
	}

}