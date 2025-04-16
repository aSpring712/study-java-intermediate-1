package lang.math.quiz;

import java.util.Random;

/**
 * Lotto Generator Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class LottoGeneratorMain {

	public static void main(String[] args) {
		LottoGenerator generator = new LottoGenerator();
		int[] lottoNumbers = generator.generate();

		// 생성된 로또 번호 출력
		System.out.print("로또 변호: ");
		for (int lottoNumber : lottoNumbers) {
			System.out.print(lottoNumber + " ");
		}
	}
}