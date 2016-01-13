package control;
import java.awt.Color;

import gui_codebehind.GUI_FieldFactory;
import gui_fields.GUI_Car.Pattern;
import gui_fields.GUI_Car.Type;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;
import model.Player;
import model.fields.Field;
import model.fields.Refuge;
import util.GameConstants;
import util.Messages;

public class GuiAdaptor {
	private GUI gui;
	public GuiAdaptor(Field[] fields){
		GUI_Field[] gui_fields = new GUI_Field[fields.length];
		for (int i =0; i<fields.length;i++) {
			gui_fields[i]= fields[i].getGuiField();
		}
		gui = new GUI(gui_fields);
	}

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

	public String askForPlayerName() {
		return gui.getUserString(Messages.getString("GuiAdaptor.4")); //$NON-NLS-1$
	}

	public Color selectPrimaryColor(Player player) {
		return selectColor(player.getName() + Messages.getString("GuiAdaptor.5"), player); //$NON-NLS-1$
	}

	public Color selectSecondaryColor(Player player) {
		return selectColor(player.getName() +Messages.getString("GuiAdaptor.6"), player); //$NON-NLS-1$
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
	
	public Type selectCarType(Player player) {
		Type[] carTypes = Type.values();
		String[] carStrings = new String[carTypes.length];
		for (int j = 0; j < carStrings.length; j++) {
			carStrings[j] = carTypes[j].toString();
		}
		
		return Type.getTypeFromString(gui.getUserSelection(player.getName() + Messages.getString("GuiAdaptor.2"), carStrings)); //$NON-NLS-1$
		
	}

	public Pattern selectCarPattern(Player player) {
		Pattern[] carPatterns = Pattern.values();
		String[] patternStrings = new String[carPatterns.length];
		for (int j = 0; j < patternStrings.length; j++) {
			patternStrings[j] = carPatterns[j].toString();
		}
		return Pattern.getPatternFromString(gui.getUserSelection(player.getName() + Messages.getString("GuiAdaptor.7"), patternStrings)); //$NON-NLS-1$
	}

	public void addPlayer(GUI_Player gui_player) {
		gui.addPlayer(gui_player);
	}
		
	public void removePlayer(GUI_Player guiPlayer) {
		guiPlayer.setName("------");
	}

	public boolean askForNewGame() {
		return gui.getUserLeftButtonPressed(Messages.getString("GuiAdaptor.0"), Messages.getString("GuiAdaptor.1"), Messages.getString("GuiAdaptor.3")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	public void showDice(int d1, int d2) {
		gui.setDice(d1, d2);
	}

	public void setCarForPlayer(Player player) {
		
		GUI_Field gField = gui.getFields()[player.getPosition()];
				gField.setCar(player.getGuiPlayer(), true);
	}
	
	public void removeCarAtPosition(Player player){
		GUI_Field gField = gui.getFields()[player.getPosition()];
				gField.setCar(player.getGuiPlayer(), false);
	}
	
	public void updateCarPosition(Player player){
		removeAllCarsForPlayer(player);
		setCarForPlayer(player);
	}
	public void removeAllCarsForPlayer(Player player){
		for (GUI_Field guiField : gui.getFields()) {
			guiField.setCar(player.getGuiPlayer(), false);
		}
	}

	public void showPlayerTurnStart(Player player) {
		gui.showMessage(player.getName() + Messages.getString("GuiAdaptor.9")); //$NON-NLS-1$
		
	}

	public void showExtraTurn(Player p) {
		gui.showMessage(p.getName() + ", du får en ekstra tur");
		
	}

	public void showTooManySameRolls(Player p) {
		gui.showMessage(p.getName() + ", du har slået for mange ens i træk - du ryger i fængsel!");
		
	}

	public void showLandedOnRefuge(Player player, Refuge refuge) {
		gui.showMessage(player.getName() + ", du landede på " + refuge.getGuiField().getTitle() + ". Her sker ikke noget.");
		
	}

	public void showLandedOnGotoJail(Player player) {
		gui.showMessage(player.getName() + ", du er landet på gå til fængsel. Du rykker direkte i fængsel.");
		
	}

	public void showTooManyTurnsInJail(Player player) {
		gui.showMessage(player.getName() + ", du har været i fængsel for længe, du må betale for at komme ud");
		
	}

	public void showNotEnoughMoney(Player payingPlayer) {
		gui.showMessage(payingPlayer.getName() + ", du har ikke nok penge.");
		
	}

	
	

}
