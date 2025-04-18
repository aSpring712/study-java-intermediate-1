package nested.inner;

/**
 * Inner Outer Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class InnerOuterMain {

	public static void main(String[] args) {

		InnerOuter outer = new InnerOuter();
		InnerOuter.Inner inner = outer.new Inner();
		inner.print();

		System.out.println("innerClass = " + inner.getClass());
	}
}