package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Change Time Plus Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class ChangeTimePlusMain {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
		System.out.println("dt = " + dt);

		LocalDateTime plusDt1 = dt.plus(10, ChronoUnit.YEARS);
		System.out.println("plusDt1 = " + plusDt1);

		LocalDateTime plusDt2 = dt.plusYears(10);
		System.out.println("plusDt2 = " + plusDt2);

		Period period = Period.ofYears(10);
		LocalDateTime plusDt3 = dt.plus(period);
		System.out.println("plusDt3 = " + plusDt3);
	}
}