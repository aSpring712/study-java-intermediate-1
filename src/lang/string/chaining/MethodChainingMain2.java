package lang.string.chaining;

/**
 * Method Chaining Main 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class MethodChainingMain2 {

	public static void main(String[] args) {
		ValueAdder adder = new ValueAdder();
		ValueAdder adder1 = adder.add(1);
		ValueAdder adder2 = adder1.add(2);
		ValueAdder adder3 = adder2.add(3);
		int result = adder3.getValue();
		System.out.println("result = " + result);
	}
}