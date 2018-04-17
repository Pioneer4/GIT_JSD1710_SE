package day05;

import java.util.Collection;
import java.util.ArrayList;

public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		System.out.println(c.toArray());
		
		String[] array = c.toArray(new String[4]);
		System.out.println("size of array: " + array.length);
		for (String str : array) {
			System.out.println(str);
		}
	}
}
