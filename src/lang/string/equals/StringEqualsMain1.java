package lang.string.equals;

/**
 * String Equals Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class StringEqualsMain1 {

	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("new String() == 비교: " + (str1 == str2)); // false
		System.out.println("new String() equals 비교: " + (str1.equals(str2))); // true

		String str3 = "hello";
		String str4 = "hello";
		System.out.println("리터럴 == 비교: " + (str3 == str4)); // true
		System.out.println("리터럴 equals 비교: " + (str3.equals(str4))); // true
	}
}