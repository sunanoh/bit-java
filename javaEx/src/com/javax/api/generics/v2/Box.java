package com.javax.api.generics.v2;

// v2. generics : �ſ� �߿�
// Ÿ�� �Ķ���� : T -> Type

// ���� ����ϴ� Ÿ�� �Ķ���� ����
// R : Return Type
// K : Key
// V : Value
//     --> ��ܵ� ��������� ������ ��Ű����

// ���� �ÿ� Ÿ���� �������� �ʰ�, �ν��Ͻ�ȭ �Ҷ� ���� ���Ÿ���� �����ϴ� ���-> Generics

public class Box<T> {
	
	T content; // ��� Ŭ������ �θ� 

	// Getters / Setters
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
	
}
