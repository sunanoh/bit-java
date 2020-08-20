package com.javax.api.objectclass.v5;

import java.util.Arrays;

// v5. ���� Ÿ�� �ʵ带 ���� ��ü�� ���� (���� ����)
public class Scoreboard implements Cloneable{
	// �ʵ� : ���� Ÿ��
	// ���� ������ ���ؼ��� ����Ÿ���ʵ嵵 �������־� �и��� ��� �Ѵ�.
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
	public Scoreboard getClone() { // (1) �ܺο��� getClone�θ���
		Scoreboard clone = null; // (2) �������� �ϳ�����
		
		try {
			clone = (Scoreboard)clone(); // (3) clone���� ��
		}catch(CloneNotSupportedException e) {
			System.err.println("������ �������� ����");
		}
		return clone;	
	}
	
	//����� ���� toString �������̵�
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Scoreboard [score = " + Arrays.toString(scores) + " ]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Scoreboard clone = (Scoreboard)super.clone(); // object�� ���� ���� ����
		
		// ���� ���� �ʵ带 ����
		clone.scores = Arrays.copyOf(scores, scores.length);
		return clone;
	}

	
}
