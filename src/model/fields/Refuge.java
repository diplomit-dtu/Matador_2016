package model.fields;

import control.Visitor;

public class Refuge extends Field {

	public Refuge(String name) {
		super(name);
		
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

}
