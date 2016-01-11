package control;

public class CreatePlayersAction extends Action {

	public CreatePlayersAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		int numPlayers = gc.getGuiAdaptor().getAskForNumberOfPlayers()
	}

}
