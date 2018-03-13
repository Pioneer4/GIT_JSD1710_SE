package day03;

import java.util.Calendar;
import java.util.Date;

public class Calendar_getInstance {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		Date date = calendar.getTime();
		System.out.println(date);
		
		calendar.setTime(date);
	}
}
