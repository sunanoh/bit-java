package com.javax.api;

public class WrapperEx {

	public static void main(String[] args) {
		// Wrapper 클래스 생성
		// 자바는 객체위주, 데이터를 참조타입으로 많이 사용함
		// 기본타입은 null이 없으나, 객체 다루다보면 null이 필요한 경우가 있어서 wrapper사용
		
		Integer i = new Integer(2020);
		Character c = new Character('c');
		// 위의 방식은 jdk9에서 Deprecated되어 사용하지 않는 것이 좋다.
		
		Float f = Float.valueOf(3.14159f);
		// 이 방식으로 대입하는 것이 필요
		Boolean b= Boolean.valueOf(true);
		
		
		// 기본타입은 비어있을 수 없고(null 허용 안함)
		// Wrapper 타입은 비어있을 수 있다( null 허용)
		b = null; // 허용함
		
		
		// 활용
		// 문자열로 된 데이터를 변환할 때 활용
		Integer i2 = Integer.valueOf("2020");
		// 주의 : valueOf 내부의 문자열 인자의 형태가 해당 데이터 타입으로 변환할 수 있는 형태여야 한다.
		//---------------------------------------------------------------------------
		System.out.println("-------------------------------------------------------");
		
		// 내부 포장된 값의 비교
		System.out.println("i의 값 : " + i.intValue());
		System.out.println("i와 i2의 값이 같은가? :" + (i.intValue() == i2.intValue()));
		
		// 언박싱 비교 2번째  --> 자동 언박싱 되지 않음
		System.out.println("i와 i2가 같은가? "+ (i == i2)); 
		// 어쨌든 다른 객체기 때문에 false./ 다른 메모리 차지
		System.out.println("i와 i2의 값이 같은가?  "+ (i.intValue() == i2.intValue()) );
		// equals를 이용한 값의 비교
		System.out.println("i와 i2의 값이 같은가? "+ i.equals(i2));
		
		//-------------------------------------------------------------------------
		System.out.println("-------------------------------------------------------");

		Float f2 = 3.1459f; // Float.valueOf(3.14159f); 이렇게 안써도 자동 박싱됨
		
		// parse 계열 메서드 : 주로 변환작업에 활용
		System.out.println("문자열 -> 정수형으로 변환 : "+ Integer.parseInt("-12345"));
		// 진법 변환
		System.out.println("16진수 FF -> 10진수로 변환 : "+ Integer.parseInt("FF",16));
		// 형변환
		System.out.println("f2 -> int : "+ f2.intValue());
		

	}

}
