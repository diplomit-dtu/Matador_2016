package control;

import model.Player;
import model.fields.Field;

public class MovePlayerAction extends Action {
	private Player player;
	private int dist;

	public MovePlayerAction(GameController gc, Player player, int dist) {
		super(gc);
		this.player = player;
		this.dist = dist;
	}

	@Override
	public void execute() {
		player.move(dist);
		gc.getGuiAdaptor().updateCarPosition(player);
		LandOnFieldVisitor v = new LandOnFieldVisitor(gc);
		Field currentField = gc.getCurrentField();
		currentField.accept(v);

	}

}
