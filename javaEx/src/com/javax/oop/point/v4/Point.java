package com.javax.oop.point.v4;

// v4
// ���
public class Point {

	protected int x, y; // ��ӹ��� Ŭ���������� ������ �� �ֵ��� ������ ���� (private -> protected)

	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point ������");
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
	
	// �޼���
	public void draw() {
		System.out.printf("��[x=%d, y=%d]�� �׷Ƚ��ϴ�. %n",x, y);
	}
	
	// �޼��� �����ε�
	// ���� ����Ÿ�԰� ���� �̸��� ��������
	// �Ű������� ����, ����, ������ �ٸ� �޼���
	public void draw(boolean show) {
		// show : true -> �׷Ƚ��ϴ�.
		// show : false -> �������ϴ�.
		String message = show ? "�׷Ƚ��ϴ�." : "�������ϴ�.";
		// TODO : -> if�� �������� �غ���
		
		System.out.printf("��[x=%d, y=%d]�� %s %n",x, y, message);
	}
}
