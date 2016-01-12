package model.fields;

import control.Visitor;

public abstract class Ownable extends Field {

	@Override
	public abstract void accept(Visitor v);

}
