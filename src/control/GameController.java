package control;
import model.Field;
import model.Player;
import util.FieldFactory;

public class GameController {
//	private ChanceController cc;
//	private FieldVisitor visitor;
	private GuiAdaptor ga;
	private Player[] players;
	Field[] fields;
	Action currentAction;
	
	public void run() {
		// Make fields
		fields = FieldFactory.makeFields();
		//Initialize GUI
		ga = new GuiAdaptor();
		//Ask for number of players
		do {
			new RunGameAction(this).execute();
			new AskForNewGameAction(this).execute;
		} while
		
	}

	public GuiAdaptor getGuiAdaptor() { return ga; }
	//Getters and setters
	public Player[] getPlayers() {		return players;	}
	public void setPlayers(Player[] players) {		this.players = players;	}
	
	
}
