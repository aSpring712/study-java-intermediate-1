package lang.string.quiz;

/**
 * Test String 5
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class TestString5 {

	public static void main(String[] args) {
		// indexOf, substring 조합
		String str = "hello.txt";
		String ext = ".txt";

		// 코드 작성
		int extIndex = str.indexOf(ext);

		String fileName = str.substring(0, extIndex);
		String extName = str.substring(extIndex);

		System.out.println("filename = " + fileName);
		System.out.println("extName = " + extName);
	}
}