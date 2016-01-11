package control;

import model.Player;

public class CreatePlayersAction extends Action {

	public CreatePlayersAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		GuiAdaptor ga = gc.getGuiAdaptor();
		int playerCount = ga.askForNumberOfPlayers();
		
		for(int i = 0; i < playerCount; i++){
			String name = ga.askForPlayerName(i);
			new Player(name, balance)
		}
	}
}
