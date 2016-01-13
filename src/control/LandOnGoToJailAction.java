package control;

import util.GameConstants;

public class LandOnGoToJailAction extends Action {

	public LandOnGoToJailAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		gc.getGuiAdaptor().showLandedOnGotoJail(gc.getActivePlayer());
		gc.getActivePlayer().moveTo(GameConstants.getJailPosition());
		gc.getGuiAdaptor().updateCarPosition(gc.getActivePlayer());
		gc.getActivePlayer().goToJail();

	}

}
