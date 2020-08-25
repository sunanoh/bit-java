package com.javax.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_buffered_copy.jpg";
	
	public static void main(String[] args) {

		try {
			// �� ��Ʈ���� �ʿ�
			InputStream fis = new FileInputStream(source);
			OutputStream fos = new FileOutputStream(target);
			// ���� ��Ʈ�� : �ܵ����� ���� �� ����
			// ���ڷ��̼�
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// ���۰� �ʿ�
			byte[] data = new byte[10240];
			int size = 0;  // ���ۿ� ���۵� ������ ������ Ȯ�ο� ����
			
			while((size = bis.read(data))!= -1) {
				bos.write(data);
				System.out.println(size + "����Ʈ �����߽��ϴ�.");
			}
			
			// ���� ��Ʈ���� ������ �� ��Ʈ���� ������.
			bis.close();
			bos.close();
			
			System.out.println("������ ���� �߽��ϴ�.");
			
		}catch(FileNotFoundException e){
			System.err.println("������ ã�� �� �����!");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
