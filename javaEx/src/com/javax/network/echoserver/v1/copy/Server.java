package com.javax.network.echoserver.v1.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	// io, 네트워크는 예외처리 잘해주어야 함

	public static void main(String[] args) {
		
		// 1. 서버 소켓 생성
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			
			// 2. bind (주소, 포트 연결)                        // localhost(내컴퓨터) // port번호 
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
			// port번호 : 네트워크를 타고 데이터가 오고갈 때, 해당 데이터를 어떤 프로토콜/프로세스에게 이 데이터를 전달해야할 지 확인해주는 일종의 숫자
			// 시스템포트/ 사용자 포트 --> 같은 포트를 사용하는 프로그램이 있으면 안됨 
			// http 는 80번 포트 중
			
			serverSocket.bind(local); // bind(연결)
			
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다.]");
			
			// 3. 접속 대기
			Socket socket = serverSocket.accept();// 클라이언트 없으면 여기서 멈춰있음
			
			// 접속 후 처리 : 클라이언트 정보 확인
			InetSocketAddress client = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println("[클라이언트가 연결되었습니다.]");
			System.out.println(client.getAddress() + " : " + client.getPort());
			
			// 클라이언트로부터 메시지를 전송 받기
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			// 메시지 읽기
			String message; // 받아 들일 메시지
			while((message = br.readLine())!= null) {
				System.out.println("수신 메시지 : " + message);
			}
			
			br.close();
			
			
			// 후 처리
			System.err.println("[접속이 종료되었습니다.]");
			System.out.println("=============================");
			System.out.println("<서버 종료>");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 서버 소켓 닫기
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
