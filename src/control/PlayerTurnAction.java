package control;

import model.Player;

public class PlayerTurnAction extends Action {

	public PlayerTurnAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		//get active player
		Player activePlayer = gc.getActivePlayer();
		//Show start turn
		gc.getGuiAdaptor().showPlayerTurnStart(activePlayer);
		if (activePlayer.isInJail()){
			new JailTurnAction(gc).execute();
		} else {
			//Loop while extraTurn
			boolean extraTurn;
			do {
				extraTurn = false;
				new RollAndMoveAction(gc).execute();
				if (activePlayer.tooManySameRolls()){
					gc.getGuiAdaptor().showTooManySameRolls(activePlayer);
					new GotoJailAction(gc).execute();
				}
				if (gc.getDiceCup().isSame()) {
					extraTurn = true;
					gc.getGuiAdaptor().showExtraTurn(activePlayer);
				}

			} while (extraTurn && !activePlayer.isInJail());
		}
	}
}
