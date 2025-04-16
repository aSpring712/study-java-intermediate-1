package lang.wrapper.quiz;

/**
 * Wrapper Test 4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class WrapperTest4 {

	public static void main(String[] args) {

		String str = "100";

		// String -> Integer
		Integer integer1 = Integer.valueOf(str);
		System.out.println("integer1 = " + integer1);

		// Integer -> int
		int intValue = integer1;
		System.out.println("intValue = " + intValue);

		// int -> Integer
		Integer integer2 = intValue;
		System.out.println("integer2 = " + integer2);
	}
}