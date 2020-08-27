package com.javax.network.echoserver.v1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

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
			
			// 3. ���� ���
			Socket socket = serverSocket.accept();// Ŭ���̾�Ʈ ������ ���⼭ ��������
			
			// ���� �� ó�� : Ŭ���̾�Ʈ ���� Ȯ��
			InetSocketAddress client = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println("[Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.]");
			System.out.println(client.getAddress() + " : " + client.getPort());
			
			// �� ó��
			System.out.println("=============================");
			System.out.println("<���� ����>");
			
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
