package control;

import model.fields.Brewery;
import model.fields.ChanceField;
import model.fields.GoToJailField;
import model.fields.Ownable;
import model.fields.Refuge;
import model.fields.Shipping;
import model.fields.Street;
import model.fields.TaxField;

public class FieldVisitor extends Visitor {

	private GameController gc;

	public FieldVisitor(GameController gc) {
		this.gc = gc;
	}

	@Override
	public void visit(Refuge jail) {
		System.out.println("Landed on refuge");

	}

	@Override
	public void visit(GoToJailField goToJail) {
		System.out.println("Landed on goToJail");

	}


	@Override
	public void visit(Street street) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Brewery brewery) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Shipping shipping) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ChanceField chanceField) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(TaxField taxField) {
		// TODO Auto-generated method stub

	}

}
