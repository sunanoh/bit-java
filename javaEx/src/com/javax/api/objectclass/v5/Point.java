package com.javax.api.objectclass.v5;

// v3. 복제 (얕은 복제)
// 복제 : object.clone() 메서드를 사용
//      --> Clonable 인터페이스를 구현해야 clone() 메서드 사용 가능
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
		System.out.printf("점[x=%d, y=%d]을 그렸습니다. %n",x, y);
	}

	public void draw(boolean show) {
		String message = show ? "그렸습니다." : "지웠습니다.";
		System.out.printf("점[x=%d, y=%d]을 %s %n",x, y, message);
	}

	// toString : print 혹은 문자열과 연결될 때 호출되어서 내용을 문자열로 반환
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]"; // 출력 포맷
	}

	// equals : 내부 값이 같은지 점검 로직 작성
	@Override
	public boolean equals(Object obj) { // object를 point로 다운 캐스트 필요
		if(obj instanceof Point) { // 클래스 체크
			// 다운캐스트 가능
			Point other = (Point)obj;
			return this.x == other.x && this.y == other.y;
		}
		
		return super.equals(obj);
	}
	
	
	public Point getClone() {
		Point clone = null;
		
		try {
			clone = (Point)clone(); // 복제한 후 다운캐스팅
		}catch(CloneNotSupportedException e) {
			System.err.println("복제 불가 객체!");
		}
		
		return clone;
	}
	
	

	
	
}
