package exception.basic.unchecked;

/**
 * Unchecked Catch Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class UncheckedCatchMain {

	public static void main(String[] args) {
		Service service = new Service();
		service.callCatch();
		System.out.println("정상 종료");
	}
}