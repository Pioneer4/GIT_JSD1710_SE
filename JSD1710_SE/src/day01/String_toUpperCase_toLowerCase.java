package day01;

/**
 * String toUpperCase();
 * String toLowerCase();
 * 
 * @author 	Walter
 * @version 0.0 1/31/2018
 * @see 	java.lang.String
 * @since 	JDK1.9
 */
public class String_toUpperCase_toLowerCase {
	public static void main(String[] args) {
		String str = "你好！Java";
		
		String upperStr = str.toUpperCase();
		String lowerStr = str.toLowerCase();
		
		System.out.println(upperStr);
		System.out.println(lowerStr);
	}
}
