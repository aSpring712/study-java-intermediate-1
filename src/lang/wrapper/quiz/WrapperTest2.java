package lang.wrapper.quiz;

/**
 * Wrapper Test 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class WrapperTest2 {

	public static void main(String[] args) {
		String[] array = {"1.5", "2.5", "3.0"};

//		배열에 입력된 모든 숫자의 합. 숫자는 double 형이 입력될 수 있다.

		double sum = 0;
		for (String s : array) {
			double i = Double.parseDouble(s);
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
}