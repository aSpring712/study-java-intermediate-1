package enumeration.ref1;

/**
 * Discount Service
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public class DiscountService {

	public int discount(ClassGrade classGrade, int price) {
		return price * classGrade.getDiscountPercent() / 100;
	}
}