package day03;

import java.util.Collection;
import java.util.ArrayList;

public class Collection_Demo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(1);
		c.add("electrical");
		c.add("math");
		c.add("computer");
		
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		c.clear();
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
	}
}
