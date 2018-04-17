package day06;

import java.io.File;
import java.io.FileFilter;

public class FileDemo8 {
	public static void main(String[] args) {
		File dir = new File(".");
		
		File[] subs = dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File arg0) {
				return arg0.isFile();
			}
		});
		
		for (File sub : subs) {
			System.out.println(sub.getName());
		}
	}
}
