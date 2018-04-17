package day06;

import java.io.File;

public class FileDemo6 {
	public static void main(String[] args) {
		File dir = new File("." + File.separator + "Demo");
		if (dir.exists()) {
			/*
			 * The method can only delete the empty directories.
			 */
			dir.delete();
			System.out.println("Operation OK");
		} else {
			System.out.println("The direction is not exists!");
		}
	}
	
}
