package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NewForDemo2 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		
		for (String str : c) {
			System.out.println(str);
		}
		
		/*
		 *  The complier while use iterator traversal collection
		 *  when it finds a new for.
		 *  
		 *  Attention: JVM doesn't support the syntax of new for.
		 */
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			String str = (String)o;
			System.out.println(str);
		}
	}
}
