package lang.string.quiz;

/**
 * Test String 10
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class TestString10 {

	public static void main(String[] args) {
		// split()을 사용해서 fruits를 분리하고, join()을 사용해서 분리한 문자들을 하나로 합쳐라.

		String fruits = "apple,banana,mango";

		// 분리하기
		String[] splitFruits = fruits.split(",");
		for (String fruit : splitFruits) {
			System.out.println(fruit);
		}

		// 합치기
		String joinedString = String.join("->", splitFruits);
		System.out.println("joinedString = " + joinedString);
	}
}