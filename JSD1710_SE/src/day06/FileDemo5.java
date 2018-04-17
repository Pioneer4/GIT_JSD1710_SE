package day06;

import java.io.File;

public class FileDemo5 {
	public static void main(String[] args) {
		File dir = new File("." + File.separator +
				"a" + File.separator +
				"b" + File.separator +
				"c" + File.separator +
				"d" + File.separator +
				"e");
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("Operation success");
		} else {
			System.out.println("The direction has been exists!");
		}
				
	}
}
