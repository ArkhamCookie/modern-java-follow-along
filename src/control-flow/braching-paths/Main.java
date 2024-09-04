public class Main {
	public static void main(String[] args) {

		// If
		System.out.println("--- If ---");
		int age = 5;

		if (age < 25) {
			System.out.println("You are too young to rent a car!");
		}

		age = 80;

		if (age < 25) {
			System.out.println("You are too young to rent a car!");
		}

		age = 5;

		// Nested Ifs
		System.out.println("--- Nested Ifs ---");

		if (age < 25) {
			System.out.println("You are too young to rent a car!");
			if (age == 24) {
				System.out.println("(but it was close)");
			}
		}

		age = 24;

		if (age < 25) {
			System.out.println("You are too young to rent a car!");
			if (age == 24) {
				System.out.println("(but it was close)");
			}
		}


		// Else
		System.out.println("--- Else ---");

		age = 30;

		if (age < 25) {
			System.out.println("You cannot rent a car!");
		} else {
			System.out.println("You might be able to rent a car.");
		}

		// Else If
		System.out.println("--- Else If ---");

		boolean cool = true;
		age = 30;

		if (age < 25) {
			System.out.println("You cannot rent a car!");
		} else {
			if (!cool) {
				System.out.println("You failed the vibe check.");
			} else {
				System.out.println("You are rad enough to rent a car.");
			}
		}

		if (age < 25) {
			System.out.println("You cannot rent a car!");
		} else if (!cool) {
			System.out.println("You failed the vibe check.");
		} else {
			System.out.println("You are rad enough to rent a car.");
		}

		if (age < 25) {
			System.out.println("You cannot rent a car!");
		} else if (!cool) {
			System.out.println("You failed the vibe check.");
		} else if (age > 99) {
			System.out.println("You are too old to safely drive a car!");
		} else if (age > 450) {
			System.out.println("There can only be one!");
		} else {
			System.out.println("You are rad enough to rent a car.");
		}

		// Relation to Delayed Assignment
		System.out.println("--- Relation to Delayed Assignment ---");

		age = 22;

		String message;
		if (age > 25) {
			message = "You might be able to rent a car";
		} else {
			message = "You cannot rent a car!";
		}

		System.out.println(message);

		// Conditional Operator
		System.out.println("--- Conditional Operator ---");

		message = age < 25
				? "You cannot rent a car!"
				: "You might be able to rent a car";

		System.out.println(message);


		// Challenge 1
		/*
		 Question:
		 Write code that will outputs "The number is even." if `x` is an even number.
		*/
		System.out.println("--- Challenge 1 ---");

		int x = 6;

		if ((x % 2) == 0) {
			System.out.println("The number is even.");
		}

		// Challenge 2
		/*
		 Question:
		 Make it so that your code from the previous problem will also output "The
		 number is odd." if the number is odd.
		 */
		System.out.println("--- Challenge 2 ---");

		if ((x % 2) == 0) {
			System.out.println("The number is even.");
		} else if ((x % 2) == 1) {
			System.out.println("The number is odd.");
		}

		// Challenge 3
		/*
		 Question:
		 Write code that will output "allowed" if the the password variable is equal to
		 "abc123" and "not allowed" if it isn't.
		 */

		String password = "abc123";

		if (password == "abc123") {
			System.out.println("not allowed");
		} else {
			System.out.println("allowed");
		}

		// Challenge 4
		/*
		 Question:
		 Write code that will assign the string "The number is {x} is even" to `message` if `x` is an even number
		 and "The number is {x} is odd" if `x` is an odd number.

		 So if `x` is 12 the string you should assign "The number 12 is even" to `message`.
		 */
		System.out.println("--- Challenge 3 ---");

		x = 12;

		if ((x % 2) == 0) {
			message = "The number is " + x + " is even.";
		} else if ((x % 2) == 1) {
			message = "The number is " + x + "is odd.";
		}

		System.out.println(message);
	}
}