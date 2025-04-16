package lang.string.method;

/**
 * String Info Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class StringInfoMain {

	public static void main(String[] args) {
		String str = "Hello, Java!";
		System.out.println("문자열의 길이: " + str.length()); // 12
		System.out.println("문자열이 비어 있는지: " + str.isEmpty()); // false
		System.out.println("문자열이 비어 있거나 공백인지1: " + str.isBlank()); // false, Java 11
		System.out.println("문자열이 비어 있거나 공백인지2: " + " ".isBlank()); // true

		char c = str.charAt(7);
		System.out.println("7번 인덱스의 문자: " + c); // 7
	}
}