package com.javax.oop.point.v2;


// v2.
// 생성자 연습
public class Point {

	private int x, y;

	// 사용자 정의 생서자가 있을 경우
	// JVM은 기본 생성자를 만들지 않는다
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
		System.out.printf("점[x=%d, y=%d]을 그렸습니다. %n",x, y);
	}
	
}
