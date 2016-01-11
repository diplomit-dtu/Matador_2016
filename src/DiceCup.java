
public class DiceCup {
	private Dice d1, d2;
	
	public DiceCup(){
		d1 = new Dice();
		d2 = new Dice();
		roll();
	}

	public DiceCup roll() {
		d1.roll();
		d2.roll();
		return this;
	}

	public Dice getD1() {
		return d1;
	}

	public Dice getD2() {
		return d2;
	}
	
	public int getSum(){
		return d1.getValue() + d2.getValue();
	}
	
	public boolean isSame(){
		return d1.getValue() == d2.getValue();
	}
}
