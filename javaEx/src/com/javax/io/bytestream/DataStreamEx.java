package com.javax.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// DataInputStream, DataOutputStream�� java�� �⺻ Ÿ���� binary�� �����ϴ� ���� ��Ʈ��
public class DataStreamEx {

	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "primitives.txt";
	
	public static void main(String[] args) {
		try {
			// �� ��Ʈ���� �ʿ���
			OutputStream fos = new FileOutputStream(filename);
			// ���� ��Ʈ��
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("ȫ�浿");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);
			
			dos.writeUTF("��浿");
			dos.writeBoolean(false);
			dos.writeInt(50);
			dos.writeFloat(74f);
			
			dos.close();
			
			// �о����
			InputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis);
			
			// ����:
			// DataInputStream���� read�� ��, ����� Ÿ���� ������� �о�� �Ѵ�.
			
			for(int i = 0; i < 2; i++) {
				String s = dis.readUTF();
				Boolean b = dis.readBoolean();
				int v = dis.readInt();
				float f = dis.readFloat();
				
				System.out.printf("%s:%b:%d:%f%n",s,b,v,f);
			}
			
			dis.close();
	
			
		}catch(FileNotFoundException e){
			System.err.println("������ ã�� �� �����!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
