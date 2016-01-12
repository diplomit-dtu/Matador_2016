package model.fields;

import control.Visitor;

public class ChanceField extends Field {

	public ChanceField(String name) {
		super(name);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
