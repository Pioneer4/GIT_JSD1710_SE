package day07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Note {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the file's name: ");
		String fileName = scan.nextLine();
		
		RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
		
		System.out.println("Enter contents");
		while (true) {
			String str = scan.nextLine();
			if ("exit".equals(str)) {
				break;
			}
			
			raf.write(str.getBytes("UTF-8"));
		}
		
		System.out.println("Bye");
		raf.close();
	}
}
