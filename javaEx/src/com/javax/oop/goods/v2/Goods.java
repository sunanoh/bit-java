package com.javax.oop.goods.v2;

// v2
public class Goods {
	// �ʵ�(�Ӽ�)
	// public > protected > default > private
	private String name;
	private int price;
	
	// Getter / Setter 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// this : �ش� �ν��Ͻ� �ڽ��� ����Ű��
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// �޼���
	public void showInfo() {
		// ���� �ʵ��� ������ ���
		System.out.printf("%s, ���� : %d%n", name, price);
	}
	
	
	
	
}


