package control;

import model.Player;

public class PlayerTurnAction extends Action {

	public PlayerTurnAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		Player activePlayer = gc.getActivePlayer();
		if (activePlayer.isInJail()){
			new JailTurnAction(gc).execute();
		} else {
			gc.getGuiAdaptor().showPlayerTurnStart(activePlayer);
			boolean extraTurn = false;
			do {
				extraTurn = false;
				new RollAndMoveAction(gc).execute();
				if (gc.getDiceCup().isSame()) {
					extraTurn = true;
					gc.getGuiAdaptor().showExtraTurn(activePlayer);
				}
				if (activePlayer.tooManySameRolls()){
					extraTurn = false;
					new GotoJailAction(gc).execute();
				}
			} while (extraTurn);
		}
	}
}
