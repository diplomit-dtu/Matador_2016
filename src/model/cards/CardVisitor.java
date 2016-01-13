package model.cards;

public abstract class CardVisitor {
	public abstract void visit(MoveCard card);
	public abstract void visit(MoveToCard card);
	public abstract void visit(MoneyCard card);

}
