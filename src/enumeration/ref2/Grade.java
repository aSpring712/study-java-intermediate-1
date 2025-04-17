package enumeration.ref2;

/**
 * Grade
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public enum Grade {
	BASIC(10), GOLD(20), DIAMOND(30);

	private final int discountPercent;

	Grade(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public int getDiscountPercent() {
		return this.discountPercent;
	}
}