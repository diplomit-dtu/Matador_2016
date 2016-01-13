package model.cards;

import control.GameController;
import control.MovePlayerAction;
import control.MovePlayerToAction;
import model.Player;

public class DoCardVisitor extends CardVisitor {
	private GameController gc;
	
	public DoCardVisitor(GameController gc) {
		this.gc = gc;
	}

	@Override
	public void visit(MoveCard card) {
		Player player = gc.getActivePlayer();
		int dist = card.getDist();
		new MovePlayerAction(gc, player, dist).execute();
	}

	@Override
	public void visit(MoveToCard card) {
		Player player = gc.getActivePlayer();
		int dest = card.getDestination();
		new MovePlayerToAction(gc, player, dest).execute();
	}

	@Override
	public void visit(MoneyCard card) {
		Player player
		
	}

}
