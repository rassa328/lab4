package lab4;

//ärver ifrån ahritmitctable
public class MultiplicationTable extends ArithmeticTable{	
	public MultiplicationTable(int rad, int kolumn) {
		super(rad,kolumn);
	}

	// Beräkningsdelen
	int evaluate(int x, int y) {
		return x*y;
	}
	String symbol() {
		return "* |";
	}
	
	// Räknar ut bredden mellan varje tal
		public String bredd(int rad, int kolumn) {
			int result = rad * kolumn;
			int length = String.valueOf(result).length();
			length = length + 1;
			String str1 = Integer.toString(length); 
			return str1;
			}

}
		
