package lang.immutable.change;

/**
 * Immutable Obj
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class ImmutableObj {

	private final int value;

	public ImmutableObj(int value) {
		this.value = value;
	}

	public ImmutableObj add(int addValue) {
		int result = this.value + addValue;
		return new ImmutableObj(result);
	}

	public int getValue() {
		return this.value;
	}
}