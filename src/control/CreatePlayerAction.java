package control;

import model.Player;
import util.GameConstants;

public class CreatePlayerAction extends Action {
	private boolean quick;

	public CreatePlayerAction(GameController gc) {
		this(gc, false);
	}
	public CreatePlayerAction(GameController gc, boolean quick) {
		super(gc);
		this.quick = quick;
	}

	@Override
	public void execute() {
		String name = null;
		if(quick){
			for(int i = 0; i < gc.getPlayers().length; i++){
				if(gc.getPlayers()[i] == null){
					name = "Player"+i;
					break;
				}
			}
			if(name == null){
				System.err.println("Unable to auto-create player");
				return;
			}
		} else {
			GuiAdaptor ga = gc.getGuiAdaptor();
			name = ga.askForPlayerName();
		}
		Player player;
		if(quick){
			player = new Player(name, GameConstants.getStartPenge(), GameConstants.getStartPosition());
		} else {
			int balance = GameConstants.getStartPenge();
			player = new Player(name, balance, GameConstants.getStartPosition());
		}
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
		new CreateGuiPlayerAction(gc, player, quick).execute();
	}
}
