package com.javax.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {

	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "char.txt";  // �ؽ�Ʈ ���� ���Ƿ� �ϳ� ����!
	
	public static void main(String[] args) {
		// writer : Char ��� Stream�� �ְ� ����
		
		try {
			Writer fw = new FileWriter(filename);
			fw.write("Bit Computer\r\n");
			fw.write("Java Programing \r\n");
			fw.write("2020.08\r\n");
			fw.write("��Ȯ��\r\n");
			
			// ���� ����
			fw.flush();
			fw.close();
			
			System.out.println("���� ���� �Ϸ�!");
			
			// ���� �о����
			Reader fr = new FileReader(filename);
			
			int data = 0;
			
			while((data = fr.read())!= -1){
				System.out.print((char)data); // ���� �����ʹ�  char������, ����ȯ ���־�� ��
			}
			
			fr.close();
			System.out.println("���� �о���� �Ϸ�!");
			
		}catch(FileNotFoundException e) {
			System.err.print("������ ã�� ���߽��ϴ�.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
