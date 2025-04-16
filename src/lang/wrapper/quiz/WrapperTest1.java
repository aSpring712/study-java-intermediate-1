package lang.wrapper.quiz;

/**
 * Wrapper Test 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class WrapperTest1 {

	public static void main(String[] args) {
		String str1 = "10";
		String str2 = "20";

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int sum = num1 + num2;
		System.out.println("두 수의 합: " + sum);
	}
}