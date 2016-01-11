package test;

import control.Action;
import control.GameController;

public class ActionTest {
	int sum = 0;

	public static void main(String[] args) {
		new ActionTest();
	}
	
	public ActionTest(){
		Action a1 = new DummyAction1(null);
		Action a2 = new DummyAction1(null);
		Action a3 = new DummyAction1(null);
		Action a4 = new DummyAction1(null);
		Action a5 = new DummyAction1(null);
		Action b1 = new DummyAction2(null);
		Action b2 = new DummyAction2(null);
		Action b3 = new DummyAction2(null);
		Action b4 = new DummyAction2(null);
		Action b5 = new DummyAction2(null);
		
		String str = "";
		a1.execute(); str += " +1 ";
		a2.execute(); str += " +1 ";
		a3.execute(); str += " +1 ";
		Action.undo(); str += " <- ";
		b1.execute(); str += " +10 ";
		Action.undo(); str += " <- ";
		Action.undo(); str += " <- ";
		b2.execute(); str += " +10 ";
		System.out.println(str);
	}

	class DummyAction1 extends Action{
		public DummyAction1(GameController gc) {
			super(gc);
		}
		@Override
		public void doAction() {
			sum += 1;
			System.out.println(sum);
		}
		@Override
		public void undoAction() {
			sum -= 1;
			System.out.println(sum);
		}
	}
	
	class DummyAction2 extends Action{
		public DummyAction2(GameController gc) {
			super(gc);
		}
		@Override
		public void doAction() {
			sum += 10;
			System.out.println(sum);
		}
		@Override
		public void undoAction() {
			sum -= 10;
			System.out.println(sum);
		}
	}
}

