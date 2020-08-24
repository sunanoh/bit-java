package com.javax.api.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// Stack �ڷ���
		// ���Լ��� : Last In First Out
		// ����� ������ �� ����
		
		
		// ���� ����
		Stack<Integer> stack = new Stack<>(); // ������ ���� �� �ִ� ����
		
		// �Է� : push(�ױ�)
		for(int i = 1; i<= 10; i++) {
			stack.push(i);
		}
		
		System.out.println("STACK : "+ stack);
		System.out.println("==========================================");
		
		// ��� : pop (����)
		int out = stack.pop();
		System.out.println("����� ������  : "+ out);
		System.out.println("STACK : "+ stack);
		
		// ���� ���� ������ ���� : peek(������ ���� ����)
		int peek = stack.peek();
		System.out.println("������ ������  : "+ peek);
		System.out.println("STACK : "+ stack);
		System.out.println("==========================================");
		
		// ������ ���鼭 ��ü�� ��� pop
		// ������ �� ���¿��� pop�� �ϸ� ���� �߻�
		/*while(true){
			System.out.println("���� ������ : " + stack.pop());
			System.out.println("STACK : "+ stack);
		}*/
		
		while(!stack.empty()){ // ������ ������� ������ �ݺ�
			System.out.println("���� ������ : " + stack.pop());
			System.out.println("STACK : "+ stack);
		}
	}

}
