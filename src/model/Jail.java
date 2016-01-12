package model;

import control.Visitor;

public class Jail extends Field {

	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

}
