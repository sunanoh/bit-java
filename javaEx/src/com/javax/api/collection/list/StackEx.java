package com.javax.api.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// Stack 자료형
		// 후입선출 : Last In First Out
		// 입출력 방향이 한 방향
		
		
		// 스택 생성
		Stack<Integer> stack = new Stack<>(); // 정수를 담을 수 있는 스택
		
		// 입력 : push(쌓기)
		for(int i = 1; i<= 10; i++) {
			stack.push(i);
		}
		
		System.out.println("STACK : "+ stack);
		System.out.println("==========================================");
		
		// 출력 : pop (추출)
		int out = stack.pop();
		System.out.println("인출된 데이터  : "+ out);
		System.out.println("STACK : "+ stack);
		
		// 가장 위쪽 데이터 참조 : peek(추출은 하지 않음)
		int peek = stack.peek();
		System.out.println("참조된 데이터  : "+ peek);
		System.out.println("STACK : "+ stack);
		System.out.println("==========================================");
		
		// 루프를 돌면서 객체를 모두 pop
		// 스택이 빈 상태에서 pop을 하면 예외 발생
		/*while(true){
			System.out.println("인출 데이터 : " + stack.pop());
			System.out.println("STACK : "+ stack);
		}*/
		
		while(!stack.empty()){ // 스택이 비어있지 않으면 반복
			System.out.println("인출 데이터 : " + stack.pop());
			System.out.println("STACK : "+ stack);
		}
	}

}
