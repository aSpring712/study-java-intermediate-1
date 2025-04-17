package enumeration.ref3;

/**
 * Enum Ref Main 3_4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public class EnumRefMain3_4 {

	public static void main(String[] args) {

		int price = 10000;

		Grade[] grades = Grade.values();
		for (Grade grade : grades) {
			printDiscount(grade, price);
		}
	}

	public static void printDiscount(Grade grade, int price) {
		System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
	}
}