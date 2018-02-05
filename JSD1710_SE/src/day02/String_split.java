package day02;

public class String_split {
	public static void main(String[] args) {
		String str = "abc123def456ghi789jkl";
		
		String[] date = str.split("[0-9]+");
		System.out.println(date.length);
		for (int i=0; i<date.length; i++) {
			System.out.println(date[i]);
		}
 	}
}
