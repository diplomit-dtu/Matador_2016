package control;

public class CreatePlayersAction extends Action {

	public CreatePlayersAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		GuiAdaptor ga = gc.getGa();
		int playerCount = ga.askforNumberOfPlayers();
		
		for(int i = 0; i < playerCount; i++){
			
		}
	}

}
