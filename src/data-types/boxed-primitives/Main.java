public class Main {
	public static void unboxingConversion() {
		Integer x = 5;
		int y = 3;
		int z = x * y;

		System.out.println(z);
	}

	public static void boxingConversion() {
		int x = 5;
		Integer y = x;

		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		Integer age = null;
		Double double1 = null;
		Character char1 = null;
		Boolean boolean1 = null;

		System.out.println(age);
		System.out.println(double1);
		System.out.println(char1);
		System.out.println(boolean1);

		unboxingConversion();

		boxingConversion();
	}
}