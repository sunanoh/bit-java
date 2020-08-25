package com.javax.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// DataInputStream, DataOutputStream은 java의 기본 타입을 binary로 저장하는 보조 스트림
public class DataStreamEx {

	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "primitives.txt";
	
	public static void main(String[] args) {
		try {
			// 주 스트림이 필요함
			OutputStream fos = new FileOutputStream(filename);
			// 보조 스트림
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);
			
			dos.writeUTF("고길동");
			dos.writeBoolean(false);
			dos.writeInt(50);
			dos.writeFloat(74f);
			
			dos.close();
			
			// 읽어오기
			InputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis);
			
			// 주의:
			// DataInputStream에서 read할 때, 저장된 타입의 순서대로 읽어야 한다.
			
			for(int i = 0; i < 2; i++) {
				String s = dis.readUTF();
				Boolean b = dis.readBoolean();
				int v = dis.readInt();
				float f = dis.readFloat();
				
				System.out.printf("%s:%b:%d:%f%n",s,b,v,f);
			}
			
			dis.close();
	
			
		}catch(FileNotFoundException e){
			System.err.println("파일을 찾을 수 없어요!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
