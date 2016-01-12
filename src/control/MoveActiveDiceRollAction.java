package control;

import model.Player;
import model.fields.Field;

public class MoveActiveDiceRollAction extends Action {

	public MoveActiveDiceRollAction(GameController gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		//Determine activeplayer
		Player player = gc.getActivePlayer();
		player.move(gc.getDiceCup().getSum());
		gc.getGuiAdaptor().updateCarPosition(player);
		FieldVisitor v = new FieldVisitor(gc);
		Field currentField = gc.getCurrentField();
		currentField.accept(v);

	}

}
