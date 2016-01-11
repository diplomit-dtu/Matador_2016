package model;

public class Dice {
	private int value;
	
	public Dice(){
		roll();
	}

	public Dice roll() {
		value = (int)(Math.random()*6 + 1);
		return this;
	}
	
	public int getValue(){ return value; }
}
