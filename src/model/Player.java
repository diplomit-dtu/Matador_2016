package model;

import gui_fields.GUI_Player;
import util.GameConstants;

public class Player {
	private static int nextId = 0;
	private int id; //Bare fordi
	private String name;
	private Account account;
	private boolean inJail = false;
	private int sameEyesCount = 0;
	private GUI_Player guiPlayer;
	private int position; //0 indexed
	private boolean bankrupt = false;

	public Player(String name, int balance, int position){
		this.name = name;
		this.account = new Account(balance);
		this.id = nextId++;
		this.position=position;
	}

	public int getId() { return id; }
	
	public String getName() { return name; }

	// Composite methods
	public int getBalance() { return account.getBalance(); }
	public Player setBalance(int balance) { account.setBalance(balance); return this; }
	public Player addToBalance(int amount) { account.addToBalance(amount); return this; }

	public boolean isInJail() { return inJail; }

	public void setGuiPlayer(GUI_Player guiPlayer) { this.guiPlayer = guiPlayer; }
	public GUI_Player getGuiPlayer() { return guiPlayer; }

	public int getPosition() { return position; }
	public void setPosition(int position) { this.position = position; }

	public void move(int distance) { position+=distance; position%=40; }

	public void incrementSameRoll() { sameEyesCount++; }
	public void resetSameRoll() { sameEyesCount=0; }
	public boolean tooManySameRolls() { return sameEyesCount>=GameConstants.getMaxAllowedSameRolls(); }

	public void goToJail() { inJail = true; }

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", account=" + account + ", inJail=" + inJail
				+ ", sameEyesCount=" + sameEyesCount + ", guiPlayer=" + guiPlayer + ", position=" + position + "]";
	}

	public boolean isBankrupt() {
		return bankrupt ;
	}
}
