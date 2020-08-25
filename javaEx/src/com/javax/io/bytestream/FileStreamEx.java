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
			
			int data = 0; // 저장용 변수
			
			//8메가 이미지를 1바이트씩 받아서 복사하는 것.
			
			while((data = fis.read())!= -1) {
				fos.write(data);
			}
			
			fis.close();
			fos.close();
			
			System.out.println("파일을 복사했어요!");
				
		}catch(FileNotFoundException e){
			System.err.println("파일을 찾을 수 없어요!");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
