package com.javax.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue 자료형 
		// First In First Out (선입선출)
		// Queue는 인터페이스만 제공
		// 실체 클래스는 LinkedList 클래스 이용
		
		Queue<Integer> queue = new LinkedList<>();
		
		// 데이터 제공(enqueue) : offer
		for(int i = 1; i <= 10; i++) {
			queue.offer(i);
		}
		System.out.println("QUEUE : " + queue);
		System.out.println("==========================================");
		
		// 인출 : 방향의 확인
		System.out.println("dequeue : " + queue.poll());
		System.out.println("QUEUE : " + queue);
		// 입력 : 방향의 확인
		System.out.println("enqueue : " + queue.offer(11));
		System.out.println("QUEUE : " + queue);
		
		// 데이터의 확인 : 먼저 입력된 맨 앞꺼가 추출됨
		System.out.println("peek : " + queue.peek());
		System.out.println("QUEUE : " + queue);
		System.out.println("==========================================");
		
		// 전체 데이터의 인출
		// poll할 때는 isEmpty로 체크 필수
		while(!queue.isEmpty()) {
			System.out.println("POLL  : "+queue.poll());
			System.out.println("QUEUE : " + queue);
		}
	}

}
