package model.fields;

import control.Visitor;

public class Street extends Ownable {

	private int[] rents;
	private int noHouses;	

	public Street(int[] rents, String name, int price) {
		super(name,price);
		this.rents = rents;

	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);		
	}
	
	public boolean addHouse(){
		if (noHouses>=rents.length) return false;
		noHouses++;
		return true;
		
	}
	public boolean removeHouse(){
		if (noHouses<=0) return false;
		noHouses--;
		return true;
	}
	
	public int getRent() {
		return rents[noHouses];
	}

}
