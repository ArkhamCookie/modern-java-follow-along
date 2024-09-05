public class Main {
	public static void main(String[] args) {
		String shortStory = "Everyone lived happily ever after, the end.";
		String title = "The \"Honorable\" Judge Judy";
		String shrug = "¯\\_(ツ)_/¯";
		String letter = "To Whom It May Concern,\n\nI am writing this letter to complain.";
		String conversationWithDog = "";
		String conversationWithInlaws = " ";
		String poem = """
				I met a traveller from an antique land,
				Who said—“Two vast and trunkless legs of stone
				Stand in the desert. . . . Near them, on the sand,
				Half sunk a shattered visage lies, whose frown,
				And wrinkled lip, and sneer of cold command,
				Tell that its sculptor well those passions read
				Which yet survive, stamped on these lifeless things,
				The hand that mocked them, and the heart that fed;
				And on the pedestal, these words appear:
				My name is Ozymandias, King of Kings;
				Look on my Works, ye Mighty, and despair!
				Nothing beside remains. Round the decay
				Of that colossal Wreck, boundless and bare
				The lone and level sands stretch far away.
				""";

		System.out.println(shortStory);
		System.out.println(title);
		System.out.println(shrug);
		System.out.println(letter);
		System.out.println(conversationWithDog);
		System.out.println(conversationWithInlaws);
		System.out.println(poem);

		// Concatenation
		System.out.println("--- Concatenation ---");

		String he = "he";
		String llo = "llo";

		String hello = he + llo;

		System.out.println(hello);

		int numberOfApples = 5;
		double dollars = 1.52;

		String message = "I have " + numberOfApples +
				" apples and $" + dollars + " in my pocket.";

		System.out.println(message);

		// Equality
		System.out.println("--- Equality ---");

		String lyricOne = "Green, Green, Dress";
		String lyricTwo = "Green, Green, Dress";

		boolean areSameLyric = lyricOne.equals(lyricTwo);
		boolean isSongName = lyricOne.equals("Bop Bop");

		System.out.println(areSameLyric);
		System.out.println(isSongName);

		String bow = "bow";
		String wow = "WOW";

		boolean areNotSame = !bow.equals(wow);

		System.out.println(areNotSame);

		// Length
		System.out.println("--- Length ---");

		String fruit = "apple";
		int numberOfChars = fruit.length();

		System.out.println(
			fruit + " is " + numberOfChars + " characters long"
		);

		// Access Individual Characters
		System.out.println("--- Access Individual Characters ---");

		String spy = "loid";

		char l = spy.charAt(0);

		System.out.println(l);

		char i = spy.charAt(3);

		System.out.println(i);

		String assassin = "yor";
		int indexOfR = 2;

		char r = assassin.charAt(indexOfR);
		System.out.println(r);

		// Strings 2
		System.out.println("--- Strings 2 ---");

		message = "Happy Valentines Day";

		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());

		String historicalFigureOne = "St. Valentines";
		String historicalFigureTwo = "st. valentines";

		System.out.println(
			historicalFigureOne.equalsIgnoreCase(historicalFigureTwo)
		);

		message = "";

		System.out.println(
			message.isEmpty()
		);

		String brainSounds = """



			""";

		System.out.println(
			brainSounds.isBlank()
		);

		message = "   Happy Valentines Day.   ";

		System.out.println(
			message.strip()
		);

	}
}