package day01;

/**
 * String trim();
 * Remove the white space on both sides of the string.
 * 
 * @author 	Walter
 * @version 0.0 1/30/2018
 * @see 	java.lang.String
 * @since 	JDK1.9
 */
public class String_trim {
	public static void main(String[] args) {
		String str = "   Hello ! ";
		
		String s = str.trim();
		System.out.println(s);
		System.out.println(str);
	}
}
