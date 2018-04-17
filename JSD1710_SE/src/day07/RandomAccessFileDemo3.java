package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo3 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		
		String str = "I am learning java!";
		byte[] date = str.getBytes("UTF-8");
		raf.write(date);
		
		str = "\r\nfor instance";
		date = str.getBytes("UTF-8");
		raf.write(date);
		
		System.out.println("Operation successfully!");
		
		raf.close();
	}
}
