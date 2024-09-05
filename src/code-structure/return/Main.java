public class Main {
	public static int plusOne(int x) {
		return x++;
	}

	public static void doStuff() {
		System.out.println("Doing something...");

		// Can return without value on a void method
		return;
	}

	public static void main(String[] args) {
		System.out.println(plusOne(2));

		doStuff();
	}
}