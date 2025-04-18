package time;

import java.time.LocalDate;

/**
 * Local Date Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public class LocalDateMain {

	public static void main(String[] args) {

		LocalDate nowDate = LocalDate.now();
		LocalDate ofDate = LocalDate.of(2013, 11, 21);
		System.out.println("오늘 날짜 = " + nowDate);
		System.out.println("지정 날짜 = " + ofDate);

		// 계산(불변)
		LocalDate plusDays = ofDate.plusDays(10);
		System.out.println("지정 날짜+10d = " + plusDays);
	}
}