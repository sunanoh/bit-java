package com.javax.api.arrays;


// ����� ���� ��ü�� ����, �� ���� ����� �����ϱ� ���ؼ��� 
// Comparable �������̽��� ��������� �Ѵ�.
public class Member implements Comparable{
	// �ʵ�
	private String name;
	
	
	// ������
	public Member(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	// toString
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	
	@Override
	public int compareTo(Object o) {
		// �� ��ü�� ��Ұ��踦 �����ϴ� �޼���
		// 0�̸� �� ��ü�� ����
		// �� ����� ���� ��� : -1
		// �� ����� Ŭ ��� : 1
		
		if(o instanceof Member) { // �Ű������� ���� ���ڰ� member�� ��ü�� ���
			Member other = (Member)o;
			return name.compareTo(other.name); // ���ڿ��� ��Ұ���
		}
		return 0;
	}
}
