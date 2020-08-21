package com.javax.api.generics.v2;

public class BoxApp {

	public static void main(String[] args) {
		// ������ ���� �� �ִ� �ڽ��� ����		
		// Box<Integer> intBox = new Box<Integer>(); // Ÿ���� Integer�� ����
		
		Box<Integer> intBox = new Box<>(); // �ڿ� <Integer>�� ���� ����
		intBox.setContent(2020);
		//intBox.setContent("2020"); // �����Ϸ��� Generics�� üũ --> �������� ��! ���Ұ�
		
		
		// ���� ������ ���ô�.
		// ������ �����Ͱ� Integer���� Ȯ�� - > ĳ������ ���ʿ��� 
		int content = intBox.getContent();
		System.out.println("�ڽ��� ���빰 : "+ content);
		
		
		
		Box<String> strBox = new Box<>();
		strBox.setContent("Java"); // ���� (String Ÿ�� ����)
		
		// ���� ������ ���ô�.
		String strContent = strBox.getContent();
		System.out.println("�ڽ��� ���빰 : "+ strContent);
		
		// ����ĳ������ �߸��ϸ�?
		// �����Ϸ��� �ȵȴ�(Generics�� üũ)
		//strContent = (String)intBox.getContent();
		//System.out.println("�ڽ��� ���빰 : "+ strContent);
	}

}
