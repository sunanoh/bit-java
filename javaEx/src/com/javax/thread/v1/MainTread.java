package com.javax.thread.v1;

// Process : 실행중인 하나의 프로그램
// Thread : 프로세스 내에서 실행되는 하나의 작업 흐름
// 하나의 Process가 실행되면 Main Thread가 하나 생성 (기본적으로 1 Process - 1 Thread 임)
public class MainTread {

	public static void main(String[] args) {
		// 메인 스레드와 별도로 다른 작업흐름이 필요
		// Thread 생성하여 실행
		
		// 아래for문과 별도로 스레드 생성
		Thread thread1 = new DigitThread();
		thread1.setName("DigitThread");
		
		// 스레드의 시작 : Runnable -> Running
		thread1.start(); // thread 내부의 run 메서드는 직접 호출하지 않음
		
		
		// 메인 스레드의 로직
		// A부터 Z까지 0.3초 간격으로 출력
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread : " + ch);
			
			try {
				// 0.3초 대기
				Thread.sleep(300);
			} catch (InterruptedException e) { // 스레드에 관련된 에러 : Interrupt...
				e.printStackTrace();
			}
			
			
		}
		
	}

}
