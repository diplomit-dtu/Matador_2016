
public class Account {
	private int balance = 0;
	
	public Account(int balance){
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public Account setBalance(int balance) {
		this.balance = balance;
		return this;
	}
	
	public Account addToBalance(int amount) {
		this.balance += balance;
		return this;
	}

}
