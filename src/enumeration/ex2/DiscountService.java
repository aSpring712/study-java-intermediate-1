package enumeration.ex2;

/**
 * Discount Service
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class DiscountService {

	public int discount(ClassGrade classGrade, int price) {
		int discountPercent = 0;

		if (classGrade == ClassGrade.BASIC) {
			discountPercent = 10;
		} else if (classGrade == ClassGrade.GOLD) {
			discountPercent = 20;
		} else if (classGrade == ClassGrade.DIAMOND) {
			discountPercent = 30;
		} else {
			System.out.println("할인X");
		}

		return price * discountPercent / 100;
	}
}