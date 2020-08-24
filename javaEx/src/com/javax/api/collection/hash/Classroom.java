package com.javax.api.collection.hash;

public class Classroom {
	// �ʵ�
	private String roomName;
	private String subject;
	
	// ������
	public Classroom(String subject) {
		this.subject = subject;
	}
	
	public Classroom(String roomName, String subject) {
		this(subject);
		this.roomName = roomName;
	}

	// toString �������̵�
	@Override
	public String toString() {
		return "Classroom [roomName=" + roomName + ", subject=" + subject + "]";
	}

	// equals, hashCode �������̵�
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Classroom) {
			return hashCode() == obj.hashCode();
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// ���� ���� ������ �ؽ��ڵ� ��ȯ
		return subject.hashCode();
	}
	
	
}
