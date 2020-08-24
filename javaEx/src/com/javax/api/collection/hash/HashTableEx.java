package com.javax.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableEx {

	public static void main(String[] args) {
		// HashMap : Map �� �ڷ���
		// key - ���� ������ �����͸� ����
		// key�� �ߺ��� �� ����(*)
		
		Hashtable<String, Classroom> map = new Hashtable<>();
		
		map.put("101", new Classroom("R101", "Java"));
		map.put("202", new Classroom("R202", "C"));
		map.put("303", new Classroom("R303", "Python"));
		map.put("404", new Classroom("R404", "Linux"));
		
		System.out.println("MAP : " + map);
		
		// ������ �������� : get
		System.out.println("303���ǽ��� ���� : " + map.get("303"));
		
		// ������ ���� : put (�̹� �ִ� KEY��, ������ �����)
		map.put("202", new Classroom("R202", "C#"));
		System.out.println("MAP : " + map);
		
		// Ű�� �ִ� �� Ȯ�� : containsKey()
		System.out.println("Ű�� 202 �� �ִ°� ? : " + map.containsKey("202"));
		System.out.println("Ű�� 501 �� �ִ°� ? : " + map.containsKey("501"));
		
		// ���� �˻�
		System.out.println("Java : " + map.containsValue("Java")); // false��, �츮 value��  classroom��!
		System.out.println("Java ���� ����? : " + map.containsValue(new Classroom("Java")) );
		// --> hashcode, equals�� ������ �������̵� �Ǿ��־�� ���� �۵���. 
		
		
		// Iterator�� �̿��� �ڷ��� ��ȸ
		Iterator<String> it = map.keySet().iterator(); // �츮�ڷ�� string������...
		
		while(it.hasNext()) { // �ڿ� ������ �� �ִ°�?
			Classroom room = map.get(it.next());
			System.out.println("���ǽ� : " + room);
		}
		
		map.clear();
		System.out.println("MAP : " + map);
	}

}
