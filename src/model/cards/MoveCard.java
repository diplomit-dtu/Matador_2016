package model.cards;

public class MoveCard extends Card {
	private int dist;

	public MoveCard(int dist) {
		this.dist = dist;
	}

	@Override
	public void accept(CardVisitor v) {
		v.visit(this);
	}
	
	public int getDist() { return dist; }
}
