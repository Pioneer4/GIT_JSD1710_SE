package day03;

import java.util.Calendar;

public class Calendar_add {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, 4);
		calendar.add(Calendar.DAY_OF_YEAR, 100);
		
		System.out.println(calendar.getTime());
	}
}
