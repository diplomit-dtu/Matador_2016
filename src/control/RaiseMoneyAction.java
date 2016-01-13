package control;

import model.Player;

public class RaiseMoneyAction extends Action {

	private Player payingPlayer;

	public RaiseMoneyAction(GameController gc, Player payingPlayer) {
		super(gc);
		this.payingPlayer = payingPlayer;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

}
