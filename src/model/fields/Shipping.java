package model.fields;

import java.awt.Color;

import control.FieldVisitor;
import gui_fields.GUI_Shipping;

public class Shipping extends Ownable {
	private int baseRent;

	private Shipping(GUI_Shipping guiField, int price, int baseRent) {
		super(guiField, price);
		this.baseRent=baseRent;
	}

	@Override
	public void accept(FieldVisitor v) {
		v.visit(this);
	}

	public int getBaseRent() {
		return baseRent;
	}
	
	public static Shipping create(int price, int baseRent, 
			String picture, String title, String subText, String description, String rent, Color bgColor, Color fgColor){
		GUI_Shipping guiField = new GUI_Shipping(picture, title, subText, description, rent, bgColor, fgColor);
		Shipping shipping = new Shipping(guiField, price, baseRent);
		return shipping;
	}
}
