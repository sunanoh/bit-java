package com.javax.api.arrays;


// 사용자 정의 객체가 정렬, 비교 등의 기능을 수행하기 위해서는 
// Comparable 인터페이스를 구현해줘야 한다.
public class Member implements Comparable{
	// 필드
	private String name;
	
	
	// 생성자
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
		// 두 객체의 대소관계를 리턴하는 메서드
		// 0이면 두 객체는 같다
		// 비교 대상이 작을 경우 : -1
		// 비교 대상이 클 경우 : 1
		
		if(o instanceof Member) { // 매개변수로 들어온 인자가 member의 객체인 경우
			Member other = (Member)o;
			return name.compareTo(other.name); // 문자열의 대소관계
		}
		return 0;
	}
}
