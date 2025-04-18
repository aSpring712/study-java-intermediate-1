package exception.ex2;

/**
 * Network Service V2_1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class NetworkServiceV2_1 {

	public void sendMessage(String data) throws NetworkClientExceptionV2 {
		String address = "http://example.com";

		NetworkClientV2 client = new NetworkClientV2(address);
		client.initError(data);

		client.connect();
		client.send(data);
		client.disconnect();
	}
}