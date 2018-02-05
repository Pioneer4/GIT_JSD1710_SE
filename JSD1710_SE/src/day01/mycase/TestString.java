package day01.mycase;

import org.junit.Test;

public class TestString {
	/**
	 * Test constant pool.
	 */
	@Test
	public void testConstantPool() {
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println((str1 == str2));
		
		String str3 = new String("Hello");
		System.out.println(str1 == str3);
	}
	
	/**
	 * Get the length the of string.
	 */
	@Test
	public void testLength() {
		String str1 = "Walter";
		String str2 = "你好 ！";
		
		System.out.println(str1.length());
		System.out.println(str2.length());
	}
	
	/**
	 * Retrieve the index of a designated string in the string.
	 */
	@Test
	public void testIndexOf() {
		String str = "I can because i think i can";
		
		System.out.println(str.indexOf("can"));
		System.out.println(str.lastIndexOf("can"));
		
		System.out.println(str.indexOf("can", str.indexOf("can")+1));
		
		System.out.println(str.indexOf("CAN"));
	}
	
	/**
	 * Intercepts the designated substring from source string.
	 */
	@Test
	public void testSubstring() {
		String str = "http://www.oracle.com";
		
		int indexBegin = str.indexOf(".") + 1;
		int indexEnd = str.indexOf(".", indexBegin);
		String substring = str.substring(indexBegin, indexEnd);
		System.out.println(substring);
	}
	
	/**
	 * Remove a string's leading and trailing whitespace.
	 */
	@Test
	public void testTrim() {
		String str = " Hello ";
		
		System.out.println(str);
		System.out.println(str.length());
		
		str = str.trim();
		System.out.println(str);
		System.out.println(str.length());
	}
	
	
	/**
	 * Rerurn the value at the specified index of th string.
	 */
	@Test
	public void testCharAt() {
		String  str = "Thinking in java";
		
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			System.out.print(c + " ");
		}
	}
	
	/**
	 * Test if string starts or ends with the specified prefix.
	 */
	@Test
	public void testStartsWithAndEndsWith() {
		String str = "Thinking in java";
		
		System.out.println(str.startsWith("Th"));
		System.out.println(str.startsWith("thinking"));
		
		System.out.println(str.endsWith("java"));
		System.out.println(str.endsWith("Java"));
	}
	
	/**
	 * Converts all of the characters to the upper case or to the lower case.
	 */
	@Test
	public void testTOUpperCasseAndToLowerCase() {
		String str = "I love java";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}
	
	/**
	 * Return the string  representation of the argument.
	 */
	@Test
	public void testValueOf() {
		double pi = 3.14159;
		char[] cs = new char[] {'l', 'o', ' ', 'v', 'e'};
		
		String str = String.valueOf(pi);
		System.out.println("length: " + str.length());
		System.out.println(str);
		
		str = String.valueOf(cs);
		System.out.println("length: " + str.length());
		System.out.println(str);
	}
	
	/**
	 * Test the method append of StringBuilder.
	 */
	@Test
	public void testAppend() {
		String str = "Programming Language:";
		StringBuilder sb = new StringBuilder(str);
		sb.append(" java").append(" cpp").append(" php").append(" c#").append(" objective-c");
		
		System.out.println(sb.toString());
	}
	
	/**
	 * Test the method insert of StringBuilder.
	 */
	@Test
	public void testInsert() {
		StringBuilder sb = new StringBuilder("java cpp c# objective-c");
		
		sb.insert(8, " php");
		System.out.println(sb.toString());
	}
	
	/**
	 * Test the method delete of StringBuilder.
	 */
	@Test
	public void testDelete() {
		StringBuilder sb = new StringBuilder("java cpp php c# objective-c");
		
		sb.delete(8, 8+4);
		System.out.println(sb.toString());
	}
	
	/**
	 * Output all Unicode encoding Chinese characters.
	 */
	@Test
	public void testOutputChineseCharaters() {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (char c='\u4e00'; c<='\u9fa5'; c++) {
			i++;
			sb.append(c);
			if (i%50 == 0) {
				sb.append("\n");
			}
		}
		System.out.println("amount: " + i);
		System.out.println(sb.toString());
	}
}
