package lang.wrapper;

/**
 * Autoboxing Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class AutoboxingMain1 {

	public static void main(String[] args) {
		// Primitive -> Wrapper
		int value = 7;
		Integer boxedValue = Integer.valueOf(value);

		// Wrapper -> Primitive
		int unboxedValue = boxedValue.intValue();

		System.out.println("boxedValue = " + boxedValue);
		System.out.println("unboxedValue = " + unboxedValue);
	}
}