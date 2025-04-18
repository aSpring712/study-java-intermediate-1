package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Offset Date Time Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public class OffsetDateTimeMain {

	public static void main(String[] args) {
		OffsetDateTime nowOdt = OffsetDateTime.now();
		System.out.println("nowOdt = " + nowOdt);

		LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
		System.out.println("ldt = " + ldt);
		OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
		System.out.println("odt = " + odt);
	}
}