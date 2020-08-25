package com.javax.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {

	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "char.txt";  // 텍스트 파일 임의로 하나 생성!
	
	public static void main(String[] args) {
		// writer : Char 출력 Stream의 최고 조상
		
		try {
			Writer fw = new FileWriter(filename);
			fw.write("Bit Computer\r\n");
			fw.write("Java Programing \r\n");
			fw.write("2020.08\r\n");
			fw.write("재확인\r\n");
			
			// 버퍼 비우기
			fw.flush();
			fw.close();
			
			System.out.println("파일 저장 완료!");
			
			// 파일 읽어오기
			Reader fr = new FileReader(filename);
			
			int data = 0;
			
			while((data = fr.read())!= -1){
				System.out.print((char)data); // 실제 데이터는  char형으로, 형변환 해주어야 함
			}
			
			fr.close();
			System.out.println("파일 읽어오기 완료!");
			
		}catch(FileNotFoundException e) {
			System.err.print("파일을 찾지 못했습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
