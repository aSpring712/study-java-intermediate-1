package time.quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Test Adjusters
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class TestAdjusters {

	public static void main(String[] args) {

		// 입력받은 월의 첫날 요일과 마지막날 요일을 구해라.
		int year = 2024;
		int month = 1;

		LocalDate date = LocalDate.of(year, month, 1);
		DayOfWeek firstDayOfWeek = date.getDayOfWeek();
		DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

		System.out.println("firstDayOfWeek = " + firstDayOfWeek);
		System.out.println("lastDayOfWeek = " + lastDayOfWeek);
	}
}