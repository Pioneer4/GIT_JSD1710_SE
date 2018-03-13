package day03;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Test {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input your birthday:(yyyy-mm-dd)");
		String birthStr = scan.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date birthDate = sdf.parse(birthStr);
		Date now  = new Date();
		long time = now.getTime() - birthDate.getTime();
		time = time/1000/60/60/24;
		System.out.println("You have lived " + time + " days!");
	}
}
