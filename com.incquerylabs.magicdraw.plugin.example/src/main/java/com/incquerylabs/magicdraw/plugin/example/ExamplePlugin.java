package com.incquerylabs.magicdraw.plugin.example;

import com.google.inject.Injector;
import com.incquerylabs.magicdraw.plugin.example.actions.EdgeCheckAction;
import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;
import com.nomagic.magicdraw.plugins.Plugin;

public class ExamplePlugin extends Plugin {
	
	public static Injector languageInjector;
	
	@Override
	public boolean close() {
		return true;
	}

	@Override
	public void init() {

		ActionsConfiguratorsManager manager = ActionsConfiguratorsManager.getInstance();
		manager.addMainMenuConfigurator(
				new ExampleMainMenuConfigurator(new EdgeCheckAction()));

	}

	@Override
	public boolean isSupported() {
		return true;
	}

}
