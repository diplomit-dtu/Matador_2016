package control;

public class RollAndMoveAction extends Action {

	public RollAndMoveAction(GameController gc) {
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
