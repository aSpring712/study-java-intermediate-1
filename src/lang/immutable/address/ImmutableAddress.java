package lang.immutable.address;

/**
 * Immutable Address
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class ImmutableAddress {

	private final String value;

	public ImmutableAddress(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return "ImmutableAddress{" +
				"value='" + value + '\'' +
				'}';
	}
}