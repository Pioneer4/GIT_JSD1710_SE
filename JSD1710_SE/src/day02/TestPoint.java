package day02;

public class TestPoint {
	public static void main(String[] args) {
		Point p = new Point();
		p.setX(1);
		p.setY(2);
		
		String str = p.toString();
		System.out.println(str);
		
		System.out.println(p);	
		
		Point p1 = new Point();
		p1.setX(1);
		p1.setY(2);
		
		System.out.println(p.equals(p1));
	}
}
