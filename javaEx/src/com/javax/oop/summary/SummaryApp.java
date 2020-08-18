package com.javax.oop.summary;

public class SummaryApp {

	// ���� ����
	static KungFu[] dojang;  // �������̽� ���� Ÿ���� �迭
	
	public static void main(String[] args) {
		
		Panda p1 = new Panda("��", 30);
		p1.say();
		Human h1 = new Human("ȫ�浿", 28);
		h1.say();
		Panda p2 = new KungfuPanda("��", 15);
		p2.say();
		Human h2 = new TheOne("�׿�", 50);
		h2.say();
		
		fight(p1);
		fight(h1);
		fight(p2);
		fight(h2);
		
		// �� ��ü�� ���忡 ���
		dojang = new KungFu[] {
								// h1,  // �������̽� ���� �ƴϾ ��� �Ұ� 
								(KungFu)h2, 
								//(KungFu)p1, 
								(KungFu)p2
		};
		
		for(KungFu actor : dojang) {
			actor.kungfu();
		}
	}
	
	private static void fight(Animal actor) {
		// actor�� KungFu �������̽��� ���������� Kungfu�޼��� ��� ����
		
		if(actor instanceof KungFu) {
			// Kungfu �������̽��� ������ Ŭ���� �̴� 
			// �� ��ȯ�� ����
			((KungFu)actor).kungfu();
		} else {
			// �� ������ �Ұ�
			System.out.println(actor.name + " : ���� ���ؿ�!");
		}
	}

}
