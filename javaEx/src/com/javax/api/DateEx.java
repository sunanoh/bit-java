package com.javax.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// Date Ŭ������ Calendar Ŭ������ ����
public class DateEx {

	public static void main(String[] args) {
		// ��¥ �������� ȹ��
		Date now = new Date(); // ���� ��¥�� �ð�
		String nowStr = now.toString();
		
		System.out.println("���� ��¥ : " + nowStr);
		System.out.println("����ȭ�� ��¥ : " + now.toLocaleString());
		// Deprecated�� �޼���� ����� �޼��� -> �ٸ� ������� ��ü�� �ʿ���
		
		// ����ȭ�� ��� : DateFormat!
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL ���� : "+df.format(now));
		// FULL, LONG, MEDIUM, SHORT
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG ���� : "+df2.format(now));
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM ���� : "+df3.format(now));
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("SHORT ���� : "+df4.format(now));
		
		// �����ο� ��¥ ������ ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		System.out.println("���� ���� : "+ sdf.format(now));
	}

}
