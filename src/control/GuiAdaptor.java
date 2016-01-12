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
		int minSpillere = GameConstants.getInt("minSpillere"); //$NON-NLS-1$
		int maxSpillere = GameConstants.getInt("maxSpillere"); //$NON-NLS-1$
		int input =  gui.getUserInteger(Messages.getString("GuiAdaptor.antalSpillere"), minSpillere, maxSpillere);		 //$NON-NLS-1$
		if (input<=maxSpillere && input >=minSpillere) return input;
		return minSpillere;
	}

	public String askForPlayerName(int i) {
		return gui.getUserString("Indtast spillernavn");
	}

	public Color selectPrimaryColor(int i, Player player) {
		return selectColor(player.getName() + ", Vælg forgrundsfarve", player);
	}

	public Color selectSecondaryColor(int i, Player player) {
		return selectColor(player.getName() +", Vælg baggrundsfarve", player);
	}
	private Color selectColor(String string, Player player) {
		Color[] colors = new Color[]{Color.BLACK, Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW, Color.WHITE};
		String[] colorStrings = new String[colors.length];
		for (int j = 0; j < colorStrings.length; j++) {
			colorStrings[j] = colors[j].toString();
		}
		String choice = gui.getUserSelection(string, colorStrings);
		for (int i = 0; i < colorStrings.length; i++) {
			if (choice == colorStrings[i]) return colors[i];
		}
		return Color.BLUE;
	}
	
	public Type selectCarType(int i, Player player) {
		Type[] carTypes = Type.values();
		String[] carStrings = new String[carTypes.length];
		for (int j = 0; j < carStrings.length; j++) {
			carStrings[j] = carTypes[j].toString();
		}
		
		return Type.getTypeFromString(gui.getUserSelection(player.getName() + Messages.getString("GuiAdaptor.2"), carStrings)); //$NON-NLS-1$
		
	}

	public Pattern selectCarPattern(int i, Player player) {
		Pattern[] carPatterns = Pattern.values();
		String[] patternStrings = new String[carPatterns.length];
		for (int j = 0; j < patternStrings.length; j++) {
			patternStrings[j] = carPatterns[j].toString();
		}
		return Pattern.getPatternFromString(gui.getUserSelection(player.getName() + ", vælg bilens mønster", patternStrings));
	}

	public void addPlayer(GUI_Player gui_player) {
		gui.addPlayer(gui_player);
	}
		
	public boolean askForNewGame() {
		return gui.getUserLeftButtonPressed(Messages.getString("GuiAdaptor.0"), Messages.getString("GuiAdaptor.1"), Messages.getString("GuiAdaptor.3")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	public void showDice(int d1, int d2) {
		gui.setDice(d1, d2);
	}

	public void setCarPosition(Player activePlayer, int startPosition) {
		//Need gui method!!!
	}
	
	

}
