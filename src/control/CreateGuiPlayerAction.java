package control;

import java.awt.Color;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import model.Player;
import util.GameConstants;

public class CreateGuiPlayerAction extends Action {
	private int i;
	private Player player;

	public CreateGuiPlayerAction(GameController gc, int i, Player player) {
		super(gc);
		this.i = i;
		this.player = player;
	}

	@Override
	public void doAction() {
		GuiAdaptor ga = gc.getGuiAdaptor();
		Color c1 = ga.selectPrimaryColor(i, player);
		Color c2 = ga.selectSecondaryColor(i, player);
		GUI_Car.Type carType = ga.selectCarType(i, player);
		GUI_Car.Pattern carPattern = ga.selectCarPattern(i, player);
		
		GUI_Car car = new GUI_Car(c1, c2, carType, carPattern);
		GUI_Player guiPlayer = new GUI_Player(player.getName(), player.getBalance(), car);
		player.setGuiPlayer(guiPlayer);
		ga.addPlayer(guiPlayer);
		ga.setCarForPlayer(player);
	}

	@Override
	public void undoAction() {
		// TODO Auto-generated method stub
		
	}

}
