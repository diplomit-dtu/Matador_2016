package control;

import model.Player;
import model.fields.Field;

public class MovePlayerToAction extends Action {
	private Player player;
	private int dest;

	public MovePlayerToAction(GameController gc, Player player, int dest) {
		super(gc);
		this.player = player;
		this.dest = dest;
	}

	@Override
	public void execute() {
		player.setPosition(dest);
		gc.getGuiAdaptor().updateCarPosition(player);
		LandOnFieldVisitor v = new LandOnFieldVisitor(gc);
		Field currentField = gc.getCurrentField();
		currentField.accept(v);
	}

}
