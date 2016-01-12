package model.fields;

import control.Visitor;

public abstract class Field {
	private String name;
	
	public Field(String name) {
		this.name=name;
	}

	public abstract void accept(Visitor v); //Must be implemented in baseClass

	public String getName() {
		return name;
	}


}
