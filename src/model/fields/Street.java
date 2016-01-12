package model.fields;

import control.Visitor;

public class Street extends Ownable {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
