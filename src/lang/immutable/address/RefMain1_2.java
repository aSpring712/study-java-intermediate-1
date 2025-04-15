package lang.immutable.address;

/**
 * Ref Main 1_2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-14
 * @version 1.0
 */
public class RefMain1_2 {

	public static void main(String[] args) {
		Address a = new Address("서울");
		Address b = new Address("서울");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		b.setValue("부산");
		System.out.println("부산 -> b");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}