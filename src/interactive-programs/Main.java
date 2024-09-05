import java.util.Scanner;

public class Main {
	static String input(String message) {
		var scanner = new Scanner(System.in);

		try {
			System.out.println(message);

			return scanner.nextLine();
		} finally {
			scanner.close();
		}
	}

	// TODO: Fix this
	/*
	static void exitPrompt() {
		while (true) {
			var response = input("Answer me: yes or no");
			response.toLowerCase();

			if (response.equals("yes")) {
				System.out.println("Okay then.");
			} else if (response.equals("no")) {
				System.out.println("Also fine.");
			} else {
				System.out.println("Not a vaild response");
				continue;
			}

			break;
		}

	}
	 */

	public static void main(String[] args) {
		var givenInput = input("foo");

		System.out.println(givenInput);

		// exitPrompt();
	}
}