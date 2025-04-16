package lang.string.quiz;

/**
 * Test String 4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class TestString4 {

	public static void main(String[] args) {
		String str = "hello.txt";
		String filename = str.substring(0, 5);
		String extName = str.substring(5, 9);
		System.out.println("filename = " + filename);
		System.out.println("extName = " + extName);
	}
}