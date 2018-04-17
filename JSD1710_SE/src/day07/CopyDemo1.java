package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo1 {
	public static void main(String[] args) throws IOException  {
		RandomAccessFile src = new RandomAccessFile("AWSome.png", "r");
		RandomAccessFile desc = new RandomAccessFile("Award.png", "rw");
		
		int d = -1;
		long start = System.currentTimeMillis();
		
		while ((d = src.read()) != -1) {
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("Copy successfully! Time consuming: " + (end-start) + "ms");
		
		src.close();
		desc.close();
	}
}
