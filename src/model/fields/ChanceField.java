package model.fields;

import control.Visitor;
import gui_fields.GUI_Chance;

public class ChanceField extends Field {

	public ChanceField(GUI_Chance guiField) {
		super(guiField);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
