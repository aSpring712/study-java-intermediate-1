package exception.ex1;

/**
 * Network Service V1_3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class NetworkServiceV1_3 {

	public void sendMessage(String data) {
		NetworkClientV1 clinet = new NetworkClientV1("http://example.com");
		clinet.initError(data);

		String connectResult = clinet.connect();
		if (isError(connectResult)) {
			System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
		} else {
			String sendResult = clinet.send(data);
			if (isError(sendResult)) {
				System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
			}
		}

		clinet.disconnect();
	}

	private static boolean isError(String resultCode) {
		return !resultCode.equals("success");
	}
}