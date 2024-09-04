public class Main {
	public static void main(String[] args) {
		// `camelCase` is the norm for variable names
		String name = "Logan";
		System.out.println(name);

		name = "ArkhamCookie";
		System.out.println(name);

		String repoOwner;
		repoOwner = "ArkhamCookie";
		System.out.println(repoOwner);

		final String favoriteFood = "chocolate";
		System.out.println(favoriteFood);

		// Java can infer a variable's type
		var exampleString = "This is a string!";
		System.out.println(exampleString);

		var user = repoOwner;
		System.out.println(user);
	}
}
