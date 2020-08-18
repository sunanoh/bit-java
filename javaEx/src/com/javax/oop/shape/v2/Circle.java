package com.javax.oop.shape.v2;


public class Circle extends Shape implements Drawable{

	protected double radius; // 반지름
	

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	// 인터페이스를 구현한 메서드
	@Override
	public void draw() {
		System.out.printf("원 (x = %d, y = &d, r = %d, area = %f)을 그렸습니다. %n", x, y, radius, area());
		
	}
	
	@Override
	public double area() {
		// 면적 구하기
		double result = Math.PI * Math.pow(radius, 2); //radius ** 2도 두번 곱하는것과 동일.
		return result;
	}

	
}
