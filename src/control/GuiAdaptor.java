package control;
import java.awt.Color;

import gui_codebehind.GUI_FieldFactory;
import gui_fields.GUI_Car.Pattern;
import gui_fields.GUI_Car.Type;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
import model.Player;
import util.GameConstants;
import util.Messages;

public class GuiAdaptor {
	private GUI gui;

	public GuiAdaptor(){
		// Default GUI
		GUI_Field[] gui_fields = GUI_FieldFactory.makeFields();
		gui = new GUI(gui_fields);
	}

	/**
	 * @return number from 2 - 6 keeps asking player until valid entry
	 */
	public int askForNumberOfPlayers() {
		int minSpillere = GameConstants.getInt("minSpillere");
		int maxSpillere = GameConstants.getInt("maxSpillere");
		int input =  gui.getUserInteger(Messages.getString("GuiAdaptor.antalSpillere"), minSpillere, maxSpillere);		 //$NON-NLS-1$
		if (input<=maxSpillere && input >=minSpillere) return input;
		return minSpillere;
	}

	public String askForPlayerName(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public Color selectPrimaryColor(int i, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	public Color selectSecondaryColor(int i, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	public Type selectCarType(int i, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	public Pattern selectCarPattern(int i, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addPlayer(GUI_Player gui_player) {
		// TODO Auto-generated method stub
		
	}
	
	

}
