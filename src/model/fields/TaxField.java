package model.fields;

import java.awt.Color;

import control.FieldVisitor;
import gui_fields.GUI_Tax;

public class TaxField extends Field {
	private int taxAmount;
	private int taxRate;

	private TaxField(GUI_Tax guiField, int taxAmount, int taxRate) {
		super(guiField);
		this.taxAmount = taxAmount;
		this.taxRate = taxRate;
	}

	@Override
	public void accept(FieldVisitor v) {
		v.visit(this);
	}
	
	public static TaxField create(int taxAmount, int taxRate, String title, String subText, String description, Color bgColor, Color fgColor){
		GUI_Tax guiField = new GUI_Tax(title, subText, description, bgColor, fgColor);
		TaxField taxField = new TaxField(guiField, taxAmount, taxRate);
		return taxField;
	}
}
