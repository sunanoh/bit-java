package javaEx.com.basic;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithOper();
	}

	
	// ���������
	public static void arithOper() {
		// ��Ģ���� : +, -, , /
		int a = 7;
		int b = 3;
		
		System.out.println("7 / 3 = " + (7/3));
		// int / int -> int(��)
		System.out.println("7 / 3�� �� = " + (7%3));
		// ������������ : %
		
		// ��Ȯ�� �Ǽ����� �������� int -> float ��ȯ
		
		System.out.println("7 / 3 �Ǽ� => " + (float)a/(float)b);
		
		
		// ����, ������ 0���� ������
		//System.out.println("���� ������ 0 " + (a/0));
	}
}
