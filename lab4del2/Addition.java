package lab4del2;

public class Addition implements Operation{

	public String symbol() {
		return "+  |";
	}
	// beräkningsdelen
	public int evaluate(int a, int b) {
		
		return a+b;
	}
	// beräknar och bestämmer avståndet mellan varje tal i tabellen
	public String bredd(int rad, int kolumn) {
		int result = rad + kolumn;
		int length = String.valueOf(result).length();
		length = length + 1;
		String str1 = Integer.toString(length); 
		return str1;
		}
	
}
	
	

