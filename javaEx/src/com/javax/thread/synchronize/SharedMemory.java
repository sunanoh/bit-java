package com.javax.thread.synchronize;

// ���� �����忡�� �����ϴ� ���� ��ü
public class SharedMemory {

	private int memory;

	public int getMemory() {
		return memory;
	}

	// �Ӱ� ���� : ��Ƽ ������ ���α׷����� �� �ϳ��� �����常 ������ �� �ִ� �ڵ�
	// �Ӱ迵�� ������ ���ؼ��� �޼��� ����ο� synchronized Ű���� �ο�
	// synchronized �޼��尡 ����Ǹ� ��ü ��ݻ��°� �ȴ�.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			//��� ���
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +":" + this.memory);
	}
	
	
	
	
}
