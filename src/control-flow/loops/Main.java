public class Main {
	public static void main(String[] args) {

		// While
		System.out.println("--- While ---");

		int x = 5;

		while (x != 0) {
			System.out.println(x);
			x--;
		}

		// Endless Loop
		/*
		System.out.println("--- Endless Loops ---");

		while (true) {
			System.out.println("This is the song that never ends!");
		}

		x = 0;

		while (x != 1) {
			System.out.println("It goes on and on my friends.");
		}
		 */


		// Break
		System.out.println("--- Break ---");

		x = 5;

		while (x > 0) {
			if (x == 2) {
				break;
			}
			x--;
		}

		System.out.println("Final value of x is " + x);

		while (true) {
			System.out.println("The people started singing it not knowing what it was");

			break;
		}

		// Continue
		System.out.println("--- Continue ---");

		x = 5;

		while (x > 0) {
			if (x == 4) {
				x--;
				continue;
			}
			System.out.println(x + " is a good number");
			x--;
		}

		// Do
		System.out.println("--- Do ---");

		x = 0;

		do {
			System.out.println("This will run.");
		} while (x != 0);

		while (x != 0) {
			System.out.println("This will not run.");
		}

		// Nested Loops
		System.out.println("--- Nested Loops ---");

		x = 5;
		int y = 3;

		while (x != 0) {
			while (y != 0) {
				System.out.println(
						"x is " + x);
				System.out.println(
						"y is " + y);

				x--;
				y--;
			}

			x--;
		}

		x = 5;
		y = 3;

		while (x != 0) {
			while (y != 0) {
				if (y == 2) {
					break;
				}

				System.out.println(
						"x is " + x);
				System.out.println(
						"y is " + y);

				x--;
				y--;
			}

			x--;
		}

		x = 5;
		y = 3;

		while (x != 0) {
			if (x == 2) {
				break;
			}
			while (y != 0) {

				System.out.println(
						"x is " + x);
				System.out.println(
						"y is " + y);

				x--;
				y--;
			}

			x--;
		}

		// Labeled Break
		System.out.println("--- Labeled Break ---");

		outerLoop: while (true) {
			System.out.println("foo");
			while (true) {
				break outerLoop;
			}
		}

		x = 5;
		y = 3;

		xLoop:
		while(x != 0) {
			while (y != 0) {
				if (x == 2 && y == 2) {
					break xLoop;
				}

				System.out.println("x is " + x);
				System.out.println("y is " + y);

				x--;
				y--;
			}	

			x--;
		}

		System.out.println("done.");

		// Labeled Continue
		System.out.println("--- Labeled Continue ---");

		x = 2;

		outerLoop:
		while (x != 0) {
			System.out.println("inside outer loop");
			x--;
			while (true) {
				System.out.println("inside inner loop");
				continue outerLoop;
			}
		}

		// Iterate over a String
		System.out.println("--- Iterate over a String ---");

		String name = "Logan";

		int index = 0;
		while (index < name.length()) {
			System.out.println(name.charAt(index));
			index++;
		}

		// Challenge 1
		/*
		 Question:
		 Write code that outputs every number from "1" to "10".
		 */
		System.out.println("--- Challenge 1 ---");

		x = 1;

		while (x <= 10) {
			System.out.println(x);
			x++;
		}
	}
}