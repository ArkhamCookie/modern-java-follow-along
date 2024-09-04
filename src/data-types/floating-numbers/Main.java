public class Main {
	public static void main(String[] args) {
		int basicInt = 1;
		double basicFloatingNumber = 1.1;
		double alsoBasicFloatingNumber = basicInt + basicFloatingNumber;

		System.out.println("alsoBasicFloatingNumber = " + alsoBasicFloatingNumber);

		// Create vars
		double x;
		double y;
		double z;

		// Addition
		System.out.println("--- Addition ---");

		x = 5.1;
		y = x + 1.1;
		z = x + y;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		x = 5.1;
		y = x + -4.1;

		System.out.println(y);

		// Subtraction
		System.out.println("--- Subtraction ---");

		x = 5.1;
		y = x - 1;
		z = x - y;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		x = 5.1;
		y = x - -4;

		System.out.println(y);

		// Multiplication
		System.out.println("--- Multiplication ---");

		x = 5.1;
		y = x * 5.1;
		z = x * y;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		// Division
		System.out.println("--- Division ---");

		x = 8;
		y = x / 2.3;

		System.out.println(x);
		System.out.println(y);

		x = 5.1 / 2.3;
		y = 13 / 3;

		System.out.println(x);
		System.out.println(y);

		// Comparison
		System.out.println("--- Comparison ---");

		boolean universeBroken = 1 == 2.3; // false

		System.out.println(universeBroken);

		double loneliestNumber = 1;
		double otherLonelyNumber = 2.3;

		boolean bothLonely = loneliestNumber == (otherLonelyNumber - 1); // true

		System.out.println(bothLonely);

		boolean universeOkay = 1 != 2.3; // true
		System.out.println(universeOkay);

		// Setup vars
		boolean willBeTrue;
		boolean willBeFalse;

		willBeTrue = 5.1 > 2.3;
		willBeFalse = 2.3 > 5.1;

		System.out.println(willBeTrue);
		System.out.println(willBeFalse);

		willBeFalse = 5.1 < 2.3;
		willBeTrue = 2.3 < 5.1;

		System.out.println(willBeTrue);
		System.out.println(willBeFalse);

		willBeTrue = 5.1 >= 5.1; // true
		willBeFalse = 5.1 > 5.1; // false

		System.out.println(willBeTrue);
		System.out.println(willBeFalse);

		willBeTrue = 5.1 <= 5.1; // true
		willBeFalse = 5.1 < 5.1; // false

		System.out.println(willBeTrue);
		System.out.println(willBeFalse);

		// Chain comparsion
		boolean xInRange = 0 < x && x < 5.1;

		System.out.println(xInRange);

		// Reassignment
		System.out.println("--- Reassignment ---");
		x = x + 1;

		System.out.println(x);

		// Shorthand reassignments
		x += 1;
		x -= 2.3;
		x *= 2.3;
		x /= 4;

		x++;
		x--;

		System.out.println(x);

		// NaN
		System.out.println("--- NaN ---");

		double nan = 0.0 / 0.0;

		System.out.println(nan);

		// All will be false
		System.out.println(nan == nan);
		System.out.println(nan > nan);
		System.out.println(nan < nan);
		System.out.println(nan < 5);
		System.out.println(nan > 5);
		System.out.println(nan == 5);

		// Infinity
		double positiveInfinity = 1.0 / 0.0;
		double negativeInfinity = 1.0 / -0.0;

		System.out.println(positiveInfinity > 99999999); // true
		System.out.println(negativeInfinity < -99999999); // true

		System.out.println(positiveInfinity > nan); // false
		System.out.println(negativeInfinity < nan); // false

		// Square Root
		System.out.println("--- Square Root ---");

		x = 4;
		y = Math.sqrt(x);
		z = Math.sqrt(9 * x + y);

		System.out.println(y);
		System.out.println(z);

		System.out.println(Math.sqrt(-5.2)); // NaN

		// Converting to Integers
		System.out.println("--- Converting to Intergers ---");

		x = 5.0;
		int xInt = (int) x;

		System.out.println(xInt);

		x = 5.1;

		System.out.println((int) x); // 5

		x = 5.9;

		System.out.println((int) x); // 5

		System.out.println((int) 4207483647.0); // 2147483647
		System.out.println((int) positiveInfinity); // 2147483647
		System.out.println((int) -9999999999.0); // -2147483648
		System.out.println((int) negativeInfinity); // -2147483648
		System.out.println((int) nan); // 0

		// Conversion from Integers
		System.out.println("--- Conversion from Integers ---");

		xInt = 5;
		y = xInt; // Converts by itself

		System.out.println(y);

		xInt = 7;
		int yInt = 2;
		z = xInt / yInt;

		System.out.println(z); // 3

		// To perform math on an `int` so it behaves like a double,
		// we must first convert said `int` into a `double` using a cast experssion.

		xInt = 7;
		yInt = 2;
		z = (double) xInt / yInt;

		System.out.println(z); // 3.5
	}	
}
