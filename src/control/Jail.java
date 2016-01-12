package control;

import model.Field;

public class Jail extends Field {

	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

}
