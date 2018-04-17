package day04;

import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class Collection_addAll {
	public static void main(String[] args) {
		Collection<Object> c1 = new ArrayList<Object>();
		c1.add("java");
		c1.add("c");
		c1.add(".net");
		
		Collection<Object> c2 = new HashSet<Object>();
		c2.add("php");
		c2.add("android");
		c2.add("oc");
		c2.add("java");
		
		System.out.println(c1.addAll(c2));
		System.out.println(c1);
		
		Collection<Object> c3 = new ArrayList();
		c3.add(".net");
		c3.add("android");
		System.out.println(c1.containsAll(c3));
		
		System.out.println(c1.removeAll(c3));
		System.out.println(c1);
	}
}
