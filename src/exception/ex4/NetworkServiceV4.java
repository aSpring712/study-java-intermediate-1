package exception.ex4;

/**
 * Network Service V4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class NetworkServiceV4 {

	public void sendMessage(String data) {
		String address = "http://example.com";

		NetworkClientV4 client = new NetworkClientV4(address);
		client.initError(data);

		try {
			client.connect();
			client.send(data);
		} finally {
			client.disconnect();
		}
	}
}