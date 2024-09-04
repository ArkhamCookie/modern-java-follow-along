public class Main {
	public static void main(String[] args) {
		boolean learning = true;

		System.out.println("learning = " + learning);

		/* AND */
		System.out.println("--- AND ---");

		boolean funToBeAround = true;
		boolean believesInFundamentalHumanRights = true;
		boolean willAskOnDate = funToBeAround && believesInFundamentalHumanRights; // AND

		System.out.println(willAskOnDate); // prints true

		funToBeAround = false;
		willAskOnDate = funToBeAround && believesInFundamentalHumanRights; // remember to recall var if conditions change
		System.out.println(willAskOnDate); // prints false

		believesInFundamentalHumanRights = false;
		willAskOnDate = funToBeAround && believesInFundamentalHumanRights;
		System.out.println(willAskOnDate); // prints false

		/* OR */
		System.out.println("--- OR ---");

		boolean dogLooksNice = true;
		boolean personLooksNice = false;
		boolean willAskToPetDog = dogLooksNice || personLooksNice; // OR

		System.out.println(willAskToPetDog); // prints true

		dogLooksNice = false;
		willAskToPetDog = dogLooksNice || personLooksNice;
		System.out.println(willAskToPetDog); // prints false

		/* NOT */
		System.out.println("--- NOT ---");

		boolean haveSweetsInHouse = true;
		boolean healthySnackTime = !haveSweetsInHouse; // prints false

		System.out.println(healthySnackTime);

		haveSweetsInHouse = false;
		healthySnackTime = !haveSweetsInHouse;
		System.out.println(healthySnackTime); // prints true
		
		/* Order of Operations */
		System.out.println("--- Order of Operations ---");

		boolean a = true;
		boolean b = false;
		boolean c = false;

		// just as 2 + 5 * 3 "evaluates" 5 * 3 before adding 2
		// first, !b is true
		// second, a && true is true
		// third true || c is true.
		boolean result = a && !b || c;
		System.out.println(result); // prints true

		// Even though || has a lower precedence than &&, we evaluate
		// (!b || c) first because of the parentheses.
		result = a && (!b || c);
		System.out.println(result); // prints true

		// Challenge 3
		/*
		 Question:
		 Say you have two boolean variables, how could you use the operators we've
		 covered to get the "exclusive or" of the two.
		 */
		System.out.println("--- Challenge 3 ---");

    	boolean hasIceCream = false;
    	boolean hasCookie = true;

    	boolean validChoice = !(hasIceCream && hasCookie) && (hasIceCream || hasCookie);

	    System.out.println(validChoice);
	}
}