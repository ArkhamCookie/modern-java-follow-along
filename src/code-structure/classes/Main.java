class Muppet {
	String name;
	boolean talented = true;

	// static void main(String[] args) {}
}

class Location {
	double latitude;
	double longitude;
}
/*
	
Location find() {
	Location location = new Location();
	location.latitude = 40.2085;
	location.longitude = -3.713;

	return location;
}
*/

public class Main {
	public static void main(String[] args) {
		var kermit = new Muppet();

		System.out.println(kermit);

		kermit.name = "Kermit the Frog";

		System.out.println(kermit.name);

		/*
		// Return Multiple Values
		System.out.println("--- Return Multiple Values ---");

		var location = new Location();

		System.out.println(
			"Treasure island is located at " +
			location.latitude +
			" " +
			location.longitude +
			"."
		);
		 */
	}
}