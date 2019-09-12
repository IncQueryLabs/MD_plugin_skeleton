package com.incquerylabs.magicdraw.plugin.example.commands;
		
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.Arrays;

import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;

import com.incquerylabs.magicdraw.plugin.example.codegen.GenPython;
import com.incquerylabs.v4md.ViatraQueryAdapter;
import com.nomagic.magicdraw.commandline.CommandLineAction;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.tests.MagicDrawTestCase;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

public class CodeGenRunner implements CommandLineAction {

	private final static String OUTPUT_DIR = "./target/codegen";
	
	public Project loadProject(String testFile) throws IOException {
		//String filePath = FileSystems.getDefault().getPath(testFile).normalize().toAbsolutePath().toString();
    	File file = new File(testFile);
    	String path = file.getCanonicalPath();
    	
    	assertTrue(path, file.exists());
    	Project project = MagicDrawTestCase.loadProject(path);
    	assertNotNull(project);
    	return project;
    }


	@Override
	public byte execute(String[] args) {
		if(args.length >= 1 && args[0].contains("mdzip")) {
			String projectPath = args[0];

			Project project;
			try {
				project = loadProject(projectPath);
				String engineId = CodeGenRunner.class.getName();

				ViatraQueryAdapter adapter = ViatraQueryAdapter.getOrCreateAdapter(project, engineId);
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
				
				adapter.dispose(engineId);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return 0;
	}

}
