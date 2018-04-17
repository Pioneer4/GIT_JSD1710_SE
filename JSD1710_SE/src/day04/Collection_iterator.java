package day04;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Collection_iterator {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		System.out.println(c);
		
		Iterator<String> it = c.iterator();
		
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
			
			if ("#".equals(str)) {
				it.remove();
			}
		}
		
		System.out.println(c);
	}
}
