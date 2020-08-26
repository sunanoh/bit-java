package com.javax.thread.v3;

// Process : �������� �ϳ��� ���α׷�
// Thread : ���μ��� ������ ����Ǵ� �ϳ��� �۾� �帧
// �ϳ��� Process�� ����Ǹ� Main Thread�� �ϳ� ���� (�⺻������ 1 Process - 1 Thread ��)
public class MainTread {

	public static void main(String[] args) {
		// ���� ������� ������ �ٸ� �۾��帧�� �ʿ�
		// Thread �����Ͽ� ����
		
		Thread thread1 = new DigitThread();
		thread1.setName("DigitThread");
		
		// �������� ���� : Runnable -> Running -> ����������!
		thread1.start(); // thread ������ run �޼���� ���� ȣ������ ����
		
		
		// Runnable�� �̿��� �۾� Thread
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.start(); // -> ���׻��·� ����� 
		
		// Thread�� ���� �켱���� : �ڿ��� ������ ��� ���� �����ؾ��� Thread�� ����
		// 1(MIN_PRIORITY)) ~ 10(MAX_PRIORITY) - �Ϲ��� �켱������ 5(NORM_PRIORITY)
		thread1.setPriority(Thread.MIN_PRIORITY); // ��� 1
		thread2.setPriority(Thread.MAX_PRIORITY); // ��� 10
		

		try {
			thread1.join(); // ���� �޼��� �帧�� �շ�
 			thread2.join(); // ���� �޼��� �帧�� �շ�
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		// ���� �������� ����
		System.out.println("���� ������ ����"); 
		// �������ڸ��� ����Ǿ����
		// ���ν����尡 �ΰ����� ��ŷ�����带 ��� �����ؾ��ϳ�, ���� �׾����
		// ���� ��ŷ��������� ������ �� ���� ���°� ��
		// ��ŷ�����尡 ����� �� �۾��帧�� ���ν������� �۾��帧�� ����(�շ�)�ؾ��� �ʿ䰡���� = JOIN
		// (���� try�� �߰�)
		
		// ��� �����尡 ����Ǳ��������� ���ν������ ����������..!
		
		
		// �������� �켱���� ����ֱ� -> .setPriority(���ڰ� Ŭ���� ����) ->v3
		
	
		
		
	
		
	}

}
