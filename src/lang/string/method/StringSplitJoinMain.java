package lang.string.method;

/**
 * String Split Join Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class StringSplitJoinMain {

	public static void main(String[] args) {
		String str = "Apple,Banana,Orange";

		// split()
		String[] splitStr = str.split(",");
		for (String s : splitStr) {
			System.out.println(s); // Apple		Banana		Ornage
		}

		// join()
		String joinedStr = String.join("-", "A", "B", "C");
		System.out.println("연결된 문자열: " + joinedStr); // A-B-C

		// 문자열 배열 연결
		String result = String.join("-", splitStr);
		System.out.println("result = " + result); // Apple-Banana-Orange
	}
}