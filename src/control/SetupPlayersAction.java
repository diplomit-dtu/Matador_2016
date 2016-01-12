package control;

import model.Player;

public class SetupPlayersAction extends Action {
	private boolean quick;

	public SetupPlayersAction(GameController gc) {
		this(gc, false);
	}
	public SetupPlayersAction(GameController gc, boolean quick) {
		super(gc);
		this.quick = quick;
	}

	@Override
	public void execute() {
		int playerCount;
		if(quick){
			playerCount = 3;
		} else {
			GuiAdaptor ga = gc.getGuiAdaptor();
			playerCount = ga.askForNumberOfPlayers();
			
		}
		Player[] players = new Player[playerCount];
		gc.setPlayers(players);
		
		for(int i = 0; i < playerCount; i++){
			new CreatePlayerAction(gc, quick).execute();
		}
	}
}
