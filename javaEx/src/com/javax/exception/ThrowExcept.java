package com.javax.exception;

import java.io.IOException;

// �޼��忡�� ���� ���� �߻�
public class ThrowExcept {

	public void executeCheckedException() throws IOException {
		System.out.println("üũ�� ���� �߻�!");
		// ���� ���ܹ߻�
		throw new IOException("���� IO ����");	
	}
	
	public void executeUncheckedException() throws RuntimeException {
		System.out.println("��üũ�� ���� �߻�!");
		// ��üũ�� ���ܴ� ��κ� RuntimeException�� �ڽ� Ŭ����
		throw new RuntimeException("���� RuntimeException");	
	}
	
	public double divide(int num1, int num2) {
		double result = 0;
		
		try {
			result = num1/num2;
		}catch(ArithmeticException e){
			// �Ϲ��� ���� �߻���
			// ���� ��ü���� ����� ���� ���ܷ� ��ȯ�Ͽ� throw�ϴ� ����
			// ������, �ڵ� ����� �۾����� ��������
			throw new CustomArithmeticException("����� ���� ����", num1, num2);
		}
		return result;
	}
}
