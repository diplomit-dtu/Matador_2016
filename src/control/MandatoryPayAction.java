package control;

import model.Player;

public class MandatoryPayAction extends Action {

	private int price;
	private Player payingPlayer;

	public MandatoryPayAction(GameController gc, int price, Player payingPlayer) {
		super(gc);
		this.price=price;
		this.payingPlayer = payingPlayer;
	}

	@Override
	public void execute() {
		if (payingPlayer.getBalance()>=price){
			payingPlayer.addToBalance(-price);
		} else {
			//Attempt to raise money
			gc.getGuiAdaptor().showNotEnoughMoney(payingPlayer);
			boolean wantsToSell = true;
//			while (payingPlayer.hasAssetsToSell() && payingPlayer.){
//				new RaiseMoneyAction(gc, payingPlayer);
//			}
		}
		
	}

}
