package nested.nested;

import nested.nested.NestedOuter.Nested;

/**
 * Nested Outer Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class NestedOuterMain {

	public static void main(String[] args) {

		NestedOuter outer = new NestedOuter();
		NestedOuter.Nested nested = new Nested();
		nested.print();
		System.out.println("nestedClass = " + nested.getClass());
	}
}