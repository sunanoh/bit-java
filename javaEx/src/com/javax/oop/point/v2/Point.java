package com.javax.oop.point.v2;


// v2.
// ������ ����
public class Point {

	private int x, y;

	// ����� ���� �����ڰ� ���� ���
	// JVM�� �⺻ �����ڸ� ������ �ʴ´�
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
	
	public void draw() {
		System.out.printf("��[x=%d, y=%d]�� �׷Ƚ��ϴ�. %n",x, y);
	}
	
}
