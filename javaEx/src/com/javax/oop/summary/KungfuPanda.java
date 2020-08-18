package com.javax.oop.summary;

public class KungfuPanda extends Panda implements KungFu{

	public KungfuPanda(String name, int age) {
		super(name, age);
	}

	// 인터페이스 내의 모든 메서드는 반드시 오버라이드
	@Override
	public void kungfu() {
		System.out.printf("%s : 아뵤 ~%n", name);
		
	}
	
	// 추상 메서드는 반드시 override 해야하는데,
	// say()는 panda에서 이미 작성해서 여기서 안해도 됨

}
