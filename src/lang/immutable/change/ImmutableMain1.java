package lang.immutable.change;

/**
 * Immutable Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class ImmutableMain1 {

	public static void main(String[] args) {
		ImmutableObj obj1 = new ImmutableObj(10);
		ImmutableObj obj2 = obj1.add(20);

		// 계산 이후에도 기존값과 신규값 모두 확인 가능
		System.out.println("obj1 = " + obj1.getValue());
		System.out.println("obj2 = " + obj2.getValue());
	}
}