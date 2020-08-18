package com.javax.oop.summary;

public class SummaryApp {

	// 쿵후 도장
	static KungFu[] dojang;  // 인터페이스 참조 타입의 배열
	
	public static void main(String[] args) {
		
		Panda p1 = new Panda("핑", 30);
		p1.say();
		Human h1 = new Human("홍길동", 28);
		h1.say();
		Panda p2 = new KungfuPanda("포", 15);
		p2.say();
		Human h2 = new TheOne("네오", 50);
		h2.say();
		
		fight(p1);
		fight(h1);
		fight(p2);
		fight(h2);
		
		// 각 객체를 도장에 등록
		dojang = new KungFu[] {
								// h1,  // 인터페이스 형이 아니어서 등록 불가 
								(KungFu)h2, 
								//(KungFu)p1, 
								(KungFu)p2
		};
		
		for(KungFu actor : dojang) {
			actor.kungfu();
		}
	}
	
	private static void fight(Animal actor) {
		// actor가 KungFu 인터페이스를 구현했으면 Kungfu메서드 사용 가능
		
		if(actor instanceof KungFu) {
			// Kungfu 인터페이스를 구현한 클래스 이다 
			// 형 변환이 가능
			((KungFu)actor).kungfu();
		} else {
			// 형 변한이 불가
			System.out.println(actor.name + " : 쿵후 못해요!");
		}
	}

}
