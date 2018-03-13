package day03;

import java.util.Calendar;

public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "-" + month + "-" + day);
		
		int hour   = calendar.get(Calendar.HOUR_OF_DAY); 
		int minute = calendar.get(Calendar.MINUTE); 
		int second = calendar.get(Calendar.SECOND);  
		
		System.out.println(hour + ":" + minute + ":" + second);
		
		String[] date = {"日", "一", "二", "三", "四", "五", "六"};
		int dow = calendar.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(date[dow]);
		
		int dd = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(dd);
	}
}
