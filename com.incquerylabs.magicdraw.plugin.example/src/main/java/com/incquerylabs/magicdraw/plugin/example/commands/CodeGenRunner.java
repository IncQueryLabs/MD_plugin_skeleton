package com.incquerylabs.magicdraw.plugin.example.commands;
		
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;

import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;

import com.incquerylabs.magicdraw.plugin.example.codegen.GenPython;
import com.incquerylabs.v4md.ViatraQueryAdapter;
import com.nomagic.magicdraw.commandline.CommandLineAction;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.tests.MagicDrawTestCase;
import com.nomagic.magicdraw.uml.Finder;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

public class CodeGenRunner implements CommandLineAction {

	private final static String OUTPUT_DIR = "./target/codegen";
	
	public Project loadProject(String testFile) {
    	File file = new File(testFile);
    	assertTrue(file.getAbsolutePath(), file.exists());
    	String path = file.getAbsolutePath();
    	Project project = MagicDrawTestCase.loadProject(path);
    	assertNotNull(project);
    	return project;
    }


	@Override
	public byte execute(String[] arg0) {
		
		if(arg0.length == 1) {
			String projectPath = arg0[0];

			Project project = loadProject(projectPath);
			ViatraQueryAdapter adapter = ViatraQueryAdapter.getOrCreateAdapter(project);
			AdvancedViatraQueryEngine engine = adapter.getEngine();
			
			Profile mdSkeletonProfile = StereotypesHelper.getProfile(project, "MD Skeleton Profile");
			Stereotype codeGenScopeStereotype = StereotypesHelper.getStereotype(project, "CodeGenerationScope", mdSkeletonProfile);
			
			StereotypesHelper.getExtendedElements(codeGenScopeStereotype).forEach(scopePackage -> {
				GenPython gen = new GenPython(engine, 
						OUTPUT_DIR, 
						java.util.Collections.emptyList(), 
						Arrays.asList((Package)scopePackage));
				gen.doGen();
			});
		}
		
		
		return 0;
	}

}
