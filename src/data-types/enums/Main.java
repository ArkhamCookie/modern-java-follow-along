public class Main {
	public static void main(String[] args) {
		enum Stoplight {
			RED,
			YELLOW,
			GREEN
		}

		var light = Stoplight.RED;

		System.out.println(
			"The light is " +
			light +
			"."
		);

		if (light == Stoplight.RED) {
			System.out.println("You must stop.");
		} else {
			System.out.println("Full speed ahead.");
		}
	}
}