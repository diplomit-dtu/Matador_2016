package test;

import control.Action;
import control.GameController;
import gui_main.GUI;

public class ActionTest {
	int sum = 0;

	public static void main(String[] args) {
		new ActionTest();
	}
	
	public ActionTest(){
		Action a1 = new DummyAction1(null, "a1");
		Action a2 = new DummyAction1(null, "a2");
		Action a3 = new DummyAction1(null, "a3");
		Action a4 = new DummyAction1(null, "a4");
		Action b1 = new DummyAction2(null, "b1");
		Action b2 = new DummyAction2(null, "b2");
		
		a1.execute(); Action.printUndoRedoStack();
		a2.execute(); Action.printUndoRedoStack();
		a3.execute(); Action.printUndoRedoStack();
		a4.execute(); Action.printUndoRedoStack();
		Action.undo(); Action.printUndoRedoStack();
		Action.redo(); Action.printUndoRedoStack();
		Action.redo(); Action.printUndoRedoStack();
		Action.redo(); Action.printUndoRedoStack();
		Action.redo(); Action.printUndoRedoStack();
		b1.execute(); Action.printUndoRedoStack();
		Action.undo(); Action.printUndoRedoStack();
		Action.undo(); Action.printUndoRedoStack();
		Action.undo(); Action.printUndoRedoStack();
		b2.execute(); Action.printUndoRedoStack();
	}
	
	

	class DummyAction1 extends Action{
		private String s;
		public DummyAction1(GameController gc, String s) {
			super(gc);
			this.s = s;
		}
		@Override
		public void doAction() {
			sum += 1;
			System.out.print("  +1 => " + sum);
		}
		@Override
		public void undoAction() {
			sum -= 1;
			System.out.print("  -1 => " + sum);
		}
		@Override
		public String toString() {
			return s;
		}
	}
	
	class DummyAction2 extends Action{
		private String s;
		public DummyAction2(GameController gc, String s) {
			super(gc);
			this.s = s;
		}
		@Override
		public void doAction() {
			sum += 10;
			System.out.print(" +10 => " + sum);
		}
		@Override
		public void undoAction() {
			sum -= 10;
			System.out.print(" -10 => " + sum);
		}
		@Override
		public String toString() {
			return s;
		}
	}
}

