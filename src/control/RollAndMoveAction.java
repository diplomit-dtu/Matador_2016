package control;

public class RollAndMoveAction extends Action {

	public RollAndMoveAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		new RollAction(gc).execute();
	}
}
