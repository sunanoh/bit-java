package com.javax.oop.staticmembers;

public class StaticExApp {
	
		public static void main(String[] args) {
			
			StaticEx s1 = new StaticEx();
			// ù ��° �ε� : static ��� ���� -> ������
			// refCount�� static -> �ν��Ͻ� ���� ���� ���� ����
			System.out.println("RefCount: " + StaticEx.refCount);
			
			StaticEx s2 = new StaticEx();
			// �տ��� static �ʱ�ȭ �Ϸ� : static ��� ���� ���� -> ������
			System.out.println("RefCount: " + StaticEx.refCount);
			
			
			s1 = null; // ���� ����

			System.out.println("s1 ����: " ); // �����Ѵٰ� �ٷ� finallize�ϴ°� �ƴ϶�..�ٷ� ����ȳ��� ������
			System.out.println("RefCount: " + StaticEx.refCount);
			
			
			// ������ �ݷ��� ���� ����
			// ���� : ���� ������ �ݷ��͸� ȣ������ �ʵ��� ����
			// �۵� ���� ���ظ� ���� �ڵ��̴� �� �ڵ�� ��� �ʵ��� �սô�.
			
			System.gc();
			// ��� ���
			try {
				Thread.sleep(3000); // 3�� ���
				System.out.println("RefCount: " + StaticEx.refCount);
			} catch(Exception e) {
				
			}
		
		}
		
		
		
	
}
