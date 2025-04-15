package lang.immutable.address;

/**
 * Ref Main 1_1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-14
 * @version 1.0
 */
public class RefMain1_1 {

	public static void main(String[] args) {
		// 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
		Address a = new Address("서울");
		Address b = a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		b.setValue("부산");
		System.out.println("부산 -> b");
		System.out.println("a = " + a); // 사이드 이펙트 발생
		System.out.println("b = " + b);
	}
}