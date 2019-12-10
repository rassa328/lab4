package lab4del2;

public class Multiplikation implements Operation{

	public String symbol() {
		return "*  |";
	}
	// Uträkningsdelen
	public int evaluate(int a, int b) {
		return a*b;
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
