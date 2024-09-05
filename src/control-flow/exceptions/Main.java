public class Main {
	static void doThing(int x) {
		if (x == 0) {
			throw new RuntimeException("Can't do something zero times.");
		}
	}

	public static void main(String[] args) {
		try {
			doThing(0);
		} catch (RuntimeException error) {
			System.out.println("Something went wrong doing a thing.");
		}
	}
}