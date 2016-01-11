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
	private boolean continuePlaying = true;
	private Player activePlayer;
	private DiceCup diceCup;
	
	public GameController(){
		init();
	}

	public void init() {
		diceCup = new DiceCup();
		// Make fields
		fields = FieldFactory.makeFields();
		//Initialize GUI
		ga = new GuiAdaptor();
	}
	public void run(){
		do {
			new RunGameAction(this).execute();
			new AskForNewGameAction(this).execute();
		}
		while(continuePlaying);
		System.exit(0);

	}

	public GuiAdaptor getGuiAdaptor() { return ga; }
	//Getters and setters
	public Player[] getPlayers() {		return players;	}
	public void setPlayers(Player[] players) {		this.players = players;	}
	//Set gameState to STOP!
	public void stopPlaying() { this.continuePlaying = false;}

	public void setActivePlayer(Player player) {
		this.activePlayer = player;
		
	}

	public Player getActivePlayer() {
		return activePlayer;
	}

	public DiceCup getDiceCup() {
		return diceCup;
	}



}
