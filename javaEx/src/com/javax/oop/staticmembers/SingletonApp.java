package com.javax.oop.staticmembers;

public class SingletonApp {

	public static void main(String[] args) {
		// Singleton s1 = new Singleton();
		// ������ private -> new �ȵ�
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 = " + s1);
		System.out.println("s1 = " + s2);
		
		// �ּ��� �� == 
		System.out.println("s1�� s2�� ���� ��ü?" + (s1 == s2));
	}

}
