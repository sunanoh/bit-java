package javaEx.com.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifElseEx();
		//ifElseEx2();
		//ifElseEx3();
		//switchEx();
		//switchEx2();
		//whileEx();
		//whileEx2();
		doWhileEx();
	}
	
	public static void doWhileEx() {
		// ���ڸ� �Է� �޾Ƽ� �ջ�
		// 0�� �Է� ������ �ݺ��� ����
		
		int num =0;
		int total = 0; //�ջ� ����

		Scanner scan = new Scanner(System.in);
		
		// �ּ� 1�� �����ؾ� �ϴ� �ݺ� do ~ while
		// or �ݺ� ������ loop �� ���ο��� �����Ǵ� ��� do ~ while
		System.out.println("���ڸ� �Է��ϼ���. [0�̸� ����]");
		
		do { // �ϴ� ����
			//System.out.print("���� : ");
			num = scan.nextInt();
			total += num;
			System.out.println("�հ� : "+ total);
		}while(num != 0);
		System.out.println("0�� �Է��Ͽ� ����Ǿ����ϴ�. �հ�� "+total + " �Դϴ�.");
	}
	
	public static void whileEx2() {
		//�ܼ��� �Է�, �ش� ���� ����ǥ�� ���
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ܼ��� �Է����ּ��� : ");
		int dan = scan.nextInt();
		
		int i = 1;
		while(i <= 9) {
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}
		
		scan.close();
	}
	
	public static void whileEx() {
		// �ݺ����� ���, 1���� 100���� ���ڸ� �ջ��Ͽ� ���
		int num = 1; // ���۰�, ���Ǻ�
		int sum = 0;
		
		// ���� : while���� �ݺ� ������ �����ڰ� ���� ��Ʈ�� ���־�� �Ѵ�.
		while(num <= 100) {
			sum = sum + num;
			System.out.println("num = " +num+ " sum = "+sum);
			num++;
		}
		System.out.println(sum);
	}
	
	public static void switchEx2() {
		// ������(����) �Է�
		// 1, 3, 5, 7, 9, 11 -> 31��
		// 2 -> 28��
		// 4, 6, 8, 10, 12 -> 30��
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");

		int month = scan.nextInt();
		int days = 0;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 9: case 11:
				days = 31;
				break; // �������� break;
			case 2: 
				days = 28;
				break; // �������� break;
			case 4: case 6: case 10: case 12:
				days = 30;
				break; // �������� break;
		}
		

		System.out.println(month+ "���� " + days + "�� �Դϴ�.");		
		scan.close();
	}

	public static void switchEx() {
		// ifElseEx3�� ������ ������ switch
		// switch�� ���޹��� ������ ���� �̿��ؼ� �帧�� ���� (==)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �����ϼ���.");
		System.out.println("------------------------");
		System.out.println("1. �ڹ�");
		System.out.println("2. C");
		System.out.println("3. C++");
		System.out.println("4. ���̽�");
		System.out.println("------------------------");
		System.out.print("���� ��ȣ : ");
		
		int subjectNum = scan.nextInt();
		
		switch(subjectNum) {
		case 1:
			System.out.println("�ڹ� ������ ���ǽ��� R101ȣ �Դϴ�.");
			break; // �������� break;
		case 2:
			System.out.println("C ������ ���ǽ��� R202ȣ �Դϴ�.");
			break;
		case 3:
			System.out.println("C++ ������ ���ǽ��� R303ȣ �Դϴ�.");
			break;
		case 4:
			System.out.println("���̽� ������ ���ǽ��� R403ȣ �Դϴ�.");
			break;
		default: // else ���� case ������ ��ġ�ϴ� ��� ���� ��
			System.out.println("�������� �����ϼ���.");
				
		}
		scan.close();
		
	}
	
	public static void ifElseEx3() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �����ϼ���.");
		System.out.println("------------------------");
		System.out.println("1. �ڹ�");
		System.out.println("2. C");
		System.out.println("3. C++");
		System.out.println("4. ���̽�");
		System.out.println("------------------------");
		System.out.print("���� ��ȣ : ");
		
		int subjectNum = scan.nextInt();
		
		if(subjectNum == 1) {
			System.out.println("�ڹ� ������ ���ǽ��� R101ȣ �Դϴ�.");
		}else if(subjectNum == 2){
			System.out.println("C ������ ���ǽ��� R202ȣ �Դϴ�.");
		}else if(subjectNum == 3){
			System.out.println("C++ ������ ���ǽ��� R303ȣ �Դϴ�.");
		}else if(subjectNum == 4){
			System.out.println("���̽� ������ ���ǽ��� R403ȣ �Դϴ�.");
		}
		else {
			System.out.println("�������� �����ϼ���.");
		}
		scan.close();
	}
	
	public static void ifElseEx2() {
		// �����Է�
		// 0���� ũ�� ���, 0�̸� 0, 0���� ������ ����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("����Դϴ�.");
		}else if(num < 0){
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("0 �Դϴ�.");
		}
		scan.close();
		// ��ø if : 1���� ���͸�
		// ���� ��� ���ʿ��� 2���� ���� �Ǻ�
	}
	
	public static void ifElseEx(){
		// Scanner�� ������ �Է�
		// ������ 60�� �̻��̸� "�հ�"
		// �׷��� �ʴ�(60�� �̸��̸�) "���հ�"
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = scan.nextInt();
		
		if(score >= 60) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		scan.close();
	}
	
	
}
