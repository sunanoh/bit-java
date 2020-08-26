package com.javax.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

// Ư�� �����ڸ� �������� ���ڿ��� ��ūȭ ��Ű�� Ŭ����
// �⺻ �����ڴ� \t\n\r
// sangbuk.txt -> ,�� ���� �Ϲ����� ����

public class StringTokenizerEx {
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "sangbuk.txt";
	
	public static void main(String[] args) {
		
		
		try {
			// �� ��Ʈ�� ����
			Reader freader = new FileReader(filename);
			// ���� ��Ʈ�� ����
			BufferedReader br = new BufferedReader(freader);
			
			// ������ ����� ���� , ���� ���� �����͵���  ���� �� �о���� ����
			String member;
			
			// ���̻� ���� ������ ���� ���� ����
			while((member = br.readLine())!= null) {
				// ����
				StringTokenizer st = new StringTokenizer(member, ",");
				// ��ũ������ ����
				while(st.hasMoreTokens()) { // ���� �ִ� ��ū�� �ֳ�?
					String token = st.nextToken();
					System.out.print(token + " ");
				}// �� ������ ó��
				System.out.println();
			}
			
			br.close();
			
		}catch(FileNotFoundException e) {
			System.err.println("������ ã�� �� �����ϴ�.");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
