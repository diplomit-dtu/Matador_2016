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
			new RollAndMoveAction(gc).execute();
		}
	}

}
