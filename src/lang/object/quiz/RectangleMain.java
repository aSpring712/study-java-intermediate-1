package lang.object.quiz;

/**
 * Rectangle Main
 *
 * toString(), equals() 구현하기
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-14
 * @version 1.0
 */
public class RectangleMain {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(100, 20);
		Rectangle rect2 = new Rectangle(100, 20);
		System.out.println(rect1);
		System.out.println(rect2);
		System.out.println(rect1 == rect2); // false
		System.out.println(rect1.equals(rect2)); // true
	}
}