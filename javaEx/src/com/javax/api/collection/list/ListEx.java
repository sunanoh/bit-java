package com.javax.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		//List<String> linkedList = new LinkedList<>();
		//listEx(linkedList);
		
		// List(�������̽�)���� ���� �������� ������ List���� ó���ؾ� ��  
		// ����� ����� ���� �Ǿ��ִ�
		// ��ü Ŭ���������� �������̽��� ������ ���� ������ ��� �ִ�
		List<String> arrayList = new ArrayList<>(); // �����ϴ� ��ü�� �ٲ��ָ鼭 ��������� �ٲ��� �� �ִ�.
		listEx(arrayList);

	}
	
	private static void listEx(List<String> list) {
		// List�� �������̽���, Linked�� array��� �̸� ��üȭ��Ų �ֵ���.
		// List�� �������̽� -> ��ü Ŭ������ ��ü ����
		// ��ü�� �߰� : add
		
		list.add("Java"); // ����Ʈ�� �� �������� �� ��ü �߰�
		list.add("C");
		list.add("C++");
		list.add("Python");
		
		System.out.println(list);
		// ��ü�� ���� : add(index, ��ü);
		
		list.add(2, "C#"); // 2�� �ε����� "C#"�� ����
		System.out.println("���� : " + list);
		
		// List�� �ߺ� ������ ���
		list.add("Java");
		System.out.println("�ߺ� ���� : " + list);
		
		// ����
		// 1. �ε����� �̿��� ����
		list.remove(2); // 2�� �ε����� ��ü ����
		System.out.println("�ε��� ���� : " + list);
		// 2. ��ü�� ������ ����
		list.remove("Python");
		System.out.println("��ü ���� : "+ list);
		
		// ��ü�� ��ȸ : ���� ��ü�� ���鼭 �ϳ��� �̾Ƴ���
		// List�� Set ����� Iterator�� �����Ͽ� ��ȸ
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) { // �ڿ� ����� ��尡 �ִ��� Ȯ��
			String item = it.next(); // ���� ��ü�� ����
			System.out.println("��� ������ : " + item);
		}
		
		// ������ô�.
		list.clear();
		System.out.println("����Ʈ : " + list);
		
		
		
		
	}
}
