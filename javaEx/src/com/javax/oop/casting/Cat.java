package com.javax.oop.casting;

public class Cat extends Animal{
	// �θ�κ��� name�ʵ�� eat/walk �޼��带 ��ӹ޾� ����� �� �ְ� ��
	
	public Cat(String name) {
		super(name);
	}
	
	public void meow() {
		System.out.println(name + ": �߿�~");
	}


}
