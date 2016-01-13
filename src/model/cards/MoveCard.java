package model.cards;

import control.Visitor;

public class MoveCard extends Card {
	private int dist;

	public MoveCard(int dist) {
		this.dist = dist;
	}

	@Override
	public void accept(CardVisitor v) {
		v.visit(this);
	}
}
