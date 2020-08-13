package javaEx.com.basic;

public class MethodEx {

	public static void main(String[] args) {
		
		//System.out.println(sum(1,4));
		//printMessage("�ȳ�");
		//sum(10, 20, 30, 40, 50); // �μ����� �迭 ���·� ��ȯ�Ǿ� ����
		//System.out.println("�����μ� ����: "+ sum(10,20,30,40,50));
		printSum("�����μ� ���� : ", 10,20,30,40,50);
	}
	
	// �����μ�, �����μ��� �Բ� ��� ����
	// ���� ����� ���, ������ �߿���
	// �ݵ�� �����μ� -> �����μ� ������ ����ؾ� ��
	private static void printSum(String message, double ...values) {
		                         //�����μ�              //�����μ�
		double total = sum(values);
		System.out.println(message + ":" + total);
	}
	
	
	// �����μ�
 	private static double sum(double ... values) {
		System.out.println("�μ��� ����: "+ values.length);
		double total = 0;
		for (double val: values) { // ���� for��
			total += val;
		}
		return total;
	}

	
	private static double sum(double a, double b) {
		return a + b; // �����ʹ� double�̾�� �Ѵ�.
	}
	
	private static void printMessage(String message) {
		// ������ �����Ͱ� ������ void
		System.out.println(message);
		
	}

}
