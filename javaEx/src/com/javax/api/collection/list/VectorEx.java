package com.javax.api.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		System.out.println("vector: " + v);
		
		System.out.printf("size : %d, capacity : %d%n", v.size(), v.capacity());
		// �޸� �״�, ������ cpu/�޸𸮸� ���� �����ؼ� �̸� ���۸� �����δ� ��
		
		// �߰�
		for(int i = 1 ; i <=10 ; i++) {
			v.addElement(i); // �Ʒ��� ����
			//v.addElement(Integer.valueOf(i));
		}
		
		v.addElement(11);  // ��뷮 �ʰ� --> �ڵ����� ���ۻ����� ������! 20����~
		System.out.printf("size : %d, capacity : %d%n", v.size(), v.capacity());
		
		// ����
		v.insertElementAt(5, 7);
		System.out.println("vector : "+ v);
		
		// Ư�� �ε����� �ִ� ��ü�� ��ȯ
		int value = v.elementAt(7);
		System.out.printf("%d�� �ε����� ��ü : %d%n", 7, value);
		
		// ��ü �ε��� �˻� indexOf
		System.out.println("��ü 7�� �ε��� ? " + v.indexOf(7));
		
		// ���� ��ü�� �˻�
		System.out.println("���� ��ü�� �ε���? "+ v.indexOf(0));
		
		// ��ü ����
		v.removeElement(10);  // ��ü 10�� ����
		v.removeElement(5); 
		System.out.println("vector : "+ v);
		System.out.printf("size : %d, capacity : %d%n", v.size(), v.capacity());
		
		// ���� ����
		v.clear();
		System.out.println("vector : "+ v);
		System.out.printf("size : %d, capacity : %d%n", v.size(), v.capacity());
		// �þ ���۴� ����.
		
		// Generics�� Ȱ��
		// Number Ŭ������ �θ�� ���� ��� �ڽ� Ŭ������ ��׸����� ���� 
		// byte/short/integer/long/float/double
		Vector<? super Number> v2 = new Vector<>();
		v2.addElement(Integer.valueOf(2020));
		v2.addElement(Float.valueOf(3.14159f));
		//v2.addElement(Boolean.valueOf(true)); // �Ҹ��� �ѹ��� �ڽ��� �ƴϾ �ȉ�
		System.out.println("vector : "+ v2);
		
		// Enumeration�� �̿��Ͽ� �׸��� ���ʴ�� ���� �� �ִ�. 
		Enumeration<? super Number> e = v2.elements();
		
		while(e.hasMoreElements()) { //�ڿ� �����Ͱ� �� �ִ���?
			System.out.println("��� : "+ e.nextElement());
		}
		
	}
}
