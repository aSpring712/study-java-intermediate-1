package lang.object.tostring;

/**
 * Object Printer
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-14
 * @version 1.0
 */
public class ObjectPrinter {

	public static void print(Object obj) {
		String string = "객체 정보 출력: " + obj.toString();
		System.out.println(string);
	}
}