package com.javax.oop.goods.v1;

public class GoodApp {

	public static void main(String[] args) {
	
		// Goods Ŭ���� ���
		Goods notebook = new Goods(); // �ν��Ͻ� ȭ
		// �ʵ忡 ����
		// name, price �ʵ�� private�̹Ƿ� ���� �Ұ�(����)
		notebook.name = "LG Gram";
		notebook.price = 1500000;
		
		System.out.printf("%s, %d�� %n", notebook.name, notebook.price);
		
		
		
		Goods smartphone = new Goods();
		
		smartphone.name = "iPhone SE";
		smartphone.price = 600000;
		
		System.out.printf("%s, %d�� %n", smartphone.name, smartphone.price);
	}

}
