package model.fields;

import control.FieldVisitor;
import gui_fields.GUI_Ownable;
import model.Player;

public abstract class Ownable extends Field {
	private int price;
	private Player owner = null;
	
	public Ownable(GUI_Ownable guiField, int price) {
		super(guiField);
		this.price = price;
	}

	@Override
	public abstract void accept(FieldVisitor v);

	public int getPrice() {
		return price;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public boolean isOwned(){
		return owner!=null;
	}

}
