package day06;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

public class FileDemo1 {
	public static void main(String[] args) {
		File file  = new File("." + File.separator + "demo.txt");
		
		String name = file.getName();
		System.out.println("name: " + name);
		
		long length = file.length();
		System.out.println("length: " + length);
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
		
		long time = file.lastModified();
		Date date = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日，hh:mm:ss");
		System.out.println(sdf.format(date));
	}
}
