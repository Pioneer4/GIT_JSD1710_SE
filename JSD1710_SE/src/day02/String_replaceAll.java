package day02;

public class String_replaceAll {
	public static void main(String[] args) {
		String str = "abc123def456ghi789jkl";
		
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
	}
}
