package exception.ex4;

/**
 * Network Service V5
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class NetworkServiceV5 {

	public void sendMessage(String data) {
		String address = "http://example.com";

		try (NetworkClientV5 client = new NetworkClientV5(address)) {
			client.initError(data);
			client.connect();
			client.send(data);
		} catch (Exception e) {
			System.out.println("[예외 확인]: " + e.getMessage());
			throw e;
		}
	}
}