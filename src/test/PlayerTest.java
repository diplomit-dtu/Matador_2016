package test;

import control.CreateGuiPlayerAction;
import control.GameController;
import model.Player;

public class PlayerTest {
	
	public static void main(String[] args) {
		
		Player p = new Player("Anders And", 1000);
		new CreateGuiPlayerAction(new GameController(), 1, p).execute();
	}

}