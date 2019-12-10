package lab4del2;

public  class ArithmeticTable {
	int thisRad;
	int thisKolumn;
	Operation operation; 
	
	//konstruktör för arithmitctable
	public ArithmeticTable(Operation op, int rad, int kolumn) {
		//sparar värderna som den får in
		thisRad = rad;
		thisKolumn = kolumn;
		operation = op;
		//kör metoden print
		this.print();
	}
	
	
	
	
	
	public void print() {	
		//sparar 2 strings som t.ex "%5d". Används för att bestämma bredden mellan talen
		String formatD = ("%" + operation.bredd(thisRad, thisKolumn) + "d");
		String formatS = ("%" + operation.bredd(thisRad, thisKolumn) + "s");
		
		//skriver ut första raden
		for(int i = 0; i<=thisKolumn; i++)
		{
			if(i == 0){
				//skriver symbolen
				System.out.printf("%4s", operation.symbol());
			}
			//skriver ut siffrorna
			System.out.printf(formatD, i);	
		}
		
		System.out.println();
		System.out.print("---+");	
		
		//Skriver ut rätt antal -. Antal kolumner * bredd på rutorna
		for(int i = 0; i<= this.thisKolumn; i++) {
			//int i = Integer.parseInt(myString);
			for(int j = 0; j< Integer.parseInt(operation.bredd(thisRad, thisKolumn)); j++) {
				System.out.print("-");
			}
		}
		System.out.println();
		
		
		//skriver ut resultatet av vår operation genom att skriva ut en rad i taget
		for(int i = 0; i <= thisRad; i++)
		{
			
			for(int x = 0; x<= thisKolumn+1; x++)
			{
				if(x == 0) {
					System.out.printf("%2d",i);
					System.out.printf("%2s", "|");
				}
				else {
					// Skriver ut beräkningen in i tabellen
					System.out.printf(formatD, operation.evaluate(x-1,i));
				}
				
			}
			
		System.out.println();
		
		}
	}

}
