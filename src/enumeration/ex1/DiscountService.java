package enumeration.ex1;

/**
 * Discount Service
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class DiscountService {

	public int discount(String grade, int price) {
		int discountPercent = 0;

		if (grade.equals(StringGrade.BASIC)) {
			discountPercent = 10;
		} else if (grade.equals(StringGrade.GOLD)) {
			discountPercent = 20;
		} else if (grade.equals(StringGrade.DIAMOND)) {
			discountPercent = 30;
		} else {
			System.out.println(grade + " : 할인X");
		}

		return price * discountPercent / 100;
	}
}