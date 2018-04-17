package day05;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = {"one", "two", "three", "four"};
		
		List<String> list = Arrays.asList(array);
		System.out.println(list.size());
		System.out.println(list);
		
		list.set(1, "2");
		System.out.println(list);
		
		/*
		 * The operation of the collection elements is the operation of 
		 * the original array element.
		 */
		for (String str : array) {
			System.out.println(str);
		}
		
		/*
		 * Collection converted from array cannot add new element. 
		 */
		//list.add("5");
		
		/*
		 * If you want to add new elements, you can do the following.
		 */
		List<String> list1 = new ArrayList<String>();
		list1.addAll(list);
		list1.add("5");
		System.out.println("list1: \r\n" + list1);
	}
}
