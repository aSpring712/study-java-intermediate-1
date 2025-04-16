package lang.string.quiz;

/**
 * Test String 11
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class TestString11 {

	public static void main(String[] args) {
		String str = "Hello Java";

		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed); // 출력: "avaJ olleH"
	}
}