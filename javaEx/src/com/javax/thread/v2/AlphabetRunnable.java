package com.javax.thread.v2;

// Thread를 만드는 두 번째 방법 : Runnable 인터페이스 구현
public class AlphabetRunnable implements Runnable{

	
	@Override
	public void run() {
		// Thread 내부의 start 메서드에서 호출 될 쓰레드의 로직
		// Thread를 상속받은게 아니라서 getname등 부가적인 메소드를 사용할 수 없음
		// runnable을 구현하면 정말 스레드의 로직만 작성해서 구현할 때 사용함
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("AlphabetRunnable : " + ch);
			
			try {
				// 0.3초 대기
				Thread.sleep(300);
			} catch (InterruptedException e) { // 스레드에 관련된 에러 : Interrupt...
				e.printStackTrace();
			}
		
		}
		
		
		
	}

}
