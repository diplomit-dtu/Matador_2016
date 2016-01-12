package control;

import model.Player;
import util.GameConstants;

public class CreatePlayersAction extends Action {
	private int playerCount;
	private Player[] players;
	private CreateGuiPlayerAction[] guiActions;

	public CreatePlayersAction(GameController gc) {
		super(gc);
	}

	@Override
	protected void doAction() {
		GuiAdaptor ga = gc.getGuiAdaptor();
		playerCount = ga.askForNumberOfPlayers();
		players = new Player[playerCount];
		guiActions = new CreateGuiPlayerAction[playerCount];
		
		for(int i = 0; i < playerCount; i++){
			String name = ga.askForPlayerName(i);
			int balance = GameConstants.getStartPenge();
			Player player = new Player(name, balance, GameConstants.getStartPosition());
			players[i] = player;
			
			guiActions[i] = new CreateGuiPlayerAction(gc, i, player);
			guiActions[i].execute();
		}
		gc.setPlayers(players);
	}

	@Override
	protected void undoAction() {
		for(int i = playerCount -1; i >= 0; i++){
			guiActions[i].undoAction();
		}
		gc.setPlayers(null);
	}
}
