package com.javax.oop.goods.v2;

public class GoodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Goods Ŭ���� ���
		//Goods notebook = new Goods(); // �ν��Ͻ� ȭ
		// �ʵ忡 ����
		/* Goods���� private�̶� ���� �Ұ�
		notebook.name = "LG Gram";
		notebook.price = 1500000;
		
		System.out.printf("%s, %d�� %n", notebook.name, notebook.price);
		
		
		
		Goods smartphone = new Goods();
		
		smartphone.name = "iPhone SE";
		smartphone.price = 600000;
		*/
		
		// setter�� �̿��� ��ȸ ����
		
		Goods notebook = new Goods();
		
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);
		
		notebook.showInfo();
		
	
	
		Goods smartphone = new Goods();
	
		smartphone.setName("iPhone SE");
		smartphone.setPrice(600000);
		
		smartphone.showInfo();
	}

}
