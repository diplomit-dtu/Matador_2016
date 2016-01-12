package control;

import model.fields.Brewery;
import model.fields.Field;
import model.fields.GoToJailField;
import model.fields.Refuge;
import model.fields.Ownable;
import model.fields.Shipping;
import model.fields.Street;
@Deprecated
public class JailVisitor extends Visitor {

	private GameController gc;
	public JailVisitor(GameController gameController) {
		this.gc = gameController;
	}
	@Override
	public void visit(Refuge j){
		System.out.println("Jail Visited");
	}
	@Override
	public void visit(GoToJailField g){
		
	}
	@Override
	public void visit(Ownable ownable) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void visit(Street street) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void visit(Brewery brewery) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void visit(Shipping shipping) {
		// TODO Auto-generated method stub
		
	}

}
