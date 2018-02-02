package day01;

/**
 * valueOf
 * 
 * @author  Walter
 * @version 0.0 1/31/2018
 * @see 	java.lang.String
 * @since 	JDK1.9
 */
public class String_valueOf {
	public static void main(String[] args) {
		int a = 123;
		
		String str = String.valueOf(a);
		System.out.println(str + 4);
		
		double b = 123.123;
		str =  String.valueOf(b);
		System.out.println(str + 4);
	}
}
