package control;

import model.Player;

public class RollAndMoveAction extends Action {

	public RollAndMoveAction(GameController gc) {
		super(gc);
	}

	@Override
	public void execute() {
		new RollAction(gc).execute();
		Player player = gc.getActivePlayer();
		int dist = gc.getDiceCup().getSum();
		new MovePlayerAction(gc, player, dist).execute();
	}
}
