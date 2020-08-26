package com.javax.thread.v3;

// Working Thread�� ����� ��� 1
// Runnable ����
public class DigitThread extends Thread{
	// Thread�� ������ run �޼��带 �������̵� �Ͽ� �߰�
	
	@Override
	public void run() {
		// ���� : run�޼��带 ���� ȣ���ϸ� ��Ƽ�����尡 �ƴ�
		//      start�޼��带 �̿��Ͽ� ��ȸ�����ؾ� ��
		// ���ڸ� 0���� 30���� 1�� �����ϸ鼭 ���, 0.3�� ���
		for(int i = 0 ; i <= 30; i++) {
			System.out.printf("%s : %d%n", getName(),i); // �������� �̸��� ������!
			
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}

	
	
}
