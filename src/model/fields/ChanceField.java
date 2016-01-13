package model.fields;

import java.awt.Color;

import control.FieldVisitor;
import gui_fields.GUI_Chance;

public class ChanceField extends Field {

	private ChanceField(GUI_Chance guiField) {
		super(guiField);
	}

	@Override
	public void accept(FieldVisitor v) {
		v.visit(this);
	}

	public static ChanceField create(String title, String subText, String description, Color bgColor, Color fgColor){
		GUI_Chance guiField = new GUI_Chance(title, subText, description, bgColor, fgColor);
		ChanceField chanceField = new ChanceField(guiField);
		return chanceField;
	}
}
