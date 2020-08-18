package com.javax.oop.casting;

public class Cat extends Animal{
	// 부모로부터 name필드와 eat/walk 메서드를 상속받아 사용할 수 있게 됨
	
	public Cat(String name) {
		super(name);
	}
	
	public void meow() {
		System.out.println(name + ": 야옹~");
	}


}
