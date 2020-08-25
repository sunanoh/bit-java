package com.javax.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	                             // ���� ������Ʈ�� dir            //������ files�� ��ġ�� �Է�!
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	
	public static void main(String[] args) {
		// rootPath ������ ���� Ȯ��
		
		File root = new File(rootPath);
		
		// ������ �ִ� �������� Ȯ��
		System.out.println("rootPath exists? " + root.exists());
		
		// ���丮 �����
		if(!root.exists()) {
			root.mkdirs();
		}
		
		// ���� ���� Ȯ�� - ���� �޼��� �ۼ�
		printFileInfo(root);
		
		// ���丮 ���ο� ������ ����
		File file = new File(rootPath + "myfile.txt");
		if(!file.exists()) { // ������ ������
			// ����
			try {
				file.createNewFile(); // ���⼭ ���� ������ ������
				System.out.println("���� ����!");
			}catch(IOException e) {
				System.err.println("������ �������� ���߽��ϴ�.");
			}
		}
		
		printFileInfo(root);
		
		// ���� ����
		file.delete(); // myFile.txt ����
		printFileInfo(root);
	}
	
	
	private static void printFileInfo(File f) {
		System.out.println("-------------------");
		
		// �� ������ ���͸� �ΰ�? (= ���� �ΰ�?)
		if(f.isDirectory()) {
			// ���� ���� ��� Ȯ��
			System.out.println("Directory : "+ f.getName());
			// ��� Ȯ��
			File[] files = f.listFiles();
			
			for(File file : files) {
				System.out.print(file.isDirectory() ? "(d) " : "(f) ");
				System.out.printf("%s - %d%n",file.getName(), file.length());
			}
		}else {
		// ������ �ƴϸ�
			System.out.println("File : "+ f.getName());
		}
		System.out.println("-------------------");
	}

}
