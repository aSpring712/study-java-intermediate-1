package lang.immutable.address;

/**
 * Member Main V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class MemberMainV1 {

	public static void main(String[] args) {
		Address address = new Address("서울");

		MemberV1 memberA = new MemberV1("회원A", address);
		MemberV1 memberB = new MemberV1("회원B", address);

		// 회원A, 회원B의 처음 주소는 모두 서울
		System.out.println("memberA = " + memberA);
		System.out.println("memberB = " + memberB);

		// 회원B의 주소를 부산으로 변경해야함
		memberB.getAddress().setValue("부산");
		System.out.println("부산 -> memberB.address");
		System.out.println("memberA = " + memberA);
		System.out.println("memberB = " + memberB);
	}
}