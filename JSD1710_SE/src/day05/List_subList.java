package day05;

import java.util.ArrayList;
import java.util.List;

public class List_subList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<10; i++) {
			list.add(i);
		}
		System.out.println("list: " + list);
		
		/*
		 * List<E> subList(int fromIndex, int toIndex);
		 */
		List<Integer> subList =  list.subList(3, 8);
		System.out.println("subList: " + subList);
		
		for (int i=0; i<subList.size(); i++) {
			subList.set(i, subList.get(i)*10);
		}
		
		System.out.println("After *10, subList: " + subList);
		System.out.println("After *10, list: " + list);
		
		list.subList(2, 9).clear();
		System.out.println("After clear, list: " + list);
	}
}
