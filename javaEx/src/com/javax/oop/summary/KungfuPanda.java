package com.javax.oop.summary;

public class KungfuPanda extends Panda implements KungFu{

	public KungfuPanda(String name, int age) {
		super(name, age);
	}

	// �������̽� ���� ��� �޼���� �ݵ�� �������̵�
	@Override
	public void kungfu() {
		System.out.printf("%s : �ƺ� ~%n", name);
		
	}
	
	// �߻� �޼���� �ݵ�� override �ؾ��ϴµ�,
	// say()�� panda���� �̹� �ۼ��ؼ� ���⼭ ���ص� ��

}
