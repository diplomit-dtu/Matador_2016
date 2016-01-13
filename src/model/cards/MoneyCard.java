package model.cards;

public class MoneyCard extends Card {
	private int amount;

	public MoneyCard(int amount) {
		this.amount = amount;
	}

	@Override
	public void accept(CardVisitor v) {
		v.visit(this);
	}

	public int getAmount() { return amount; }
}
