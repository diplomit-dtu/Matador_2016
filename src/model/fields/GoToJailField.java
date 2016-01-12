package model.fields;

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

}
