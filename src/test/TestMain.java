package test;

import control.Action;
import control.AskForNewGameAction;
import control.CreatePlayersAction;
import control.GameController;
import control.GuiAdaptor;
import control.RollAction;
import gui_main.GUI;
import util.GameConstants;

public class TestMain {

	public static void main(String[] args) {
		GameController gc = new GameController();
		//Action a = new CreatePlayersAction(gc);
//		a.execute();
		new RollAction(gc).execute();
	}

}
