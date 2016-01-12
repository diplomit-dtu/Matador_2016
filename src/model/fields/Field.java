package model.fields;

import control.Visitor;
import gui_fields.GUI_Field;

public abstract class Field {
	private GUI_Field guiField;
	
	public Field(GUI_Field guiField) {
		this.guiField = guiField;
	}

	public abstract void accept(Visitor v); //Must be implemented in baseClass

	
	public GUI_Field getGuiField(){
		return guiField;
		
	}


}
