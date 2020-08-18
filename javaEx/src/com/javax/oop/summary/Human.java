package com.javax.oop.summary;

public class Human extends Animal {

	public Human(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void say() {
		System.out.printf("My name is %s%n", name);
	}

}
