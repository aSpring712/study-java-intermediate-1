package lang.immutable.address;

/**
 * Ref Main 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class RefMain2 {

	public static void main(String[] args) {
		ImmutableAddress a = new ImmutableAddress("서울");
		ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법이 없다.
		System.out.println("a = " + a);
		System.out.println("b = " + b);

//		b.setValue("부산"); // 컴파일 오류 발생
		b = new ImmutableAddress("부산");
		System.out.println("부산 -> b");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}