package exception.basic.unchecked;

/**
 * Unchecked Throw Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class UncheckedThrowMain {

	public static void main(String[] args) {
		Service service = new Service();
		service.callThrow();
		System.out.println("정상 종료");
	}
}