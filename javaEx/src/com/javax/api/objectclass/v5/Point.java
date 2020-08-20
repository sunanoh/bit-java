package com.javax.api.objectclass.v5;

// v3. ���� (���� ����)
// ���� : object.clone() �޼��带 ���
//      --> Clonable �������̽��� �����ؾ� clone() �޼��� ��� ����
public class Point implements Cloneable{

	protected int x, y; 

	
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

	public void draw(boolean show) {
		String message = show ? "�׷Ƚ��ϴ�." : "�������ϴ�.";
		System.out.printf("��[x=%d, y=%d]�� %s %n",x, y, message);
	}

	// toString : print Ȥ�� ���ڿ��� ����� �� ȣ��Ǿ ������ ���ڿ��� ��ȯ
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]"; // ��� ����
	}

	// equals : ���� ���� ������ ���� ���� �ۼ�
	@Override
	public boolean equals(Object obj) { // object�� point�� �ٿ� ĳ��Ʈ �ʿ�
		if(obj instanceof Point) { // Ŭ���� üũ
			// �ٿ�ĳ��Ʈ ����
			Point other = (Point)obj;
			return this.x == other.x && this.y == other.y;
		}
		
		return super.equals(obj);
	}
	
	
	public Point getClone() {
		Point clone = null;
		
		try {
			clone = (Point)clone(); // ������ �� �ٿ�ĳ����
		}catch(CloneNotSupportedException e) {
			System.err.println("���� �Ұ� ��ü!");
		}
		
		return clone;
	}
	
	

	
	
}
