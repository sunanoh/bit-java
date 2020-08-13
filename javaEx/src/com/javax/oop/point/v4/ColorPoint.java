package com.javax.oop.point.v4;


// 상속 키워드 extends
public class ColorPoint extends Point{
	// 추가 필드
	private String color;
	// 생성자1
	public ColorPoint(String Color) {
		// 특별한 지시가 없으면 자바는 super() 생성자를 호출한다. --> 부모 먼저 초기화
		this.color = color;
	}
	// 생성자2
	public ColorPoint(int x, int y, String color) {
		//this.x = x;  // 부모로부터 물려받은 x,y는 prviate
		               // -> 부모가 물려줄 필드는 protected로 변경 -> 접근가능
		super(x,y); // 부모의 생성자 호출
		this.color = color;
		
		System.out.println("Color Point 생성자");
	}
	
	// getter / setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// 메서드 오버라이딩 : 부모로부터 물려받은 기능을 무시하고 자신의 기능을 수행
	@Override
	public void draw() {
		System.out.printf("색상점(%d,%d)을 그렸습니다. %n",x, y);
	}
	
	@Override
	public void draw(boolean show) {
		String message = show ? "그렸습니다." : "지웠습니다.";
		System.out.printf("색상점(%d,%d,%s)을 그렸습니다. %n",x, y,message);
		
		// 만약 부모가 가진 메서드를 수행해야 한다면
		System.out.println("=== parent method");
		super.draw(show);
		
	}
}
