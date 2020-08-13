package com.javax.oop.staticmembers;

// Singleton Pattern
// 어떤 상황에서도 반드시 1개의 인스턴스를 유지해야하는 경우

public class Singleton {
	// 인스턴스를 static으로 선언
	private static Singleton instance = new Singleton(); // 얘가 먼저 호출됨. 클래스 영역은 단 1번 호출되므로 두번 호출될일이 없음
	
	private Singleton() {
		// 절대 호출되면 안되는 경우, private으로 선언
	}
	
	// 일종의 getter를 만들어서 우회접근
	public static Singleton getInstance() {
		return instance;
	}
}
