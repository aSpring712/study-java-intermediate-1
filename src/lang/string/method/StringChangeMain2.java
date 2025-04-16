package lang.string.method;

/**
 * String Change Main 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class StringChangeMain2 {

	public static void main(String[] args) {
		String strWithSpaces = "	Java Programming";

		System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase()); //  	java programming
		System.out.println("대문자로 변환: " + strWithSpaces.toUpperCase()); // 	JAVA PROGRAMMING

		System.out.println("공백 제거(trim): '" + strWithSpaces.trim() + "'"); // 'Java Programming'
		System.out.println("공백 제거(strip): '" + strWithSpaces.strip() + "'"); // 'Java Programming'
		System.out.println("앞 공백 제거(strip): '" + strWithSpaces.stripLeading() + "'"); // 'Java Programming'
		System.out.println("뒤 공백 제거(strip): '" + strWithSpaces.stripTrailing() + "'"); // 'Java Programming'
	}
}