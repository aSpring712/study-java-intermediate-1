package lang.string.builder;

/**
 * Loop String Builder Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class LoopStringBuilderMain {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append("Hello Java ");
		}
		String result = sb.toString();
		long endTime = System.currentTimeMillis();

		System.out.println("result = " + result);
		System.out.println("time = " + (endTime - startTime) + "ms");
	}
}