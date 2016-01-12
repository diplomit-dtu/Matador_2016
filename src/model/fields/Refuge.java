package model.fields;

import control.Visitor;
import gui_fields.GUI_Refuge;

public class Refuge extends Field {

	public Refuge(GUI_Refuge guiField) {
		super(guiField);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

}
