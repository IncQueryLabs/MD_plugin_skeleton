package com.incquerylabs.magicdraw.plugin.example.actions;

import java.awt.event.ActionEvent;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;

import com.incquerylabs.magicdraw.plugin.example.queries.EdgeTest;
import com.incquerylabs.v4md.ViatraQueryAdapter;
import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.GUILog;

public class EdgeCheckAction extends NMAction
{
	
	public EdgeCheckAction()
	{
		super("EDGE_CHECK", "Edge Check", null, null);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		ViatraQueryEngine engine = ViatraQueryAdapter.getOrCreateAdapter(Application.getInstance().getProject()).getEngine();
		
		GUILog guiLog = Application.getInstance().getGUILog();
		
		guiLog.log("-------------------------------------");

		EdgeTest.Matcher.on(engine).forEachMatch(match -> {
			
			guiLog.log("+++");
			try {
				guiLog.log("Name: " + match.getEdge().getName());
			} catch (NullPointerException e) {
				guiLog.log("Name: " + "nullptr");
			}

			guiLog.log("getLocalID: " + match.getEdge().getLocalID());
			guiLog.log("getID: " + match.getEdge().getID());
			guiLog.log("sGetID: " + match.getEdge().sGetID());
			guiLog.log("+++");
		});
		
		guiLog.log("-------------------------------------");
		
	}

}
