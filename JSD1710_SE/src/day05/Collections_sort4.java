package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_sort4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Walter");
		list.add("electrical");
		list.add("mathematic");
		list.add("java");
		System.out.println(list);
		
		/*
		 * The overload "sort" method doesn't require the Comparable interface
		 * to be implemented. If it has already been implemented, it will not 
		 * be compared against the previously implemented comparison rules, but
		 * follow current rules. 
		 */
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				return arg0.length() - arg1.length();
			}
		});
		
		System.out.println(list);
	}
}
