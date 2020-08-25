package com.javax.io.bytestream;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

// ByteStream
// 이진 파일을 입력, 출력하는 클래스 들
// 최상위 부모: InputStream, OutputStream
public class ByteArrayStreamEx {

	public static void main(String[] args) {
		// 입력 소스
		byte[] inSrc = {1,2,3,4,5,6,7,8,9};
		// 출력 소스
		byte[] outSrc = null;
		
		// 입력 소스 내용 확인
		System.out.println("입력 소스 : "+ Arrays.toString(inSrc));
		
		// 순서
		// 1. 데이터에 적합한 스트림 열고 
		// 2. 입력/출력 소스 연결
		// 3. 데이터를 스트림을 통해서 입력 or 출력
		
		try {
			InputStream bis = new ByteArrayInputStream(inSrc); // InputStream은 추상이라 직접 new 할 수 없음 // stream은 오류가 많아서 checked Exception임, try로 무어주기!
			OutputStream bos = new ByteArrayOutputStream();
			
			int data = 0; // inputstream으로 부터 넘어오는 데이터 저장 변수
			
			// read를 하면 byte 데이터를 받아서 int 데이터로 변환하여 리턴
			//data = bis.read();
			//System.out.println("읽은 데이터 : "+ data);
			
			//read시 더 이상 읽을 데이터가 없을 때 -1 을 반환
			while((data = bis.read()) != -1) {
				System.out.println("읽은 데이터 : " + data);
				// 출력
				bos.write(data); // outputstream에 데이터를 저장해둔 상태 -> target 배열로 출력 필요
			}
			
			outSrc = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("대상 배열 : "+ Arrays.toString(outSrc));
			
			bos.close();
			bis.close();
			
		}catch(IOException e) {
			// IO 예외는 checked 예외
			e.printStackTrace();
		}catch (Exception e) {
			// 잔여 예외는 이곳에서 체크
			e.printStackTrace();
		}
	}

}
