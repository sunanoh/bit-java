package com.javax.oop.shape.v1;

// ������ ���� ����? 
// 1. �������� ����
// 2. �߻� �޼��� ������ ����
public class Circle extends Shape{
	// x,y �ʵ�� draw, area �޼��带 ���
	// �ڽŸ��� �ʵ�
	protected double radius; // ������
	
	// ������
	public Circle(int x, int y, double radius) {
		// �θ� ������ ȣ��
		super(x, y);
		this.radius = radius;
	}
	
	// �߻� Ŭ������ ��ӹ��� �ڽ� Ŭ������ �߻� Ŭ������ "�ݵ��" �������־�� �Ѵ�.
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
