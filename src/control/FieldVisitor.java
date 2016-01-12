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
		System.out.println("Landed on Street");

	}

	@Override
	public void visit(Brewery brewery) {
		System.out.println("Landed on Brewery");

	}

	@Override
	public void visit(Shipping shipping) {
		System.out.println("Landed on Shipping");

	}

	@Override
	public void visit(ChanceField chanceField) {
		System.out.println("Landed on ChanceField");

	}

	@Override
	public void visit(TaxField taxField) {
		System.out.println("Landed on TaxField");

	}

}
