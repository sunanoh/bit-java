package com.javax.oop.casting;

public class Animal {
	// �ʵ�
	
	protected String name; // �������� �� �ڽĵ� ����� �� �ֵ���
	
	// ������
	public Animal(String name) {
		this.name = name;
	}
	
	// �޼���
	public void eat() {
		System.out.println(name + "��(��) �԰� �ִ�.");
	}
	public void walk() {
		System.out.println(name + "��(��) �Ȱ� �ִ�.");
	}
	
}
