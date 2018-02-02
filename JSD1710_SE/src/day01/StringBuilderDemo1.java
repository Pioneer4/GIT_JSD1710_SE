package day01;

/**
 * java.lang.StringBuilder
 * 
 * @author  Walter
 * @version 0.0 1/31/2018
 * @see 	java.lang.String
 * @since 	JDK1.9
 */
public class StringBuilderDemo1 {
	public static void main(String[] args) {
		String str = "Work hard!";
		
		StringBuilder builderStr = new StringBuilder(str);
		builderStr.append("In order to learn java.");
		
		System.out.println(builderStr);
		
		str = builderStr.toString();
		System.out.println(str);
		
		builderStr.replace(10, 33, "Change the world!");
		System.out.println(builderStr);
		
		builderStr.delete(0, 10);
		System.out.println(builderStr);
		
		builderStr.insert(0, "Come on! ");
		System.out.println(builderStr);
		
		builderStr.reverse();
		System.out.println(builderStr);
	}
}

