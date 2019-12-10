package lab4del2;

public class Main {

	public static void main(String[] args) {
		
		
		//det vi ska skicka in i arithmetictable
		int xRows = 3;
		int yColumn = 9;
		char symbol = '-';
		
		
		
		//deklarerar en op och arithmetictable
		Operation op;
		ArithmeticTable table;
		
		//en switch beroende på våran symbol
		switch(symbol) {
		case('*'):
			//bestämmer op som mult
			op = new Multiplikation();
			//skapar en ny tabell med värderna 
			table = new ArithmeticTable(op, xRows, yColumn);
			break;//	public int linje(int a, int b);

		case('-'):
			op = new Subtraktion();
			table = new ArithmeticTable(op, xRows, yColumn);
			break;
		case('+'):
			op = new Addition();
			table = new ArithmeticTable(op, xRows, yColumn);
			break;
		case('/'):
			op = new Division();
			table = new ArithmeticTable(op, xRows, yColumn);
			break;
		}
		 
//		
//	Operation multi = new Multiplikation();
//	Operation div = new Division();
//	Operation add = new Addition();
//	Operation sub = new Subtraktion();
//	
//		ArithmeticTable table = new ArithmeticTable(multi,xRows,11);
//		table.print();
//		System.out.println();
//		
//		ArithmeticTable table1 = new ArithmeticTable(div,12,11);
//		table1.print();
//		System.out.println();
//		
//		ArithmeticTable table2 = new ArithmeticTable(add,12,11);
//		table2.print();
//		System.out.println();
//
//		ArithmeticTable table3 = new ArithmeticTable(sub,12,11);
//		table3.print();
//		System.out.println();	
	}
}
