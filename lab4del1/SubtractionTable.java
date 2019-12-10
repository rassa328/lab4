package lab4;

//ärver ifrån ahritmitctable
public class SubtractionTable extends ArithmeticTable {
	public SubtractionTable(int rad, int kolumn) {
		super(rad, kolumn);
	}
	int evaluate(int x, int y) {
		return x-y;
	}
	String symbol() {
		return "- |";
	}
	
	
	// Beräknar avståndet mellan varje tal i tabellen
		public String bredd(int rad, int kolumn) {
			int result = rad - kolumn;
			int length = String.valueOf(result).length() + 3;
			String str1 = Integer.toString(length); 
			return str1;
			}
}
