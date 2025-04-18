package nested.quiz;

/**
 * Anonymous Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class AnonymousMain {

	public static void main(String[] args) {

		Hello hello = new Hello() {
			@Override
			public void hello() {
				System.out.println("Hello.hello");
			}
		};

		hello.hello();
	}
}