package com.javax.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	                             // 현재 프로젝트의 dir            //복붙한 files의 위치를 입력!
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	
	public static void main(String[] args) {
		// rootPath 내부의 정보 확인
		
		File root = new File(rootPath);
		
		// 실제로 있는 파일인지 확인
		System.out.println("rootPath exists? " + root.exists());
		
		// 디렉토리 만들기
		if(!root.exists()) {
			root.mkdirs();
		}
		
		// 파일 정보 확인 - 별도 메서드 작성
		printFileInfo(root);
		
		// 디렉토리 내부에 파일을 생성
		File file = new File(rootPath + "myfile.txt");
		if(!file.exists()) { // 파일이 없으면
			// 생성
			try {
				file.createNewFile(); // 여기서 실제 파일이 생성됨
				System.out.println("파일 생성!");
			}catch(IOException e) {
				System.err.println("파일을 생성하지 못했습니다.");
			}
		}
		
		printFileInfo(root);
		
		// 파일 삭제
		file.delete(); // myFile.txt 삭제
		printFileInfo(root);
	}
	
	
	private static void printFileInfo(File f) {
		System.out.println("-------------------");
		
		// 이 파일이 디렉터리 인가? (= 폴더 인가?)
		if(f.isDirectory()) {
			// 내부 파일 목록 확인
			System.out.println("Directory : "+ f.getName());
			// 목록 확인
			File[] files = f.listFiles();
			
			for(File file : files) {
				System.out.print(file.isDirectory() ? "(d) " : "(f) ");
				System.out.printf("%s - %d%n",file.getName(), file.length());
			}
		}else {
		// 파일이 아니면
			System.out.println("File : "+ f.getName());
		}
		System.out.println("-------------------");
	}

}
