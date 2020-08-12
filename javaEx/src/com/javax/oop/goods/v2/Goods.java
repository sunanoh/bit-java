package com.javax.oop.goods.v2;

// v2
public class Goods {
	// 필드(속성)
	// public > protected > default > private
	private String name;
	private int price;
	
	// Getter / Setter 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// this : 해당 인스턴스 자신으 가리키는
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메서드
	public void showInfo() {
		// 내부 필드의 정보를 출력
		System.out.printf("%s, 가격 : %d%n", name, price);
	}
	
	
	
	
}


