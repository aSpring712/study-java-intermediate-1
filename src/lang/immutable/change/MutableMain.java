package lang.immutable.change;

/**
 * Mutable Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class MutableMain {

	public static void main(String[] args) {
		MutableObj obj = new MutableObj(10);
		obj.add(20);
		// 계산 이후 기존 값은 사라짐
		System.out.println("obj = " + obj.getValue());
	}
}