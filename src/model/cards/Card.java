package model.cards;

import control.Visitor;

public abstract class Card {

	public abstract void accept(CardVisitor v); //Must be implemented in baseClass
}
