package com.javax.api;

public class WrapperEx {

	public static void main(String[] args) {
		// Wrapper Ŭ���� ����
		// �ڹٴ� ��ü����, �����͸� ����Ÿ������ ���� �����
		// �⺻Ÿ���� null�� ������, ��ü �ٷ�ٺ��� null�� �ʿ��� ��찡 �־ wrapper���
		
		Integer i = new Integer(2020);
		Character c = new Character('c');
		// ���� ����� jdk9���� Deprecated�Ǿ� ������� �ʴ� ���� ����.
		
		Float f = Float.valueOf(3.14159f);
		// �� ������� �����ϴ� ���� �ʿ�
		Boolean b= Boolean.valueOf(true);
		
		
		// �⺻Ÿ���� ������� �� ����(null ��� ����)
		// Wrapper Ÿ���� ������� �� �ִ�( null ���)
		b = null; // �����
		
		
		// Ȱ��
		// ���ڿ��� �� �����͸� ��ȯ�� �� Ȱ��
		Integer i2 = Integer.valueOf("2020");
		// ���� : valueOf ������ ���ڿ� ������ ���°� �ش� ������ Ÿ������ ��ȯ�� �� �ִ� ���¿��� �Ѵ�.
		//---------------------------------------------------------------------------
		System.out.println("-------------------------------------------------------");
		
		// ���� ����� ���� ��
		System.out.println("i�� �� : " + i.intValue());
		System.out.println("i�� i2�� ���� ������? :" + (i.intValue() == i2.intValue()));
		
		// ��ڽ� �� 2��°  --> �ڵ� ��ڽ� ���� ����
		System.out.println("i�� i2�� ������? "+ (i == i2)); 
		// ��·�� �ٸ� ��ü�� ������ false./ �ٸ� �޸� ����
		System.out.println("i�� i2�� ���� ������?  "+ (i.intValue() == i2.intValue()) );
		// equals�� �̿��� ���� ��
		System.out.println("i�� i2�� ���� ������? "+ i.equals(i2));
		
		//-------------------------------------------------------------------------
		System.out.println("-------------------------------------------------------");

		Float f2 = 3.1459f; // Float.valueOf(3.14159f); �̷��� �Ƚᵵ �ڵ� �ڽ̵�
		
		// parse �迭 �޼��� : �ַ� ��ȯ�۾��� Ȱ��
		System.out.println("���ڿ� -> ���������� ��ȯ : "+ Integer.parseInt("-12345"));
		// ���� ��ȯ
		System.out.println("16���� FF -> 10������ ��ȯ : "+ Integer.parseInt("FF",16));
		// ����ȯ
		System.out.println("f2 -> int : "+ f2.intValue());
		

	}

}
