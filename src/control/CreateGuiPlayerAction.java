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
	public void execute() {
		GuiAdaptor ga = gc.getGuiAdaptor();
		Color c1 = ga.selectPrimaryColor(i, player);
		Color c2 = ga.selectSecondaryColor(i, player);
		GUI_Car.Type carType = ga.selectCarType(i, player);
		GUI_Car.Pattern carPattern = ga.selectCarPattern(i, player);
		
		GUI_Car car = new GUI_Car(c1, c2, carType, carPattern);
		GUI_Player gui_player = new GUI_Player(player.getName(), player.getBalance(), car);
		ga.addPlayer(gui_player);
		ga.setCarPosition(gc.getActivePlayer(), GameConstants.getStartPosition());
	}

}
