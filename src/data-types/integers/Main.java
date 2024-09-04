public class Main {
	public static void main(String[] args) {
		int basicInt = 1;

		System.out.println("basicInt = " + basicInt);

		// Create vars
		int x;
		int y;
		int z;

		// Addition
		System.out.println("--- Addition ---");

		x = 5;
		y = x + 1;
		z = x + y;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		x = 5;
		y = x + -4;

		System.out.println(y);

		// Subtraction
		System.out.println("--- Subtraction ---");

		x = 5;
		y = x - 1;
		z = x - y;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		x = 5;
		y = x - -4;

		System.out.println(y);

		// Multiplication
		System.out.println("--- Multiplication ---");

		x = 5;
		y = x * 5;
		z = x * y;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		// Division
		System.out.println("--- Division ---");

		x = 8;
		y = x / 2;

		System.out.println(x);
		System.out.println(y);

		// Division with integers gives results in only the quotient of the result, not
		// the remainder.

		x = 5 / 2; // 2
		y = 13 / 3; // 4

		System.out.println(x);
		System.out.println(y);

		// Remainder
		// (remainder of the division between two integers)
		System.out.println("--- Remainder ---");

		x = 8;
		y = x % 3; // 2
		z = x % 2; // 0

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		// Comparison
		System.out.println("--- Comparison ---");

		boolean universeBroken = 1 == 2; // false

		System.out.println(universeBroken);

		int loneliestNumber = 1;
		int otherLonelyNumber = 2;

		boolean bothLonely = loneliestNumber == (otherLonelyNumber - 1); // true

		System.out.println(bothLonely);

		boolean universeOkay = 1 != 2; // true
		System.out.println(universeOkay);

		// Setup vars
		boolean willBeTrue;
		boolean willBeFalse;

		willBeTrue = 5 > 2;
		willBeFalse = 2 > 5;

		System.out.println(willBeTrue);
		System.out.println(willBeFalse);

		willBeFalse = 5 < 2;
		willBeTrue = 2 < 5;

		System.out.println(willBeTrue);
		System.out.println(willBeFalse);

		willBeTrue = 5 >= 5; // true
		willBeFalse = 5 > 5; // false

		System.out.println(willBeTrue);
		System.out.println(willBeFalse);

		willBeTrue = 5 <= 5; // true
		willBeFalse = 5 < 5; // false

		System.out.println(willBeTrue);
		System.out.println(willBeFalse);

		// Chain comparsion
		boolean xInRange = 0 < x && x < 5;

		System.out.println(xInRange);

		// Order of Operation
		System.out.println("--- Order of Operation ---");

		// Follows PEMDAS
		int result = 2 * 3 + 3 * 9 / 2 - 2; // 17
		System.out.println(result);

		// The == check happens last.
		boolean areThingsSame = 3 * (4 - 1 + 3) * 4 == 5 * 3 + 1 * 3 * 9;
		System.out.println(areThingsSame);

		// Reassignment
		System.out.println("--- Reassignment ---");
		x = x + 1; // 9

		System.out.println(x);

		// Shorthand reassignments
		x += 1; // 10
		x -= 2; // 8
		x *= 2; // 16
		x /= 4; // 4
		x %= 3; // 1

		x++; // 2
		x--; // 1

		System.out.println(x);

		// Challenge 3
		/*
		 * Question:
		 * Make it so that this program correctly determines if the numbers are even or
		 * not.
		 */
		System.out.println("--- Challenge 3 ---");

		x = 5;
		y = 4;
		z = 98;

		boolean xIsEven = x % 2 == 0;
		System.out.println(xIsEven);

		boolean yIsEven = y % 2 == 0;
		System.out.println(yIsEven);

		boolean zIsEven = z % 2 == 0;
		System.out.println(zIsEven);
	}	
}
