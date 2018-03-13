package day03;

import java.util.Calendar;

public class Calendar_set {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR, 2018);
		calendar.set(Calendar.MONTH, 6);
		calendar.set(Calendar.DAY_OF_MONTH, 30);
		System.out.println(calendar.getTime());
	}
}
