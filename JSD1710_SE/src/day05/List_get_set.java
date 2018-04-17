package day05;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class List_get_set {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		String str = list.get(1);
		System.out.println("list.get(1): " + str);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println("old: " + old);
	}
}
