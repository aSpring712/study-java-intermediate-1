package nested.nested.ex1;

/**
 * Network Message
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
// Network 객체 안에서만 사용
public class NetworkMessage {

	private String content;

	public NetworkMessage(String content) {
		this.content = content;
	}

	public void print() {
		System.out.println(content);
	}
}