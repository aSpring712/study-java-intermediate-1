package lang.wrapper;

/**
 * My Integer
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class MyInteger {

	private final int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public int compareTo(int target) {
		if (this.value < target) {
			return -1;
		} else if (this.value > target) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return String.valueOf(value); // 숫자를 문자로 변경
	}
}