package test;

import control.GameController;
import control.SetupPlayersAction;

public class SetupTest {
	
	public static void main(String[] args) {
		new SetupPlayersAction(new GameController(), true).execute();
	}
}
