package control;

public abstract class Action {
	private static Node head = null;
	protected GameController gc;

	public Action(GameController gc){
		this.gc = gc;
	}
	
	public void execute(){
		push();
		doAction();
	}
	
	public abstract void doAction();
	public abstract void undoAction();
	
	public void push(){
		if(head == null){
			head = new Node(this);
		} else {
			Node current = new Node(this);
//			head.next = current;
			current.previous = head;
			head = current;
		}
	}
	public static void undo(){
		Action action = head.action;
		head = head.previous;
//		if(head != null) head.next = null;
		action.undoAction();
	}

	private class Node {
//		Node next = null;
		Node previous = null; 
		Action action = null;
		
		private Node(Action action){
			this.action = action;
			
		}
	}
}
