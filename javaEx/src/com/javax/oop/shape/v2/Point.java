package com.javax.oop.shape.v2;

// v4
// ���
public class Point implements Drawable{

	protected int x, y; // ��ӹ��� Ŭ���������� ������ �� �ֵ��� ������ ���� (private -> protected)

	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	// �޼���
	// Drawable �������̽��� ������ �޼���
	@Override
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
