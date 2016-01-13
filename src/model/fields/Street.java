package model.fields;

import java.awt.Color;

import control.Visitor;
import gui_fields.GUI_Street;

public class Street extends Ownable {
	private int[] rents;
	private int noHouses;	

	private Street(GUI_Street guiField, String name, int[] rents, int price, int housePrice) {
		super(guiField, price);
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

	public static Street create(String name, int[] rents, int price, int housePrice,
			String title, String subText, String description, String rent, Color bgColor, Color fgColor) {
		// name != title
		GUI_Street guiField = new GUI_Street(title, subText, description, rent, bgColor, fgColor);
		Street street = new Street(guiField, name, rents, price, housePrice);
		return street;
	}
}
