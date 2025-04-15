package lang.immutable.address;

/**
 * Member V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class MemberV2 {

	private String name;

	private ImmutableAddress address;

	public MemberV2(String name, ImmutableAddress address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public ImmutableAddress getAddress() {
		return this.address;
	}

	public void setAddress(ImmutableAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MemberV2{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}