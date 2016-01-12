package model.fields;

import control.Visitor;

public class GoToJailField extends Field {

	public GoToJailField(String name) {
		super(name);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

}
