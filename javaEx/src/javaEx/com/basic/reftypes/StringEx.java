package javaEx.com.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
		//stringBasic();
		//stringFormat();
	}
	
	public static void stringFormat() {
		// ���� ����
		// %d(10��), %s(���ڿ�), %f(�Ǽ�)
		// %n(����), %%(%)
		// 0���� 0�߿��� 0���� �Ծ���.
		
		// ���� �������� ��� �������� ���!
		
		String fruit = "���";
		int total = 10;
		int eat = 3;
		
		String fmt = "%d���� %s�� ���� %d���� �Ծ���.";
		System.out.printf(fmt, total, fruit, eat);
		System.out.println("");
		// ���� ���� ������ ����
		
		// printf������ ����ϴ� ���� �ƴϰ�
		// ���ο� ���ڿ��� ������ �� ����Ѵ�
		
		String res = String.format("���̻���� %f�Դϴ�.", Math.PI);
		System.out.println(res);
		// %f�� ��� --> �Ҽ��� �ڸ��� ������ �� �ִ�.
		
		res = String.format("���̻���� %.2f�Դϴ�.", Math.PI);
		System.out.println(res);
	}
	
	public static void stringBasic() {
		// ���� �⺻���� �����ڷ����� ����
		String str; // ����
		str = "Java";
		String str2 = "Java"; // ���� + �Ҵ�
		String str3 = new String("Java"); 
		
		// ����Ÿ���� ���, 
		// ==, != �� �ּ��� ��(hashCode ��)
		System.out.println(str==str2);
		System.out.println(str2==str3);
		
		//���� ��
		//��ü ���ο� equals��� �ϴ� �޼��带 �̿�
		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str3));
		
	}

}
