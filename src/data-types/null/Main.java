public class Main {
	public static void sayHello(String firstName, String lastName) {
		if (lastName == null) {
			System.out.println("Hello " + firstName);
		} else {
			System.out.println("Hello " + firstName + " " + lastName);
		}
	}

	public static void main(String[] args) {
		String name = null;
		int [] numbers = null;
		// int, double, char, and boolean can't be null
		// along with long, short, byte, float

		System.out.println(name);
		System.out.println(numbers);

		sayHello("Sonny", "Bono");
		sayHello("Cher", null);
	}
}