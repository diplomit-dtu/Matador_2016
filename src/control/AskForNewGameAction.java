package control;

public class AskForNewGameAction extends Action {

	public AskForNewGameAction(GameController gc) {
		super(gc);
	}

	@Override
	public void doAction() {
		if (!gc.getGuiAdaptor().askForNewGame()) gc.stopPlaying();
		else {
			//ASK for reset or same players
			
		}
	}

	@Override
	public void undoAction() {
		// TODO Auto-generated method stub
		
	}

}
