package com.javax.oop.shape.v2;

// 추상클래스 : 실체 클래스의 공통점만 추출한 설계도
public abstract class Shape {
	
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상 메서드 : 추상 클래스를 상속받은 실체 클래스는
	// 반드시 부모의 추상 클래스를 구현해 주어야 한다.
	// 추상 메서드는 구현부가 없음, 특정 기능의 구현을 강제 하는 역할을 함
	// public abstract void draw(); --> 인터페이스로 분리 
	public abstract double area();

}
