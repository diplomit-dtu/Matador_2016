package control;
import model.Player;
import model.fields.Field;
import util.FieldFactory;
import util.GameConstants;

public class GameController {
	//	private ChanceController cc;
	//	private FieldVisitor visitor;
	private GuiAdaptor ga;
	private Player[] players;
	private Field[] fields;
	private boolean continuePlaying = true;
	private Player activePlayer;
	private DiceCup diceCup;
	private int jailPosition;
	
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
	public void setPlayers(Player[] players) { this.players = players; }
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

	public int getJailPosition() {
		if (fields==null) return GameConstants.getErrorInt();
		for (int i = 0; i < fields.length; i++) {
			fields[i].accept(new JailVisitor(this));
		}
		return jailPosition;
		
	}

	public boolean getGameOver() {
		int noLeft = 0;
		for (Player player : players) {
			if (!player.isBankrupt()) noLeft++;
		}
		return noLeft <=1;
	}

	public Field[] getFields(){ return fields; }
	
	public Field getCurrentField() {
		return fields[getActivePlayer().getPosition()];
	}



}
