package com.javax.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		
		Point p= new Point(10, 20);
		
		// Java�� �ֻ��� Ŭ������ Object
		// ��� Ŭ������ Object Ŭ������ ��� ����� ���� �޴´�.
		// Object�� ���� �������� �����
		
		System.out.println(p.getClass().getSimpleName());
		System.out.println(p.hashCode()); // ��ü �ĺ� �ڵ�
		System.out.println(p.toString());
		System.out.println(p); // toString
		
		// �θ� ������ Ȯ��
		System.out.println(p.getClass().getSuperclass().getName());
	}
	
	

	

}
