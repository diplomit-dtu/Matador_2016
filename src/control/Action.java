package control;

public abstract class Action {
	protected GameController gc;
	

	public Action(GameController gc){
		this.gc = gc;
	}
	
	public abstract void execute();
}
