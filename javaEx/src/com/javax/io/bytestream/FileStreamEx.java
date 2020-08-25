package com.javax.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamEx {

	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_copy.jpg";
	
	public static void main(String[] args) {
		// source => FIS => data => FOS => target
		try {
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			int data = 0; // ����� ����
			
			//8�ް� �̹����� 1����Ʈ�� �޾Ƽ� �����ϴ� ��.
			
			while((data = fis.read())!= -1) {
				fos.write(data);
			}
			
			fis.close();
			fos.close();
			
			System.out.println("������ �����߾��!");
				
		}catch(FileNotFoundException e){
			System.err.println("������ ã�� �� �����!");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
