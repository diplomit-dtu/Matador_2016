package control;

import java.awt.Color;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import model.Player;

public class CreateGuiPlayerAction extends Action {
	private GuiAdaptor ga;
	private Player player;
	private boolean quick;

	public CreateGuiPlayerAction(GameController gc, Player player){
		this(gc, player, false);
	}
	public CreateGuiPlayerAction(GameController gc, Player player, boolean quick) {
		super(gc);
		this.player = player;
		this.quick = quick;
		ga = gc.getGuiAdaptor();
	}

	@Override
	public void execute() {
		Color c1;
		Color c2;
		GUI_Car.Type carType;
		GUI_Car.Pattern carPattern;
		GUI_Player guiPlayer;
		if(quick){
			guiPlayer = new GUI_Player(player.getName(), player.getBalance());
		} else {
			c1 = ga.selectPrimaryColor(player);
			c2 = ga.selectSecondaryColor(player);
			carType = ga.selectCarType(player);
			carPattern = ga.selectCarPattern(player);
			GUI_Car car = new GUI_Car(c1, c2, carType, carPattern);
			guiPlayer = new GUI_Player(player.getName(), player.getBalance(), car);
		}
		
		player.setGuiPlayer(guiPlayer);
		ga.addPlayer(guiPlayer);
		ga.setCarForPlayer(player);
	}

}
