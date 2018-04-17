package day06;

import java.io.File;

public class FileDemo7 {
	public static void main(String[] args) {
		File dir = new File(".");
		if (dir.isDirectory()) {
			File[] subs = dir.listFiles();
			for (File sub : subs) {
				System.out.println(sub.getName());
			}
		}
	}
}
