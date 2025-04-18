package exception.basic.checked;

/**
 * Checked Catch Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class CheckedCatchMain {

	public static void main(String[] args) {
		Service service = new Service();
		service.callCatch();
		System.out.println("정상 종료");
	}
}