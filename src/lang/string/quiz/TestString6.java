package lang.string.quiz;

/**
 * Test String 6
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class TestString6 {

	public static void main(String[] args) {
		// indexOf와 반복문

		String str = "start hello java, hello spring, hello jpa";
		String key = "hello";

		int count = 0;
		int index = str.indexOf(key);

		// 코드 작성
		while (index >= 0) {

			index = str.indexOf(key, index + 1);
			count++;
		}

		System.out.println("count = " + count);
	}
}