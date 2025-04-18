package time.quiz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Test Loop Plus
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class TestLoopPlus {

	public static void main(String[] args) {

		LocalDate startDate = LocalDate.of(2024, 1, 1);

		for (int i = 0; i < 5; i ++) {
			LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
			System.out.println("날짜 " + (i + 1) + ": " + nextDate);
		}
	}
}