public class Main {
	public static void sayHello(String name) {
		System.out.println("Hello, " + name + "!");
	}

	public static void happyBirthday(String name, int age) {
		System.out.println(
			"Happy " + age + "th birthday, " + name + "!"
		);
	}

	public static void eat(final String food) {
		System.out.println("I ate " + food + ".");
	}

	public static void doThing(String word) {
		System.out.println(word);
	}

	public static void doThing(int number) {
		number = number + 5;

		System.out.println(number);
	}

	public static void challengeOne(int size) {
		int totalSize = size;
		int lineSize = size;

		for (; totalSize > 0; totalSize--) {
			lineSize = size;

			for (; lineSize > 0; lineSize--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		System.out.print("\n");
	}

	public static void challengeTwo(int size) {
		if (size < 0) {
			size = size * -1;
		}

		int totalSize = size;
		int lineSize = size;

		for (; totalSize > 0; totalSize--) {
			lineSize = size;

			for (; lineSize > 0; lineSize--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		System.out.print("\n");
	}

	public static void main(String[] args) {
		sayHello("Logan");
		sayHello("Jeff");

		happyBirthday("Jeff", 21);

		eat("cake");

		// Multiple methods can have the same name if they have different arguements,
		// but this seemes like a bad practice.
		doThing("foo");
		doThing(5);

		// Challenge 1
		System.out.println("--- Challenge 1 ---");

		challengeOne(4);
		challengeOne(1);

		// Challenge 2
		System.out.println("--- Challenge 1 ---");

		challengeTwo(4);
		challengeTwo(-3);
	}
}