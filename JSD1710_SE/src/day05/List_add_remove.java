package day05;

import java.util.List;
import java.util.ArrayList;

public class List_add_remove {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println("list: " + list);
		
		/*
		 * void add(int index, E element);
		 */
		list.add(2, "3");
		System.out.println("list: " + list);
		
		/*
		 * E remove(int index);
		 */
		String removeStr = list.remove(2);
		System.out.println("list: " + list);
		System.out.println("removeStr: " + removeStr);
	}
}
