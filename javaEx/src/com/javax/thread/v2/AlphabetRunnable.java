package com.javax.thread.v2;

// Thread�� ����� �� ��° ��� : Runnable �������̽� ����
public class AlphabetRunnable implements Runnable{

	
	@Override
	public void run() {
		// Thread ������ start �޼��忡�� ȣ�� �� �������� ����
		// Thread�� ��ӹ����� �ƴ϶� getname�� �ΰ����� �޼ҵ带 ����� �� ����
		// runnable�� �����ϸ� ���� �������� ������ �ۼ��ؼ� ������ �� �����
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("AlphabetRunnable : " + ch);
			
			try {
				// 0.3�� ���
				Thread.sleep(300);
			} catch (InterruptedException e) { // �����忡 ���õ� ���� : Interrupt...
				e.printStackTrace();
			}
		
		}
		
		
		
	}

}
