package javaEx.com.basic;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arithOper();
		// incDecOper();
		// logicalOper();
		// bitOper();
		conditionalOper();
	}
	
	// 3�� ������
	public static void conditionalOper() {
		// ���� ? (true�϶�) �� or ����� : (false�϶�)�� or �����
		// ������ ���� ����, �ڵ� �������� ���� �� �ִ�
		
		int a = 10;

		// a�� ¦���� "¦��", �ƴϸ� "Ȧ��" ���ڿ�
		String message = a % 2 == 0 ? "a�� ¦��" : "a�� Ȧ��";
		System.out.println(message);
		
		int score = 85;
		// ������ 80 �̻��̸� Good
		// ������ 50 �̻��̸� Pass
		// �׷��� ������ Fail
		
		message = score >= 80 ? "Good" : (score >= 50 ? "Pass" : "Fail"); 
		System.out.println(message);
		//��ø�����ϳ�, ��õ���� ����
	}

	// ��Ʈ ������
	public static void bitOper() {
		// and (&), or (|), not (~)
		// ������ �����͸� ��Ʈ ������ �����ϴ� ������
		
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2; // bit and ����
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 | b2; // bit or ����
		System.out.println(Integer.toBinaryString(result));
		
		result = ~b1; // bit not ����
		System.out.println(Integer.toBinaryString(result));
		System.out.println(result);
		
		// ��Ʈ ����Ʈ
		// << : ��Ʈ�� �������� �̵� (������ 2�� ����� ��)
		// >> : ��Ʈ�� ���������� �̵� (������ 2�� ����� ������)
		
		int val = 1;
		// �������� 1��Ʈ �̵�
		System.out.println(val);
		System.out.println(Integer.toBinaryString(val << 1));
		System.out.println(Integer.toBinaryString(val << 2));
		
		val = 0b100;
		// ���������� 1��Ʈ �̵�
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val >> 1));
		System.out.println(Integer.toBinaryString(val >> 2));
	}
	
	// ��, ������
	public static void logicalOper() {
		// �� ������ : >, >=, <, <=, == (����), != (�����ʴ�)
		// �� ������ : &&(���� AND), ||(���� OR), !(������ NOT)
		
		int n = 5;
		
		// n�� 0 �ʰ�, 10 �̸��ΰ�?
		// ���� 1: n > 0 �̰�,
		// ���� 2: n < 10 �̴�	
		boolean b1 = n > 0;
		boolean b2 = n < 10;
		boolean r = b1 && b2;
		System.out.println("a > 0 and a < 10 ? " + r);
		
		// n�� 0���� �̰ų�, 10 �̻��ΰ�?
		// ���� 1: n <= 0 �̰ų�,
		// ���� 2: n >= 10		
		b1 = n <= 0;
		b2 = n >= 10;
		r = b1 || b2;
		System.out.println("a <= 0 or a >= 10 ? " + r);
		
		boolean notR = !r;
		System.out.println("������ : " + notR);
	}

	
	// ����, ���� ������
 	public static void incDecOper() {
		
		// ������ �߿�
		int a = 5; // a++
		int b = 5; // ++a
		
		// ����������
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		// ����������
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);
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
		// ArithmeticException
		//System.out.println("���� ������ 0 " + (a/0));
		
		// �Ǽ��� 0���� ������
		// "�Ǽ� / 0 => Infinity" ���Ѵ밡 ����
		System.out.println("�Ǽ� / 0 => " +(4.0/0));
		// ���Ѵ뿡 ������� -> ���Ѵ�
		System.out.println("���Ѵ��� ��� => " + (4.0/0 + 10));
		// ���� -> ����� �� ���� ��(NaN -> Not a Number)
		System.out.println("0.0/0.0 => "+ (0.0/0.0));
		// NaN ���Ե� ��� ���� -> NaN (���Ұ�)
		System.out.println("NaN ��� => " + (0.0/0.0 + 20));
		// ���Ѽ����� Ȯ��
		System.out.println("���Ѽ��� Ȯ��: " + Double.isFinite(4.0/0));
		// NaN���� Ȯ��
		System.out.println("NaN Ȯ�� => " + Double.isNaN(0.0/0.0));
		
		
		
		
		
		
	}
}
