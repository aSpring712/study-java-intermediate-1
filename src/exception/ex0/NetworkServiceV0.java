package exception.ex0;

/**
 * Network Service V0
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class NetworkServiceV0 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV0 client = new NetworkClientV0(address);

		client.connect();
		client.send(data);
		client.disconnect();
	}
}