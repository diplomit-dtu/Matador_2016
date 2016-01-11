package model;

public class Player {
	private static int nextId = 0;
	private int id;
	private String name;
	private Account account;
	private boolean inJail = false;
	private int sameEyes = 0;
	
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
}
