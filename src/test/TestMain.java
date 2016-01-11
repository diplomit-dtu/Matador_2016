package test;

import control.Action;
import control.AskForNewGameAction;
import control.GameController;
import control.GuiAdaptor;
import gui_main.GUI;
import util.GameConstants;

public class TestMain {

	public static void main(String[] args) {

		Action a = new AskForNewGameAction(new GameController());
		a.execute();
	}

}
