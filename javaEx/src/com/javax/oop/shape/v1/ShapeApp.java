package com.javax.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
	
		// �߻� Ŭ������ new�� ������ �� ����
		// Shape s = new Shape(); 
		
		Circle c = new Circle(10, 20 ,30);
		c.draw();
		
		Rectangle r = new Rectangle(10,10,30,40);
		r.draw();
	}

}
