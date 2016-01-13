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
		LandOnFieldVisitor v = new LandOnFieldVisitor(gc);
		Field currentField = gc.getCurrentField();
		currentField.accept(v);

	}

}
