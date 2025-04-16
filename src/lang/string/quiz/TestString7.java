package lang.string.quiz;

/**
 * Test String 7
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class TestString7 {

	public static void main(String[] args) {
		// 문자의 양쪽 공백을 제거하라

		String original = "	Hello Java	";
		String trimmed = original.trim();
		System.out.println(trimmed);
	}
}