package exception.ex3.exception;

/**
 * Send Exception V3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class SendExceptionV3 extends NetworkClientExceptionV3 {

	private final String sendData;

	public SendExceptionV3(String sendData, String message) {
		super(message);
		this.sendData = sendData;
	}

	public String getSendData() {
		return sendData;
	}
}