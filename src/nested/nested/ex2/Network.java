package nested.nested.ex2;

/**
 * Network
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class Network {

	public void sendMessage(String text) {
		NetworkMessage networkMessage = new NetworkMessage(text);
		networkMessage.print();
	}

	private static class NetworkMessage {
		private String content;

		public NetworkMessage(String content) {
			this.content = content;
		}

		public void print() {
			System.out.println(content);
		}
	}
}