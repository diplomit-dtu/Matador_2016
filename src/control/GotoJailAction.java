package control;

public class GotoJailAction extends Action {

	public GotoJailAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		gc.getActivePlayer().resetSameRoll();
		gc.getActivePlayer().goToJail();
		gc.getActivePlayer().setPosition(gc.getJailPosition());

	}

}
