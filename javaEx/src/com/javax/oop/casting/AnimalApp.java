package com.javax.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
	
		Dog d1 = new Dog("스누피");
		// 객체 참조 형식이 자기 자식
		// 갖고 있는 모든 기능을 활용 가능
		d1.bark(); // 자기 자신의 메소드
		d1.eat();  // 부모클래스의 메소드
		d1.walk(); // 부모클래스의 메소드
		
		Animal d2 = new Dog("두기");
		// 자식 객체를 부모 타입으로 참조하는 것
		// -> Upcasting
		d2.eat(); // 부모 참조 타입에 있음
		d2.walk(); // 부모 참조 타입에 있음
		//d2.bark(); // 부모 참조 타입에 없음 --> 설계도에 있는 것만 사용 가능
		
		((Dog)d2).bark(); // 다운캐스팅
		
		// 교체 가능성(다형성)
		Dog pet = new Dog("아지");
		pet.eat();
		pet.walk();
		
		// 새로 애완동물을 입양
		//pet = new Cat("아즈라엘"); // 교체를 함, 하지만 24줄에서 이미 dog타입으로 해버렸기 때문에 cat 형식으로 생성 불가능
		System.out.println("==========================================");
		// 따라서, 애초에 animal참조형식으로 선언
		// 24줄을 아래와 같이 바꾸면
		Animal pet2 = new Dog("아지");
		pet2.eat();
		pet2.walk();

		pet2 = new Cat("아즈라엘");
		pet2.eat();
		pet2.walk();
		
		// 짖거나 혹은 야옹을 하게 하고 싶다면
		// 다운 캐스팅 시, 가능 여부를 판단 : instanceof 연산자 확인 필요
		
		if(pet2 instanceof Dog) {
			// 안전하게 다운 캐스팅 가능함
			((Dog)pet2).bark();
		}else if(pet2 instanceof Cat) {
			// 안전하게 다운 캐스팅
			((Cat)pet2).meow();
		}
		
		
	}

}
