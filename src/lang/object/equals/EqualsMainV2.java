package lang.object.equals;

/**
 * Equals Main V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-14
 * @version 1.0
 */
public class EqualsMainV2 {

	public static void main(String[] args) {
		UserV2 user1 = new UserV2("id-100");
		UserV2 user2 = new UserV2("id-100");

		System.out.println("identity = " + (user1 == user2)); // false
		System.out.println("equality = " + user1.equals(user2)); // true
	}
}