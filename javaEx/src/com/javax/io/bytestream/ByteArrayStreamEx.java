package com.javax.io.bytestream;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

// ByteStream
// ���� ������ �Է�, ����ϴ� Ŭ���� ��
// �ֻ��� �θ�: InputStream, OutputStream
public class ByteArrayStreamEx {

	public static void main(String[] args) {
		// �Է� �ҽ�
		byte[] inSrc = {1,2,3,4,5,6,7,8,9};
		// ��� �ҽ�
		byte[] outSrc = null;
		
		// �Է� �ҽ� ���� Ȯ��
		System.out.println("�Է� �ҽ� : "+ Arrays.toString(inSrc));
		
		// ����
		// 1. �����Ϳ� ������ ��Ʈ�� ���� 
		// 2. �Է�/��� �ҽ� ����
		// 3. �����͸� ��Ʈ���� ���ؼ� �Է� or ���
		
		try {
			InputStream bis = new ByteArrayInputStream(inSrc); // InputStream�� �߻��̶� ���� new �� �� ���� // stream�� ������ ���Ƽ� checked Exception��, try�� �����ֱ�!
			OutputStream bos = new ByteArrayOutputStream();
			
			int data = 0; // inputstream���� ���� �Ѿ���� ������ ���� ����
			
			// read�� �ϸ� byte �����͸� �޾Ƽ� int �����ͷ� ��ȯ�Ͽ� ����
			//data = bis.read();
			//System.out.println("���� ������ : "+ data);
			
			//read�� �� �̻� ���� �����Ͱ� ���� �� -1 �� ��ȯ
			while((data = bis.read()) != -1) {
				System.out.println("���� ������ : " + data);
				// ���
				bos.write(data); // outputstream�� �����͸� �����ص� ���� -> target �迭�� ��� �ʿ�
			}
			
			outSrc = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("��� �迭 : "+ Arrays.toString(outSrc));
			
			bos.close();
			bis.close();
			
		}catch(IOException e) {
			// IO ���ܴ� checked ����
			e.printStackTrace();
		}catch (Exception e) {
			// �ܿ� ���ܴ� �̰����� üũ
			e.printStackTrace();
		}
	}

}
