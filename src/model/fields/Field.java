package model.fields;

import control.Visitor;
import gui_fields.GUI_Field;

public abstract class Field {
	private String name;
	
	public Field(String name) {
		this.name=name;
	}

	public abstract void accept(Visitor v); //Must be implemented in baseClass

	public String getName() {
		return name;
	}
	
	public GUI_Field getGuiField(){
		return null;
		
	}


}
