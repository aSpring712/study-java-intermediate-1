package exception.ex1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Main V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class MainV1 {

	public static void main(String[] args) {
//		NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
//		NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
		NetworkServiceV1_3 networkService = new NetworkServiceV1_3();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("전송할 문자: ");
			String input = scanner.nextLine();
			if (input.equals("exit")) {
				break;
			}
			networkService.sendMessage(input);
			System.out.println();
		}
		System.out.println("프로그램을 정상 종료합니다.");
	}
}