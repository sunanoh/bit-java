package com.javax.network.echoserver.v1;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String args) {
		// 1. Socket����
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("<Ŭ���̾�Ʈ ����>");
			System.out.println("[������ ��û�մϴ�.]");
			
			// 2. ���� ���� Ȯ��                                                                  // ������ IP,  // ������ ��Ʈ����
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			

			// 3. ������ ���� �õ�
			socket.connect(remote);  // connet �õ�
			
			System.out.println("[������ ���� �Ǿ����ϴ�.]");
			
			
			// ����
			System.out.println("<Ŭ���̾�Ʈ ����>");
			
			
		}catch(ConnectException e) {
			System.err.println("[������ �źεǾ����ϴ�.]");
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
