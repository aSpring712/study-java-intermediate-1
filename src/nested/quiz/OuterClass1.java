package nested.quiz;

/**
 * Outer Class 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class OuterClass1 {
	// 여기에 NestedClass를 구현해라. 그리고 hello() 메서드를 만들어라.

	static class NestedClass{
		public void hello() {
			System.out.println("NestedClass.hello");
		}
	}
}