package lab4;

public class Main {

	public static void main(String[] args) {
		
		
		
		// Styr switchen
		char symbol = '/';
		// bestämmer värdena som ska skickas in i konstruktören
		int xRows = 5;
		int yRows = 5;
		
		
		
		switch(symbol) {
		
		case('*'): 
		ArithmeticTable multTable = new MultiplicationTable(xRows,yRows);
		multTable.print();
		break;
		
		case('+'):
		ArithmeticTable addTable = new AdditionTable(xRows,yRows);
		addTable.print();
		break;

		case('-'):
		ArithmeticTable subTable = new SubtractionTable(xRows,yRows);
		subTable.print();
		break;

		case('/'):
		ArithmeticTable divTable = new DivisionTable(xRows,yRows);
		divTable.print();
		break;
		}
	}
}
