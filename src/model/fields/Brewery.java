package model.fields;

import java.awt.Color;

import control.FieldVisitor;
import gui_fields.GUI_Brewery;

public class Brewery extends Ownable {
	private int baseRent;

	private Brewery(GUI_Brewery guiField, int price, int baseRent ) {
		super(guiField, price);
		this.baseRent = baseRent;
	}

	@Override
	public void accept(FieldVisitor v) {
		v.visit(this);
	}

	public int getBaseRent() {
		return baseRent;
	}

	public static Brewery create(int price, int baseRent, 
			String picture, String title, String subText, String description, String rent, Color bgColor, Color fgColor){
		GUI_Brewery guiField = new GUI_Brewery(picture, title, subText, description, rent, bgColor, fgColor);
		Brewery brewery = new Brewery(guiField, price, baseRent);
		return brewery;
	}
}
