package control;
import gui_codebehind.GUI_FieldFactory;
import gui_fields.GUI_Field;
import gui_main.GUI;
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

	public boolean askForNewGame() {
		return gui.getUserLeftButtonPressed("Spil igen", "ja tak", "nej tak");
	}
	
	

}
