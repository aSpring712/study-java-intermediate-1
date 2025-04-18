package nested.local;

/**
 * Local Outer V4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class LocalOuterV4 {

	private int outerInstanceVar = 3;

	public Printer process(int paramVar) {

		int localVar = 1;

		class LocalPrinter implements Printer {

			int value = 0;

			@Override
			public void print() {
				System.out.println("value = " + value);

				// 인스턴스는 지역 변수보다 더 오래 살아남는다.
				System.out.println("localVar = " + localVar);
				System.out.println("paramVar = " + paramVar);

				System.out.println("outInstanceVar = " + outerInstanceVar);
			}
		}

		Printer printer = new LocalPrinter();
		// 만약 localVar의 값을 변경한다면? 다시 캡처해야 하나??
//		localVar = 10; // 컴파일 오류
//		paramVar = 20; // 컴파일 오류

		return printer;
	}

	public static void main(String[] args) {
		LocalOuterV4 localOuter = new LocalOuterV4();
		Printer printer = localOuter.process(2);
		printer.print();
	}
}