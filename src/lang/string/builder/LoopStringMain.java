package lang.string.builder;

/**
 * Loop String Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class LoopStringMain {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		String result = "";
		for (int i = 0; i < 100000; i++) {
			result += "Hello Java ";
		}
		long endTime = System.currentTimeMillis();

		System.out.println("result = " + result);
		System.out.println("time = " + (endTime - startTime) + "ms");
	}
}