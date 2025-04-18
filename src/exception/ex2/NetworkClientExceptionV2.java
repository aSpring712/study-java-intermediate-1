package exception.ex2;

/**
 * Network Client Exception V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class NetworkClientExceptionV2 extends Exception {

	private String errorCode;

	public NetworkClientExceptionV2(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
}