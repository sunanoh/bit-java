package com.javax.api.objectclass.v1;

// �ڹ��� �ֻ��� Ŭ���� Object
public class Point {

	protected int x, y; 

	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	//	System.out.println("Point ������");
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

	public void draw(boolean show) {
		String message = show ? "�׷Ƚ��ϴ�." : "�������ϴ�.";
		System.out.printf("��[x=%d, y=%d]�� %s %n",x, y, message);
	}

	// toString : print Ȥ�� ���ڿ��� ����� �� ȣ��Ǿ ������ ���ڿ��� ��ȯ
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]"; // ��� ����
	}
	
	

	
	
}
