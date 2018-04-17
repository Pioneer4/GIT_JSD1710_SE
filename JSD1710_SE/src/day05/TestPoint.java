package day05;

public class TestPoint {
	public static void main(String[] args) {
		Point<Integer> p1 = new Point<Integer>(1, 2);
		p1.setX(12);
		System.out.println(p1);
		int x1 = p1.getX();
		System.out.println(x1);
		
		Point<Double> p2 = new Point<Double>(1.1, 2.2);
		p2.setY(2.222);
		System.out.println(p2);
		double x2 = p2.getX();
		System.out.println(x2);
		
		Point<String> p3 = new Point<String>("one", "two");
		System.out.println(p3);
	}
}
