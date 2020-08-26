package com.javax.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {
	
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "thieves2.txt";
	
	public static void main(String[] args) {
		// Scanner�� �ܼ��� ǥ���Է�(Ű����)���� ���� Ŭ������ �ƴϴ�
		// �������� ���ڷ� �Է� �ҽ��� �����ϸ�
		// ����, ��Ʈ��ũ �� �ٸ� �Է¼ҽ��κ��� �����͸� �о�� �� �ִ�.
		
		// �Է� �ҽ�
		File file = new File(filename); // ���� �Է��� �ҽ��� ���
		System.out.println(file.exists());
		try {
			Scanner scanner = new Scanner(file);
			
			String name;
			float height;
			float weight;
			
			// �� �̻� ���� ������ ���� �� ���� ����
			while(scanner.hasNextLine()) {
				// �Է°� parsing(��ȯ)�� ���ÿ� ����
				name = scanner.next();
				height = scanner.nextFloat();
				weight = scanner.nextFloat();
				
				System.out.printf("%s, Ű : %f, ������ : %f%n",name, height, weight);
				// �����ִ� �����͸� �о����
				scanner.nextLine();
			}
			
			scanner.close();
			
		}catch(FileNotFoundException e) {
			System.err.println("������ ã�� �� �����ϴ�.");
		}catch(IOException e) {
			e.printStackTrace();;
		}
		

	}

}
