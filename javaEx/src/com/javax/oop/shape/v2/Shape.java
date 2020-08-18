package com.javax.oop.shape.v2;

// �߻�Ŭ���� : ��ü Ŭ������ �������� ������ ���赵
public abstract class Shape {
	
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// �߻� �޼��� : �߻� Ŭ������ ��ӹ��� ��ü Ŭ������
	// �ݵ�� �θ��� �߻� Ŭ������ ������ �־�� �Ѵ�.
	// �߻� �޼���� �����ΰ� ����, Ư�� ����� ������ ���� �ϴ� ������ ��
	// public abstract void draw(); --> �������̽��� �и� 
	public abstract double area();

}
