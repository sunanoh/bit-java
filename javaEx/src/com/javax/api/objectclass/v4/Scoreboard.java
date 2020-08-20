package com.javax.api.objectclass.v4;

import java.util.Arrays;

// v4. ���� Ÿ�� �ʵ带 ���� ��ü�� ����
public class Scoreboard implements Cloneable{
	// �ʵ� : ���� Ÿ��
	private int scores[]; // ���� �迭
	
	
	// ������
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
	
	// ���� �޼���
	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
			clone = (Scoreboard)clone();
		}catch(CloneNotSupportedException e) {
			System.err.println("������ �������� ����");
		}
		return clone;	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Scoreboard [score = " + Arrays.toString(scores) + " ]";
	}
	
	//����� ���� toString �������̵�
	
	
}
