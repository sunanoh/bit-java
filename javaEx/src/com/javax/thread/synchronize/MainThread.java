package com.javax.thread.synchronize;


// ��ü�� �����ϴ� �۾� �������� ���,
// �Ӱ� ������ ������ ���� �� ��� �Ѵ�(�߿�)
public class MainThread {

	public static void main(String[] args) {
		// ���� ��ü
		
		SharedMemory memory = new SharedMemory();
		
		User user1 = new User("ö��", memory, 100);
		user1.start();
		
		
		User user2 = new User("����", memory, 200);
		user2.start();
	}

}
