package com.javax.oop.casting;

public class Dog extends Animal {
	// 에러가 나는 이유?
	// 생성자의 문제 
	// java 컴파일러가 기본 생성자를 만듦
	// 기본 생성자 내부에서 부모의 기본 생성자를 호출 함
	// 이러한 절차때문에 현재 부모의 기본생성자가 없어서 오류 생김
	
	// 부모로부터 name필드와 eat/walk 메서드를 상속받아 사용할 수 있게 됨
	
	// 생성자
	public Dog(String name) {
		// 1. 부모의 생성자는 반드시 호출 필요
		// 2. 부모의 생성자를 명시하지 않으면 부모의 기본 생성자를 끼워 넣는다
		// 하지만 현재 부모에게 기본생성자가 없어서, 오류생김
		super(name);
	}
	
	// 자신만의 메서드
	public void bark() {
		System.out.println(name + ": 멍멍!");
	}
	
}
