package com.javax.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// Calendar ��� : getInstance()�� ���;� ��
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		
		// ��¥ ������ ����
		custom.set(1999,11,31); // 12�� 31�� 
		
		// ����� ����
		int nowYear = now.get(Calendar.YEAR);
		int nowMonth = now.get(Calendar.MONTH)+1;  // ���� : 0 ���� ������.
		int nowDate = now.get(Calendar.DATE);
		System.out.printf("%d�� %d�� %d��%n",nowYear,nowMonth,nowDate);
		
		// ��¥�� ����
		// 10�� �ڷ� �̵�
		Calendar future = Calendar.getInstance();
		future.add(Calendar.YEAR, 10);
		System.out.printf("10�� �� : %d�� %d�� %d��%n",future.get(Calendar.YEAR), future.get(Calendar.MONTH)+1, future.get(Calendar.DATE));
		
		// �̳��� ���� ����?
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println("10�� �� ������ ���� : "+ dow);
		
		String dowStr;
		
		switch(dow) {
			case Calendar.SUNDAY:  // 1
				dowStr = "�Ͽ���";
				break;
			case Calendar.MONDAY:  // 2
				dowStr = "������";
				break;
			case Calendar.TUESDAY: // 3
				dowStr = "ȭ����";
				break;
			case Calendar.WEDNESDAY: // 4
				dowStr = "������";
				break;
			case Calendar.THURSDAY: //5 
				dowStr = "�����";
				break;
			case Calendar.FRIDAY:
				dowStr = "�ݿ���";
				break;
			case Calendar.SATURDAY:
				dowStr = "�����";
				break;
			default: 
				dowStr = "??";
		}
		
		System.out.println("10�� �� ������ ���� : "+ dowStr);
		
		
		//int customYear = custom.get(Calendar.YEAR);
		//System.out.println(customYear);
		

	}

}
