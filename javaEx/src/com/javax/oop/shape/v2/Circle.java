package com.javax.oop.shape.v2;


public class Circle extends Shape implements Drawable{

	protected double radius; // ������
	

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	// �������̽��� ������ �޼���
	@Override
	public void draw() {
		System.out.printf("�� (x = %d, y = &d, r = %d, area = %f)�� �׷Ƚ��ϴ�. %n", x, y, radius, area());
		
	}
	
	@Override
	public double area() {
		// ���� ���ϱ�
		double result = Math.PI * Math.pow(radius, 2); //radius ** 2�� �ι� ���ϴ°Ͱ� ����.
		return result;
	}

	
}
