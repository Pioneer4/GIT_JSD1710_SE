package day02;

public class IntegerDemo {
	public static void main(String[] args) {
		int a = -128;
		Integer i = new Integer(a);
		Integer i1 = Integer.valueOf(a);
		Integer i2 = Integer.valueOf(a);
		dosome(i);
		int b = i.intValue();
		System.out.println(b);
		System.out.println(i1==i2);
		
		double c = i1.doubleValue();
		System.out.println(c);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}
	
	public static void dosome(Object obj) {
		
	}
}
