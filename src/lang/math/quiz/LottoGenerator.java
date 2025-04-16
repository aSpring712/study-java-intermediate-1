package lang.math.quiz;

import java.util.Random;

/**
 * Lotto Generator
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class LottoGenerator {

	private final Random random = new Random();
	private int[] lottoNumbers;
	private int count;

	public int[] generate() {
		lottoNumbers = new int[6];
		count = 0;

		while (count < 6) {
			// 1부터 45 사이의 숫자 생성
			int number = random.nextInt(45) + 1;
			if (isUnique(number)) {
				lottoNumbers[count] = number;
				count++;
			}
		}
		return lottoNumbers;
	}

	// 이미 생성된 번호와 중복되는지 검사
	private boolean isUnique(int number) {
		for (int i = 0; i < count; i++) {
			if (lottoNumbers[i] == number) {
				return false;
			}
		}
		return true;
	}
}