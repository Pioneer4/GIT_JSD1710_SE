package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_format {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss E a");
		String str = sdf.format(now);
		System.out.println(str);
	}
}
