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
	
	// 위의 파일로 부터 문장을 한줄 단위로 읽어서  -> last-leaf.txt
	// 해당 라인에 leaf or leaves 단어가 포함되어 있으면 별도로 저장 -> filtered.txt
	public static void main(String[] args) {
		try {
			Reader fr = new FileReader(filename);
			Writer fw = new FileWriter(filtered);
			
			// 보조스트림
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			// int -> char 했지만, 여기선 그럴 필요 없음
			// BufferedReader를 사용하면 줄단위 입력 가능함

			String line = ""; // 데이터를 입력받을 변수
			
			// 더이상 읽을 라인이 없으면 null
			while((line = br.readLine())!= null) {
				// 체크 : leaf, leaves가 포함?
				if(line.toLowerCase().contains("leaf")||line.toLowerCase().contains("leaves")) {
					// leaf, leaves 들어있는 라인만 출력
					System.out.println(line);
					bw.write(line);
					bw.newLine(); // 개행 출력
				}
			}
			
			// 보조스트림 닫기
			br.close();
			bw.close();
			
			System.out.println("필터링 완료!");
			
		}catch(FileNotFoundException e) {
			System.err.print("파일을 찾지 못했습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
