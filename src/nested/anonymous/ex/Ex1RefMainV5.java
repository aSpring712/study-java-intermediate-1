package nested.anonymous.ex;

import java.util.Random;

/**
 * Ex1 Ref Main V5
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class Ex1RefMainV5 {

	public static void hello(Process process) {
		System.out.println("프로그램 시작");
		// 코드 조각 시작
		process.run();
		// 코드 조각 종료
		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {
		hello(() -> {
			int randomValue = new Random().nextInt(6) + 1;
			System.out.println("주사위 = " + randomValue);
		});

		hello(() -> {
			for (int i = 1; i <= 3; i++) {
				System.out.println("i = " + i);
			}
		});
	}
}