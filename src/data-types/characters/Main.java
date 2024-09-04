public class Main {
	public static void main(String[] args) {
		char letter = 'a';
		char newline = '\n';
		char backslash = '\\';
		char singleQuote = '\'';

		System.out.println(letter);
		System.out.println(newline);
		System.out.println(backslash);
		System.out.println(singleQuote);

		// Conversion to Intergers
		System.out.println("--- Conversion to Integers ---");

		int valueOfA = 'a';
		
		System.out.println(valueOfA);

		char g = 'g';

		// All the letters from a to z have consecutive numeric values.
		boolean isLetter = g >= 'a' && g <= 'z';

		System.out.println(isLetter);

		// Conversion from Intergers
		System.out.println("--- Conversion from Integers ---");

		int x = 120;
		char xAsChar = (char) x;

		System.out.println(xAsChar);

		char z = 122;
		
		System.out.println(z);
	}
}