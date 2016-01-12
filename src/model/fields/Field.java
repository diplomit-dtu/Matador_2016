package model.fields;

import control.Visitor;

public abstract class Field {
	public abstract void accept(Visitor v); //Must be implemented in baseClass

}
