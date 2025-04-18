package nested.inner;

/**
 * Inner Outer
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class InnerOuter {

	private static int outClassValue = 3;
	private int outInstanceValue = 2;

	class Inner {
		private int innerInstanceValue = 1;

		public void print() {
			// 자신의 멤버에 접근
			System.out.println(innerInstanceValue);

			// 외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
			System.out.println(outInstanceValue);
			// 외부 클래스의 클래스 멤버에는 접근 가능, private도 접근 가능
			System.out.println(outClassValue);
		}
	}
}