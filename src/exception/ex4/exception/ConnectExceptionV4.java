package exception.ex4.exception;

/**
 * Connect Exception V4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class ConnectExceptionV4 extends NetworkClientExceptionV4 {

	private final String address;

	public ConnectExceptionV4(String address, String message) {
		super(message);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
}