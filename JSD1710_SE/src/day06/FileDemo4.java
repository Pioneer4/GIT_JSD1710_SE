package day06;

import java.io.File;

public class FileDemo4 {
	public static void main(String[] args) {
		File dir  = new File("Demo");
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("Operation success");
		} else {
			System.out.println("The directory has been exists!");
		}
	}
}
