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
		// 1. Socket����
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("<Ŭ���̾�Ʈ ����>");
			System.out.println("[������ ��û�մϴ�.]");
			
			// 2. ���� ���� Ȯ��                                                                  // ������ IP,  // ������ ��Ʈ����
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			

			// 3. ������ ���� �õ�
			socket.connect(remote);  // connect �õ�
			
			System.out.println("[������ ���� �Ǿ����ϴ�.]");
			
			// ������ �޽��� ���� : Stream IO Ȱ��
			// OutputStream Ȯ��
			OutputStream os = socket.getOutputStream(); // �츮�� txt�޾ƾ��ϴµ� �ƿ�Ǫ��Ʈ���� ���̳ʸ��ϱ�..
			Writer osw = new OutputStreamWriter(os, "UTF-8");
											// Main Stream  // �ؽ�Ʈ ���ڵ� ����
			BufferedWriter bw = new BufferedWriter(osw);
			String message = "�׽�Ʈ ��û �޽���";
			bw.write(message);
			System.out.println("Ŭ���̾�Ʈ ���� �޽��� : "+ message);
			
			bw.close();
			
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
