package com.javax.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

// ���ͳ� �ּҿ� ���õ� InetAddress Ŭ���� ����

public class InetAddressEx {

	public static void main(String[] args) {
		// ���� ������ IP �ּ� Ȯ��
		printServerIp("www.google.com");
		printServerIp("www.naver.com");
	
		
		

	}
	
	private static void printServerIp(String hostname) {
		try {
			// Local IP Ȯ��
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("Local IP : " + local);
			
			// hostname �ּ��� ���� IP�� Ȯ��
			InetAddress[] addrs = InetAddress.getAllByName(hostname);
			for(InetAddress remote : addrs) {
				System.out.println(hostname + " : " + remote.getHostAddress());
			}
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
