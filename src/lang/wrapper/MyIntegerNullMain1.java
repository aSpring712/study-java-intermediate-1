package lang.wrapper;

/**
 * My Integer Null Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class MyIntegerNullMain1 {

	public static void main(String[] args) {
		MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
		System.out.println(findValue(intArr, -1)); // -1
		System.out.println(findValue(intArr, 0)); // 1
		System.out.println(findValue(intArr, 1)); // 1
		System.out.println(findValue(intArr, 10)); // null
	}

	public static MyInteger findValue(MyInteger[] intArr, int target) {
		for (MyInteger myInteger : intArr) {
			if (myInteger.getValue() == target) {
				return myInteger;
			}
		}
		return null;
	}
}