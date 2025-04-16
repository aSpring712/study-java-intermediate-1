package lang.wrapper;

/**
 * Wrapper Class Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class WrapperClassMain {

	public static void main(String[] args) {
		Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신에 valueOf() 사용
		Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
		Long longObj = Long.valueOf(100);
		Double doubleObj = Double.valueOf(10.5);

		System.out.println("newInteger = " + newInteger); // 10
		System.out.println("integerObj = " + integerObj); // 10
		System.out.println("longObj = " + longObj); // 100
		System.out.println("doubleObj = " + doubleObj); // 10.5

		System.out.println("내부 값 읽기");
		int intValue = integerObj.intValue();
		System.out.println("intValue = " + intValue); // 10
		long longValue = longObj.longValue();
		System.out.println("longValue = " + longValue); // 100

		System.out.println("비교");
		System.out.println("==: " + (newInteger == integerObj)); // false
		System.out.println("equals: " + (newInteger.equals(integerObj))); // true
	}
}