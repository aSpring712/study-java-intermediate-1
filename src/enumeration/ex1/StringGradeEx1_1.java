package enumeration.ex1;

/**
 * String Grade Ex 1_1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class StringGradeEx1_1 {

	public static void main(String[] args) {
		int price = 10000;

		DiscountService discountService = new DiscountService();
		int basic = discountService.discount(StringGrade.BASIC, price);
		int gold = discountService.discount(StringGrade.GOLD, price);
		int diamond = discountService.discount(StringGrade.DIAMOND, price);

		System.out.println("BASIC 등급의 할인 금액: " + basic);
		System.out.println("GOLD 등급의 할인 금액: " + gold);
		System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
	}
}