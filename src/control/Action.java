package control;

public abstract class Action {
	private static Node undoHead = null;
	private static Node redoHead = null;
	protected GameController gc;

	public Action(GameController gc){
		this.gc = gc;
	}
	
	public final void execute(){
		System.out.print("Execute\t");
		redoHead = null;
		push();
		doAction();
	}
	
	protected abstract void doAction();
	protected abstract void undoAction();
	
	private final void push(){
		// Push to undo stack
		Node current = new Node(this);
		current.previous = undoHead;
		undoHead = current;
	}
	public final static void undo(){
		System.out.print("Undo\t");
		// Pop from undo stack
		if(undoHead == null) return;
		Node current = undoHead;
		undoHead = current.previous;
		current.action.undoAction();
		
		// Push to redo stack
		current.previous = redoHead;
		redoHead = current;
		
	}
	public final static void redo(){
		System.out.print("Redo\t");
		// Pop from redo stack
		if(redoHead == null) return;
		Node current = redoHead;
		redoHead = current.previous;
		current.action.doAction();
		
		// Push to undo stack
		current.previous = undoHead;
		undoHead = current;
	}

	private final class Node {
		Node previous = null; 
		Action action = null;
		
		private Node(Action action){
			this.action = action;
			
		}
	}

	public static void printUndoRedoStack(){
		Node n = undoHead;
		System.out.print("\nUndo:   ");
		while(n != null) {
			System.out.print(", "+n.action);
			n = n.previous;
		}
		
		Node n1 = redoHead;
		System.out.print("\nRedo:   ");
		while(n1 != null) {
			System.out.print(", "+n1.action);
			n1 = n1.previous;
		}
		
		System.out.println("\n==============================================");
	}
}
