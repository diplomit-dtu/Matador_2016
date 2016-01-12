package control;

import model.Field;

public class JailVisitor extends Visitor {

	private GameController gc;
	public JailVisitor(GameController gameController) {
		this.gc = gameController;
	}

	public void visit(Jail j){
		System.out.println("Jail Visited");
	}

}
