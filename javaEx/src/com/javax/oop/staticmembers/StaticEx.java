package com.javax.oop.staticmembers;


// scope 연습
public class StaticEx {
	public static int refCount; // 클래스 변수 : static
	public static String classVar; // 클래스 변수
	public String instanceVar; // 인스턴스 변수
	
	// static 영역의 초기화
	static {                                    // 처음 초기화1번만 하고, 인스턴스 생성되도 다시 안나옴
		refCount = 0;
		classVar = "Static Member";
		// intstanceVar = "Instance Member";  
		// static영역에서 instance영역에 접근은 불가
		// instance영역에서 static영여에 접근 가능
		
		System.out.println("Static Block");	
	}
	
	// 생성자
	public StaticEx() {
		refCount++; // Static영역이므로 모든 인스턴스에서 접근 가능
		instanceVar = "Instance Member";
		System.out.println("refCount: "+ refCount);
		System.out.println("인스턴스 생성");
	}
	
	
	@Override
	protected void finalize() throws Throwable{ // 객체가 없어질 때 호출되는 함수
		refCount--;
		super.finalize();
		System.out.println("소멸자 호출");
	}
	
	

}
