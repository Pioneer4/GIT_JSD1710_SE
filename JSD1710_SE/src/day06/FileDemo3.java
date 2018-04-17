package day06;

import java.io.File;

public class FileDemo3 {
	public static void main(String[] args) {
		File file = new File("test.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("Operation success");
		} else {
			System.out.println("File is not exist");
		}
	}
}
