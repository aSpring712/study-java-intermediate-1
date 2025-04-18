package exception.ex3.exception;

/**
 * Connect Exception V3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class ConnectExceptionV3 extends NetworkClientExceptionV3 {

	private final String address;

	public ConnectExceptionV3(String address, String message) {
		super(message);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
}