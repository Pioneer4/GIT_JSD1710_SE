package day01;

/**
 * char charAt(int index)
 * 
 * @author  Walter
 * @version 0.0 1/30/2018
 * @see     java.lang.String
 * @since   JDK1.9
 */
public class String_charAt {
	public static void main(String[] args) {
		String str = "thinking in java";
		char c = str.charAt(9);
		System.out.println(c);
		
		String s = "ABCDCBA";
		boolean palindrome = true;
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length()-1-i)) {
				palindrome = false;
			}
		}
		
		if (palindrome) {
			System.out.println("This string is palindrome.");
		} else {
			System.out.println("This string is not a palindrome.");
		}
	}
}
