package nested.anonymous;

import nested.local.Printer;

/**
 * Anonymous Outer
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class AnonymousOuter {

	private int outInstanceVar = 3;

	public void process(int paramVar) {

		int localVar = 1;

		Printer printer = new Printer() {

			int value = 0;

			@Override
			public void print() {
				System.out.println("value = " + value);
				System.out.println("localVar = " + localVar);
				System.out.println("paramVar = " + paramVar);
				System.out.println("outInstanceVar = " + outInstanceVar);
			}
		};
		printer.print();
		System.out.println("printer.class = " + printer.getClass());
	}

	public static void main(String[] args) {
		AnonymousOuter main = new AnonymousOuter();
		main.process(2);
	}
}