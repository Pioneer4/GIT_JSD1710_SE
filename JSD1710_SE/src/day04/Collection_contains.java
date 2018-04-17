package day04;

import java.util.Collection;
import java.util.ArrayList;

public class Collection_contains {
	public static void main(String[] args) {
		Collection<Object> c = new ArrayList<Object>();
		
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		c.add(new Point(7, 8));
		c.add("hello");
		
		System.out.println(c);
		System.out.println(c.contains(new Point(1, 2)));
	}
}
