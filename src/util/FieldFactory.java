package util;
import java.awt.Color;

import gui_fields.GUI_Field;
import model.fields.ChanceField;
import model.fields.Field;
import model.fields.Refuge;
import model.fields.Shipping;
import model.fields.Street;
import model.fields.TaxField;

public class FieldFactory {

	@SuppressWarnings("unused")
	public static Field[] makefields(GUI_Field[] guiFields){
		final String PIC = GameConstants.getDefaultPicture();
		int[] rent;
		int price, housePrice, baseRent, taxAmount, taxRate;
		String title, subtext, desc, name, rentStr;
		Color bg, fg;
		Field[] fields = {
				/*  0 */ Refuge.createRefuge(PIC, title="Start", subtext="Modtag: 200", desc="Modtag kr. 200,-\nnår de passerer start", bg=Color.RED, fg=Color.BLACK),
				/*  1 */ Street.create(name="Rødovrevej", rent = new int[] {50,250,750,2250,4000,6000}, price=1200, housePrice=1000,
							title="Rødovrevej", subtext="Pris: "+price, desc="Rødovrevej", rentStr="Leje: "+rent[0], bg=new Color(75, 155, 225), fg=Color.BLACK),
				/*  2 */ ChanceField.create(title="?", subtext="Prøv lykken", desc="Ta' et chancekort.", bg=new Color(204, 204, 204), fg=Color.BLACK),
				/*  3 */ Street.create(name="Hvidovrevej", rent = new int[] {50,250,750,2250,4000,6000}, price=1200, housePrice=1000,
							title="Hvidovrevej", subtext="Pris: "+price, desc="Hvidovrevej", rentStr="Leje: "+rent[0], bg=new Color(75, 155, 225), fg=Color.BLACK),
				/*  4 */ TaxField.create(taxAmount=4000, taxRate=10, 
							title="Betal\nindkomst-\nskat", subtext=taxRate+"% el. "+taxAmount, desc="Betal indkomstskat\n"+taxRate+"% eller kr. "+taxAmount+",-", 
							bg=Color.GRAY, fg=Color.BLACK),
				/*  5 */ Shipping.create(price=4000, baseRent=500, 
							PIC, title="Øresund", subtext="Pris: "+baseRent, desc="Øresundsredderiet", rentStr="Leje: "+baseRent, bg=Color.WHITE, fg=Color.BLACK),
				/*  6 */ Street.create(name="Roskildevej", rent = new int[] {100,600,1800,5400,8000,11000}, price=2000, housePrice=1000,
							title="Roskildevej", subtext="Pris: "+price, desc="Roskildevej", rentStr="Leje: "+rent[0], bg=new Color(255, 135, 120), fg=Color.BLACK),
				/*  7 */ ChanceField.create(title="?", subtext="Prøv lykken", desc="Ta' et chancekort.", bg=new Color(204, 204, 204), fg=Color.BLACK),
				/*  8 */ Street.create(name="Valby Langgade",rent = new int[] {100,600,1800,5400,8000,11000},  price=2000, housePrice=1000,
							title="Valby\nLanggade", subtext="Pris: "+price, desc="Valby Langgade", rentStr="Leje: "+rent[0], bg=new Color(255, 135, 120), fg=Color.BLACK),
				/*  9 */ Street.create(name="Allégade", rent = new int[] {150,800,2000,6000,9000,12000}, price=2400, housePrice=1000,
							title="Allégade", subtext="Pris: "+price, desc="Allégade", rentStr="Leje: "+rent[0], bg=new Color(255, 135, 120), fg=Color.BLACK),
				/* 10 */ Refuge.createJail(PIC, title="Fængsel", subtext="Fængsel", desc="På besøg i fængslet", bg=new Color(125, 125, 125), fg=Color.BLACK),
				/* 11 */ Street.create(name="Frederiksberg allé",rent = new int[] {200,1000,3000,9000,12500,15000},  price=2800, housePrice=2000,
							title="Frederiks-\nberg Allé", subtext="Pris: "+price, desc="Frederiksberg Allé", rentStr="Leje: "+rent[0], bg=new Color(102, 204, 0), fg=Color.BLACK),
//				/* 12 */ new Brewery("Tuborg", 3000, 100),	
				/* 13 */ Street.create(name="Bülowsvej", rent = new int[] {200,1000,3000,9000,12500,15000}, price=2800, housePrice=2000,
							title="Bülowsvej", subtext="Pris: "+price, desc="Bülowsvej", rentStr="Leje: "+rent[0], bg=new Color(102, 204, 0), fg=Color.BLACK),
				/* 14 */ Street.create(name="Gl. Kongevej", rent = new int[] {250,1250,3750,10000,14000,18000}, price=3200, housePrice=2000,
							title="Gammel Kongevej", subtext="Pris: "+price, desc="Gammel Kongevej", rentStr="Leje: "+rent[0], bg=new Color(102, 204, 0), fg=Color.BLACK),
//				/* 15 */ new Shipping("D.F.D.S.", 4000, 500),
				/* 16 */ Street.create(name="Bernstorffvej", rent = new int[] {300,1400,4000,11000,15000,19000}, price=3600, housePrice=2000,
							title="Bernstorffsvej", subtext="Pris: "+price, desc="Bernstorffsvej", rentStr="Leje: "+rent[0], bg=new Color(153, 153, 153), fg=Color.BLACK),
				/* 17 */ ChanceField.create(title="?", subtext="Prøv lykken", desc="Ta' et chancekort.", bg=new Color(204, 204, 204), fg=Color.BLACK),
				/* 18 */ Street.create(name="Hellerupvej", rent = new int[] {300,1400,4000,11000,15000,19000}, price=3600, housePrice=2000,
							title="Hellerupvej", subtext="Pris: "+price, desc="Hellerupvej", rentStr="Leje: "+rent[0], bg=new Color(153, 153, 153), fg=Color.BLACK),
				/* 19 */ Street.create(name="Strandvejen", rent = new int[] {350,1600,4400,12000,16000,20000}, price=4000, housePrice=2000,
							title="Strandvejen", subtext="Pris: "+price, desc="Strandvejen", rentStr="Leje: "+rent[0], bg=new Color(153, 153, 153), fg=Color.BLACK),
				/* 20 */ Refuge.createRefuge(PIC, "Parkering", "Parkering", "Ta' en pause", Color.WHITE, Color.BLACK),
				/* 21 */ Street.create(name="Trianglen", rent = new int[] {350,1800,5000,14000,17500,21000}, price=4400, housePrice=3000,
							title="Trianglen", subtext="Pris: "+price, desc="Trianglen", rentStr="Leje: "+rent[0], bg=Color.RED, fg=Color.BLACK),
				/* 22 */ ChanceField.create(title="?", subtext="Prøv lykken", desc="Ta' et chancekort.", bg=new Color(204, 204, 204), fg=Color.BLACK),
				/* 23 */ Street.create(name="Østerbrogade", rent = new int[] {350,1800,5000,14000,17500,21000}, price=4400, housePrice=3000,
							title="Østerbro-\ngade", subtext="Pris: "+price, desc="Østerbrogade", rentStr="Leje: "+rent[0], bg=Color.RED, fg=Color.BLACK),
				/* 24 */ Street.create(name="Grønningen", rent = new int[] {400,2000,6000,15000,18500,22000}, price=4800, housePrice=3000,
							title="Grønningen", subtext="Pris: "+price, desc="Grønningen", rentStr="Leje: "+rent[0], bg=Color.RED, fg=Color.BLACK),
//				/* 25 */ new Shipping("Ø.S.", 4000, 500),
				/* 26 */ Street.create(name="Bredegade", rent = new int[] {450,2200,6600,16000,19500,23000}, price=5200, housePrice=3000,
							title="Bredgade", subtext="Pris: "+price, desc="Bredgade", rentStr="Leje: "+rent[0], bg=Color.WHITE, fg=Color.BLACK),
				/* 27 */ Street.create(name="Kgs. Nytorv", rent = new int[] {450,2200,6600,16000,19500,23000}, price=5200, housePrice=3000,
							title="Kgs. Nytorv", subtext="Pris: "+price, desc="Kongens Nytorv", rentStr="Leje: "+rent[0], bg=Color.WHITE, fg=Color.BLACK),
//				/* 28 */ new Brewery("Carlsberg", 3000, 100),
				/* 29 */ Street.create(name="Østergade", rent = new int[] {500,2400,7200,17000,20500,24000}, price=5600, housePrice=3000,
							title="Østergade", subtext="Pris: "+price, desc="Østergade", rentStr="Leje: "+rent[0], bg=Color.WHITE, fg=Color.BLACK),
//				/* 30 */ new GoToJailField("Gå i fængsel"),
				/* 31 */ Street.create(name="Amagertorv", rent = new int[] {550,2600,7800,18000,22000,25000}, price=6000, housePrice=4000,
							title="Amagertorv", subtext="Pris: "+price, desc="Amagertorv", rentStr="Leje: "+rent[0], bg=new Color(255, 255, 50), fg=Color.BLACK),
				/* 32 */ Street.create(name="Vimmelskaftet", rent = new int[] {550,2600,7800,18000,22000,25000}, price=6000, housePrice=4000,
							title="Vimmel-\nskaftet", subtext="Pris: "+price, desc="Vimmelskaftet", rentStr="Leje: "+rent[0], bg=new Color(255, 255, 50), fg=Color.BLACK),
				/* 33 */ ChanceField.create(title="?", subtext="Prøv lykken", desc="Ta' et chancekort.", bg=new Color(204, 204, 204), fg=Color.BLACK),
				/* 34 */ Street.create(name="Nygade", rent = new int[] {600,3000,9000,20000,24000,28000}, price=6400, housePrice=4000,
							title="Nygade", subtext="Pris: "+price, desc="Nygade", rentStr="Leje: "+rent[0], bg=new Color(255, 255, 50), fg=Color.BLACK),
//				/* 35 */ new Shipping("Bornholm", 4000, 500),
				/* 36 */ ChanceField.create(title="?", subtext="Prøv lykken", desc="Ta' et chancekort.", bg=new Color(204, 204, 204), fg=Color.BLACK),
				/* 37 */ Street.create(name="Frederiksberggade", rent = new int[] {700,3500,10000,22000,26000,30000}, price=7000, housePrice=4000,
							title="Frederiks-\nberggade", subtext="Pris: "+price, desc="Frederiksberggade", rentStr="Leje: "+rent[0], bg=new Color(150, 60, 150), fg=Color.WHITE),
				/* 38 */ TaxField.create(taxAmount=2000, taxRate=-1, 
							"Ekstra-\nordinær\nstatsskat", "Betal "+taxAmount, "Betal ekstraordinær\nstatsskat: kr. "+taxAmount+",-", Color.GRAY, Color.BLACK),
				/* 39 */ Street.create(name="Rådhuspladsen", rent = new int[] {1000,4000,12000,28000,34000,40000}, price=8000, housePrice=4000,
							title="Rådhuspladsen", subtext="Pris: "+price, desc="Rådhuspladsen", rentStr="Leje: "+rent[0], bg=new Color(150, 60, 150), fg=Color.WHITE)
		};
		return fields;
	}
}
