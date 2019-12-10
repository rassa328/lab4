package lab4del2;

public class Subtraktion implements Operation{
	public String symbol() {
		return "-  |";
	}
 // Yträkningsdelen
	public int evaluate(int a, int b) {
		return a-b;
	}
	
	
	// Beräknar avståndet mellan varje tal i tabellen
	public String bredd(int rad, int kolumn) {
		int result = rad - kolumn;
		int length = String.valueOf(result).length() + 3;
		String str1 = Integer.toString(length); 
		return str1;
		}

}
