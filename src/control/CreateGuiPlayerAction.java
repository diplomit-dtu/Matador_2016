package control;

import java.awt.Color;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import model.Player;

public class CreateGuiPlayerAction extends Action {
	private GuiAdaptor ga;
	private Player player;

	public CreateGuiPlayerAction(GameController gc, Player player) {
		super(gc);
		this.player = player;
		ga = gc.getGuiAdaptor();
	}

	@Override
	public void execute() {
		Color c1 = ga.selectPrimaryColor(player);
		Color c2 = ga.selectSecondaryColor(player);
		GUI_Car.Type carType = ga.selectCarType(player);
		GUI_Car.Pattern carPattern = ga.selectCarPattern(player);
		
		GUI_Car car = new GUI_Car(c1, c2, carType, carPattern);
		GUI_Player guiPlayer = new GUI_Player(player.getName(), player.getBalance(), car);
		player.setGuiPlayer(guiPlayer);
		ga.addPlayer(guiPlayer);
		ga.setCarForPlayer(player);
	}

}
