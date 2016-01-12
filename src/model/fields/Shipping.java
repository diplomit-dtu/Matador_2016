package model.fields;

import control.Visitor;
import gui_fields.GUI_Shipping;

public class Shipping extends Ownable {
	private int baseRent;

	public Shipping(GUI_Shipping guiField, int price, int baseRent) {
		super(guiField, price);
		this.baseRent=baseRent;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	public int getBaseRent() {
		return baseRent;
	}
}
