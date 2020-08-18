package com.javax.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
	
		// �߻� Ŭ������ new�� ������ �� ����
		// Shape s = new Shape(); 
		
		Circle c = new Circle(10, 20 ,30);
		//c.draw();
		printObject(c);
		
		Rectangle r = new Rectangle(10,10,30,40);
		//r.draw();
		printObject(r);
		
		Point p = new Point(100,200);
		printObject(p);
		
		//�������̽��� ���� Ÿ������ ������ �� �ֵ�.
		Drawable d = c;
		
		// instanceof �����ڷ� ���� ��ü�� �������̽��� Ȯ���� �� �ִ�.
		if(r instanceof Drawable) {
			((Drawable)r).draw(); // �ν��Ͻ� Ÿ�������� ��ȯ ���� 
		}
	}

	private static void printObject(Drawable obj) {
		// Point�� Circle, Rectangle�� ���� ��Ӱ��迡 ���� ������
		// �������̽��� �����ϹǷ� ���� �׷����� ���� �� �ִ�.
		obj.draw();
		
	}
}
