package control;

public class RollAction extends Action {

	public RollAction(GameController gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doAction() {
		gc.getDiceCup().roll();
		gc.getGuiAdaptor().showDice(gc.getDiceCup().getD1().getValue(), gc.getDiceCup().getD2().getValue());
	}

	@Override
	protected void undoAction() {
		// TODO Auto-generated method stub
		
	}

}
