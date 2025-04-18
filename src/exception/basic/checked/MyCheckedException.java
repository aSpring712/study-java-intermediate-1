package exception.basic.checked;

/**
 * My Checked Exception
 *
 * Exception을 상속받은 예외는 체크 예외가 된다.
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class MyCheckedException extends Exception {
	public MyCheckedException(String message) {
		super(message);
	}
}