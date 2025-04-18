package exception.ex2;

/**
 * Network Service V2_4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class NetworkServiceV2_4 {

	public void sendMessage(String data) {
		String address = "http://example.com";

		NetworkClientV2 client = new NetworkClientV2(address);
		client.initError(data);

		try {
			client.connect();
			client.send(data);
		} catch (NetworkClientExceptionV2 e) {
			System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
		}

		// NetworkClientExceptionV2이 아닌 다른 예외가 발생해서 예외가 밖으로 던져지면 무시
		client.disconnect();
	}
}