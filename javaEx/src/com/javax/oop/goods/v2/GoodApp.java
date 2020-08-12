package com.javax.oop.goods.v2;

public class GoodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Goods 클래스 사용
		//Goods notebook = new Goods(); // 인스턴스 화
		// 필드에 접근
		/* Goods에서 private이라서 접근 불가
		notebook.name = "LG Gram";
		notebook.price = 1500000;
		
		System.out.printf("%s, %d원 %n", notebook.name, notebook.price);
		
		
		
		Goods smartphone = new Goods();
		
		smartphone.name = "iPhone SE";
		smartphone.price = 600000;
		*/
		
		// setter를 이용한 우회 접근
		
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
