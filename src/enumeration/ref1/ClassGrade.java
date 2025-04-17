package enumeration.ref1;

/**
 * Class Grade
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public class ClassGrade {

	public static final ClassGrade BASIC = new ClassGrade(10);
	public static final ClassGrade GOLD = new ClassGrade(20);
	public static final ClassGrade DIAMOND = new ClassGrade(30);

	private final int discountPercent;

	private ClassGrade(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public int getDiscountPercent() {
		return this.discountPercent;
	}
}