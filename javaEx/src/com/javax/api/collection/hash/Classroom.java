package com.javax.api.collection.hash;

public class Classroom {
	// 필드
	private String roomName;
	private String subject;
	
	// 생성자
	public Classroom(String subject) {
		this.subject = subject;
	}
	
	public Classroom(String roomName, String subject) {
		this(subject);
		this.roomName = roomName;
	}

	// toString 오버라이드
	@Override
	public String toString() {
		return "Classroom [roomName=" + roomName + ", subject=" + subject + "]";
	}

	// equals, hashCode 오버라이드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Classroom) {
			return hashCode() == obj.hashCode();
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// 과목 명이 같으면 해시코드 반환
		return subject.hashCode();
	}
	
	
}
