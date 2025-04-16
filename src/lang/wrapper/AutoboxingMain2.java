package lang.wrapper;

/**
 * Autoboxing Main 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class AutoboxingMain2 {

	public static void main(String[] args) {
		// Primitive -> Wrapper
		int value = 7;
		Integer boxedValue = value; // 오토 박싱(Auto-boxing)

		// Wrapper -> Primitive
		int unboxedValue = boxedValue; // 오토 언박싱(Auto-unboxing)

		System.out.println("boxedValue = " + boxedValue);
		System.out.println("unboxedValue = " + unboxedValue);
	}
}