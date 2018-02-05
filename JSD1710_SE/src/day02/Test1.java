package day02;

public class Test1 {
	public static void main(String[] args) {
		String imgName = "123.jpg";
		
//		String[] names = imgName.split("\\.");
//		long time = System.currentTimeMillis();
//		imgName = time + "." + names[1];
//		System.out.println(imgName);
		
		String name = imgName.substring(imgName.indexOf(".")+1);
		long time = System.currentTimeMillis();
		imgName = time + "." + name;
		System.out.println(imgName);
	}
}
