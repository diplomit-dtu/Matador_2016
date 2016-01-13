package model.cards;

import control.Visitor;
import model.fields.Brewery;
import model.fields.ChanceField;
import model.fields.GoToJailField;
import model.fields.Refuge;
import model.fields.Shipping;
import model.fields.Street;
import model.fields.TaxField;

public class CardVisitor {
	public abstract void visit(MoveCard card);
	

}
