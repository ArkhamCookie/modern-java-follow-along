class Elmo {
	int age;
	int nextAge() {
		return age++;
	}

	void talkAboutRocko() {
		System.out.println("ROCKO'S NOT ALIVE!!");
	}

	void sayHello() {
		System.out.println("Hi, I'm Elmo.");
		System.out.println(
			"I'm " +
			age +
			" years old."
		);
	}

	void haveBirthday() {
		age++;
	}

	void startTheShow(String name) {
		sayHello();
		// `this.sayHello()` is also vaild
		System.out.println(
			"Welcome to " +
			name
		);
	}

	boolean isOlderThan(int age) {
		// Vaild but seems like a bad idea to have the same var name
		return this.age > age;
	}
}

class Muppet {
	String name;

	void singLyric(int verse) {
		if (verse == 1) {
			System.out.println("Why are there so many");
		} else if (verse == 2) {
			System.out.println("Songs about rainbows");
		} else {
			System.out.println("And what's on the other side?");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		var elmo = new Elmo();

		elmo.talkAboutRocko();

		var kermit = new Muppet();

		// Arguements
		System.out.println("--- Arguements ---");

		int i;
		for (i = 1; i <= 3; i++) {
			kermit.singLyric(i);
		}

		// Field Access
		System.out.println("--- Field Access ---");

		elmo.age = 3;

		elmo.sayHello();

		// Field Updates
		System.out.println("--- Field Updates ---");

		elmo.haveBirthday();
		elmo.sayHello();

		// Derived Values
		System.out.println("--- Derived Values ---");

		System.out.println(
			"Next year I will be " + elmo.nextAge()
		);

		// Invoke Other Methods
		System.out.println("--- Invoke Other Methods ---");

		elmo.startTheShow("Birthday Party");
	}
}