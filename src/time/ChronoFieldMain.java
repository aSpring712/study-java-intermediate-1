package time;

import java.time.temporal.ChronoField;

/**
 * Chrono Field Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public class ChronoFieldMain {

	public static void main(String[] args) {

		ChronoField[] values = ChronoField.values();
		for (ChronoField value : values) {
			System.out.println(value + ", range = " + value.range());
		}

		System.out.println("MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
		System.out.println("DAY_OF_MONTH.range() = " + ChronoField.DAY_OF_MONTH.range());
	}
}