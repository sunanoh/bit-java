package javaEx.com.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifElseEx();
		//ifElseEx2();
		//ifElseEx3();
		//switchEx();
		//switchEx2();
		//whileEx();
		//whileEx2();
		doWhileEx();
	}
	
	public static void doWhileEx() {
		// 숫자를 입력 받아서 합산
		// 0을 입력 받으면 반복을 종료
		
		int num =0;
		int total = 0; //합산 변수

		Scanner scan = new Scanner(System.in);
		
		// 최소 1번 실행해야 하는 반복 do ~ while
		// or 반복 조건이 loop 문 내부에서 결정되는 경우 do ~ while
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		
		do { // 일단 실행
			//System.out.print("숫자 : ");
			num = scan.nextInt();
			total += num;
			System.out.println("합계 : "+ total);
		}while(num != 0);
		System.out.println("0을 입력하여 종료되었습니다. 합계는 "+total + " 입니다.");
	}
	
	public static void whileEx2() {
		//단수를 입력, 해당 단의 곱셈표를 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단수를 입력해주세요 : ");
		int dan = scan.nextInt();
		
		int i = 1;
		while(i <= 9) {
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}
		
		scan.close();
	}
	
	public static void whileEx() {
		// 반복문을 사용, 1부터 100까지 숫자를 합산하여 출력
		int num = 1; // 시작값, 조건비교
		int sum = 0;
		
		// 주의 : while문은 반복 조건을 개발자가 직접 컨트롤 해주어야 한다.
		while(num <= 100) {
			sum = sum + num;
			System.out.println("num = " +num+ " sum = "+sum);
			num++;
		}
		System.out.println(sum);
	}
	
	public static void switchEx2() {
		// 월정보(정수) 입력
		// 1, 3, 5, 7, 9, 11 -> 31일
		// 2 -> 28일
		// 4, 6, 8, 10, 12 -> 30일
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");

		int month = scan.nextInt();
		int days = 0;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 9: case 11:
				days = 31;
				break; // 잊지말자 break;
			case 2: 
				days = 28;
				break; // 잊지말자 break;
			case 4: case 6: case 10: case 12:
				days = 30;
				break; // 잊지말자 break;
		}
		

		System.out.println(month+ "월은 " + days + "일 입니다.");		
		scan.close();
	}

	public static void switchEx() {
		// ifElseEx3와 동일한 내용을 switch
		// switch는 전달받은 변수의 값을 이용해서 흐름을 제어 (==)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요.");
		System.out.println("------------------------");
		System.out.println("1. 자바");
		System.out.println("2. C");
		System.out.println("3. C++");
		System.out.println("4. 파이썬");
		System.out.println("------------------------");
		System.out.print("과목 번호 : ");
		
		int subjectNum = scan.nextInt();
		
		switch(subjectNum) {
		case 1:
			System.out.println("자바 과목의 강의실은 R101호 입니다.");
			break; // 잊지말자 break;
		case 2:
			System.out.println("C 과목의 강의실은 R202호 입니다.");
			break;
		case 3:
			System.out.println("C++ 과목의 강의실은 R303호 입니다.");
			break;
		case 4:
			System.out.println("파이썬 과목의 강의실은 R403호 입니다.");
			break;
		default: // else 위에 case 문에서 일치하는 결과 없을 때
			System.out.println("상담원에게 문의하세요.");
				
		}
		scan.close();
		
	}
	
	public static void ifElseEx3() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요.");
		System.out.println("------------------------");
		System.out.println("1. 자바");
		System.out.println("2. C");
		System.out.println("3. C++");
		System.out.println("4. 파이썬");
		System.out.println("------------------------");
		System.out.print("과목 번호 : ");
		
		int subjectNum = scan.nextInt();
		
		if(subjectNum == 1) {
			System.out.println("자바 과목의 강의실은 R101호 입니다.");
		}else if(subjectNum == 2){
			System.out.println("C 과목의 강의실은 R202호 입니다.");
		}else if(subjectNum == 3){
			System.out.println("C++ 과목의 강의실은 R303호 입니다.");
		}else if(subjectNum == 4){
			System.out.println("파이썬 과목의 강의실은 R403호 입니다.");
		}
		else {
			System.out.println("상담원에게 문의하세요.");
		}
		scan.close();
	}
	
	public static void ifElseEx2() {
		// 정수입력
		// 0보다 크며 양수, 0이면 0, 0보다 작으면 음수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("양수입니다.");
		}else if(num < 0){
			System.out.println("음수입니다.");
		}else {
			System.out.println("0 입니다.");
		}
		scan.close();
		// 중첩 if : 1차로 필터링
		// 내부 블록 안쪽에서 2차로 조건 판별
	}
	
	public static void ifElseEx(){
		// Scanner로 점수를 입력
		// 점수가 60점 이상이면 "합격"
		// 그렇지 않다(60점 미만이면) "불합격"
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		if(score >= 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		scan.close();
	}
	
	
}
