package javaEx.com.basic;

// �ڹ��� �⺻ �ڷ��� ����
//
//2020.05.31~��Ʈ
//Luvstagram
//���� : @Sienna_noh
//���� : @gidong_0422


public class TypeEx {

	public static void main(String[] args) {
		
	// 	intLongTest();
	// 	floatDoubleTest();
	//	booleanEx();
	//	charEx();
		constantEx();
	}
	
	// �������
	public static void constantEx() {
		// ������ �ʴ� ������
		// final�� ����� �տ� ���̸� �ȴ�
		// ����ĺ��ڴ� ��� �빮��, ���� �ܾ� ���ս�
		// �ܾ� ���̿� _
		// ��� ���� �����ϸ� �ش� ����� ����� ��� �ڵ尡 �����
		// 1. �ڵ��� ������
		// 2. �ڵ� ���� ������ ����
		
		final double PI = 3.14159;
		final int SPEED_LIMIT = 110;
		
		System.out.println("PI = " + PI);
		System.out.println("���Ѽӵ� = " + SPEED_LIMIT);
		
		// SPEED_LIMIT = 80; // ����̹Ƿ� ���� �Ұ��ϰ� �ȴ�
		
		System.out.println("���Ѽӵ� = " + SPEED_LIMIT);
	}
	
	// char ����
	public static void charEx() {
		// 2����Ʈ(��ȣ ����)
		// �����ڵ� �� ������ ��ġȭ�� �ڵ�
		// '' <- char
		// "" <- string
		char ch1 = 'A';
		char ch2 = '��';
		
		System.out.println("A -> " + ch1);
		System.out.println("�� -> " + ch2);
		
		System.out.println(ch1 + ch2);
	}
	
	// boolean ����
	public static void booleanEx() {
		// ���� true or false
		// �� ����, �� ������ ����� ��ȯ
		// �帧 ����, �ݺ��ؼ� �帧�� ������ �� �� ���� ����Ѵ�
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int v1 = 3;
		int v2 = 5;
		
		boolean result = v1 > v2;
		
		System.out.println("result = " + result);
		
	}
	
	// �Ǽ��� ����
	// float(4) < double(8)
	public static void floatDoubleTest() {
		// ���е��� ����, ǥ�� ������ ���� �ڷ���
		
		float fVar = 3.14159f; //float�� �ν��� ���ؼ�, ����Ϸ��� ���� f�� �ٿ��־�� ��
		double dVar = 3.14159;//�ڹٿ��� �Ǽ�ǥ���� �⺻�� double��
		
		// ���е� �ľ�
		fVar = 0.1234567890123456789f;
		dVar = 0.1234567890123456789;
		
		System.out.println(fVar); //��� : 0.12345679
		System.out.println(dVar); //��� : 0.12345678901234568
		
		//���� ǥ���
		fVar = 1234567890E-10F;
		System.out.println(fVar);
		
		// �Ǽ� �ڷ����� ó���� ���е��� ��������(ǥ�� ������ ����)
		System.out.println(0.1 * 3);
		// ������ ���� ���е��� �䱸�ϴ� ���߿��� float, double ����� �����ؾ� �Ѵ�.
		
	}
	
	// ������ ����
	// byte < short < int < long
	public static void intLongTest() {
		// ��������
		// int -> �ڹٰ� �ٷ�� �������� ���� �⺻���� ����
		
		int intVar1;
		intVar1 = 2020; // �ʱ�ȭ �۾�
		int intVar2 = 2020; // ���� + �ʱ�ȭ �۾�
		
		System.out.println(intVar1);
		System.out.println(intVar2);
		
		// long : 8byte
		long longVar1;
		longVar1 = 2020;
		long longVar2 = 123456789012345678L; //�� �ڿ� L�� �ٿ��� Long���� �����, ���̱� ������ int�� �ν�
		
		System.out.println(longVar1);
		System.out.println(longVar2);

		
		int bin = 0b1100; //2������ 0b�� ����
		int oct = 010;    //8������ 0���� ����
		int hex = 0xFF;   //16������ 0x�� ����
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}

}
