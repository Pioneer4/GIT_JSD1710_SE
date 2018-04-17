package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("AWSome.png", "r");
		RandomAccessFile desc = new RandomAccessFile("Award.png", "rw");
		
		byte[] date = new byte[1024*10];
		int len = -1;
		long start = System.currentTimeMillis();
		
		while ((len = src.read(date)) != -1) {
			desc.write(date, 0, len);
		}
		long end = System.currentTimeMillis();
		System.out.println("Copy successfully! Time consuming: " + (end-start) + "ms");
		
		src.close();
		desc.close();
	}
}
