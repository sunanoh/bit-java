package com.javax.api.generics.v1;

public class BoxApp {

	public static void main(String[] args) {
		// ������ ���� �� �ִ� �ڽ��� ����
		
		Box intBox = new Box(); // ����(Object)
		intBox.setContent(2020);
		
		// ���� ������ ���ô�.
		// Object�̹Ƿ� �ٿ� ĳ���� �ʿ�
		int content = (int)intBox.getContent();
		System.out.println("�ڽ��� ���빰 : "+ content);
		
		Box strBox = new Box();
		strBox.setContent("Java"); // ����(Obhect)
		
		// ���� ������ ���ô�.
		String strContent = (String)strBox.getContent();
		System.out.println("�ڽ��� ���빰 : "+ strContent);
		
		// ����ĳ������ �߸��ϸ�?
		// �����ϴ�
		//strContent = (String)intBox.getContent();
		//System.out.println("�ڽ��� ���빰 : "+ strContent);
	}

}
