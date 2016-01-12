package model.fields;

import control.Visitor;

public class TaxField extends Field {

	public TaxField(String name) {
		super(name);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

}
