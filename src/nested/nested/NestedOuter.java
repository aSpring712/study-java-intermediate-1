package nested.nested;

/**
 * Nested Outer
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class NestedOuter {

	private static int outClassValue = 3;
	private int outInstanceValue = 2;

	static class Nested {
		private int nestedInstantValue = 1;

		public void print() {

			// 자신의 멤버에 접근
			System.out.println(nestedInstantValue);

			// 바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.
//			System.out.println(outInstanceValue);

			// 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
			System.out.println(NestedOuter.outClassValue);
		}
	}
}