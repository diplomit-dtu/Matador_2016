package control;

import model.Field;
import model.Jail;

public abstract class Visitor {
	public abstract void visit(Jail jail);
}
