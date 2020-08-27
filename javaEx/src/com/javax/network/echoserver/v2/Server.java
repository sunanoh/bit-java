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


// v2. ��Ƽ������ ������ Echo Server 

public class Server {
	
	// io, ��Ʈ��ũ�� ����ó�� �����־�� ��

	public static void main(String[] args) {
		
		// 1. ���� ���� ����
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			
			// 2. bind (�ּ�, ��Ʈ ����)                        // localhost(����ǻ��) // port��ȣ 
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
			// port��ȣ : ��Ʈ��ũ�� Ÿ�� �����Ͱ� ���� ��, �ش� �����͸� � ��������/���μ������� �� �����͸� �����ؾ��� �� Ȯ�����ִ� ������ ����
			// �ý�����Ʈ/ ����� ��Ʈ --> ���� ��Ʈ�� ����ϴ� ���α׷��� ������ �ȵ� 
			// http �� 80�� ��Ʈ ��
			
			serverSocket.bind(local); // bind(����)
			
			System.out.println("<���� ����>");
			System.out.println("[������ ��ٸ��ϴ�.]");
			
			// 3. ���� ��� : ���� Ŭ���̾�Ʈ�� ������ ���
			while(true){
				Socket socket = serverSocket.accept();// Ŭ���̾�Ʈ ������ ���⼭ ��������
				
				// �� ���� �����带 ���� ������ ����
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// ���� ���� �ݱ�
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
