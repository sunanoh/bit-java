package com.javax.oop.point.v4;

public class PointApp {

	public static void main(String[] args) {
	
		Point a = new Point(); // �⺻ ������ ���
		 
		Point b = new Point(10, 23); // ����� ���� ������ ���
		
		a.setX(5);
		a.setY(5);
		
		//b.setX(10);
		//b.setY(23);
		
		a.draw();
		b.draw();

		// �����ε��� �޼���
		//a.draw(false);
		//b.draw(false);
		
		// �ڽ� Ŭ���� ����
		ColorPoint cp = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		
		cp.draw();
		cp2.draw(true);
	}
	

}
