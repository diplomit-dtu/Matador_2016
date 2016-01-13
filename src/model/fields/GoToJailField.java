package model.fields;

import java.awt.Color;

import control.Visitor;
import gui_fields.GUI_Jail;

public class GoToJailField extends Field {

	public GoToJailField(GUI_Jail guiField) {
		super(guiField);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	public static GoToJailField create(String picture, String title, String subText, String description, Color bgColor, Color fgColor){
		GUI_Jail guiField = new GUI_Jail(picture, title, subText, description, bgColor, fgColor);
		GoToJailField field = new GoToJailField(guiField);
		return field;
	}
}
