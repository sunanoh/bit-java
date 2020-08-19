package com.javax.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		//arithmeticExceptionEx();
		//indexOutOfBoundEx();
		//nullPointerExceptionEx();
		customExceptionEx();
	}
	
	private static void customExceptionEx() {
		// ����� ���� ������ Ȱ��
		ThrowExcept ex = new ThrowExcept();
		try {
			ex.executeCheckedException(); // üũ�� �ͼ��� �߻�
			ex.executeUncheckedException(); // ��üũ�� �ͼ��� �߻�
			System.out.println("10/0 = " + ex.divide(10, 0));
		}catch(IOException e) {
			System.err.println("���� �޽��� :"  + e.getMessage());
		}catch(CustomArithmeticException e) {
			System.err.println("����� ���� ���� �޽��� : " + e.getMessage());
			System.err.printf("���� ��Ȳ �߻��� num1 = %d, num2 = %d%n",e.getNum1(), e.getNum2());
		}catch(RuntimeException e) {
			System.err.println("�� Ÿ�� ���� �޽���  : " + e.getMessage());
		}
		//catch(CustomArithmeticException e) { // �� Ŭ������ runtimeexcetion�� ��ӹ����Ŷ�, ������ �̸�ó���ع��� ����. ������ �߿���
		//}// �����ܴ� runtimeException�� �ڼ��̹Ƿ� runtimeexception���� ������ ó�� �ʿ�
	}
	
	// ���� ���� �߻��ϴ� ����
	private static void nullPointerExceptionEx() {
		String s = "Hello"; // ���� ��ü
		
		s = null;
		
		try {
			//���� ���� ���
			System.out.println(s.toUpperCase());
		}catch(NullPointerException e) {
			System.err.println("���� �޽��� :" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("end of code");
			
	}
		
	private static void indexOutOfBoundEx() {
		int[] intAry = new int[] {3, 6, 9 };
		
		System.out.println("�迭�� ��dl : " + intAry.length);
		// ���� ������ �ε��� == length - 1
		try {
			System.out.println(intAry[3]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("���� �޽���: "+ e.getMessage());
		}
		//finally�� ���� ����
		System.out.println("End of code");
		
	}
	
	private static void arithmeticExceptionEx() {
		// ��ĳ�ʷκ��� �����ϳ��� �Է�
		// 0���� ���� ����
		
		Scanner scan = new Scanner(System.in);
		double result = 0;
		int num;
		
		System.out.print("������ �Է��ϼ���: ");
		
		
		try {
			// ���ܰ� �߻��� �� �ִ� ���� -> try
			num = scan.nextInt(); //(1)
			result = 100/num; //(2)
		}catch(ArithmeticException e) { //(2) �߻� ����
			// �޽����� ��� �ִ�.
			System.out.println("���� �޽���: " + e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("������ �Է����ּ���!");
			// ���� ��Ȳ ��ü�� Ȯ���ϰ� �ʹٸ�
			e.printStackTrace();
		}catch(Exception e) {
			// catch���� ���������� exception ��ü�� ���������� �� ���ܸ� ó��
			e.printStackTrace();
		}finally {
			// �����ǹ� ������� �׻� �������� ����
			// �ڿ� ���� �۾� � Ȱ��
			System.out.println("Finally");
			System.out.println("���: "+ result);
			scan.close();
		}
	}
		
			

}
