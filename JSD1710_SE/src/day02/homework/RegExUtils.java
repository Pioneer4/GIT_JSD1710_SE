package day02.homework;

import org.junit.Test;


/**
 * Exercise 1: Provide a static method to verify the legitimacy of identity card number, zip 
 *             code and cell phone number.
 * @author  Walter    
 * @version 1.0   8-February-2018
 * @see     java.lang
 * @since   JDK 9
 *
 */
public class RegExUtils {
	private static final String IDENTITY_CARD = "\\d{15}|\\d{18}";
	private static final String ZIP_CODE = "[1-9]\\d{5}";
	private static final String PHONE_NUMBER = "(13[0-9]{9})|(15[89][0-9]{8})";
	
	public static boolean identityCard(String str) {
		return str.matches(IDENTITY_CARD);
	}
	
	public static boolean zipCode(String str) {
		return str.matches(ZIP_CODE);
	}
	
	public static boolean phoneNumber(String str) {
		return str.matches(PHONE_NUMBER);
	}
	
	@Test
	public void testRegExUtils() {
		String phoneNum = "13302287167";
		
		System.out.println(RegExUtils.phoneNumber(phoneNum));
	}
}
