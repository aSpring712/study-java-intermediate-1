package lang.clazz;

/**
 * Class Create Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-16
 * @version 1.0
 */
public class ClassCreateMain {

	public static void main(String[] args) throws Exception {
//		Class helloClass = Hello.class;
		Class helloClass = Class.forName("lang.clazz.Hello");
		Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
		String result = hello.hello();
		System.out.println("result = " + result);
	}
}