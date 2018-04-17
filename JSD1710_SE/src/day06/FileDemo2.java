package day06;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("." + File.separator + "test.txt");
		
		if (!file.exists()) {
			file.createNewFile();
		} else {
			System.out.println("The file already exists!");
		}
	}
}
