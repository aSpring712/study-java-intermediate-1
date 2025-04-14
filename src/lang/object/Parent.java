package lang.object;

/**
 * Parent
 *
 * 부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-14
 * @version 1.0
 */
public class Parent extends Object {

	public void parentMethod() {
		System.out.println("Parent.parentMethod");
	}
}