package javaEx.com.basic;

import java.util.Scanner;




public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//consoleOutput();
		consoleInput();
	}
	
	// �ܼ� �Է� (System.in)
	// Scanner Ŭ������ �̿��ϸ� �پ��� �Է� �ҽ��κ��� �����͸� �Է� ���� �� �ִ�
	public static void consoleInput() {
		// Tip. Ctrl + Shift + O -> �ڵ� import
		// Tip. Ctrl + Space -> Code Assist
		Scanner scan = new Scanner(System.in);
		// �̸���? -> ���ڿ� ������ �Է�
		// ���̴�? �̶�� ���� ���������� �Է�
		// ��� -> ���̴� 0��
		
		System.out.print("�̸��� ? : ");
		String name = scan.next();
		System.out.print("���̴� ? : ");
		int age = scan.nextInt();
		
		System.out.print("\n" + name +"���� ���̴� "+age +"�� �Դϴ�.");
		
		scan.close();
		// �ý��� �ڿ��� ����ϴ� ����� �̿��� �Ŀ��� �ݵ�� �ݾ�����.
		
	}

	
	// �ܼ� ���
	public static void consoleOutput() {
		// System.out.print -> ��� �� ���� ����
		// System.out.println -> ����� ����
		// System.out.printf -> ����ȭ�� ��� : String �Ҷ� ���� (TODO)
		
		System.out.print("Hello ");
		System.out.println("Java");
		
		// �̽������� ����(������)
		// \n : ����
		// \t : ��
		// \" : �ֵ���ǥ
		// \\ : \
	
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		
		String message = "Hello, \"Java\"";
		System.out.println(message);
		
		// ������ �ٷ�� �ϴµ�, C:\mydir\myfile.txt�� ����Ϸ��� �� ��
		// ��������(\)�� �� ������ \�� �ѹ��ڸ� ã�Ƽ� �̽������� ���ڸ� ã�´�.
		// ���� \m���� ���� ã�ٰ� ������ ����
		// \\���� \���� ǥ�����־���� 
		String dir = "C:\\mydir\\myfile.txt";	
		}
}
