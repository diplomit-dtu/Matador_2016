package control;

public class RollAction extends Action {

	public RollAction(GameController gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		gc.getDiceCup().roll();
		gc.getGuiAdaptor().showDice(gc.getDiceCup().getD1().getValue(), gc.getDiceCup().getD2().getValue());
		if (gc.getDiceCup().isSame()) gc.getActivePlayer().incrementSameRoll(); 
		else gc.getActivePlayer().resetSameRoll();
	}
}
