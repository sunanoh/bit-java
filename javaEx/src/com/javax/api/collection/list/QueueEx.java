package com.javax.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue �ڷ��� 
		// First In First Out (���Լ���)
		// Queue�� �������̽��� ����
		// ��ü Ŭ������ LinkedList Ŭ���� �̿�
		
		Queue<Integer> queue = new LinkedList<>();
		
		// ������ ����(enqueue) : offer
		for(int i = 1; i <= 10; i++) {
			queue.offer(i);
		}
		System.out.println("QUEUE : " + queue);
		System.out.println("==========================================");
		
		// ���� : ������ Ȯ��
		System.out.println("dequeue : " + queue.poll());
		System.out.println("QUEUE : " + queue);
		// �Է� : ������ Ȯ��
		System.out.println("enqueue : " + queue.offer(11));
		System.out.println("QUEUE : " + queue);
		
		// �������� Ȯ�� : ���� �Էµ� �� �ղ��� �����
		System.out.println("peek : " + queue.peek());
		System.out.println("QUEUE : " + queue);
		System.out.println("==========================================");
		
		// ��ü �������� ����
		// poll�� ���� isEmpty�� üũ �ʼ�
		while(!queue.isEmpty()) {
			System.out.println("POLL  : "+queue.poll());
			System.out.println("QUEUE : " + queue);
		}
	}

}
