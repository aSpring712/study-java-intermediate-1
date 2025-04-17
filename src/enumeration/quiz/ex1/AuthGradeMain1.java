package enumeration.quiz.ex1;

/**
 * Auth Grade Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public class AuthGradeMain1 {

	public static void main(String[] args) {

		AuthGrade[] values = AuthGrade.values();

		for (AuthGrade value : values) {
			System.out.println("grade = " + value.name() + ", level = " + value.getLevel() + ", 설명 = " + value.getDescription());
		}
	}
}