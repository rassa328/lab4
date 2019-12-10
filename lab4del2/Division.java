package lab4del2;

public class Division implements Operation{
	
	public String symbol() {
		return "/  |";
	}
 // Uträkningsdelen
	public int evaluate(int a, int b) {
		if(b == 0){
			return 0;
		}
		else {
		return a/b;
		}
	}
	
	
	// beräknar och bestämmer avståndet mellan varje tal i tabellen
	public String bredd(int rad, int kolumn) {
		int result = kolumn;
		int length = String.valueOf(result).length() + 1;
		
		String str1 = Integer.toString(length);
		return str1;
	}
	
}
