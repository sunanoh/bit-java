package com.javax.oop.summary;

public class TheOne extends Human implements Flyable, KungFu {
	// �θ� Ŭ������ 1������ ������, �������̽��� ���� �� �� �� �ִ�
	
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
