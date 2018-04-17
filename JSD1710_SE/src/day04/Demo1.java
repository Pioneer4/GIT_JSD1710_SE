package day04;

import java.util.Collection;
import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		test(null);
	}
	
	public static void test(int i) {
		System.out.println("int");
	}
	
//	public static void test(String str) {
//		System.out.println("string");
//	}
	
	public static void test(ArrayList arraylist) {
		System.out.println("arraylist");
	}
	
	public static void test(Collection c) {
		System.out.println("collection");
	}
	
	public static void test(Object o) {
		System.out.println("object");
	}
}
