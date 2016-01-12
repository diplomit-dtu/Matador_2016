package control;

import model.fields.Brewery;
import model.fields.ChanceField;
import model.fields.GoToJailField;
import model.fields.Ownable;
import model.fields.Refuge;
import model.fields.Shipping;
import model.fields.Street;
import model.fields.TaxField;

public abstract class Visitor {
	public abstract void visit(Refuge jail);
	public abstract void visit(GoToJailField goToJail);
	public abstract void visit(Ownable ownable);
	public abstract void visit(Street street);
	public abstract void visit(Brewery brewery);
	public abstract void visit(Shipping shipping);
	public abstract void visit(ChanceField chanceField);
	public abstract void visit(TaxField taxField);	
}
	
	