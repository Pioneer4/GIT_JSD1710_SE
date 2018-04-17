package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo4 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "r");
		
		byte[] data = new byte[1024];
		
		int len = raf.read(data);
		
		String str = new String(data, 0, len, "GBK");
		System.out.println(str);
		
		raf.close();
	}
}
