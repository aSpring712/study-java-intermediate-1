package exception.ex2;

/**
 * Network Service V2_3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class NetworkServiceV2_3 {

	public void sendMessage(String data) {
		String address = "http://example.com";

		NetworkClientV2 client = new NetworkClientV2(address);
		client.initError(data);

		try {
			client.connect();
			client.send(data);
			client.disconnect(); // 예외 발생시 무시
		} catch (NetworkClientExceptionV2 e) {
			System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
		}
	}
}