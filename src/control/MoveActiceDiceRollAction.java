package control;

import model.Player;

public class MoveActiceDiceRollAction extends Action {

	public MoveActiceDiceRollAction(GameController gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		Player player = gc.getActivePlayer();
		player.move(gc.getDiceCup().getSum());
		gc.getGuiAdaptor().updateCarPosition(player);

	}

}
