package lang.string.chaining;

/**
 * Method Chaining Main 3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class MethodChainingMain3 {

	public static void main(String[] args) {
		ValueAdder adder = new ValueAdder();
		int result = adder.add(1).add(2).add(3).getValue();
		System.out.println("result = " + result);
	}
}