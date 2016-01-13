package control;

import model.Player;
import util.GameConstants;

public class JailTurnAction extends Action {

	public JailTurnAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		new RollAction(gc).execute();
		Player activeplayer = gc.getActivePlayer();
		if (gc.getDiceCup().isSame()){
			//Get out of jail!
			activeplayer.getOutOfJail();
			
		} else {
			if (activeplayer.getJailTurns()>=GameConstants.getMaxJailTurns()){
				gc.getGuiAdaptor().showTooManyTurnsInJail(activeplayer);
				new MandatoryPayAction(gc, GameConstants.getGetOutofJailPrice(), activeplayer);
				
			} else {
				//Chose pay or not
			}
		}
	}
}
