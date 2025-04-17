package enumeration.ref3;

/**
 * Enum Ref Main 3_3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public class EnumRefMain3_3 {

	public static void main(String[] args) {

		int price = 10000;

		printDiscount(Grade.BASIC, price);
		printDiscount(Grade.GOLD, price);
		printDiscount(Grade.DIAMOND, price);
	}

	private static void printDiscount(Grade grade, int price) {
		System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
	}
}