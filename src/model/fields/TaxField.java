package model.fields;

import control.Visitor;
import gui_fields.GUI_Tax;

public class TaxField extends Field {

	public TaxField(GUI_Tax guiField) {
		super(guiField);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

}
