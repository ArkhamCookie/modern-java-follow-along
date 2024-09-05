class Muppet {
	String muppetName;
	int muppetAge;

	public Muppet(String name, int age) {
		muppetName = name;
		muppetAge = age;
	}
}

public class Main {
	public static void main(String[] args) {
		var bigBird = new Muppet("Big Bird", 6);

		System.out.println(bigBird.muppetName);
		System.out.println(bigBird.muppetAge);
	}
}