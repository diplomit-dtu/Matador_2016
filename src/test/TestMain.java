package test;

import control.GuiAdaptor;
import gui_main.GUI;
import util.GameConstants;

public class TestMain {

	public static void main(String[] args) {
//		GuiAdaptor g= new GuiAdaptor();
//		g.askForNumberOfPlayers();
		System.out.println(GameConstants.getInt("maxSpillere"));
	}

}
