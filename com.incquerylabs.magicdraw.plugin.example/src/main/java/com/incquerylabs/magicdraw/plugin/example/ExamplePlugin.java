package com.incquerylabs.magicdraw.plugin.example;

import com.incquerylabs.magicdraw.plugin.example.actions.PortTypeCorrectorAction;
import com.incquerylabs.magicdraw.plugin.example.actions.PythonGenAction;
import com.incquerylabs.magicdraw.plugin.example.commands.CodeGenRunner;
import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;
import com.nomagic.magicdraw.commandline.CommandLineActionManager;
import com.nomagic.magicdraw.plugins.Plugin;

public class ExamplePlugin extends Plugin {
	@Override
	public boolean close() {
		return true;
	}

	@Override
	public void init() {

		ActionsConfiguratorsManager manager = ActionsConfiguratorsManager.getInstance();
		manager.addMainMenuConfigurator(new ExampleMainMenuConfigurator(
				new PortTypeCorrectorAction(),
				new PythonGenAction()
		));
		manager.addContainmentBrowserContextConfigurator(new EventDrivenPortTypeCorrectorConfigurator());

		CommandLineActionManager.getInstance().addAction(new CodeGenRunner());
	}

	@Override
	public boolean isSupported() {
		return true;
	}

}
