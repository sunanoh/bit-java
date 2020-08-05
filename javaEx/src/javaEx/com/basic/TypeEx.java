package javaEx.com.basic;

// 자바의 기본 자료형 연습
//
//2020.05.31~하트
//Luvstagram
//여자 : @Sienna_noh
//남자 : @gidong_0422


public class TypeEx {

	public static void main(String[] args) {
		
	// 	intLongTest();
	// 	floatDoubleTest();
	//	booleanEx();
	//	charEx();
		constantEx();
	}
	
	// 상수연습
	public static void constantEx() {
		// 변하지 않는 데이터
		// final을 선언부 앞에 붙이면 된다
		// 상수식별자는 모두 대문자, 여러 단어 결합시
		// 단어 사이에 _
		// 상수 값을 변경하며 해당 상수를 사용한 모든 코드가 변경됨
		// 1. 코드의 가독성
		// 2. 코드 유지 보수의 장점
		
		final double PI = 3.14159;
		final int SPEED_LIMIT = 110;
		
		System.out.println("PI = " + PI);
		System.out.println("제한속도 = " + SPEED_LIMIT);
		
		// SPEED_LIMIT = 80; // 상수이므로 변경 불가하게 된다
		
		System.out.println("제한속도 = " + SPEED_LIMIT);
	}
	
	// char 연습
	public static void charEx() {
		// 2바이트(부호 없음)
		// 유니코드 한 글자의 수치화된 코드
		// '' <- char
		// "" <- string
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println("A -> " + ch1);
		System.out.println("한 -> " + ch2);
		
		System.out.println(ch1 + ch2);
	}
	
	// boolean 연습
	public static void booleanEx() {
		// 논리값 true or false
		// 비교 연산, 논리 연산의 결과를 반환
		// 흐름 제어, 반복해서 흐름을 제어할 때 이 값을 사용한다
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int v1 = 3;
		int v2 = 5;
		
		boolean result = v1 > v2;
		
		System.out.println("result = " + result);
		
	}
	
	// 실수형 연습
	// float(4) < double(8)
	public static void floatDoubleTest() {
		// 정밀도를 포기, 표현 범위를 넓힌 자료형
		
		float fVar = 3.14159f; //float는 인식을 못해서, 사용하려면 끝에 f를 붙여주어야 함
		double dVar = 3.14159;//자바에서 실수표현의 기본은 double임
		
		// 정밀도 파악
		fVar = 0.1234567890123456789f;
		dVar = 0.1234567890123456789;
		
		System.out.println(fVar); //출력 : 0.12345679
		System.out.println(dVar); //출력 : 0.12345678901234568
		
		//지수 표기법
		fVar = 1234567890E-10F;
		System.out.println(fVar);
		
		// 실수 자료형의 처리는 정밀도가 떨어진다(표현 범위를 넓힘)
		System.out.println(0.1 * 3);
		// 금융권 같은 정밀도를 요구하는 개발에는 float, double 사용은 유의해야 한다.
		
	}
	
	// 정수형 연습
	// byte < short < int < long
	public static void intLongTest() {
		// 변수선언
		// int -> 자바가 다루는 정수형의 가장 기본적인 형태
		
		int intVar1;
		intVar1 = 2020; // 초기화 작업
		int intVar2 = 2020; // 선언 + 초기화 작업
		
		System.out.println(intVar1);
		System.out.println(intVar2);
		
		// long : 8byte
		long longVar1;
		longVar1 = 2020;
		long longVar2 = 123456789012345678L; //맨 뒤에 L을 붙여서 Long으로 만들기, 붙이기 전에는 int로 인식
		
		System.out.println(longVar1);
		System.out.println(longVar2);

		
		int bin = 0b1100; //2진수는 0b로 시작
		int oct = 010;    //8진수는 0으로 시작
		int hex = 0xFF;   //16진수는 0x로 시작
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}

}
