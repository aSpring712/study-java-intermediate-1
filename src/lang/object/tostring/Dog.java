package lang.object.tostring;

/**
 * Dog
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-14
 * @version 1.0
 */
public class Dog {

	private String dogName;
	private int age;

	public Dog(String dogName, int age) {
		this.dogName = dogName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"dogName = '" + dogName + '\'' +
				", age = " + age +
				"}";
	}
}