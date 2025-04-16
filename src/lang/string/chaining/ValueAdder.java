package lang.string.chaining;

/**
 * Value Addr
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class ValueAdder {

	private int value;

	public ValueAdder add(int addValue) {
		value += addValue;
		return this;
	}

	public int getValue() {
		return value;
	}
}