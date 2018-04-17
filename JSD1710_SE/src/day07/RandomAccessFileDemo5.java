package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo5 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		
		int imax = Integer.MAX_VALUE; 
		raf.writeInt(imax);
		raf.writeLong(123L);
		
		long point  = raf.getFilePointer();
		System.out.println("Point: " + point);
		
		raf.seek(0);
		System.out.println(raf.readInt());
		
		point = raf.getFilePointer();
		System.out.println("Point: " + point);
		
		System.out.println(raf.readLong());
		
		raf.close();
	}
}
