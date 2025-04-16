package lang.string.quiz;

/**
 * Test String 8
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class TestString8 {

	public static void main(String[] args) {
		// replace()를 사용해서 java라는 단어를 jvm으로 변경해라.

		String input = "hello java spring jpa java";
		String result = input.replace("java", "jvm");
		System.out.println(result);
	}
}