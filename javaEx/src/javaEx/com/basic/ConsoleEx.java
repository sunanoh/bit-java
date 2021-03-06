package javaEx.com.basic;

import java.util.Scanner;




public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//consoleOutput();
		consoleInput();
	}
	
	// 콘솔 입력 (System.in)
	// Scanner 클래스를 이용하면 다양한 입력 소스로부터 데이터를 입력 받을 수 있다
	public static void consoleInput() {
		// Tip. Ctrl + Shift + O -> 자동 import
		// Tip. Ctrl + Space -> Code Assist
		Scanner scan = new Scanner(System.in);
		// 이름은? -> 문자열 데이터 입력
		// 나이는? 이라고 묻고 정수데이터 입력
		// 출력 -> 나이는 0세
		
		System.out.print("이름은 ? : ");
		String name = scan.next();
		System.out.print("나이는 ? : ");
		int age = scan.nextInt();
		
		System.out.print("\n" + name +"님의 나이는 "+age +"세 입니다.");
		
		scan.close();
		// 시스템 자원을 사용하는 기능을 이용한 후에는 반드시 닫아주자.
		
	}

	
	// 콘솔 출력
	public static void consoleOutput() {
		// System.out.print -> 출력 후 개행 없음
		// System.out.println -> 출력후 개행
		// System.out.printf -> 형식화된 출력 : String 할때 정리 (TODO)
		
		System.out.print("Hello ");
		System.out.println("Java");
		
		// 이스케이프 문자(시퀀스)
		// \n : 개행
		// \t : 탭
		// \" : 쌍따옴표
		// \\ : \
	
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		
		String message = "Hello, \"Java\"";
		System.out.println(message);
		
		// 파일을 다뤄야 하는데, C:\mydir\myfile.txt를 사용하려고 할 때
		// 역슬래쉬(\)가 들어가 있으면 \뒤 한문자를 찾아서 이스케이프 문자를 찾는다.
		// 따라서 \m으로 보고 찾다가 오류가 생김
		// \\으로 \임을 표시해주어야함 
		String dir = "C:\\mydir\\myfile.txt";	
		}
}
