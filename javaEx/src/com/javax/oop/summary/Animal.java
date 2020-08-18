package com.javax.oop.summary;

// ��üȭ ���� �ʴ� Ŭ����
// �߻� Ŭ������ ���� Ȯ��
public abstract class Animal {

	protected String name;
	protected int age;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, int age) {
		this(name);
		this.age = age;
	}
	
	// �߻� Ŭ���� ������ ��ü Ŭ����, �߻� Ŭ���� ��� �� �� �ִ�
	// �߻� Ŭ������ �ڽ� ��ü Ŭ�������� �ݵ�� �������̵� �� ��� �Ѵ�
	public abstract void say(); // �ݵ�� �������̵�
	public void eat() { // ��ü Ŭ����
		System.out.printf("%s is eating ... %n", name);
	}
}
