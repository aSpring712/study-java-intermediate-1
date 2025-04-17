package enumeration.quiz.http;

import java.util.Scanner;

/**
 * Http Status Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public class HttpStatusMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("HTTP CODE: ");
		int httpCodeInput = scanner.nextInt();

		HttpStatus status = HttpStatus.findByCode(httpCodeInput);
		if (status == null) {
			System.out.println("정의되지 않은 코드");
		} else {
			System.out.println(status.getCode() + " " + status.getMessage());
			System.out.println("isSuccess = " + status.isSuccess());
		}
	}
}