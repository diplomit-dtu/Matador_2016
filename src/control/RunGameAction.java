package control;

import model.Player;

public class RunGameAction extends Action {

	public RunGameAction(GameController gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		new CreatePlayersAction(gc).execute();
		System.out.println(gc.getPlayers());
		for (Player player : gc.getPlayers()) {
			gc.setActivePlayer(player);
			new PlayerTurnAction(gc).execute();
		}
	}
}
