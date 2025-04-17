package enumeration.ex2;

/**
 * Class Grade
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class ClassGrade {
	public static final ClassGrade BASIC = new ClassGrade();
	public static final ClassGrade GOLD = new ClassGrade();
	public static final ClassGrade DIAMOND = new ClassGrade();

	// private 생성자 추가
	private ClassGrade() {}
}