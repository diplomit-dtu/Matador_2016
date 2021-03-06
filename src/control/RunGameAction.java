package control;

import model.Player;

public class RunGameAction extends Action {

	public RunGameAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		new SetupPlayersAction(gc, true).execute();
		System.out.println(gc.getPlayers());
		do{
			for (Player player : gc.getPlayers()) {
				if (!player.isBankrupt()){
					gc.setActivePlayer(player);
					new PlayerTurnAction(gc).execute();
				}
			}
		} while(!gc.getGameOver());

	}
}
