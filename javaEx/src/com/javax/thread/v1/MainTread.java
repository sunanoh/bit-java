package com.javax.thread.v1;

// Process : �������� �ϳ��� ���α׷�
// Thread : ���μ��� ������ ����Ǵ� �ϳ��� �۾� �帧
// �ϳ��� Process�� ����Ǹ� Main Thread�� �ϳ� ���� (�⺻������ 1 Process - 1 Thread ��)
public class MainTread {

	public static void main(String[] args) {
		// ���� ������� ������ �ٸ� �۾��帧�� �ʿ�
		// Thread �����Ͽ� ����
		
		// �Ʒ�for���� ������ ������ ����
		Thread thread1 = new DigitThread();
		thread1.setName("DigitThread");
		
		// �������� ���� : Runnable -> Running
		thread1.start(); // thread ������ run �޼���� ���� ȣ������ ����
		
		
		// ���� �������� ����
		// A���� Z���� 0.3�� �������� ���
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread : " + ch);
			
			try {
				// 0.3�� ���
				Thread.sleep(300);
			} catch (InterruptedException e) { // �����忡 ���õ� ���� : Interrupt...
				e.printStackTrace();
			}
			
			
		}
		
	}

}
