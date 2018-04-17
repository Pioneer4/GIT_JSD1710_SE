package day05;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		
		String str = queue.poll();
		System.out.println(queue);
		System.out.println("which element has benn outed: " + str);
		
		str = queue.peek();
		System.out.println(queue);
		System.out.println(str);
		
		for (String s : queue) {
			System.out.println(s);
		}
		
	}
}
