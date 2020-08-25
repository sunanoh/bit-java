package com.javax.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import jdk.jfr.events.FileWriteEvent;

public class BufferedCharStreamEx {

	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "last-leaf.txt";  
	static String filtered = rootPath + "last-leaf-filtered.txt";
	
	// ���� ���Ϸ� ���� ������ ���� ������ �о  -> last-leaf.txt
	// �ش� ���ο� leaf or leaves �ܾ ���ԵǾ� ������ ������ ���� -> filtered.txt
	public static void main(String[] args) {
		try {
			Reader fr = new FileReader(filename);
			Writer fw = new FileWriter(filtered);
			
			// ������Ʈ��
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			// int -> char ������, ���⼱ �׷� �ʿ� ����
			// BufferedReader�� ����ϸ� �ٴ��� �Է� ������

			String line = ""; // �����͸� �Է¹��� ����
			
			// ���̻� ���� ������ ������ null
			while((line = br.readLine())!= null) {
				// üũ : leaf, leaves�� ����?
				if(line.toLowerCase().contains("leaf")||line.toLowerCase().contains("leaves")) {
					// leaf, leaves ����ִ� ���θ� ���
					System.out.println(line);
					bw.write(line);
					bw.newLine(); // ���� ���
				}
			}
			
			// ������Ʈ�� �ݱ�
			br.close();
			bw.close();
			
			System.out.println("���͸� �Ϸ�!");
			
		}catch(FileNotFoundException e) {
			System.err.print("������ ã�� ���߽��ϴ�.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
