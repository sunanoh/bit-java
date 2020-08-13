package com.javax.oop.point.v4;

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

		// 오버로딩된 메서드
		//a.draw(false);
		//b.draw(false);
		
		// 자식 클래스 생성
		ColorPoint cp = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		
		cp.draw();
		cp2.draw(true);
	}
	

}
