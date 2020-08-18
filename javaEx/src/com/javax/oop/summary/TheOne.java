package com.javax.oop.summary;

public class TheOne extends Human implements Flyable, KungFu {
	// 부모 클래스는 1개여야 하지만, 인터페이스는 여러 개 일 수 있다
	
	public TheOne(String name, int age) {
		super(name, age);
	}

	
	@Override
	public void kungfu() {
		System.out.println(name + " : I know Kungfu!");		
	}
	
	@Override
	public void fly() {
		System.out.println(name + " : I believe I can fly!");		
	}


}
