package nested.quiz;

/**
 * Outer Class 1 Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class OuterClass1Main {

	public static void main(String[] args) {
		// 여기에서 NestedClass의 hello() 메서드를 호출하라.

		OuterClass1.NestedClass nested = new OuterClass1.NestedClass();
		nested.hello();
	}
}