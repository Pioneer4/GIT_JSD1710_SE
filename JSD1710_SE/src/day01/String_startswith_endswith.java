package day01;

/**
 * boolean startswith(String str);
 * boolean endswith(String str);
 * 
 * @author  Walter
 * @version 0.0 1/31/2018
 * @see 	java.lang.String
 * @since 	JDK1.9
 */
public class String_startswith_endswith {
	public static void main(String[] args) {
		String str = "thinking in java";
		
		boolean starts = str.startsWith("think");
		System.out.println(starts);
		
		boolean ends = str.endsWith("java");
		System.out.println(ends);
	}
}
