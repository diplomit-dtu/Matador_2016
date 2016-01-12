package control;

public class JailTurnAction extends Action {

	public JailTurnAction(GameController gc) {
		super(gc);
	}

	@Override
	protected void doAction() {
		new RollAction(gc).execute();
	}

	@Override
	protected void undoAction() {
		// TODO Auto-generated method stub
		
	}

}
