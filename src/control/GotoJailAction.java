package control;

public class GotoJailAction extends Action {

	public GotoJailAction(GameController gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		gc.getActivePlayer().resetSameRoll();
		gc.getActivePlayer().goToJail();
		gc.getActivePlayer().setPosition(gc.getJailPosition());

	}

}
