package com.javax.api.collection.hash;


// ����� ���� Ŭ������ hashset�� �̿��ϸ�? 
// hash �迭 �ڷ����� ��ü�� ����� ���ϴ� ���
// 1. hashcode�� ��
// 2. equals�� �̿��� ���� ��
// �� �ΰ����� ��� ����ؾ� ���� ��ü�� ����
public class Student {
	// �ʵ� 
	private int code;
	private String name;
	
	// ������
	public Student(int code, String name) {
		this.code = code;
		this.name = name;
	}
	
	
	// toString
	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + "]";
	}

	
	// hashCode, equals �޼���  �������̵� : �ſ� �߿�!!
	
	@Override
	public boolean equals(Object obj) {
		//return super.equals(obj);
		// üũ �� �ٿ�ĳ���� 
		if(obj instanceof Student) {
			Student other = (Student)obj; // �ٿ� ĳ����
			return name.equals(other.name) && code == other.code;
		}
		return super.equals(obj);
	}


	@Override
	public int hashCode() {
		//return super.hashCode(); // �޸� �ּ�
		return code;
	}
	
	
	
	
	
	
}
