package lang.immutable.quiz;

/**
 * Immutable My Date Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-15
 * @version 1.0
 */
public class ImmutableMyDateMain {

	public static void main(String[] args) {
		ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
		ImmutableMyDate date2 = date1;
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);

		System.out.println("2025 -> date1");
		date2 = date1.withYear(2025);
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);
	}
}