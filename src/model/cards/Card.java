package model.cards;

public abstract class Card {

	public abstract void accept(CardVisitor v); //Must be implemented in baseClass
}
