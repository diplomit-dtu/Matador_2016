package model.fields;

import control.Visitor;

public class Brewery extends Field {

	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

}
