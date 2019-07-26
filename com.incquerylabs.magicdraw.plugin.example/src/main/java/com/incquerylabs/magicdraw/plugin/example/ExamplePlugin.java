package com.incquerylabs.magicdraw.plugin.example;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup.StandaloneParserModule;
import org.eclipse.viatra.query.patternlanguage.emf.vql.PatternLanguagePackage;
import org.eclipse.xtext.resource.impl.BinaryGrammarResourceFactoryImpl;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.incquerylabs.magicdraw.plugin.example.actions.PortTypeCorrectorAction;
import com.incquerylabs.magicdraw.plugin.example.actions.PythonGenAction;
import com.incquerylabs.magicdraw.plugin.example.commands.CodeGenRunner;
import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;
import com.nomagic.magicdraw.commandline.CommandLineActionManager;
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
				new ExampleMainMenuConfigurator(new PortTypeCorrectorAction(), new PythonGenAction()));
		manager.addContainmentBrowserContextConfigurator(new EventDrivenPortTypeCorrectorConfigurator());

		CommandLineActionManager.getInstance().addAction(new CodeGenRunner());
		// Initializing Xtext infrastructure
		PatternLanguagePackage.eINSTANCE.getClass();

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xtextbin",
				new BinaryGrammarResourceFactoryImpl());

		EMFPatternLanguageStandaloneSetup setup = new EMFPatternLanguageStandaloneSetup();
		languageInjector = Guice.createInjector(new StandaloneParserModule());
		setup.register(languageInjector);
	}

	@Override
	public boolean isSupported() {
		return true;
	}

}
