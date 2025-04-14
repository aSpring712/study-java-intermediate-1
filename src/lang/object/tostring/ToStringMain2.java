package lang.object.tostring;

/**
 * ToString Main 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-14
 * @version 1.0
 */
public class ToStringMain2 {

	public static void main(String[] args) {
		Car car = new Car("ModelY");
		Dog dog1 = new Dog("멍멍이1", 2);
		Dog dog2 = new Dog("멍멍이2", 5);

		System.out.println("1. 단순 toString 호출");
		System.out.println(car.toString());
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());

		System.out.println("2. println 내부에서 toString 호출");
		System.out.println(car);
		System.out.println(dog1);
		System.out.println(dog2);

		System.out.println("3. Object 다형성 활용");
		ObjectPrinter.print(car);
		ObjectPrinter.print(dog1);
		ObjectPrinter.print(dog2);
	}
}