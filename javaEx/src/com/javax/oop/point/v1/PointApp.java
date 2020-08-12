package com.javax.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
	
		Point a = new Point();
		Point b = new Point();
		
		a.setX(5);
		a.setY(5);
		
		b.setX(10);
		b.setY(23);
		
		a.draw();
		b.draw();

	}

}
