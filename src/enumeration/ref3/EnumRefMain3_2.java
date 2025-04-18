package enumeration.ref3;

/**
 * Enum Ref Main 3_2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public class EnumRefMain3_2 {

	public static void main(String[] args) {

		int price = 10000;

		DiscountService discountService = new DiscountService();
		System.out.println("BASIC 등급의 할인 금액 : " + Grade.BASIC.discount(price));
		System.out.println("GOLD 등급의 할인 금액 : " + Grade.GOLD.discount(price));
		System.out.println("DIAMOND 등급의 할인 금액 : " + Grade.DIAMOND.discount(price));
	}
}