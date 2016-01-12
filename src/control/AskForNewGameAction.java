package control;

public class AskForNewGameAction extends Action {

	public AskForNewGameAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		if (!gc.getGuiAdaptor().askForNewGame()) gc.stopPlaying();
		else {
			//ASK for reset or same players
			
		}
	}
}
