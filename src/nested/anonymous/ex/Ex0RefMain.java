package nested.anonymous.ex;

/**
 * Ex0 Ref Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class Ex0RefMain {

	public static void hello(String str) {
		System.out.println("프로그램 시작");
		System.out.println(str);
		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {
		hello("hello Java");
		hello("hello Spring");
	}
}