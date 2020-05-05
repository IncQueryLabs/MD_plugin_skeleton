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
//		manager.addMainMenuConfigurator(
//				new ExampleMainMenuConfigurator(new EdgeCheckAction());

	}

	@Override
	public boolean isSupported() {
		return true;
	}

}
