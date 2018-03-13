package day03;

import java.util.Date;

public class DateDemo1 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		long time = date.getTime();
		System.out.println(time);
		
		time += 1000*60*60*24;
		date.setTime(time);
		System.out.println(date);
	}
}
