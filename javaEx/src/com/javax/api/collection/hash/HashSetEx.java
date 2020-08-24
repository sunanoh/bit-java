package com.javax.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// basicHashSet();
		customHashSet();

	}
	
	
	private static void customHashSet() {
		// ����� ���� Ŭ������ Hash �ڷ��������� ���
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student(10,"ȫ�浿");
		Student s2 = new Student(20,"����");
		Student s3 = new Student(10,"ȫ�浿"); 
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println("�л���� : "+ hs);
		System.out.println("===============================================================================================");
		// s1�� s3�� �й��� �̸��� �����Ƿ� ���� �л��̶� hashset�� ���� ���� �ȵ����� ������
		
		// �ؽ��ڵ��� Ȯ��
		System.out.println("s1�� hashcode: "+s1.hashCode());
		System.out.println("s3�� hashcode: "+s3.hashCode());
		System.out.println("s1�� hashcode�� s3�� �ؽ��ڵ� �� : "+ (s1.hashCode() == s3.hashCode()));
		System.out.println("===============================================================================================");
	
		System.out.println("s1�� ���� s3�� ���� �� : "+ s1.equals(s3));
		// equals�� �������̵��ؼ� �ٲ���� ��.
	}
	
	
	private static void basicHashSet() {
		// HashSet
		// ������ �߿����� �ʰ�, �ߺ��� ������� �ʴ� �������μ��� �ڷ���
		
		HashSet<String> hs = new HashSet<>();
		
		// ��ü�� �߰� : add
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java"); // �ߺ� ������ - ���Ե��� ����
		
		System.out.println("======================================");
		System.out.println("SET : " + hs);
		System.out.println("���� ũ�� : "+ hs.size());
		System.out.println("======================================");
		// ���� ������ Ȯ�� : contains
		System.out.println("C++�� ����? " + hs.contains("C++"));
		System.out.println("Linux�� ����? " + hs.contains("Linux"));
		System.out.println("======================================");
		
		// ���� : �ε��� �����Ƿ� ��ü ������ ����
		hs.remove("C++");
		System.out.println("SET : " + hs);
		
		hs.remove("C++");
		System.out.println("SET : " + hs); // �ƹ��ϵ� �Ͼ�� ����. �̹̾���!
	}

}
