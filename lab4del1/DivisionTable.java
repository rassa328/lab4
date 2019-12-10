package lab4;

//ärver ifrån ahritmitctable
public class DivisionTable extends ArithmeticTable {
	public DivisionTable(int rad, int kolumn) {
		super(rad, kolumn);
	}
	// Beräkningsdelen
	int evaluate(int x, int y) {
		
		if(y == 0) {
			return 0;
		}
		else {
			return x/y;
		}
	}
	String symbol() {
		return "/ |";
	}
	// Beräknar radasvtåndet mellan varje tal i tabellen
	public String bredd(int rad, int kolumn) {
		int result = kolumn;
		int length = String.valueOf(result).length() + 1;
		
		String str1 = Integer.toString(length);
		return str1;
	}
}
