package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("dat.dat", "rw");
		
		raf.write(97);
		
		raf.close();
	}
}
