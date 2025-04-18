package lang.string.method;

/**
 * String Change Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class StringChangeMain1 {

	public static void main(String[] args) {
		String str = "Hello, Java! Welcome to Java";

		System.out.println("인덱스 7부터의 부분 문자열: " + str.substring(7)); // Java! Welcome to Java
		System.out.println("인덱스 7부터 12까지의 부분 문자열: " + str.substring(7, 12)); // Java!

		System.out.println("문자열 결합: " + str.concat("!!!")); // Hello, Java! Welcome to Java!!!

		System.out.println("'Java'를 'World'로 대체: " + str.replace("Java", "World")); // Hello, World! Welcome to World
		System.out.println("첫 번째 'Java'를 'World'로 대체: " + str.replaceFirst("Java", "World")); // Hello, World! Welcome to Java
	}
}