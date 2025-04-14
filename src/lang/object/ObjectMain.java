package lang.object;

/**
 * Object Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-14
 * @version 1.0
 */
public class ObjectMain {

	public static void main(String[] args) {

		Child child = new Child();
		child.childMethod();
		child.parentMethod();

		// toString()은 Object 클래스의 메서드
		String string = child.toString();
		System.out.println(string); // lang.object.Child@3feba861
	}
}