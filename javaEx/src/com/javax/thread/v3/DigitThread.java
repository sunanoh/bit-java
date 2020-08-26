package com.javax.thread.v3;

// Working Thread를 만드는 방법 1
// Runnable 구현
public class DigitThread extends Thread{
	// Thread의 로직을 run 메서드를 오버라이드 하여 추가
	
	@Override
	public void run() {
		// 주의 : run메서드를 직접 호출하면 멀티스레드가 아님
		//      start메서드를 이용하여 우회접근해야 함
		// 숫자를 0부터 30까지 1씩 증가하면서 출력, 0.3초 대기
		for(int i = 0 ; i <= 30; i++) {
			System.out.printf("%s : %d%n", getName(),i); // 스레드의 이름을 가져옴!
			
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}

	
	
}
