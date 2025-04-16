package lang.wrapper;

/**
 * My Integer Method Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class MyIntegerMethodMain1 {

	public static void main(String[] args) {
		MyInteger myInteger = new MyInteger(10);

		int i1 = myInteger.compareTo(5);
		int i2 = myInteger.compareTo(10);
		int i3 = myInteger.compareTo(20);

		System.out.println("i1 = " + i1); // 1
		System.out.println("i2 = " + i2); // 0
		System.out.println("i3 = " + i3); // -1
	}
}