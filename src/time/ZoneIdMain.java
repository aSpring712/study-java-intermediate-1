package time;

import java.time.ZoneId;

/**
 * Zone Id Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public class ZoneIdMain {

	public static void main(String[] args) {
		for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
			ZoneId zoneId = ZoneId.of(availableZoneId);
			System.out.println(zoneId + " | " + zoneId.getRules());
		}

		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("ZoneId.systemDefault = " + zoneId);

		ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
		System.out.println("seoulZoneId = " + seoulZoneId);
	}
}