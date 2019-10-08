package com.incquerylabs.magicdraw.plugin.example.test;

import org.assertj.swing.fixture.FrameFixture;
import org.junit.Test;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.ui.MainFrame;

public class DummyGuiTest
{
	private FrameFixture window;

	@SuppressWarnings("deprecation")
	@Test
	public void dummyTest() throws Exception {
	
		//Get main window
		MainFrame mainFrame = Application.getInstance().getMainFrame();
		//Binding to the testing FW 
		window = new FrameFixture(mainFrame.getActiveFrame());
		//Assert
		window.menuItem("Examples").requireEnabled();
		
	}
}