package com.javax.oop.goods.v4;

// v4
// 생성자 연습
public class Goods {

	private String name;
	private int price;
	
	// 생성자1 : 일부만 초기화
	public Goods(String name) {
		this.name = name;
		System.out.println("생성자 1");
	}
	
	
	
	public Goods(String name, int price) {
		// 이미 일부의 정보를 초기화하는 생성자가 있을 때
		// this()로 호출하고 나머지 정보를 초기화
		// 설정정보가 복잡할 경우, 코드의 중복을 줄일 수 있음
	
		this(name); // 생성자가 먼저 호출되고 나서야 프린트를 할 수 있음. 순서 중요
		System.out.println("생성자 2");
		this.price = price;
		
	}
	
	
	
	// Getter / Setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

	public void showInfo() {
		System.out.printf("%s, 가격 : %d%n", name, price);
	}
	
	
	
	
}


