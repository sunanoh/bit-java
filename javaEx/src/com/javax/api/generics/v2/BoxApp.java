package com.javax.api.generics.v2;

public class BoxApp {

	public static void main(String[] args) {
		// 정수를 담을 수 있는 박스를 생성		
		// Box<Integer> intBox = new Box<Integer>(); // 타입을 Integer로 지정
		
		Box<Integer> intBox = new Box<>(); // 뒤에 <Integer>는 생략 가능
		intBox.setContent(2020);
		//intBox.setContent("2020"); // 컴파일러가 Generics를 체크 --> 빨간줄이 뜸! 사용불가
		
		
		// 값을 꺼내와 봅시다.
		// 내부의 데이터가 Integer임이 확실 - > 캐스팅이 불필요함 
		int content = intBox.getContent();
		System.out.println("박스의 내용물 : "+ content);
		
		
		
		Box<String> strBox = new Box<>();
		strBox.setContent("Java"); // 가능 (String 타입 지정)
		
		// 값을 꺼내와 봅시다.
		String strContent = strBox.getContent();
		System.out.println("박스의 내용물 : "+ strContent);
		
		// 만약캐스팅을 잘못하면?
		// 컴파일러가 안된다(Generics를 체크)
		//strContent = (String)intBox.getContent();
		//System.out.println("박스의 내용물 : "+ strContent);
	}

}
