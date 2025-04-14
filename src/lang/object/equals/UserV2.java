package lang.object.equals;

/**
 * User V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-14
 * @version 1.0
 */
public class UserV2 {

	private String id;

	public UserV2(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		UserV2 user = (UserV2) obj;
		return id.equals(user.id);
	}
}