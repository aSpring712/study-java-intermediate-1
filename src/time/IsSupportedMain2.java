package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * Is Supported Main 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class IsSupportedMain2 {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
		System.out.println("supported = " + supported);
		if (supported) {
			int minute = now.get(ChronoField.SECOND_OF_MINUTE);
			System.out.println("minute = " + minute);
		}
	}
}