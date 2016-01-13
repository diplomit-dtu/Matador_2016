package model.cards;

public class MoveToCard extends Card {
	private int destination;

	public int getDestination() {
		return destination;
	}

	@Override
	public void accept(CardVisitor v) {
		v.visit(this);
	}
	
	public MoveToCard(int destination) { this.destination = destination; }
}
