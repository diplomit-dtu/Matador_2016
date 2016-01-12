package model.fields;

import control.Visitor;

public class Shipping extends Field {

	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

}
