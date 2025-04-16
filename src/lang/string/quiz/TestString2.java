package lang.string.quiz;

/**
 * Test String 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class TestString2 {

	public static void main(String[] args) {
		String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

		// 코드 작성
		int sum = 0;
		for (String s : arr) {
			int length = s.length();
			System.out.println(s + ":" + length);
			sum += length;
		}

		System.out.println("sum = " + sum);
	}
}