package day05;

import java.lang.Math;

public class Points implements Comparable<Points>{
	private int x;
	private int y;
	
	
	
	public Points(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public int compareTo(Points arg) {
		int myLen = (int)Math.pow(this.x, 2) + (int)Math.pow(this.y, 2);
		int argLen = (int)Math.pow(arg.x, 2) + (int)Math.pow(arg.y, 2);
		 	
		return myLen-argLen;
	}
}
