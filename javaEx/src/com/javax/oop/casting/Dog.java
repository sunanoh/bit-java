package com.javax.oop.casting;

public class Dog extends Animal {
	// ������ ���� ����?
	// �������� ���� 
	// java �����Ϸ��� �⺻ �����ڸ� ����
	// �⺻ ������ ���ο��� �θ��� �⺻ �����ڸ� ȣ�� ��
	// �̷��� ���������� ���� �θ��� �⺻�����ڰ� ��� ���� ����
	
	// �θ�κ��� name�ʵ�� eat/walk �޼��带 ��ӹ޾� ����� �� �ְ� ��
	
	// ������
	public Dog(String name) {
		// 1. �θ��� �����ڴ� �ݵ�� ȣ�� �ʿ�
		// 2. �θ��� �����ڸ� �������� ������ �θ��� �⺻ �����ڸ� ���� �ִ´�
		// ������ ���� �θ𿡰� �⺻�����ڰ� ���, ��������
		super(name);
	}
	
	// �ڽŸ��� �޼���
	public void bark() {
		System.out.println(name + ": �۸�!");
	}
	
}