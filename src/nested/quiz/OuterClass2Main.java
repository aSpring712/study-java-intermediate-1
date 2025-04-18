package nested.quiz;

/**
 * Outer Class2 Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class OuterClass2Main {

	public static void main(String[] args) {
		OuterClass2 outer = new OuterClass2();
		OuterClass2.InnerClass inner = outer.new InnerClass();
		inner.hello();
	}
}