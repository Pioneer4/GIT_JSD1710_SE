package day04;

import java.util.Collection;
import java.util.ArrayList;

public class Collection_remove {
	public static void main(String[] args) {
		Collection<Point> c = new ArrayList<Point>();
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		c.add(new Point(1, 2));
		System.out.println(c);
		
		c.remove(new Point(1, 2));
		System.out.println(c);
	}
}
