public class Main {
	public static void main(String[] args) {
		int[] oddNumbers = { 1, 3, 5, 7, 9 };
		char[] letters = { 'a', 'b', 'c' };
		String[] words = { "its", "as", "easy", "as" };
		double[] doubles = { 97.0, 98.0, 99.0, 1.0, 2.0, 3.0 };

		System.out.println(oddNumbers);
		System.out.println(letters);
		System.out.println(words);
		System.out.println(doubles);

		// Length
		System.out.println("--- Length ---");

		String[] veggies = { "brussels", "cabbage", "carrots" };
		int numberOfElements = veggies.length;

		System.out.println(
			"veggies is " + numberOfElements + " characters long"
		);

		// Access Individual Elements
		System.out.println("--- Access Individual Elements ---");

		String[] lyrics = { "you", "say", "goodbye" };

		String you = lyrics[0];
		String say = lyrics[1];
		String goodbye = lyrics[2];

		System.out.println(you);
		System.out.println(say);
		System.out.println(goodbye);

		int index = 2;

		System.out.println(lyrics[index]);

		// Set Individual Elements
		System.out.println("--- Set Individual Elements ---");

		String[] sentance = { "you", "are", "found", "guilty" };

		sentance[1] = "aren't";

		// Reassignment
		System.out.println("--- Reassignment ---");

		int[] numbers = { 1, 2 };

		System.out.println(numbers.length);

		numbers = new int[] { numbers[0], numbers[1], 3 };

		System.out.println(numbers.length);

		char wordOne[] = { 'g', 'o' };
		char wordTwo[] = wordOne;

		System.out.println(wordOne);
		System.out.println(wordTwo);

		wordOne = new char[] { wordOne[0], wordOne[1], 's', 'h' };

		System.out.println(wordOne);
		System.out.println(wordTwo);

		wordTwo[0] = 'n';

		System.out.println(wordOne);
		System.out.println(wordTwo);

		// Relation to Final Variables
		System.out.println("--- Relation to Final Variables ---");

		final char[] catchphrase = { 'w', 'o', 'a', 'h', '!' };

		System.out.println(catchphrase);

		// Printing the Contents of an Array
		System.out.println("--- Printing the Contents of an Array ---");

		String[] factions = { "empire", "stormcloaks", "dragons" };

		index = 0;
		while (index < factions.length) {
    		System.out.println(factions[index]);
    		index++;
		}
	}
}