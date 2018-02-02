package day01;

/**
 * int indexOf(String str);
 * int indexOf(String str, int index);
 * int lastIndexOf(String str);
 * The demo of return the substring's index within the designated string. 
 * 
 * @author 	Walter
 * @version 0.0 1/30/2018
 * @see	    java.lang.String
 * @since 	JDK1.9
 */
public class String_indexOf {
	public static void main(String[] args) {
		String str = "thinking in java";
		
		int index = str.indexOf("in");
		System.out.println(index);
		
		index = str.indexOf("in", 2);
		System.out.println(index);
		
		index = str.indexOf("in", 3);
		System.out.println(index);
		
		index = str.lastIndexOf("in");
		System.out.println(index);
	}
}
