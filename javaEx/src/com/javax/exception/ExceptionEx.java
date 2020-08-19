package com.javax.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		//arithmeticExceptionEx();
		//indexOutOfBoundEx();
		nullPointerExceptionEx();
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
