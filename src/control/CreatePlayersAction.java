package control;

import model.Player;
import util.GameConstants;

public class CreatePlayersAction extends Action {

	public CreatePlayersAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		GuiAdaptor ga = gc.getGuiAdaptor();
		int playerCount = ga.askForNumberOfPlayers();
		Player[] players = new Player[playerCount];
		
		for(int i = 0; i < playerCount; i++){
			String name = ga.askForPlayerName(i);
			int balance = GameConstants.getStartPenge();
			Player player = new Player(name, balance);
			players[i] = player;
			
			new CreateGuiPlayerAction(gc, i, player).execute();
		}
		gc.setPlayers(players);
	}
}
