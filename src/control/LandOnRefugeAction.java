package control;

import model.fields.Refuge;

public class LandOnRefugeAction extends Action {
	private Refuge refuge;

	public LandOnRefugeAction(GameController gc, Refuge refuge) {
		super(gc);
		this.refuge=refuge;
	}

	@Override
	public void execute() {
		gc.getGuiAdaptor().showLandedOnRefuge(gc.getActivePlayer(), refuge);				
	}
}
