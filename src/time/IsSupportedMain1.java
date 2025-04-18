package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * Is Supported Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class IsSupportedMain1 {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		int minute = now.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println("minute = " + minute);
	}
}