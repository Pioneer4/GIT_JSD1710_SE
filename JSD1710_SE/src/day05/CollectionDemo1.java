package day05;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		
		System.out.println(c);
		
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		for (String str : c) {
			System.out.println(str);
		}
	}
}
