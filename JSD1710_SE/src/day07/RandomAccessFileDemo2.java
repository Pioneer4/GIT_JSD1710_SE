package day07;

import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("dat.dat", "rw");
		
		int d = raf.read();
		System.out.println(d);
		raf.close();
	}
}
