package day02;

public class String_matches {
	public static void main(String[] args) {
		String email = "zhangqinkaituozhe@163.com";
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		
		boolean tf = email.matches(regex);
		if (tf) {
			System.out.println("It is an email address!");
		} else {
			System.out.println("It is not an email address!");
		}
	}
}
