package enumeration.ex3;

/**
 * Discount Service
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class DiscountService {

	public int discount(Grade grade, int price) {
		int discountPrice = 0;

		// enum switch 변경 가능
		if (grade == Grade.BASIC) {
			discountPrice = 10;
		} else if (grade == Grade.GOLD) {
			discountPrice = 20;
		} else if (grade == Grade.DIAMOND) {
			discountPrice = 30;
		} else {
			System.out.println("할인X");
		}

		return price * discountPrice / 100;
	}
}