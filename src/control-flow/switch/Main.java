public class Main {
	static void sayColor(String fruit) {
		switch (fruit) {
			case "apple" -> {
				System.out.println("Red");
			}
			case "grape" -> {
				System.out.println("Purple");
			}
			case "orange" -> {
				System.out.println("Orange");
			}
			default -> {
				System.out.println("Other");
			}
		}
	}

	static void checkCorrectYear(int year) {
		switch (year) {
			case 2023 -> {
				System.out.println("One year too early");
			}
			case 2024 -> {
				System.out.println("Correct year!");
			}
			case 2025 -> {
				System.out.println("One year too late.");
			}
			default -> {
				System.out.println("Not the correct year.");
			}
		}
	}

	enum StopLight {
		RED,
		YELLOW,
		GREEN
	}

	enum Action {
		GO,
		SLOW_DOWN,
		STOP
	}

	static void checkIfGo(StopLight light) {
		switch (light) {
			case GREEN -> {
				System.out.println("Go!");
			}
			case YELLOW -> {
				System.out.println("Speed up, coward!");
			}
			case RED -> {
				System.out.println("Stop!");
			}
			default -> {
				System.out.println("Error!");
			}
		}
	}

	static String combingCases(String vegetable) {
		switch (vegetable) {
			case "apple" -> {
				return "Malus pumila";
			}
			case "cabbage", "brussel sprouts", "kale", "cauliflower" -> {
				return "Brassica oleracea";
			}
			// Can do in Java 21+
			// case null, default -> {
			default -> {
				return "unknown";
			}
		}
	}

	static void tellAction(StopLight light) {
		Action action = switch (light) {
				case RED -> Action.STOP;
				case YELLOW -> {
					System.out.println("Lemon Light!");
					yield Action.SLOW_DOWN;
			}
				case GREEN -> Action.GO;
		};

		System.out.println(action);
	}

	public static void main(String[] args) {
		sayColor("apple");

		checkCorrectYear(2023);

		var light = StopLight.YELLOW;

		checkIfGo(light);

		System.out.println(combingCases("kale"));

		tellAction(light);
	}
}