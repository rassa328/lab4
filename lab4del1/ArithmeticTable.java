package lab4;

public abstract class ArithmeticTable {
	int thisRad;
	int thisKolumn;
	
	public ArithmeticTable(int rad, int kolumn) {
		thisRad = rad;
		thisKolumn = kolumn;
	}
	
	
	// Skelettet till varje tabell som kommer att ärva
	abstract int evaluate(int x, int y); // denna abstrakta metod kommer att vara skelettet till utträkning för varje tabell
	abstract String symbol(); // skriver ut vilken operand det kommer vara 
	abstract String bredd(int x, int y); //metoden räknar ut bredd
	
	public void print() {
		
//LOGIK FÖR ATT SKRIVA UT TABELL OCH BERÄKNA ELEMENT I TABELL	
	
		// Bestämmer radavståndet mellan varje tal i tabellen
		String formatD = ("%" + bredd(thisRad, thisKolumn) + "d");
		String formatS = ("%" + bredd(thisRad, thisKolumn) + "s");
		
		
		//skriver ut första raden
		for(int i = 0; i<=thisKolumn; i++)
		{
			if(i == 0){
				System.out.printf("%4s", symbol());
			}
			System.out.printf(formatD, i);
			
		}
		
		System.out.println();
		System.out.print("---+");	
		
		//Skriver ut rätt antal -. Antal kolumner * bredd på rutorna
		for(int i = 0; i<= this.thisKolumn; i++) {
			//int i = Integer.parseInt(myString);
			for(int j = 0; j< Integer.parseInt(bredd(thisRad, thisKolumn)); j++) {
				System.out.print("-");
			}
		}
		System.out.println();
		
		
		
		for(int i = 0; i <= thisRad; i++)
		{
			
			for(int x = 0; x<= thisKolumn+1; x++)
			{
				if(x == 0) {
					System.out.printf("%2d",i);
					System.out.printf("%2s", "|");
				}
				else {
					System.out.printf(formatD, evaluate(x-1,i));
				}
				
			}
		
		System.out.println();
		
		}
	

	
	}

}
