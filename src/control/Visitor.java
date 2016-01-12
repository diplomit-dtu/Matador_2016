package control;

import model.fields.Brewery;
import model.fields.Field;
import model.fields.GoToJail;
import model.fields.Refuge;
import model.fields.Ownable;
import model.fields.Shipping;
import model.fields.Street;

public abstract class Visitor {
	public abstract void visit(Refuge jail);
	public abstract void visit(GoToJail goToJail);
	public abstract void visit(Ownable ownable);
	public abstract void visit(Street street);
	public abstract void visit(Brewery brewery);
	public abstract void visit(Shipping shipping);
	
}
	
	