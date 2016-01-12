package control;

import model.Player;

public class SetupPlayersAction extends Action {

	public SetupPlayersAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		GuiAdaptor ga = gc.getGuiAdaptor();
		int playerCount = ga.askForNumberOfPlayers();
		Player[] players = new Player[playerCount];
		gc.setPlayers(players);
		
		for(int i = 0; i < playerCount; i++){
			new CreatePlayerAction(gc).execute();
		}
	}
}
