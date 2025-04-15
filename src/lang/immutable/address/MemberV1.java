package lang.immutable.address;

/**
 * Member V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class MemberV1 {

	private String name;

	private Address address;

	public MemberV1(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MemberV1{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}