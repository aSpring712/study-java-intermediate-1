package nested;

/**
 * Shadowing Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class ShadowingMain {

	public int value = 1;

	class Inner {
		public int value = 2;

		void go() {
			int value = 3;
			System.out.println("value = " + value); // 3
			System.out.println("this.value = " + this.value); // 3
			System.out.println("ShadowingMain.value = " + ShadowingMain.this.value); // 1
		}
	}

	public static void main(String[] args) {
		ShadowingMain main = new ShadowingMain();
		Inner inner = main.new Inner();
		inner.go();
	}
}