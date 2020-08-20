package com.javax.api;

public class StringEx {

	public static void main(String[] args) {
		//stringBasic();
		//stringMethods();
		stringBufferEx();

	}
	private static void stringBufferEx() {
		// ������ ���ڿ��� ������ �� �Ź� ���ο� ���ڿ� ��ü ����
		// -> ���ο� ����(�ӽ��������)�� ���� String Buffer�� Ȱ���ϸ�
		// �޸� ������ ����
		StringBuffer sb = new StringBuffer("This"); // ������ ���� + �ʱ�ȭ
		// ���ڿ� �߰� : append()
		sb.append(" is pencil"); 
		// ���ڿ� ���� : insert()
		sb.insert(8, "my");
		// ���ڿ� ġȯ : replace()
		sb.replace(8, 10, "your ");
		
		System.out.println("���յ� ���ڿ� : "+ sb);
		System.out.println(sb);
		// ������ ���̸� ���Ƿ� ������ ���
		sb.setLength(100); // �⺻������ ���۴� 10�ڸ��� ����
		
		// �޼��� ü�̴��� �̿��Ͽ� ���ڿ� ����
		StringBuffer sb2 = new StringBuffer("This").append(" is pencil").insert(8, "my").replace(8, 10, "your "); // �ʱ�ȭ
		String s = sb2.toString(); // ���ο� ���ڿ��� ����, �Ҵ�
		
		System.out.println("ü�̴� ���յ� ���ڿ�: "+ s);
	}
	
	private static void stringMethods() {
		// �߿� �޼��� Ȯ��
		String s = "Java Programming is Fun?";
		
		// char ���� ���� �� ����Ǿ��ִ� ����
		System.out.println("����: "+ s.length());
		
		// ��ȯ �޼��� : to �迭
		System.out.println("�빮�ڷ� : " + s.toUpperCase());
		System.out.println("�ҹ��ڷ� : " + s.toLowerCase());
		
		// �˻� ���� : ����, ���ڿ��� ��ġã�� ��
		System.out.println("5�� �ε����� ����: " + s.charAt(5));
		// ���߿�� indexOf
		System.out.println("Fun ���ڿ��� ��ġ �ε��� : "+ s.indexOf("Fun")); // �˻��� ��ҹ��ڸ� �����ϱ� ������ ���� �ʿ�
		System.out.println("fun ���ڿ��� ��ġ �ε���: " + s.indexOf("fun")); // ��ȯ���� -1�� ���? �ش� ���ڿ��� ã�� �� ����
		
		System.out.println("m�� ��ġ �ε��� : "+ s.indexOf("m"));
		System.out.println("m�� ������ ��ġ �ε��� : "+ s.lastIndexOf("m"));
		
		System.out.println("m�� ��ġ �ε��� 2nd : " + s.indexOf("m", 12)); // �˻� ���� ��ġ�� 12�� �ε������� 
		
		// ���ڿ� ���� : substring
		System.out.println("substring (������) : " + s.substring(5));
		System.out.println("substring (����) : " + s.substring(5, 16));
		
		// ġȯ
		System.out.println("ġȯ : " + s.replace('?','!'));
		System.out.println("��� ġȯ : " + s.replaceAll("Fun","Funny").replace('?', '!')); // ���ڿ� ������� �������� ����..�޼��� ü�̴�(���ʴ�� �����Ŵ)
		
		// ��ȯ �޼��带 �����ص� ���� �����ʹ� ������� �ʴ´�(�߿� : immutable)
		System.out.println("���������� : "+ s);
		
		// trim() -> ���鹮�� ����
		String word1 = "               Hello            ";
		String word2 = ", Java";
		System.out.println(word1 + word2);
		
		String result = word1.trim() + word2.trim();
		System.out.println(result);
		
		// ���ڿ� �и� : split
		String[] chunks = s.replace("?","").split(" "); // ������ �������� �и� -> ���ڿ� �迭
		System.out.println("������ �� : "+ chunks.length);
		
		for(String data : chunks) {
			System.out.println("���� : "+ data);
		}
		
		// ���ڿ��� ��� �� : �����ڵ� ���� ��Һ�
		// ABC           ABD
	    // ������ 0, �񱳰��� ������ ����, �񱳰��� ũ�� ���
		System.out.println("ABC".compareTo("ABD"));
		
		
	}
		
	private static void stringBasic(){
		String s1 = "Java"; // ���ͷ� - �ҽ� �ڵ忡 ���� �Է��� ������
		String s2 = new String("Java"); // �޸𸮿� �� ��ü 
		String s3 = "Java"; // ���ͷ�
		
		// ���� ���� �������� ���ͷ��� �� ��ü�� ��
		System.out.println("s1 == s2 ? " + (s1 == s2));
		
		// ���� ���� ���� �� ���� ���ͷ�
		System.out.println("s1 == s3 ? " + (s1 == s3));
		
		// char�� �迭�� ����� ���ڿ��� ����
		char[] letters = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		
		System.out.println("s4 = "+ s4);
		
		
		// �⺻Ÿ���� ���ڿ� ��ü�� ��ȯ : valueof
		String s5 = String.valueOf(Math.PI);
		System.out.println("s5 = "+ s5);
	}

}
