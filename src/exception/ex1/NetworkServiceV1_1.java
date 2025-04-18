package exception.ex1;

/**
 * Network Service V1_1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class NetworkServiceV1_1 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV1 clinet = new NetworkClientV1(address);
		clinet.initError(data); // 추가

		clinet.connect();
		clinet.send(data);
		clinet.disconnect();
	}
}