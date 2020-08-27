package com.javax.network.echoserver.v2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


// v2. 멀티스레드 버전의 Echo Server 

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
			
			// 3. 접속 대기 : 여러 클라이언트의 접속을 허용
			while(true){
				Socket socket = serverSocket.accept();// 클라이언트 없으면 여기서 멈춰있음
				
				// 새 서버 쓰레드를 만들어서 로직을 수행
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			
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
