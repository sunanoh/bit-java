package com.javax.oop.shape.v2;

// v4
// 상속
public class Point implements Drawable{

	protected int x, y; // 상속받은 클래스에서도 접근할 수 있도록 제한을 낮춤 (private -> protected)

	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	// 메서드
	// Drawable 인터페이스를 구현한 메서드
	@Override
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다. %n",x, y);
	}
	
	// 메서드 오버로딩
	// 같은 리턴타입과 같은 이름을 가졌지만
	// 매개변수의 종류, 갯수, 순서만 다른 메서드
	public void draw(boolean show) {
		// show : true -> 그렸습니다.
		// show : false -> 지웠습니다.
		String message = show ? "그렸습니다." : "지웠습니다.";
		// TODO : -> if문 버전으로 해보기
		
		System.out.printf("점[x=%d, y=%d]을 %s %n",x, y, message);
	}
}
