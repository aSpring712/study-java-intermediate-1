package lang.object.equals;

/**
 * Equals Main V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-14
 * @version 1.0
 */
public class EqualsMainV1 {

	public static void main(String[] args) {

		UserV1 user1 = new UserV1("id-100");
		UserV1 user2 = new UserV1("id-100");

		System.out.println("identity = " + (user1 == user2)); // false
		System.out.println("equality = " + user1.equals(user2)); // false
	}
}