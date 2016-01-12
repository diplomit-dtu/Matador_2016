package control;

public class JailTurnAction extends Action {

	public JailTurnAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		new RollAction(gc).execute();
	}
}
