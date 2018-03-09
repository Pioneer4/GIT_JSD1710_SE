package day02.mycase;

import org.junit.Test;
import java.util.Arrays;

public class TestTRegex {
	
	@Test
	public void testSplit() {
		String str = "java cpp php c# objective-c";
	    String[] strArr = str.split("\\s");
	    System.out.println(Arrays.toString(strArr));

	    String line = "100+200-150=150";
	    strArr = line.split("[\\+\\-=]");
	    System.out.println(Arrays.toString(strArr));
	}
	
	@Test
	public void testIntValueAndDoubleValue() {
        Number d = 123.45;
        Number n = 123;
        
        System.out.println(d.getClass().getName()); // java.lang.Double
        System.out.println(n.getClass().getName()); // java.lang.Integer
    }
}
