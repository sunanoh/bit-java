package com.javax.oop.staticmembers;


// scope ����
public class StaticEx {
	public static int refCount; // Ŭ���� ���� : static
	public static String classVar; // Ŭ���� ����
	public String instanceVar; // �ν��Ͻ� ����
	
	// static ������ �ʱ�ȭ
	static {                                    // ó�� �ʱ�ȭ1���� �ϰ�, �ν��Ͻ� �����ǵ� �ٽ� �ȳ���
		refCount = 0;
		classVar = "Static Member";
		// intstanceVar = "Instance Member";  
		// static�������� instance������ ������ �Ұ�
		// instance�������� static������ ���� ����
		
		System.out.println("Static Block");	
	}
	
	// ������
	public StaticEx() {
		refCount++; // Static�����̹Ƿ� ��� �ν��Ͻ����� ���� ����
		instanceVar = "Instance Member";
		System.out.println("refCount: "+ refCount);
		System.out.println("�ν��Ͻ� ����");
	}
	
	
	@Override
	protected void finalize() throws Throwable{ // ��ü�� ������ �� ȣ��Ǵ� �Լ�
		refCount--;
		super.finalize();
		System.out.println("�Ҹ��� ȣ��");
	}
	
	

}
