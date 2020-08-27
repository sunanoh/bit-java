package com.javax.network.echoserver.v1.copy;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String args) {
		// 1. Socket생성
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("<클라이언트 시작>");
			System.out.println("[연결을 요청합니다.]");
			
			// 2. 서버 정보 확보                                                                  // 서버의 IP,  // 서버의 포트정보
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			

			// 3. 서버에 접속 시도
			socket.connect(remote);  // connect 시도
			
			System.out.println("[서버에 연결 되었습니다.]");
			
			// 서버로 메시지 전송 : Stream IO 활용
			// OutputStream 확보
			OutputStream os = socket.getOutputStream(); // 우리는 txt받아야하는데 아웃푸스트림이 바이너리니까..
			Writer osw = new OutputStreamWriter(os, "UTF-8");
											// Main Stream  // 텍스트 인코딩 정보
			BufferedWriter bw = new BufferedWriter(osw);
			String message = "테스트 요청 메시지";
			bw.write(message);
			System.out.println("클라이언트 전송 메시지 : "+ message);
			
			bw.close();
			
			// 종료
			System.out.println("<클라이언트 종료>");
			
			
		}catch(ConnectException e) {
			System.err.println("[접속이 거부되었습니다.]");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
