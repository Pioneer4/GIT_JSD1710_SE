package day05;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Collections_sort {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		Random rand = new Random();
		for (int i=0; i<10; i++) {
			list.add(rand.nextInt(100));
		}
		System.out.println(list);
		
		/*
		 * Sort strings by it's Unicode encoding order.
		 */
		Collections.sort(list);
		System.out.println(list);
	}
}
