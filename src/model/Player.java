package model;

import javax.swing.text.Position;

import gui_fields.GUI_Player;

public class Player {
	private static int nextId = 0;
	private int id;
	private String name;
	private Account account;
	private boolean inJail = false;
	private int sameEyesCount = 0;
	private GUI_Player guiPlayer;
	private int position; //0 indexed

	public Player(String name, int balance){
		this.name = name;
		this.account = new Account(balance);
		this.id = nextId++;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// Composite methods
	public int getBalance() {
		return account.getBalance();
	}

	public Player setBalance(int balance) {
		account.setBalance(balance);
		return this;
	}

	public Player addToBalance(int amount) {
		account.addToBalance(amount);
		return this;
	}

	public boolean isInJail() {
		return inJail;
	}

	public void setGuiPlayer(GUI_Player guiPlayer) {
		this.guiPlayer = guiPlayer;		
	}

	public GUI_Player getGuiPlayer() {
		return guiPlayer;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
}
