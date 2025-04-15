package lang.immutable.address;

/**
 * Address
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-14
 * @version 1.0
 */
public class Address {

	private String value;

	public Address(String value) {
		this.value = value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Address{" +
				"value='" + value + '\'' +
				'}';
	}
}