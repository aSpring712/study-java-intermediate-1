package lang.string.chaining;

/**
 * Method Chaining Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class MethodChainingMain1 {

	public static void main(String[] args) {
		ValueAdder adder = new ValueAdder();
		adder.add(1);
		adder.add(2);
		adder.add(3);
		int result = adder.getValue();
		System.out.println("result = " + result);
	}
}