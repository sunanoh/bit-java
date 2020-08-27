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
import java.net.Socket;

public class ServerThread extends Thread{
	// �ʵ� : ����� ���� ����
	private Socket socket;
	
	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	// run �޼��� �������̵�
	@Override
	public void run() {
		// Ŭ���̾�Ʈ ���� ������ ����
		try {
			InetSocketAddress client = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println("[Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.]");
			System.out.println(client.getAddress() + " : " + client.getPort());
			
			// Ŭ���̾�Ʈ�κ��� �޽����� ���� �ޱ�
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			// Echo Back�� ���� OutputStream Ȯ��
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			// �޽��� �б�
			String message; // �޾� ���� �޽���
			while((message = br.readLine())!= null) {
				System.out.println("���� �޽��� : " + message);
				// Echo Back
				
				System.out.println("Echo Back : " + message);
				bw.write("[Echo]: " + message);
				bw.newLine();
				bw.flush();
			}
			
			// �� ó��
			//System.err.println("[������ ����Ǿ����ϴ�.]");
			//System.out.println("=============================");
			//System.out.println("<���� ����>");
			
			System.out.println("Ŭ���̾�Ʈ ���� ����");
			
			// ��Ʈ�� �ݱ�
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
