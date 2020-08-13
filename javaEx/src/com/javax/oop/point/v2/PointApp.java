package com.javax.oop.point.v2;

public class PointApp {

	public static void main(String[] args) {
	
		Point a = new Point(); // 기본 생성자 사용
		 
		Point b = new Point(10, 23); // 사용자 정의 생서자 사용
		
		a.setX(5);
		a.setY(5);
		
		//b.setX(10);
		//b.setY(23);
		
		a.draw();
		b.draw();

	}

}
