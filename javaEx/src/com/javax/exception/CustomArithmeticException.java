package com.javax.exception;

// ArithmeticException�� Ȯ���� ����� ���� ���� ��ü
public class CustomArithmeticException extends ArithmeticException {

	// �ʵ� : ���� �߻� ����� ��Ȳ ����(������)
	private int num1;
	private int num2;
	
	// ������                                                   //�� message�� getmessage�� �������� �װ�
	public CustomArithmeticException(String message, int num1, int num2) {
		super(message); // �θ� ������ ȣ��
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// Getter / Setter
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	

	
}
