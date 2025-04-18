package exception.ex4.exception;

/**
 * Send Exception V4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class SendExceptionV4 extends NetworkClientExceptionV4 {

	private final String sendData;

	public SendExceptionV4(String sendData, String message) {
		super(message);
		this.sendData = sendData;
	}

	public String getSendData() {
		return sendData;
	}
}