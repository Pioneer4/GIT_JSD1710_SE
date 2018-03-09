package day01;

/**
 * <strong>APIDocDemo</strong>类用于测试生成Javadoc文档
 * This class is used to test document comments.
 * 
 * @author  Walter
 * @version 1.0
 * @see 	java.lang.String
 * @since 	JDK1.9
 */

/**
 * 
 * <strong> 123</Strong> 123
 * @author Administrator
 * @version
 * @see
 * @since
 *
 */
public class APIDocDemo {
	public static void main(String[] args) {
		String str = sayHello("Walter");
		System.out.println(str);
	}
	/**
	 * Greeting used in the method sayHello.
	 */
	public static final String INFO = "Hello! ";
	
	/**
	 * Greetings to designated users.
	 * @param name Designated user's name.
	 * @return Greetings string.
	 */
	public static String sayHello(String name) {
		return INFO + name;
	}
}
