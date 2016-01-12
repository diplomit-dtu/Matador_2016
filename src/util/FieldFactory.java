package util;
import gui_fields.GUI_Field;
import model.fields.Brewery;
import model.fields.ChanceField;
import model.fields.Field;
import model.fields.GoToJailField;
import model.fields.Refuge;
import model.fields.Shipping;
import model.fields.Street;
import model.fields.TaxField;

public class FieldFactory {

	public static Field[] makefields(GUI_Field[] guiFields){
		int i = 0;
		Field[] fields = new Field[40];
		fields[i++] = 
		
			/*  0 */ new Refuge("Start"),
			/*  1 */ new Street(new int[] {50,250,750,2250,4000,6000}, "Rødovrevej", 1200, 1000),
			/*  2 */ new ChanceField("?"),
			/*  3 */ new Street(new int[] {50,250,750,2250,4000,6000}, "Hvidovrevej", 1200, 1000),
			/*  4 */ new TaxField("Betal\nindkomst-\nskat"),
			/*  5 */ new Shipping("Øresund", 4000, 500) ,
			/*  6 */ new Street(new int[] {100,600,1800,5400,8000,11000}, "Roskildevej", 2000, 1000),
			/*  7 */ new ChanceField("?"),
			/*  8 */ new Street(new int[] {100,600,1800,5400,8000,11000}, "Valby Langgade", 2000, 1000),
			/*  9 */ new Street(new int[] {150,800,2000,6000,9000,12000}, "Allégade", 2400, 1000),
			/* 10 */ new Refuge("Fængsel"),
			/* 11 */ new Street(new int[] {200,1000,3000,9000,12500,15000}, "Frederiksberg allé", 2800, 2000),
			/* 12 */ new Brewery("Tuborg", 3000, 100),	
			/* 13 */ new Street(new int[] {200,1000,3000,9000,12500,15000}, "Bülowsvej", 2800, 2000),
			/* 14 */ new Street(new int[] {250,1250,3750,10000,14000,18000}, "Gl. Kongevej", 3200, 2000),
			/* 15 */ new Shipping("D.F.D.S.", 4000, 500),
			/* 16 */ new Street(new int[] {300,1400,4000,11000,15000,19000}, "Bernstorffvej", 3600, 2000),
			/* 17 */ new ChanceField("?"),
			/* 18 */ new Street(new int[] {300,1400,4000,11000,15000,19000}, "Hellerupvej", 3600, 2000),
			/* 19 */ new Street(new int[] {350,1600,4400,12000,16000,20000}, "Strandvejen", 4000, 2000),
			/* 20 */ new Refuge("Parkering"),
			/* 21 */ new Street(new int[] {350,1800,5000,14000,17500,21000}, "Trianglen", 4400, 3000),
			/* 22 */ new ChanceField("?"),
			/* 23 */ new Street(new int[] {350,1800,5000,14000,17500,21000}, "Østerbrogade", 4400, 3000),
			/* 24 */ new Street(new int[] {400,2000,6000,15000,18500,22000}, "Grønningen", 4800, 3000),
			/* 25 */ new Shipping("Ø.S.", 4000, 500),
			/* 26 */ new Street(new int[] {450,2200,6600,16000,19500,23000}, "Bredegade", 5200, 3000),
			/* 27 */ new Street(new int[] {450,2200,6600,16000,19500,23000}, "Kgs. Nytorv", 5200, 3000),
			/* 28 */ new Brewery("Carlsberg", 3000, 100),
			/* 29 */ new Street(new int[] {500,2400,7200,17000,20500,24000}, "Østergade", 5600, 3000),
			/* 30 */ new GoToJailField("Gå i fængsel"),
			/* 31 */ new Street(new int[] {550,2600,7800,18000,22000,25000}, "Amagertorv", 6000, 4000),
			/* 32 */ new Street(new int[] {550,2600,7800,18000,22000,25000}, "Vimmelskaftet", 6000, 4000),
			/* 33 */ new ChanceField("?"),
			/* 34 */ new Street(new int[] {600,3000,9000,20000,24000,28000}, "Nygade", 6400, 4000),
			/* 35 */ new Shipping("Bornholm", 4000, 500),
			/* 36 */ new ChanceField("?"),
			/* 37 */ new Street(new int[] {700,3500,10000,22000,26000,30000}, "Frederiksberggade", 7000, 4000),
			/* 38 */ new TaxField("Ekstra-\nordinær\nstatsskat"),
			/* 39 */ new Street(new int[] {1000,4000,12000,28000,34000,40000}, "Rådhuspladsen ", 8000, 4000)
		};
		return fields;
	}
}
