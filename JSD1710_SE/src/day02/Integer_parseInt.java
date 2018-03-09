package day02;

public class Integer_parseInt {
	public static void main(String[] args) {
		String str = "123";
		int a = Integer.parseInt(str);
		System.out.println(a);
		
		str = "123.123";
		double b = Double.parseDouble(str);
		System.out.println(b);
	}
}
