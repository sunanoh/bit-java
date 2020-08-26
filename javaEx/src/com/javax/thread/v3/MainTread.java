package com.javax.thread.v3;

// Process : 실행중인 하나의 프로그램
// Thread : 프로세스 내에서 실행되는 하나의 작업 흐름
// 하나의 Process가 실행되면 Main Thread가 하나 생성 (기본적으로 1 Process - 1 Thread 임)
public class MainTread {

	public static void main(String[] args) {
		// 메인 스레드와 별도로 다른 작업흐름이 필요
		// Thread 생성하여 실행
		
		Thread thread1 = new DigitThread();
		thread1.setName("DigitThread");
		
		// 스레드의 시작 : Runnable -> Running -> 로직수행함!
		thread1.start(); // thread 내부의 run 메서드는 직접 호출하지 않음
		
		
		// Runnable을 이용한 작업 Thread
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.start(); // -> 러닝상태로 만들고 
		
		// Thread의 실행 우선순위 : 자원이 부족할 경우 먼저 수행해야할 Thread의 순위
		// 1(MIN_PRIORITY)) ~ 10(MAX_PRIORITY) - 일반적 우선순위는 5(NORM_PRIORITY)
		thread1.setPriority(Thread.MIN_PRIORITY); // 상수 1
		thread2.setPriority(Thread.MAX_PRIORITY); // 상수 10
		

		try {
			thread1.join(); // 메인 메서드 흐름에 합류
 			thread2.join(); // 메인 메서드 흐름에 합류
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		// 메인 스레드의 로직
		System.out.println("메인 쓰레드 종료"); 
		// 시작하자마자 종료되어버림
		// 메인스레드가 부가적인 워킹스레드를 모두 관리해야하나, 먼저 죽어버림
		// 하위 워킹스레드들을 제어할 수 없는 상태가 됨
		// 워킹스레드가 수행될 때 작업흐름을 메인스레드의 작업흐름상에 연결(합류)해야할 필요가있음 = JOIN
		// (위의 try문 추가)
		
		// 모든 스레드가 종료되기전까지는 메인스레드는 가만히있음..!
		
		
		// 스레드의 우선순위 잡아주기 -> .setPriority(숫자가 클수록 높음) ->v3
		
	
		
		
	
		
	}

}
