package test;

import control.GameController;

public class TestMain {

	public static void main(String[] args) {
//		GameController gc = new GameController();
//		//Action a = new CreatePlayersAction(gc);
////		a.execute();
//		new RollAction(gc).execute();
		
		GameController gc = new GameController();
		System.out.println(gc.getJailPosition());
	}

}
