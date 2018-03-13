package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_parse {
	public static void main(String[] args) throws ParseException {
		String str = "2008-10-01 10:01:01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = sdf.parse(str);
		
		System.out.println(date);
	}
}
