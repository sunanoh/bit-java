package com.javax.api.objectclass.v5;

import java.util.Arrays;

// v5. 참조 타입 필드를 가진 객체의 복사 (깊은 복제)
public class Scoreboard implements Cloneable{
	// 필드 : 참조 타입
	// 깊은 복제를 위해서는 참조타입필드도 복제해주어 분리해 줘야 한다.
	private int scores[]; // 정수 배열
	
	
	// 생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	// Getters, Setters
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	// 복제 메서드
	public Scoreboard getClone() { // (1) 외부에서 getClone부르면
		Scoreboard clone = null; // (2) 참조변수 하나만들어서
		
		try {
			clone = (Scoreboard)clone(); // (3) clone으로 들어감
		}catch(CloneNotSupportedException e) {
			System.err.println("복제를 지원하지 않음");
		}
		return clone;	
	}
	
	//출력을 위한 toString 오버라이드
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Scoreboard [score = " + Arrays.toString(scores) + " ]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Scoreboard clone = (Scoreboard)super.clone(); // object의 얕은 복제 진행
		
		// 내부 참조 필드를 복제
		clone.scores = Arrays.copyOf(scores, scores.length);
		return clone;
	}

	
}
