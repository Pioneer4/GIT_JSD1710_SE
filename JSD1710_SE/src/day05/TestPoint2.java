package day05;

public class TestPoint2 {
	public static void main(String[] args) {
		Point<Integer> p1 = new Point<Integer>(1, 2);
		
		/* 
		 * The complier will have the following operations
		 * when it finds int x1 = p1.getX();
		 * int x1 = ((Integer)p1.getX()).intValue();
		 */
		int x1 = p1.getX();
		System.out.println("x1: " + x1);
		
		Point p2 = p1;
		System.out.println("p2: " + p2);
		
		p2.setX("one");
		System.out.println("p2: " + p2);
		
		String x2 = (String)p2.getX();
		System.out.println("x2: " + x2);
		
		/*
		 * Complier will do:
		 * x1 = ((Integer)p1.getX()).intValue();
		 */
		x1 = p1.getX();  //error: ClassCastException
		System.out.println("x1: " + x1);
	}
}
