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
			
			// Ŭ���̾�Ʈ�κ��� �޽����� ���� �ޱ�
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			// �޽��� �б�
			String message; // �޾� ���� �޽���
			while((message = br.readLine())!= null) {
				System.out.println("���� �޽��� : " + message);
			}
			
			br.close();
			
			
			// �� ó��
			System.err.println("[������ ����Ǿ����ϴ�.]");
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
