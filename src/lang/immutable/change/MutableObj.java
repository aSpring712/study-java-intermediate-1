package lang.immutable.change;

/**
 * Mutable Obj
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class MutableObj {

	private int value;

	public MutableObj(int value) {
		this.value = value;
	}

	public void add(int addValue) {
		this.value = this.value + addValue;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}