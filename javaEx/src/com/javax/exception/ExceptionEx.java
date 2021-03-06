package com.javax.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		//arithmeticExceptionEx();
		//indexOutOfBoundEx();
		//nullPointerExceptionEx();
		customExceptionEx();
	}
	
	private static void customExceptionEx() {
		// 사용자 정의 예외의 활용
		ThrowExcept ex = new ThrowExcept();
		try {
			ex.executeCheckedException(); // 체크드 익셉션 발생
			ex.executeUncheckedException(); // 언체크드 익셉션 발생
			System.out.println("10/0 = " + ex.divide(10, 0));
		}catch(IOException e) {
			System.err.println("예외 메시지 :"  + e.getMessage());
		}catch(CustomArithmeticException e) {
			System.err.println("사용자 정의 예외 메시지 : " + e.getMessage());
			System.err.printf("예외 상황 발생시 num1 = %d, num2 = %d%n",e.getNum1(), e.getNum2());
		}catch(RuntimeException e) {
			System.err.println("런 타임 예외 메시지  : " + e.getMessage());
		}
		//catch(CustomArithmeticException e) { // 이 클래스는 runtimeexcetion을 상속받은거라, 위에서 미리처리해버린 상태. 순서가 중요함
		//}// 본예외는 runtimeException의 자손이므로 runtimeexception보다 위에서 처리 필요
	}
	
	// 가장 흔히 발생하는 예외
	private static void nullPointerExceptionEx() {
		String s = "Hello"; // 참조 객체
		
		s = null;
		
		try {
			//예외 가능 블록
			System.out.println(s.toUpperCase());
		}catch(NullPointerException e) {
			System.err.println("예외 메시지 :" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("end of code");
			
	}
		
	private static void indexOutOfBoundEx() {
		int[] intAry = new int[] {3, 6, 9 };
		
		System.out.println("배열의 길dl : " + intAry.length);
		// 가장 마지막 인덱스 == length - 1
		try {
			System.out.println(intAry[3]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("예외 메시지: "+ e.getMessage());
		}
		//finally는 생략 가능
		System.out.println("End of code");
		
	}
	
	private static void arithmeticExceptionEx() {
		// 스캐너로부터 정수하나를 입력
		// 0으로 나눠 보자
		
		Scanner scan = new Scanner(System.in);
		double result = 0;
		int num;
		
		System.out.print("정수를 입력하세요: ");
		
		
		try {
			// 예외가 발생할 수 있는 영역 -> try
			num = scan.nextInt(); //(1)
			result = 100/num; //(2)
		}catch(ArithmeticException e) { //(2) 발생 예외
			// 메시지가 담겨 있다.
			System.out.println("예외 메시지: " + e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력해주세요!");
			// 예외 상황 전체를 확인하고 싶다면
			e.printStackTrace();
		}catch(Exception e) {
			// catch문의 마지막에는 exception 객체로 남아있을지 모를 예외를 처리
			e.printStackTrace();
		}finally {
			// 예외의무 관계없이 항상 마지막에 수행
			// 자원 정리 작업 등에 활용
			System.out.println("Finally");
			System.out.println("결과: "+ result);
			scan.close();
		}
	}
		
			

}
