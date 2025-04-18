package time.quiz;

import java.time.LocalDateTime;

/**
 * Test Plus
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class TestPlus {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
		LocalDateTime futureDateTime = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
		System.out.println("기준 시각: " + dateTime);
		System.out.println("1년 2개월 3일 4시간 후의 시각: " + futureDateTime);
	}
}