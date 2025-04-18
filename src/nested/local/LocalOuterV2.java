package nested.local;

/**
 * Local Outer V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class LocalOuterV2 {

	private int outInstanceVar = 3;

	public void process(int paramVar) {

		int localVar = 1;

		class LocalPrinter implements Printer {

			int value = 0;

			@Override
			public void print() {
				System.out.println("value = " + value); // 0
				System.out.println("localVar = " + localVar); // 1
				System.out.println("paramVar = " + paramVar); // 2
				System.out.println("outInstanceVar = " + outInstanceVar); // 3
			}
		}

		Printer printer = new LocalPrinter();
		printer.print();
	}

	public static void main(String[] args) {
		LocalOuterV2 localOuter = new LocalOuterV2();
		localOuter.process(2);
	}
}