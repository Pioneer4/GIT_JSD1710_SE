package day05;

import java.util.LinkedList;
import java.util.Deque;

public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.offer("one");
		deque.offer("two");
		deque.offerLast("three");
		deque.offerFirst("four");
		System.out.println(deque);
		
		String str = deque.poll();
		System.out.println(str);
		
		str = deque.pollLast();
		System.out.println(str);
		
		System.out.println(deque);
	}
}
