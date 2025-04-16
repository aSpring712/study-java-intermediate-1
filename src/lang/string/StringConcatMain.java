package lang.string;

/**
 * String Concat Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class StringConcatMain {

	public static void main(String[] args) {
		String a = "hello";
		String b = " java";

		String result1 = a.concat(b);
		String result2 = a + b;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
	}
}