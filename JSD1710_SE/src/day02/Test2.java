package day02;

public class Test2 {
	public static void main(String[] args) {
		String regex = "(wqnmlgb|nc|cnm|mdzz|djb|sb|nmlgb)";
		String message = "wqnmlgb!你个sb!你怎么这么的nc!nmlgb";
		
		message = message.replaceAll(regex, "**");
		System.out.println(message);
	}
}


//