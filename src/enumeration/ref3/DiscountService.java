package enumeration.ref3;

/**
 * Discount Service
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public class DiscountService {

	public int discount(Grade grade, int price) {
		return grade.discount(price);
	}
}