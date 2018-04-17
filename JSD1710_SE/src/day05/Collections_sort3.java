package day05;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Collections_sort3 {
	public static void main(String[] args) {
		List<Points> list = new ArrayList<Points>();
		list.add(new Points(1,2));
		list.add(new Points(2,3));
		list.add(new Points(3,4));
		list.add(new Points(4,5));
		list.add(new Points(5,6));
		System.out.println(list);
		
		/*
		 * Collection must implement Comparable interface to use
		 * sort method to sort the collection elements.
		 */
		Collections.sort(list);
	}
}
