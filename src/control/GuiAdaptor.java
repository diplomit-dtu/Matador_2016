package control;

import gui_codebehind.GUI_FieldFactory;
import gui_fields.GUI_Field;
import gui_main.GUI;
import util.InputValidator;

public class GuiAdaptor {
	private GUI gui;

	public GuiAdaptor(){
		// Default GUI
		GUI_Field[] gui_fields = GUI_FieldFactory.makeFields();
		gui = new GUI(gui_fields);
	}

	public int askForNumberOfPlayers() {
		return gui.getUserInteger("Indtast antal spillere", 2, 6);

	}

}
