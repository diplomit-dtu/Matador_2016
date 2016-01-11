package control;
import model.Field;
import util.FieldFactory;

public class GameController {
//	private ChanceController cc;
//	private FieldVisitor visitor;
	private GuiAdaptor ga;
	
	public void run() {
		// Make fields
		Field[] fields = FieldFactory.makeFields();
		
		ga = new GuiAdaptor();
		
	}

	public GuiAdaptor getGuiAdaptor() { return ga; }
	
	
}
