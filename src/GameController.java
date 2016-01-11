import java.util.ArrayList;

import gui_codebehind.GUI_FieldFactory;
import gui_fields.GUI_Field;
import gui_main.GUI;

public class GameController {
//	private ChanceController cc;
//	private FieldVisitor visitor;
	
	public GameController(){
		// Make fields
		ArrayList<Field> fields = new ArrayList<Field>();
		fields.addAll(FieldFactory.makeFields());
		
		// Default GUI
		GUI_Field[] gui_fields = GUI_FieldFactory.makeFields();
		GUI gui = new GUI(gui_fields);
	}
}
