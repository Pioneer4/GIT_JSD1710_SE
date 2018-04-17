package day05;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Deque;

public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		System.out.println(stack);
		
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		str = stack.peek();
		System.out.println(str);
		System.out.println(stack);
		
		for (String str1 : stack) {
			System.out.println(str1);
		}
	}
}
