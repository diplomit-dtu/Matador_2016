package model.fields;

import control.Visitor;
import gui_fields.GUI_Brewery;

public class Brewery extends Ownable {

	private int baseRent;

	public Brewery(GUI_Brewery guiField, int price, int baseRent ) {
		super(guiField, price);
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
