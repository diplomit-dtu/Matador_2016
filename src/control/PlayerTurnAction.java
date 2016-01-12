package control;

public class PlayerTurnAction extends Action {

	public PlayerTurnAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		if (gc.getActivePlayer().isInJail()){
			new JailTurnAction(gc).execute();
		} else {
			gc.getGuiAdaptor().showPlayerTurnStart(gc.getActivePlayer());
			boolean extraTurn = false;
			do {
			new RollAndMoveAction(gc).execute();
			if (gc.getDiceCup().isSame()) extraTurn = true;
			if (gc.getActivePlayer().tooManySameRolls()){
				extraTurn = false;
				new GotoJailAction(gc).execute();
			}
			} while (extraTurn);
		}
	}
}
