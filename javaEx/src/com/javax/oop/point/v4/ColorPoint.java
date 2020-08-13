package com.javax.oop.point.v4;


// ��� Ű���� extends
public class ColorPoint extends Point{
	// �߰� �ʵ�
	private String color;
	// ������1
	public ColorPoint(String Color) {
		// Ư���� ���ð� ������ �ڹٴ� super() �����ڸ� ȣ���Ѵ�. --> �θ� ���� �ʱ�ȭ
		this.color = color;
	}
	// ������2
	public ColorPoint(int x, int y, String color) {
		//this.x = x;  // �θ�κ��� �������� x,y�� prviate
		               // -> �θ� ������ �ʵ�� protected�� ���� -> ���ٰ���
		super(x,y); // �θ��� ������ ȣ��
		this.color = color;
		
		System.out.println("Color Point ������");
	}
	
	// getter / setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// �޼��� �������̵� : �θ�κ��� �������� ����� �����ϰ� �ڽ��� ����� ����
	@Override
	public void draw() {
		System.out.printf("������(%d,%d)�� �׷Ƚ��ϴ�. %n",x, y);
	}
	
	@Override
	public void draw(boolean show) {
		String message = show ? "�׷Ƚ��ϴ�." : "�������ϴ�.";
		System.out.printf("������(%d,%d,%s)�� �׷Ƚ��ϴ�. %n",x, y,message);
		
		// ���� �θ� ���� �޼��带 �����ؾ� �Ѵٸ�
		System.out.println("=== parent method");
		super.draw(show);
		
	}
}
