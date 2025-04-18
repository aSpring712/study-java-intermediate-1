package exception.basic.unchecked;

/**
 * Client
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class Client {
	public void call() {
		throw new MyUncheckedException("ex");
	}
}