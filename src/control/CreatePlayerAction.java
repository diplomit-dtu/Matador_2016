package control;

import model.Player;
import util.GameConstants;

public class CreatePlayerAction extends Action {

	public CreatePlayerAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		GuiAdaptor ga = gc.getGuiAdaptor();
		String name = ga.askForPlayerName();
		int balance = GameConstants.getStartPenge();
		Player player = new Player(name, balance, GameConstants.getStartPosition());
		int p = -1;
		for(int i = 0; i < gc.getPlayers().length; i++){
			if(gc.getPlayers()[i] == null) {
				p = i;
				break;
			}
		}
		if(p < 0) {
			System.err.println("No room for player: "+name);
			return;
		}
		gc.getPlayers()[p] = player;
		new CreateGuiPlayerAction(gc, player).execute();
	}
}
