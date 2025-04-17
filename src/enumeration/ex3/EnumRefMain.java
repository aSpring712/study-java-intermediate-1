package enumeration.ex3;

/**
 * Enum Ref Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class EnumRefMain {

	public static void main(String[] args) {
		System.out.println("class BASIC = " + Grade.BASIC.getClass());
		System.out.println("class GOLD = " + Grade.GOLD.getClass());
		System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

		System.out.println("ref BASIC = " + refValue(Grade.BASIC));
		System.out.println("ref GOLD = " + refValue(Grade.GOLD));
		System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
	}

	private static String refValue(Object grade) {
		return Integer.toHexString(System.identityHashCode(grade));
	}
}