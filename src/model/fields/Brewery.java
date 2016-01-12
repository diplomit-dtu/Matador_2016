package model.fields;

import control.Visitor;

public class Brewery extends Ownable {

	private int baseRent;

	public Brewery(String name, int price, int baseRent ) {
		super(name, price);
		this.baseRent = baseRent;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	public int getBaseRent() {
		return baseRent;
	}

}
