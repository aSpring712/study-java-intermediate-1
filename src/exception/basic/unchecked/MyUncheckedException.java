package exception.basic.unchecked;

/**
 * My Unchecked Exception
 *
 * RuntimeException을 상속받은 예외는 언체크 예외가 된다.
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class MyUncheckedException extends RuntimeException {
	public MyUncheckedException(String message) {
		super(message);
	}
}