package lang.immutable.change;

/**
 * Immutable Main 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class ImmutableMain2 {

	public static void main(String[] args) {
		ImmutableObj obj1 = new ImmutableObj(10);
		obj1.add(20);

		System.out.println("obj1 = " + obj1.getValue());
	}
}