package lang.object.tostring;

/**
 * ToString Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-14
 * @version 1.0
 */
public class ToStringMain1 {

	public static void main(String[] args) {
		Object object = new Object();
		String string = object.toString();

		// toString() 반환값 출력
		System.out.println(string);

		// object 직접 출력
		System.out.println(object);
	}
}