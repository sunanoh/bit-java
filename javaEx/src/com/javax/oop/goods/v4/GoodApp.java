package com.javax.oop.goods.v4;

// v4
public class GoodApp {

	public static void main(String[] args) {

		// 생성자 활용
		Goods notebook = new Goods("LG Gram", 1500000);
		// 이미 초기화가 되어서 .set함수가 필요없음
		
		//Goods notebook = new Goods();
		//notebook.setName("LG Gram");
		//notebook.setPrice(1500000);
	
		Goods smartphone = new Goods("iPhone SE", 600000);
	
		//Goods smartphone = new Goods();
		//smartphone.setName("iPhone SE");
		//smartphone.setPrice(600000);
				
		notebook.showInfo();
		smartphone.showInfo();
	}

}
