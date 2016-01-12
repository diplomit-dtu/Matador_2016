package model.fields;

import control.Visitor;
import model.Player;

public abstract class Ownable extends Field {
	private int price;
	private Player owner = null;
	
	
	public Ownable(String name, int price) {
		super(name);
		this.price = price;
	}

	@Override
	public abstract void accept(Visitor v);

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
