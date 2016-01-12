package control;

public class PlayerTurnAction extends Action {

	public PlayerTurnAction(GameController gc) {
		super(gc);
	}

	@Override
	protected void doAction() {
		if (gc.getActivePlayer().isInJail()){
			new JailTurnAction(gc).execute();
		} else {
			new RollAndMoveAction(gc).execute();
		}
	}

	@Override
	protected void undoAction() {
		// TODO Auto-generated method stub
		
	}

}
