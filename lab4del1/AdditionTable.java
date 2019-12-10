package lab4;

//ärver ifrån ahritmitctable
public class AdditionTable extends ArithmeticTable {
	public AdditionTable(int rad, int kolumn) {
		super(rad, kolumn);
	}
	int evaluate(int x, int y) {
		return x+y;
	}
	String symbol() {
		return "+ |";
	}
	
	public String bredd(int rad, int kolumn) {
		int result = rad + kolumn;
		int length = String.valueOf(result).length();
		length = length + 1;
		String str1 = Integer.toString(length); 
		return str1;
		}
}
