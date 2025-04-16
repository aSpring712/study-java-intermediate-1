package lang.string.builder;

/**
 * String Builder Main 1_2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class StringBuilderMain1_2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String string = sb.append("A").append("B").append("C").append("D")
				.insert(4, "Java")
				.delete(4, 8)
				.reverse()
				.toString();

		System.out.println("string = " + string);
	}
}