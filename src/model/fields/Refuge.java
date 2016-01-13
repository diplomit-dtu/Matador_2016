package model.fields;

import java.awt.Color;

import control.Visitor;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Refuge;

public class Refuge extends Field {

	private Refuge(GUI_Refuge guiField) {
		super(guiField);
	}
	private Refuge(GUI_Jail guiField){
		super(guiField);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	public static Refuge createRefuge(String picture, String title, String subText, String description, Color bgColor, Color fgColor){
		GUI_Refuge guiField = new GUI_Refuge(picture, title, subText, description, bgColor, fgColor);
		Refuge refuge = new Refuge(guiField);
		return refuge;
	}
	
	public static Refuge createJail(String picture, String title, String subText, String description, Color bgColor, Color fgColor){
		GUI_Jail guiField = new GUI_Jail(picture, title, subText, description, bgColor, fgColor);
		Refuge refuge = new Refuge(guiField);
		return refuge;
	}
}
