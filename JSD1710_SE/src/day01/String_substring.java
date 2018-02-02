package day01;

/**
 * String substring(int start, int end);
 * Intercepts the designated index substring from source string.
 * 
 * @author  Walter
 * @version 0.0 1/30/2018
 * @see 	java.lang.String
 * @since 	JDK1.9
 */
public class String_substring {
	public static void main(String[] args) {
		String str = "www.oracle.com";
		
		String sub = str.substring(4, str.length()-4);
		System.out.println(sub);
		
		sub = str.substring(4);
		System.out.println(sub);
		
		String host = "http://www.oracle.com.cn";
		int start = host.indexOf(".") + 1;
		int end = host.indexOf(".", start);
		sub = host.substring(start, end);
		System.out.println(sub);
	}
}
